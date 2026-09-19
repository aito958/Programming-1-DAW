package ARRAYS;

import java.util.Scanner;

public class ArraysParametro {

	private static final int TOTAL_ALUMNOS = 10;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		double[] vectorNotas = new double[ TOTAL_ALUMNOS];
		insertarNotasEnVector(vectorNotas);
		mostrarVectorNotas(vectorNotas);

	}

	private static void insertarNotasEnVector(double[] vectorNotas) {
		for (int i = 0; i < vectorNotas.length; i++) {
			System.out.println("Introduce la nota de alumno " + (i + 1));
			vectorNotas[i] = Double.parseDouble(teclado.nextLine());
		}
	}

	private static void mostrarVectorNotas(double[] vectorNotas) {
		for (int i = 0; i < vectorNotas.length; i++) {
			System.out.println("  nota del alumno " + (i + 1) + ": " + vectorNotas[i]);
		}
	}
}
