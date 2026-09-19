package tareaGeometria;
public class Coordenadas {

	public static void main(String[] args) {

		Punto p1 = new Punto(-2, 5);
		System.out.println(p1);

		p1.mover(1, 1);
		System.out.println(p1);

		Punto p2 = new Punto(2  , 0 );
		System.out.println(p1);
		
		p2.mover(-5, 9);
	System.out.println(p2);
	}

}
