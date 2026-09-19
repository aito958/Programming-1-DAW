package Geometria;

public class MainCuadrado {

	public static void main(String[] args) {

		Cuadrado cuadrado1 = new Cuadrado(2);
		Rectangulo rec = new Rectangulo(4, 3);

		cuadrado1.dibujar();
		rec.dibujar();

		cuadrado1.x = 10;

		Figura f1 = new Cuadrado(3);
		Figura f2 = new Rectangulo(3, 6);

		for( Figura f : arrayFiguras) {
		if (f1 instanceof Cuadrado) {
			System.out.println("Soy un cuadrado");

			((Cuadrado) f1).mover(0, 0);
		} else {
			System.out.println("No soy nada");
		}
		}
	}
}
