package RELACIONString4;

import java.util.Scanner;

public class Ejemploclase {

    private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		
		System.out.println("Introduce un numero ");
		int numero = teclado.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			for(int j = 1; j <= i; j++ ) {
			
		
			System.out.print(j);
		
		
		
			}
			System.out.println();

		}
	}
}
