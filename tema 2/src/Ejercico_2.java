import java.util.Scanner;

public class Ejercico_2 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		int base, exponente;
		
		do {
		System.out.println("Introduce el valor de la base");
		base = teclado.nextInt();
		} while (base  < 0);
	
		do {
		System.out.println("Introduce el valor del exponente");
		exponente = teclado.nextInt();
		} while (exponente < 0);
	
		int resultado = 0;
		
		for(int i = 1; 1 <= exponente; i++) {
			resultado  = resultado * base;
		}

		System.out.println("El resultado es " +resultado);
}
}