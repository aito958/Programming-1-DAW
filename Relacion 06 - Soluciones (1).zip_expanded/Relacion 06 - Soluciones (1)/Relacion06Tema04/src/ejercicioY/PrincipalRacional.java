package ejercicioY;

import java.util.Scanner;

public class PrincipalRacional {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Racional racional1 = PrincipalRacional.crearRacional();
		Racional racional2 = PrincipalRacional.crearRacional();
		Racional racional3;

		System.out.println("La suma es " + racional1.sumar(racional2));
		System.out.println("La resta es " + racional1.restar(racional2));
		System.out.println("La multiplicación es " + racional1.multiplicar(racional2));
		System.out.println("La división es " + racional1.dividir(racional2));

		racional1.simplificar();
		racional2.simplificar();
		System.out.println("El racional 1 simplicado es " + racional1 + " y el 2 es " + racional2);

		racional3 = racional1.copiar();

		if (racional3.equals(racional1)) // Cuidado: si los comparas con == no serían iguales
			System.out.println("Los racionales 3 y 1 son iguales");
		else
			System.out.println("Los racionales 3 y 1 son distintos");
	}

	/**
	 * Método que pide el numerador y el denominador y crea un racional.
	 * 
	 * @return el racional construido con el numerador y el denominador.
	 */
	private static Racional crearRacional() {
		int numerador, denominador;
		Racional racional;

		System.out.println("Introduce el numerador: ");
		numerador = Integer.parseInt(teclado.nextLine());

		do {
			System.out.println("Introduce el denominador:");
			denominador = Integer.parseInt(teclado.nextLine());
		} while (denominador == 0);

		racional = new Racional(numerador, denominador);

		return racional;
	}
}
