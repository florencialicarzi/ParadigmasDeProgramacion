import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		System.out.println("\nEjercicio 1:");
		ejercicio01(matriz);
		System.out.println("\nEjercicio 2:");
		ejercicio02(matriz);
		System.out.println("\nEjercicio 3:");
		ejercicio03(matriz);
		System.out.println("\nEjercicio 4 v1:");
		ejercicio04v1(matriz);
		System.out.println("\nEjercicio 4 v2:");
		ejercicio04v2(matriz);
		System.out.println("\nEjercicio 5:");
		ejercicio05(matriz);
		

	}

	static void ejercicio01(int[][]matriz)
	{
		boolean esCorrecto = true;
		
		int suma = matriz[0][0];
		
		for(int i = 1 ; i< matriz.length && esCorrecto ; i++)
		{
			if(suma == matriz[i][i])
				suma += matriz[i][i];
			else
				esCorrecto = false;
			
		}
		
		if(esCorrecto)
			System.out.println("Es correcto");
		else
			System.out.println("No es correcto");
		
	}
	
	static void ejercicio02(int[][]matriz)
	{
		boolean daCero = false;
		
		for(int i=0 ; i< matriz.length && !daCero ; i++)
		{
			for(int j=0 ; j < matriz.length && !daCero ; j++)
			{
				if(matriz[i][j] == 0)
					daCero = true;
			}
		}
		
		if(daCero)
			System.out.println("El producto de la matriz da 0");
		else
			System.out.println("No da 0");
	}
	
	/*
	 * Escribir un método en Java que de una matriz numérica dada, devuelva una matriz con la misma 
	 * cantidad de elementos, pero donde cada valor es la suma de sus adyacentes originales 
	 * (arriba, abajo, izquierda, y derecha; si existen)
	 */
	
	static void ejercicio03(int[][]matriz)
	{
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		int [][] mat_aux = new int [filas][columnas];
		
		for(int i=0 ; i< filas ; i++)
		{
			for(int j = 0; j< columnas ; j++)
			{
				mat_aux[i][j] += matriz[i][j];
				mat_aux[i][j] += (i!=0)? 		matriz[i-1][j] : 0;
				mat_aux[i][j] += (i<filas-1)? 	matriz[i+1][j] : 0;
				mat_aux[i][j] += (j!=0)? 		matriz[i][j-1] : 0;
				mat_aux[i][j] += (j<columnas-1)? matriz[i][j+1] : 0;
				
				System.out.print(mat_aux[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	static void ejercicio04v1(int[][]matriz)
	{
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		ArrayList<Integer> elems = new ArrayList<Integer>();
		
		int [] cant_apariciones = new int[columnas];
		Arrays.fill(cant_apariciones, 0);
		
		int [] modas = new int [filas];
		int mayor = 0;
		int pos_mayor = 0;
		
		
		for(int i=0 ; i< filas ; i++)
		{
			for(int j = 0; j< columnas ; j++)
			{
				int pos = elems.indexOf(matriz[i][j]);
				
				if(pos == -1)
				{
					elems.add(matriz[i][j]);
					cant_apariciones[elems.size() - 1 ] = 1;
				}
				else
					cant_apariciones[pos] += 1;
			}
			
			for(int h = 0; h< columnas; h++)
			{
				if(cant_apariciones[h]>mayor)
				{
					mayor = cant_apariciones[h];	
					pos_mayor = h;
				}
			}
			
			modas[i] = elems.get(pos_mayor);
			System.out.print(modas[i]+" ");
			
			elems.clear();
			Arrays.fill(cant_apariciones, 0);
			
			mayor = pos_mayor= 0;

		}
		
	}
	
	static void ejercicio04v2(int[][]matriz)
	{

		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		ArrayList<Elemento> elems = new ArrayList<Elemento>();
		int [] modas = new int [filas];

		for (int i = 0; i < filas; i++) 
		{
			Elemento moda_act = new Elemento(0,0);
			for (int j = 0; j < columnas; j++) 
			{
				Elemento elem_actual = new Elemento(matriz[i][j],1);
				
				if(elems.contains(elem_actual))
				{
					for(Elemento elem_fe : elems)
					{
						if(elem_fe.getElem() == matriz[i][j])
							elem_fe.sumarAparicion();
					}
				}
				else
					elems.add(elem_actual);
			}
			
			Collections.sort(elems,(e1,e2)-> Integer.compare(e2.getElem(), e1.getElem()));
			
			for(Elemento elem_fe : elems)
			{
				if(elem_fe.getCantApar() > moda_act.getCantApar())
				{
					moda_act = elem_fe;
				}
			}
			
			modas[i] = moda_act.getElem();
			System.out.print(modas[i]+" ");
			
			elems.clear();
		}
        
		
	}
	
	public static void ejercicio05(int[][] matriz)
	{
		int filas = matriz.length;
		
		for(int i = filas-1; i >= 0 ; i--)
		{
			for(int j = 0  ; j<filas - i ; j++)
			{
				System.out.print(matriz[i+j][j] + " ");				
			}
			
			System.out.print("\n");
		}
		
		for(int i = filas-1; i >= 0 ; i--)
		{
			for(int j = 0  ; j<i ; j++)
			{
				System.out.print(matriz[j][j+(filas-i)] + " ");				
			}
			
			System.out.print("\n");
		}
		
	}
	
	
	public static void imprimirMatriz(int[][] matriz) 
	{
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}

class Elemento
{
	private int num;
	private int cant_apar;
	
	public Elemento(int num, int cant_apar)
	{
		this.num = num;
		this.cant_apar = cant_apar;
	}
	
	public int getElem()
	{
		return num;
	}
	
	public int getCantApar()
	{
		return cant_apar;
	}
	
	public void sumarAparicion()
	{
		this.cant_apar ++;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Elemento elemento = (Elemento) obj;
        return num == elemento.num;
    }
	
}

	