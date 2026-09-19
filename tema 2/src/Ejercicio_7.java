import java.util.Scanner;

public class Ejercicio_7 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		int contador;
		double media = 0;
		int cantidad_de_número;
double sumanum = 0;
		
		do {

			System.out.println("Introduce una cantidad de número");
			cantidad_de_número = Integer.parseInt(teclado.nextLine());

		} while (cantidad_de_número <= 0);
		for (int i = 0; i < cantidad_de_número; i++) {
			
		System.out.println("Introduce un numero");
	num = (int) teclado.nextDouble();
	sumanum = sumanum + num ;
	
		}

		media = sumanum / cantidad_de_número;

		System.out.println("la media es" + media);

	}

}