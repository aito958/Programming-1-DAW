package bloque;

import juego.Jugador;

public class BloqueVegetal extends Bloque {
	private String tipo;

	public void destruir(String herramienta, Jugador jugador) {

		int[] materiasPrimas = new int[Bloque.NUM_MATERIAS];

		boolean estaDestruido = true;

		if (!estaDestruido) {
			if ("Hacha".equalsIgnoreCase(herramienta)) {
				if ("Planta".equals(tipo)) {
					jugador.sumaMateria(0);
				} else if ("Arbol".equals(tipo)) {
					jugador.sumaMateria(1); // í
				}
			}
			marcarDestruido();
		}
	}

	private void marcarDestruido() {

		if (Bloque.ALBERO > 1 || Bloque.ARBOL > 1 || Bloque.ARCILLA > 1 || Bloque.COBRE > 1 || Bloque.HIERRO > 1) {

		}

	}
}
