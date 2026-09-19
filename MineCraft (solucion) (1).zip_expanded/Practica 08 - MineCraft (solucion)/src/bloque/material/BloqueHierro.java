package bloque.material;

import bloque.Bloque;
import bloque.categoria.BloqueMineral;
import juego.Jugador;

public class BloqueHierro extends BloqueMineral {

	public BloqueHierro(int x, int y, int z) {
		super(x, y, z);
		this.tipo = Bloque.HIERRO;
	}

	public void destruir(String herramienta, Jugador jugador) {
		if (herramienta.equals(BloqueMineral.HERRAMIENTA)) {
			jugador.sumaMateria(tipo);
		}
		super.destruir();
	}
}
