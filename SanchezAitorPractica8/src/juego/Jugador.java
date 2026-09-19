package juego;

import bloque.Bloque;

/**
 * Clase que representa el jugador del MineMonroy
 * @author y0rg
 *
 */
public class Jugador {
	
	//Nombre del jugador
	String nombre;

	//Lista de materias primas del jugador
	int[] materiasPrimas = new int[Bloque.NUM_MATERIAS];

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * No hace falta explicarlo... o si?
	 */
	public String toString() {
		return this.nombre + " - Materias primas recolectadas\n" + "Plantas: " + materiasPrimas[Bloque.PLANTA] + "\nArboles: "
				+ materiasPrimas[Bloque.ARBOL] + "\nArcilla: " + materiasPrimas[Bloque.ARCILLA] + "\nAlbero: "
				+ materiasPrimas[Bloque.ALBERO] + "\nHierro: " + materiasPrimas[Bloque.HIERRO] + "\nCobre: " + materiasPrimas[Bloque.COBRE];
	}

	
	/**
	 * Metodo que añade una unidad de una materia "tipo"
	 * @param tipo, entero que representa el tipo de Materia.
	 * @see bloque.Bloque.java
	 */
	public void sumaMateria(int tipo) {
		switch (tipo) {
		case Bloque.ALBERO: {
			materiasPrimas[Bloque.ALBERO]++;	
			break;
		}
		case Bloque.ARBOL: {
			materiasPrimas[Bloque.ARBOL]++;	
			break;
		}
		case Bloque.ARCILLA: {
			materiasPrimas[Bloque.ARCILLA]++;
			break;
		}
		case Bloque.COBRE: {
			materiasPrimas[Bloque.COBRE]++;
			break;
		}
		case Bloque.HIERRO: {
			materiasPrimas[Bloque.HIERRO]++;
			break;
		}
		case Bloque.PLANTA: {
			materiasPrimas[Bloque.PLANTA]++;	
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		
	}

}
