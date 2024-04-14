package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vectores.Vector;

class CerraduraTests {

	
	//Arrange
	Cerradura cerradura1 = new Cerradura(2321,3);
	
	
	//----------------------------- TESTS DE APERTURAS ------------------------------
	@Test
	void testAperturaCorrecta()
	{
		boolean resMental = true;
		
		//Act
		cerradura1.abrir(2321);
		
		//Assert
		assertEquals(cerradura1.estaAbierta(), resMental);
	}
	
	@Test
	void testAperturaYaAbiertaClaveInvalida()
	{
		boolean resMental = true;
		
		//Act
		cerradura1.abrir(1111);
		
		//Assert
		assertEquals(cerradura1.estaAbierta(), resMental);
	}
	
	@Test
	void testAperturaYaAbiertaClaveValida()
	{
		boolean resMental = true;
		
		//Act
		cerradura1.abrir(2321);
		
		//Assert
		assertEquals(cerradura1.estaAbierta(), resMental);
	}
	
	@Test
	void testAperturaFallida()
	{
		cerradura1.cerrar();
		boolean resMental = false;
		
		//act
		cerradura1.abrir(1111);
		
		//Assert
		assertEquals(cerradura1.estaAbierta(), resMental);
	}
	
	@Test
	void testBloquearCerradura()
	{
		cerradura1.cerrar();
		
		//act
		cerradura1.abrir(1111);
		cerradura1.abrir(2222);
		cerradura1.abrir(3333);
		cerradura1.abrir(2321);
		
		//assert
		assertEquals(cerradura1.fueBloqueada(), true);
		assertEquals(cerradura1.estaAbierta(),false);
	}
	
	
	@Test
	void testAperturaCerraduraBloqueadaClaveInvalida()
	{
		cerradura1.cerrar();
		
		//act
		cerradura1.abrir(1111);
		cerradura1.abrir(2222);
		cerradura1.abrir(3333);
		cerradura1.abrir(4444);
		
		//assert
		assertEquals(cerradura1.fueBloqueada(), true);
		assertEquals(cerradura1.estaAbierta(),false);
	}
}

