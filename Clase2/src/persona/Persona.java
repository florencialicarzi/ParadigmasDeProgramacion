package persona;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

public class Persona
{
		private Date fechaDeNacimiento;
		private String nombre;
		
		//Constructor
		public Persona(String nuevoNombre)
		{
				nombre = nuevoNombre;
				fechaDeNacimiento = null;
		}
		
//		public int getEdad()
//		{
//				Date ahora = new Date();
//				long diffInMillies = Math.abs(ahora.getTime() - fechaDeNacimiento.getTime());
//				long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//				
//				return (int) diff / 365;
//		}
//		
		public String presentarse()
		{
				return "Hola, soy " + nombre;
		}
}