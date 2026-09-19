/**
 * Programa que usa un método que dado un número positivo devuelve su factorial.
 * Si el número es negativo se mostrará un mensaje de error y se devolverá un -1. 
 * 
 * @author Señor-X
 * 
 * */
package apartado3;

public class Factorial {

	/**
	 * Método que calcula el factorial de un número positivo. Si el número es
	 * negativo muestra un mensaje de error y devuelve un -1
	 * 
	 * @param numero numero
	 * @return factorial del numero, o -1 si es negativo
	 */
	public static long calcularFactorial(int numero) {
		long factorial = 1;
		int contador;

		if (numero < 0) {
			System.out.println("Error, no puede calcularse el factorial de un negativo.");
			factorial = -1;
		} else {
			for (contador = 1; contador <= numero; contador++) {
				factorial = factorial * contador;
			}
		}

		return factorial;
	}
	
	/**
	 * Método que calcula el factorial (DE MANERA RECURSIVA) de un número positivo. 
	 * Si el número es negativo muestra un mensaje de error y devuelve un -1
	 * 
	 * @param numero numero
	 * @return factorial del numero, o -1 si es negativo
	 */
	public static long calcularFactorialRecursivo(int numero) {
		long factorial = 1;
		
		if (numero < 0) {
			System.out.println("Error, no puede calcularse el factorial de un negativo.");
			factorial = -1;
		} else {
			if (numero == 1) {
				factorial = 1;
			} else {
				factorial = numero * calcularFactorialRecursivo(numero-1);
			}
		}
		
		return factorial;
	}
}
