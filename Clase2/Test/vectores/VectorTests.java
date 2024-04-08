package vectores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VectorTests {
	
	//Arrange
	Vector vec1 = new Vector(1,1,3);
	Vector vec2 = new Vector(1,2,4);

	@BeforeEach
	public void setup()
	{
		System.out.println("Probando test");
	}
	
	@Test
	void testSuma()
	{
		//Arrange
		Vector vecSSol = new Vector(2,3,7);
		
		//Act
		Vector vecS = vec1.sumar(vec2);
		
		//vecS.touch(); //Prueba para forzar error
		
		//Assert
		assertEquals(vecS, vecSSol);		
	}
	
	@Test
	void testMultiplicacion()
	{
		//Arrange
		Vector vecMSol = new Vector(2,2,6);
		
		//Act
		Vector vecM = vec1.multiplicar(2);
		
		//Assert
		assertEquals(vecM, vecMSol);		
	}
	
	@Test
	void testOpuesto()
	{
		//Arrange
		Vector vecOSol = new Vector(-1,-1,-3);		
		
		//Act
		Vector vecO = vec1.opuesto();
		
		//Assert
		assertEquals(vecO, vecOSol);		
	}
	
	@Test
	void testResta()
	{	
		//Arrange
		Vector vecRSol = new Vector(0,-1,-1);		
		
		//Act
		Vector vecR = vec1.restar(vec2);
		
		//Assert
		assertEquals(vecR, vecRSol);		
	}
}
