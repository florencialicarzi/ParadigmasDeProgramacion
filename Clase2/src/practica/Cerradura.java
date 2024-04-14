package practica;

import java.util.Objects;

class Cerradura {
	
	private int claveDeApertura;
	private int cantFallosConsecBloq;
	private int cantFallosConsec;
	private int estado; // 1: abierta 2:cerrada 3:bloqueada
	private int cantExitosas = 0;
	private int cantFallidas = 0;
	
    public Cerradura(int claveDeApertura , int cantidadDeFallosConsecutivosQueLaBloquean)
    {
    	this.claveDeApertura = claveDeApertura;
    	this.cantFallosConsecBloq = cantidadDeFallosConsecutivosQueLaBloquean;
    	this.estado = 1;
    }
    
    public boolean abrir(int clave)
    {
    	if(fueBloqueada())
    	{
    		System.out.println("Cerradura bloqueada");
    		return false;
    	}
    	
    	if(estaAbierta())
    	{
    		System.out.println("Ya se encontraba abierta");
    		return true;
    	}
    	
    	if(estaCerrada())
    	{
    		if(this.claveDeApertura == clave)
    		{
    			this.cantExitosas ++;
    			this.estado = 1;
    			this.cantFallosConsec = 0;
    			return true;
    		}
    		else
    		{
    			this.cantFallosConsec ++;
    			this.cantFallidas++;
    			
    			if(this.cantFallosConsecBloq >= this.cantFallosConsec)
    				this.estado = 3;
    			
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public void cerrar()
    {
    	if(!fueBloqueada())
    	{
    		this.estado = 2;    		
    	}
    }
    
    public boolean estaAbierta()
    {
    	return this.estado == 1;
    }
    
    public boolean estaCerrada()
    {
    	return this.estado == 2;
    }
    
    public boolean fueBloqueada()
    {
    	return this.estado == 3;
    }
    
    public int contarAperturasExitosas()
    {
    	return this.cantExitosas;
    }
    
    public int contarAperturasFallidas()
    {
    	return this.cantFallidas;
    }

	@Override
	public int hashCode() {
		return Objects.hash(cantExitosas, cantFallidas, cantFallosConsec, cantFallosConsecBloq, claveDeApertura,
				estado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerradura other = (Cerradura) obj;
		return cantExitosas == other.cantExitosas && cantFallidas == other.cantFallidas
				&& cantFallosConsec == other.cantFallosConsec && cantFallosConsecBloq == other.cantFallosConsecBloq
				&& claveDeApertura == other.claveDeApertura && estado == other.estado;
	}
    
}
