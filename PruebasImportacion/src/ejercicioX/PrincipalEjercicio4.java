/**
 * Escribir un método main que cree dos números complejos (solicitando parte real e 
 * imaginaria) y muestre cual es el número complejo resultado de la suma y de la resta.
 */
package ejercicioX;

import java.util.Scanner;

public class PrincipalEjercicio4 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Complejo complejo1, complejo2;
		Complejo complejoSuma;
		Complejo complejoResta;

		System.out.println("Introduce los datos del primer complejo");
		complejo1 = PrincipalEjercicio4.crearComplejo();

		System.out.println("Introduce los datos del segundo complejo");
		complejo2 = PrincipalEjercicio4.crearComplejo();

		complejoSuma = complejo1.sumar(complejo2);
		complejoResta = complejo1.restar(complejo2);

		System.out.println("El resultado de la suma es el complejo " + complejoSuma);
		System.out.println("El resultado de la resta es el complejo" + complejoResta);
	}

	/**
	 * Método que crea un nuevo complejo solicitando los datos por teclado
	 * 
	 * @return Complejo, objeto complejo creado
	 */
	private static Complejo crearComplejo() {
		double parteReal;
		double parteImaginaria;
		Complejo complejo;

		parteReal = PrincipalEjercicio4.solicitarDouble("Parte real: ");
		parteImaginaria = PrincipalEjercicio4.solicitarDouble("Parte imaginaria: ");
		complejo = new Complejo(parteReal, parteImaginaria);

		return complejo;
	}

	/**
	 * Método que solicita un nímero de tipo double por teclado, mostrando
	 * previamente un mensaje por pantalla
	 * 
	 * @param msg
	 * @return numero, número leído
	 */
	private static double solicitarDouble(String msg) {
		double numero;

		System.out.println(msg);
		numero = Double.parseDouble(teclado.nextLine());

		return numero;
	}
}
