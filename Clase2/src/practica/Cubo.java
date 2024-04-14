package practica;

public class Cubo {

	private double longitudLado;
	private double areaDeCara;
	private double volumen;
	
 
    public Cubo (double longitudLado) 
    {
    	this.longitudLado = longitudLado;
    	areaDeCara = Math.pow(longitudLado, 2);
    	volumen = Math.pow(longitudLado, 3);
    }


    public double obtenerLado() 
    {
    	return this.longitudLado;
    }
    
    public void cambiarLado(double longitudLado) 
    {
    	if(longitudLado > 0)
    		this.modificarCubo(longitudLado);
    }
    
    public double obtenerAreaCara() 
    {
    	return this.areaDeCara;
    }
    
    public void cambiarAreaCara(double areaCara) 
    {	
    	if(areaCara >0)
    		this.modificarCubo(Math.sqrt(areaCara));
    }

  
    public double obtenerVolumen() 
    {
    	return this.volumen;
    }


    public void cambiarVolumen(double volumen) 
    {
    	if(volumen > 0)
    	{
    		modificarCubo(Math.cbrt(volumen));
    	}
    }
    
    private void modificarCubo(double longLado)
    {
    	this.longitudLado = longLado;
    	areaDeCara = Math.pow(longLado, 2);
    	volumen = Math.pow(longLado, 3);
    }
}