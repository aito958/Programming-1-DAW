package bloque.material;

import bloque.Bloque;
import bloque.categoria.BloqueVegetal;
import juego.Jugador;

public class BloquePlanta extends BloqueVegetal {

	public BloquePlanta(int x, int y, int z) {
		super(x, y, z);
		this.tipo = Bloque.PLANTA;
	}

	public void destruir(String herramienta, Jugador jugador) {
		if (herramienta.equals(BloqueVegetal.HERRAMIENTA)) {
			jugador.sumaMateria(tipo);
		}
		super.destruir();
	}
}
