package ejercicioYconExcepciones;

import java.util.Scanner;

public class PrincipalRacional {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Racional racional1;
		Racional racional2;
		Racional racional3;

		racional1 = PrincipalRacional.crearRacional("1");
		racional2 = PrincipalRacional.crearRacional("2");

		System.out.println("La suma es " + racional1.sumar(racional2));
		System.out.println("La resta es " + racional1.restar(racional2));
		System.out.println("La multiplicación es " + racional1.multiplicar(racional2));
		System.out.println("La división es " + racional1.dividir(racional2));

		racional1.simplificar();
		racional2.simplificar();
		System.out.println("El racional 1 simplicado es " + racional1 + " y el 2 es " + racional2);

		racional3 = racional1.copiar();

		// Cuidado: si los comparas con == no serían iguales
		if (racional3.equals(racional1))
			System.out.println("Los racionales 3 y 1 son iguales");
		else
			System.out.println("Los racionales 3 y 1 son distintos");

	}

	/**
	 * Método que pide el numerador y el denominador y crea un racional.
	 * 
	 * @return el racional construido con el numerador y el denominador.
	 * @throws RacionalException
	 */
	private static Racional crearRacional(String cadena) {
		int numerador, denominador;
		Racional racional = null;
		boolean hayError;

		do {

			try {
				hayError = false;
				numerador = solicitarNumeroEntero("Introduce el numerador " + cadena + ":");

				denominador = solicitarNumeroEntero("Introduce el denominador " + cadena + ":");

				racional = new Racional(numerador, denominador);
			} catch (RacionalException ex) {
				hayError = true;
				System.out.println(ex.getMessage());
			}
		} while (hayError);

		return racional;
	}

	private static int solicitarNumeroEntero(String mensaje) {

		String cadena;
		int numero = 0;
		boolean error;

		do {
			try {
				error = false;
				System.out.println(mensaje);
				cadena = teclado.nextLine();
				numero = Integer.parseInt(cadena);
			} catch (NumberFormatException ex) {
				error = true;
				System.out.println("No es un numero");
			}
		} while (error);

		return numero;
	}
}
