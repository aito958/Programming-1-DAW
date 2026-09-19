package RELACION08_ARRAYS;

import java.util.Scanner;

public class Ejercicio1SinArrays {
	private static Scanner teclado = new Scanner(System.in);
	static int NUM_NUMEROS = 5;

	public static void main(String[] args) {
		int contadorPositivos = 0;
		int sumTotal = 0;
		String cadenaNumeros = "";
		
		for (int i = 0; i < NUM_NUMEROS; i++) {
			System.out.println(i + " . Introduce un numero");
			int numero= teclado.nextInt();
	 
			cadenaNumeros  = numero +"\n" + cadenaNumeros;
			
			if(numero > 0) {
		 contadorPositivos++;
	 }
		
		sumTotal = sumTotal + numero;	
		}
	System.out.println(cadenaNumeros);
	System.out.println("Hay " + contadorPositivos + " numeros positivos");
	System.out.println("La suma total es = " + sumTotal);
	}

}
