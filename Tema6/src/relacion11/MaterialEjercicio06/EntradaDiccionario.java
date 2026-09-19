package relacion11.MaterialEjercicio06;

import java.util.HashSet;

public class EntradaDiccionario {

	private String palabra;
	private HashSet<String> listaSignificados;
	
	
	public EntradaDiccionario( String palabra, String significado) {
		this.palabra = palabra;
		listaSignificados = new HashSet<String>();
		listaSignificados.add(significado);
	
	}	
	
	public boolean annadirSignificado(String nuevoSignificado) {
		return listaSignificados.add(nuevoSignificado);
	}

	public String toString() {
		return palabra+ " [listaSignificados=" + listaSignificados + "]";
	}
	
}
