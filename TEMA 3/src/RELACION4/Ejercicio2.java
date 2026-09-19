package RELACION4;

import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero, para calcular los factoriales");
		int num = teclado.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.println(i + "! = " + factorial(i));
		}
	}

	public static int factorial(int num) {

		int factorial = 1;

		if (num < 0) {
			System.out.println("Error: el número no puede ser negativo.");
			return -1;
		} else if (num == 0) {
			factorial = 1;
		} else {
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;
			}
		}
		return factorial;
	}
}
