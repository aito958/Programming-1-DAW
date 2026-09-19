package Ejemplo;

import java.util.Scanner;

public class ejercicio2 {

	private static Scanner teclado = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		System.out.println("Escribe tu edad");

		int num1;
		
		num1 = Integer.parseInt(teclado.nextLine());

		
		if(num1 > 30) {
		System.out.println("Tas viejo");
		}
		else {
			System.out.println("Tas bien");
	
		}
	
	}
		
}		
