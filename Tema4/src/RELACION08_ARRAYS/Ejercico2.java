package RELACION08_ARRAYS;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercico2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa una frase: ");
		String frase = teclado.nextLine();
		
		frase = frase.toLowerCase();
		
		String abecedario = "abcdefghijklmnopqrstuvwxyz";
		
		int[] contadores = new int[abecedario.length()];
		
		for (char letra : frase.toCharArray()) {
			int indice = abecedario.indexOf(letra);
			if (indice != -1) {
				contadores[indice]++;
			}
		}
		
		System.out.println("\nArray de contadores: ");
		System.out.println(Arrays.toString(contadores));
		
		System.out.println("\nResultado:");
		System.out.println("------------------------------");
		
		for (int i = 0; i < abecedario.length(); i++) {
			if (contadores[i] > 0) {
				System.out.println("La letra '" + abecedario.charAt(i) + 
								 "' aparece " + contadores[i] + " veces");
			}
		}
		
		teclado.close();
	}
}