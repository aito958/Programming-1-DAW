package bloque;

import juego.HERRAMIENTA;

public class BloquePlanta extends Bloque {

	public BloquePlanta (int x , int z , int y) {
		
	}
	
	public String  destruir(String Planta) {
	
		if(HERRAMIENTA.equals(HERRAMIENTA.HACHA) ) {
		
		return Planta;
		
		}
	}
}
