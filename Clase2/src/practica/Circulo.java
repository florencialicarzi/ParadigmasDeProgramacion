package practica;

public class Circulo {
	private double radio;
	private double diametro;
	private double perimetro;
	private double area;
	
	public void cambiarRadio( double nueRadio)
	{
		modificarCirculo(nueRadio);
	}
	
	public void cambiarDiametro( double nueDiam)
	{
		modificarCirculo(nueDiam/2);
	}
	
	public void cambiarPerimetro(double nuePerim)
	{
		modificarCirculo(nuePerim / (2 * Math.PI));
	}
	
	public void cambiarArea(double nueArea)
	{
		modificarCirculo(Math.sqrt(nueArea* Math.PI));
	}
	
	private void modificarCirculo(double radio)
	{
		this.radio = radio;
		this.diametro = radio * 2;
		this.perimetro = 2* Math.PI * radio;
		this.area = Math.PI * Math.pow(radio, 2);
	}
	
	public double getRadio()
	{
		return this.radio;
	}
	
	public double getDiametro()
	{
		return this.diametro;
	}
	
	public double getPerim()
	{
		return this.perimetro;
	}
	
	public double getArea()
	{
		return this.area;
	}
}
