/**
 * Programa que usa un método que informa de si un año es o no bisiesto.
 * Un año es bisiesto si es múltiplo de 4, a excepción de los que, siendo múltiplos de 4 
 * son múltiplos de 100 y no de 400.
 * @author Señor-X
 *
 */
package apartado2;
import java.util.Scanner;


public class UtilidadesFecha {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variables
		int anio;
		boolean esBisiesto;
		
		// Se solicita el año
		anio = UtilidadesFecha.solicitarAnio();
		
		// Se comprueba si es o no bisiesto
		esBisiesto = UtilidadesFecha.comprobarBisiesto(anio);
		
		if(esBisiesto == true){
			System.out.println("El año " + anio + " es bisiesto.");
		}
		else{
			System.out.println("El año " + anio + " no es bisiesto.");
		}
	}

	/**
	 * Comprueba si el año es bisiesto
	 * @param anio
	 * @return true si bisiesto, false si no
	 */
	public static boolean comprobarBisiesto(int anio){
		boolean esBisiesto = false;
		
		//Un año es bisiesto si es múltiplo de 4, a excepción de los que, siendo múltiplos de 4 
		// son múltiplos de 100 y no de 400.
		if (anio % 4 == 0) {
			esBisiesto = true;
			
			if (anio % 100 == 0 && anio % 400 != 0){
				esBisiesto = false;
			}
		}
		
		return esBisiesto;
	}
	
	/**
	 * Método que solicita un año.
	 */
	public static int solicitarAnio(){
		int anio;
		
		do {
			System.out.println("Introduzca un año: ");
			anio = Integer.parseInt(teclado.nextLine());
		} while (anio < 0);
		
		return anio;
	}
}
