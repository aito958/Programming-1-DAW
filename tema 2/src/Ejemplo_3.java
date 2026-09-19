import java.util.Scanner;

public class Ejemplo_3 {

	private static final Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		
		System.out.println("Introduce un número");
		int num = teclado.nextInt();
		
		int cont =0;
		do {
			num = num / 10;
		cont++;
		
		}while(num >0);
		
		System.out.println("El resultado es "+ num );
	}


}
