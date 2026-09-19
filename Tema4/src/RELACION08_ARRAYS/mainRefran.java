package RELACION08_ARRAYS;

import java.util.Scanner;

public class mainRefran {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		Refran[] refranero = new Refran[50];
		int contador = 0;

		do {
			System.out.println("Bienvenido al refranero");
			System.out.println("1. Añade un refran");
			System.out.println("2. Buscar un refran que contegana una palabra");
			System.out.println("3. Lista refranes guardados");
			System.out.println("4. salir");

			System.out.println("Elige una opcion");
			opcion = Integer.parseInt(teclado.next());

			switch (opcion) {
			case 1:
				System.out.println("Introduce el texto del refran ");
				String texto = teclado.next();

				System.out.println("Introduce la popilaridad");
				int popularidad = Integer.parseInt(teclado.nextLine());

				Refran refran = new Refran(texto, popularidad);
				refranero[contador] = refran;
				contador++;
				break;
			case 2:
				System.out.println("Introduce la palabra  a buscar");

				break;
			case 3:
				System.out.println("Lista de todos lso refranes");
				for (int i = 0; i < contador; i++) {
					System.out.println(refranero[i]);
				}
				break;
			case 4:

				break;

			default:
				break;
			}

		} while (opcion != 4);

	}

}
