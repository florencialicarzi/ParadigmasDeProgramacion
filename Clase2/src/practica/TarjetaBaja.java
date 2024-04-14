package practica;

public class TarjetaBaja{


	private double saldoActual;
	private int cantViajesColectivo;
	private int cantViajesSubte;
	
	public TarjetaBaja(double saldoInicial) 
	{
		this.saldoActual = saldoInicial;
		this.cantViajesColectivo = 0;
		this.cantViajesSubte = 0;
	}

	public double obtenerSaldo() 
	{
		return this.saldoActual;
	}

	public void cargar(double monto) 
	{
		this.saldoActual += monto;
	}

	
	public void pagarViajeEnColectivo() 
	{
		if(this.saldoSuficiente(39.59))
		{
			this.saldoActual -= 39.59;
			this.cantViajesColectivo ++;
		}
	}

	
	public void pagarViajeEnSubte() 
	{
		if(this.saldoSuficiente(34.50))
		{
			this.saldoActual -= 34.50;
			this.cantViajesSubte++;
		}
	}


	public int contarViajes() 
	{
		return this.cantViajesColectivo + this.cantViajesSubte;
	}

	public int contarViajesEnColectivo() 
	{
		return this.cantViajesColectivo;
	}


	public int contarViajesEnSubte() 
	{
		return this.cantViajesSubte;
	}
	
	private boolean saldoSuficiente(double montoADesc)
	{
		return (this.saldoActual - montoADesc) >= 0;
	}
	

}