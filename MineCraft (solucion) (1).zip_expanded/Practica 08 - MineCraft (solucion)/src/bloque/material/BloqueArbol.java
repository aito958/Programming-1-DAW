package bloque.material;

import bloque.Bloque;
import bloque.categoria.BloqueVegetal;
import juego.Jugador;

public class BloqueArbol extends BloqueVegetal {

	public BloqueArbol(int x, int y, int z) {
		super(x, y, z);
		this.tipo = Bloque.ARBOL;
	}

	public void destruir(String herramienta, Jugador jugador) {
		if (herramienta.equals(BloqueVegetal.HERRAMIENTA)) {
			jugador.sumaMateria(tipo);
		}
		super.destruir();
	}
}
