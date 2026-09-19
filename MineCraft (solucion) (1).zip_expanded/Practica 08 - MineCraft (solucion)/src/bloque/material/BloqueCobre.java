package bloque.material;

import bloque.Bloque;
import bloque.categoria.BloqueMineral;
import juego.Jugador;

public class BloqueCobre extends BloqueMineral {

	public BloqueCobre(int x, int y, int z) {
		super(x, y, z);
		this.tipo = Bloque.COBRE;
	}

	public void destruir(String herramienta, Jugador jugador) {
		if (herramienta.equals(BloqueMineral.HERRAMIENTA)) {
			jugador.sumaMateria(tipo);
		}
		super.destruir();
	}
}
