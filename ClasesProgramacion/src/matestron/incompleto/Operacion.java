package matestron.incompleto;

import java.util.Random;

/**
 * @author y0rg 
 * Esta clase representa UNA operación de las múltiples 
 * que debe generar el juego
 */

public class Operacion {

	// El tipo de operación lo definiremos con un entero, de modo que...
	public static final int SUMA = 1;
	public static final int RESTA = 2;
	public static final int MULTIPLICACION = 3;
	public static final int DIVISION = 4;

	private int operacion;
	private int numero;
	
	/**
	 * Este es el constructor, deberemos iniciar los valores de la "operacion"
	 */
	public Operacion() {
		Random random = new Random();
		
		// Generar operación aleatoria (1-4)
		this.operacion = 1 + random.nextInt(4);  
		
		// Generar número aleatorio (1-99)
		this.numero = 1 + random.nextInt(99);
	}

	/**
	 * Metodo que devuelva en texto el signo de la operación
	 * Si el signo de la operación es 1, devuelve la cadenas "+";
	 * si la operacion es 2, el signo "-";
	 * si la operación es 3, el signo "*";
	 * si la operación es 4, el signo "/";
	 * 
	 * @return el signo en texto de la operacion
	 */
	public String signoOperacion() {
		switch(operacion) {
		// Si el signo de la operación es 1, devuelve la cadenas "+";
		case SUMA:
				return "+";
		//si la operacion es 2, el signo "-";
		case RESTA:
				return "-";
		//	 si la operación es 3, el signo "*";
		case MULTIPLICACION:
				return "*";
		//si la operación es 4, el signo "/";	
		case DIVISION:
				return "/";
			default:
				return null;
		}
	}

	/**
	 * Metodo que calcula la operacion a partir del signo de la operacion,
	 * del numero que contiene la operacion y de un valor que se le pasa,
	 * que representa la puntuacion del usuario.
	 * Se usan los metodos de la clase Math para los calculos.
	 * 
	 * @param puntuacionJugador representa la puntuacion del usuario en el momento 
	 *                        que el metodo es invocado
	 * @return devuelve el resultado de la operacion
	 * @throws ArithmeticException si hay overflow o división por cero
	 */
	public long calcula(long puntuacionJugador) throws ArithmeticException {
		long resultado = 0;
		
		try {
			switch(operacion) {
				case SUMA:
					resultado = Math.addExact(puntuacionJugador, numero);
					break;
				case RESTA:
					resultado = Math.subtractExact(puntuacionJugador, numero);
					break;
				case MULTIPLICACION:
					resultado = Math.multiplyExact(puntuacionJugador, numero);
					break;
				case DIVISION:
					if (numero == 0) {
						throw new ArithmeticException("División por cero(por si no tienes la ESO , no se puede dividir entre 0 Albert Einstn");
					}
					resultado = puntuacionJugador / numero;
					break;
			}
		} catch (ArithmeticException e) {
			throw e; 
		}
		
		return resultado;
	}

	/**
	 * Metodo toString que imprime la operación
	 * Tendra como parametro de entrada la puntuacion actual del usuario
	 * 
	 * @param calculoUsuario la puntuación actual del usuario
	 * @return la representación en texto de la operación
	 */
	public String toString(long calculoUsuario) {
		return calculoUsuario + signoOperacion() + numero;
	}
}