import java.util.Scanner;

public class Ejemplos {

	public static void main(String[] args) {
	}

	private static Scanner teclado = new Scanner(System.in);

	public static void main1(String[] args) {

		System.out.println("Bienvenidos a la calculadora de areas");

		System.out.println("Introduce base");
		int base = teclado.nextInt();

		System.out.println("Introduce altura");
		int altura = teclado.nextInt();

		System.out.println("El area del rectangulo es " + calcularAreaRectangulo(base, altura));

		System.out.println("El area del triangulo es " + calcularAreaTriangulo(base, altura));
		muestraTexto();
	}

	private static int calcularAreaRectangulo(int base, int altura) {

		int area = base * altura;

		return area;
	}

	private static float calcularAreaTriangulo(int base, int altura) {

		float area = base * altura / 2;

		return area;
	}

	private static void muestraTexto() {
		System.out.println("Texto mostrado desde un metodo");
	}
	}

