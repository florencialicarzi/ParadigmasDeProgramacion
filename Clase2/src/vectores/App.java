package vectores;

public class App {

	public static void main(String[] args) {

		Vector vec1 = new Vector(1,1,3);
		Vector vec2 = new Vector(1,2,4);
		
		System.out.println("vec1" + vec1.toString());
		System.out.println("vec2" + vec2.toString());
		
		
		Vector vecM = vec1.multiplicar(2);
		Vector vecS = vec1.sumar(vec2);
		Vector vecR = vec1.restar(vec2);
		Vector vecO = vec1.opuesto();
		
		Vector vecSSol = new Vector(2,3,7);
		
		System.out.println("\n---------OPERACIONES---------");
		System.out.println("vec1 * 2 =" + vecM.toString());
		System.out.println("vec1 + vec2 =" + vecS.toString());
		System.out.println("vec1 - vec2 = " + vecR.toString());
		System.out.println("Opuesto= " + vecO.toString() );
		
		System.out.println("\n---------TESTING---------");
		System.out.println("Suma correcta? " + vecS.equals(vecSSol));
	}

}
