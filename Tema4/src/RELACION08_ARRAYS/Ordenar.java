package RELACION08_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantos numeros quieres guardar?");

		int longuitud = teclado.nextInt();

		int arrays[] = new int[longuitud];

		for (int i = 0; i < longuitud; i++) {

			int numero;

			System.out.println("Ingrese el numero : " + (i + 1));
			numero = teclado.nextInt();
			arrays[i] = numero;
		}
		System.out.println("Array desordenado");

		for (int i = 0; i < longuitud; i++) {
			System.out.println(arrays[i]);
		}

		int guardado;

		for (int i = 0; i < (longuitud - 1); i++) {
			for (int j = 0; j < (longuitud - 1); j++) {
				if (arrays[j] > arrays[j + 1]) {
					guardado = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = guardado;
				}
			}
		}
		System.out.println(" Array ordenado");

		for (int num : arrays) {
			System.out.print(num + " ");
		}

	}

}
