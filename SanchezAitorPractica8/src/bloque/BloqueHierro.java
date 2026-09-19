package bloque;

import juego.HERRAMIENTA;

public class BloqueHierro extends Bloque  implements HERRAMIENTA {

	public BloqueHierro (int x , int z , int y) {

	public String destruir(String Hierro) {

		if (HERRAMIENTA.equals(HERRAMIENTA.PICO)) {

			return Hierro;

		}
	}
}
