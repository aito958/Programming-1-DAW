package Ejemplo;

import java.util.Scanner;

public class Ejemplodeclase {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Introducir un caracter");
		char c = teclado.next().charAt(0);
	
		System.out.println("El caracter es :"+c);
		
		int num = c;
	
		System.out.println("El numero es : "+num);
	}

}
