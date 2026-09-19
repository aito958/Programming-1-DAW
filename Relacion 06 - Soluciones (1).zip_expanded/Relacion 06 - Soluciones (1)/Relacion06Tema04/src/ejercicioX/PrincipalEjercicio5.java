/**
 * Programa que muestre un menú de este tipo:

	1. Sumar complejos: Debe solicitar dos números complejos y mostrar el resultado 
	   de la suma.
	2. Restar complejos: Debe solicitar dos número complejos y mostrar el resultado 
	   de la resta.
	3. Salir.
 *
 */
package ejercicioX;

import java.util.Scanner;

public class PrincipalEjercicio5 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;

		do {
			// Mostrar el menú
			PrincipalEjercicio5.mostrarMenu();

			// solicitar opción
			opcion = PrincipalEjercicio5.solicitarOpcion();

			// Realizar la opción correspondiente
			PrincipalEjercicio5.tratarOpciones(opcion);

		} while (opcion != 3);
	}

	/**
	 * Método que muestra el menú de opciones.
	 */
	private static void mostrarMenu() {
		System.out.println("Menú de complejos");
		System.out.println("1. Sumar complejos");
		System.out.println("2. Restar complejos");
		System.out.println("3. Salir");
	}

	/**
	 * Método que solicita la opción del menú.
	 * 
	 * @return la opción escogida.
	 */
	private static int solicitarOpcion() {
		int opcion;

		do {
			System.out.println("Introduce opción(1-3): ");
			opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < 1 || opcion > 3);

		return opcion;
	}

	/**
	 * Método que trata cada una de las opciones
	 * 
	 * @param opcion, opción escogida
	 */
	private static void tratarOpciones(int opcion) {

		Complejo complejo1;
		Complejo complejo2;
		Complejo complejoResultado;

		switch (opcion) {
		case 1: {
			complejo1 = PrincipalEjercicio5.crearComplejo();
			complejo2 = PrincipalEjercicio5.crearComplejo();
			complejoResultado = complejo1.sumar(complejo2);
			System.out.println("El resultado de sumar los complejos anteriores es " + complejoResultado);
			break;
		}
		case 2: {
			complejo1 = PrincipalEjercicio5.crearComplejo();
			complejo2 = PrincipalEjercicio5.crearComplejo();
			complejoResultado = complejo1.restar(complejo2);
			System.out.println("El resultado de restar los complejos anteriores es " + complejoResultado);
			break;
		}
		}
	}

	/**
	 * Método que crea un Complejo
	 * 
	 * @return un objeto Complejo
	 */
	private static Complejo crearComplejo() {
		double parteReal;
		double parteImaginaria;
		Complejo complejo;

		System.out.println("Introduzca parte real: ");
		parteReal = Double.parseDouble(teclado.nextLine());

		System.out.println("Introduzca parte imaginaria: ");
		parteImaginaria = Double.parseDouble(teclado.nextLine());

		complejo = new Complejo(parteReal, parteImaginaria);

		return complejo;
	}
}
