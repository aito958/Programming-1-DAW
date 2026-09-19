package RELACIONString4;

import java.util.Scanner;

public class refuerzocadena5 {

	private static final String O = "o";
	private static final String A = "a";
	private static final String E = "e";
	private static final String I = "i";
	private static final String U = "u";

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un nombre");
		String nombre = teclado.nextLine();

		metodoDiminutivo(nombre);

	}

	private static void metodoDiminutivo(String nombre) {
		String nombreFinal = nombre.substring(0, nombre.length() - 1);

		if (nombre.endsWith(A)) {

			System.out.println(nombreFinal + "ita");
		} else if (nombre.endsWith(O)) {

			System.out.println(nombreFinal + "ito");
		} else if (nombre.endsWith(E) || nombre.endsWith(I) || nombre.endsWith(U)) {
			System.out.println("El nombre puede ser masculino o femenino. Escriba M para masculino o F para femenino:");
			String generoNombre = teclado.nextLine().toUpperCase();

			if (generoNombre.equals("M")) {

				if (nombre.endsWith(E)) {
					System.out.println(nombreFinal + "ito");
				} else if (nombre.endsWith(I)) {
					System.out.println(nombreFinal + "ito");
				} else if (nombre.endsWith(U)) {
					System.out.println(nombreFinal + "ito");
				}
			} else if (generoNombre.equals("F")) {

				if (nombre.endsWith(E)) {
					System.out.println(nombreFinal + "ita");
				} else if (nombre.endsWith(I)) {
					System.out.println(nombreFinal + "ita");
				} else if (nombre.endsWith(U)) {
					System.out.println(nombreFinal + "ita");
				}
			} else {
				System.out.println("Género no válido. Debes introducir M o F.");
			}

		}
	}

}
