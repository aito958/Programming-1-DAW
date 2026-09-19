package bloque.material;

import bloque.Bloque;
import juego.Jugador;

public class BloqueVacio extends Bloque {

	public BloqueVacio(int x, int y, int z) {
		super(x, y, z);
	}

	public void destruir(String herramienta, Jugador jugador) {
		super.destruir();
	}

}
