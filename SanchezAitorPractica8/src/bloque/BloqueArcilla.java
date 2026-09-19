package bloque;

import juego.HERRAMIENTA;

public class BloqueArcilla extends Bloque {

	public BloqueArcilla(int x, int z, int y) {

	}

	public String destruir(String Arcilla) {
	
		if(HERRAMIENTA.equals(HERRAMIENTA.PALA) ) {
			
			return Arcilla;
		}
	}
}
