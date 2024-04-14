package vectores;

import java.util.Objects;

public class Vector {
	
	//Atributos
	
	private double x = 0;
	private double y = 0;
	private double z = 0;
	
	//Constructor
	
	public Vector(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getZ()
	{
		return this.z;
	}
	
	//Methods
	public Vector sumar(Vector vecSuma)
	{
		return new Vector((this.x + vecSuma.x) , (this.y + vecSuma.y) , (this.z + vecSuma.z));
	}
	
	public Vector multiplicar(double escalar)
	{
		return new Vector(this.x * escalar, this.y * escalar, this.z * escalar);
	}
	
	public Vector opuesto()
	{
		return new Vector(-this.x, -this.y, -this.z);
	}
	
	public Vector restar(Vector vec)
	{
		return this.sumar(vec.opuesto());
	}
	
	public void touch()
	{
		this.x++;
	}
	
	@Override
	public String toString()
	{
		 return ("(" + (int)this.x + "," + (int)this.y + "," + (int)this.z + ")");
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y)
				&& Double.doubleToLongBits(z) == Double.doubleToLongBits(other.z);
	}
	
	
	

}
