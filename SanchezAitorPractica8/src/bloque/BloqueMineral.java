package bloque;

import juego.Jugador;

public class BloqueMineral extends Bloque {
	    private String tipo;
		
	    boolean estaDestruido = true;

	    @Override
	    public void destruir(String herramienta, Jugador jugador) {
	        if (!estaDestruido) {
	            if ("Pico".equalsIgnoreCase(herramienta)) {
	                if ("Hierro".equals(tipo)) {
	                    jugador.sumaMateria(4);  
	                } else if ("Cobre".equals(tipo)) {
	                    jugador.sumaMateria(5);  
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
	

