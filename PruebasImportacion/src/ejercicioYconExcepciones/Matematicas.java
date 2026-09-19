/**
 * Clase que ofrece distintas operaciones matemáticas.
 *
 */
package ejercicioYconExcepciones;

public class Matematicas {

	public static int mcd(int numero1, int numero2) throws MatematicasException {
		int contador;
		int mcd = 1;
		boolean encontradoMcd = false;

		if (numero1 == 0 || numero2 == 0) {
			throw new MatematicasException("No puede calcularse el mcd");
		}
		if (numero1 < 0)
			numero1 = -numero1;
		if (numero2 < 0)
			numero2 = -numero2;

		if (numero1 > numero2)
			contador = numero2;
		else
			contador = numero1;

		while (contador >= 1 && !encontradoMcd) {
			if (numero1 % contador == 0 && numero2 % contador == 0) {
				mcd = contador;
				encontradoMcd = true;
			} else
				contador = contador - 1;

		}

		return mcd;
	}
}
