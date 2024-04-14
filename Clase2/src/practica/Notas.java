package practica;


public class Notas
{
	private int nota = 0;
	
	
	public void nuevaNota(int nuevaNota)
	{
		if((nuevaNota > this.nota) && nuevaNota > 0 && nuevaNota <= 10)
			this.nota = nuevaNota;
		else
			System.out.println("No se puede modificar la nota pq es menor");
	}
}


