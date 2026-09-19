import java.util.Scanner;

public class Ejercicio_10 {
	private static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el valor de la base");

		int base = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el caracter");
		char caracter = teclado.nextLine().charAt(0);

		for (int i = 1; i <= base; i = i + 2) {
			for (int k = 0; k <= ((base - i) / 2) - 1; k++) {
				System.out.print(' ');
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print(caracter);
			
		}
			System.out.println();

		}
	}
}
