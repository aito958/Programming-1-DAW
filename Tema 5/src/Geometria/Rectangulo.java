package Geometria;

public class Rectangulo extends Figura {

	private double lado1;
	private double lado2;

	public Rectangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	

	public void dibujar() {
		for (int i = 0; i < lado1; i++) {
			for (int j = 0; j < lado2; j++) {

				System.out.print("x");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("CUADRADO");
		System.out.println("------------");
		System.out.println("RECTANGULO");
		System.out.println();
	System.out.println("fin");
	}

	public double get_lado1() {
		return lado1;
	}

	public double area() {
		return lado1  * lado2;
	}
						
}
