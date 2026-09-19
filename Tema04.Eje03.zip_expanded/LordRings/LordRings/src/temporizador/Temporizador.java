/*
 * Temporizador.java
 */

package temporizador;

import soluciones.EstrategiaSolucion;

/**
 * Contiene toda la l�gica necesaria para medir tiempos de ejecuci�n de algoritmos. 
 * Para medir un algoritmo, la clase que lo contenga tiene que implementar la interfaz "EstrategiaSolucion". 
 * Sus m�todos se utilizan en esta clase. Para medir el tiempo de ejecuci�n, se crea un objeto Temporizador
 * y se invoca al m�todo cronometra, pas�ndole como argumento el objeto que implementa la interfaz Temporizable. 
 * El m�todo CRONOMETRA mide el tiempo de ejecuci�n de su SOLUCI�N. Posteriormente se puede 
 * tomar su tiempo medio o su tiempo m�nimo. Si se imprime un objeto temporizador se  obtiene informaci�n sobre
 * el tiempo m�nimo de ejecuci�n. 
 * Los tiempos son medidos en nanosegundos, usando la funci�n "System.nanoTime()"
 *
 * @author y0rg
 * @version 2.1, 
 * @since 04/03/2022
 * @see EstrategiaSolucion
 * @since jdk 5.0
 */
public class Temporizador {

	/**
	 * El n�mero de veces que queremos calcular el tiempo de ejecuci�n del algoritmo a medir. 
	 * El tiempo m�nimo o el tiempo medio se toma de entre las "numPruebas" ejecuciones de �ste.
	 */
	private int numPruebas;

	/**
	 * Almacena el tiempo de ejecuci�n, en nanosegundos, de cada una de las "numPruebas" ejecuciones del algoritmo a medir.
	 * Sobre �l se calcula la media y el m�nimo.
	 */
	private long[] tiempos;

	/**
	 * Crea un objeto temporizador. Valida que el argumento sea mayor que cero.
	 *
	 * @param numPruebas el n�mero de veces que se va a medir el tiempo.
	 * @throws IllegalArgumentException si el n�mero de pruebas es cero o negativo.
	 */
	public Temporizador(int numPruebas) {
		if (numPruebas <= 0) {
			throw new IllegalArgumentException("N�mero de pruebas incorrecto");
		}
		this.numPruebas = numPruebas;
		tiempos = new long[numPruebas];
	}

	/**
	 * Crea un objeto temporizador que se ejecutar� una sola vez.
	 */
	public Temporizador() {
		this(1);
	}

	/**
	 * C�lcula el tiempo m�nimo de las "numPruebas" ejecuciones. Es la medida m�s �til.
	 *
	 * @return el tiempo m�nimo.
	 */
	public long getTiempoMinimo() {
		long minimo;

		minimo = tiempos[0]; // al menos existe tiempos[0]
		for (int i = 1; i < numPruebas; i++) {
			if (tiempos[i] < minimo) {
				minimo = tiempos[i];
			}
		}
		return minimo;
	}

	/**
	 * C�lcula el tiempo m�ximo de las "numPruebas" ejecuciones. Es poco �til.
	 *
	 * @return el tiempo m�ximo.
	 */
	public long getTiempoMaximo() {
		long maximo;

		maximo = tiempos[0]; // al menos existe tiempos[0]
		for (int i = 1; i < numPruebas; i++) {
			if (tiempos[i] > maximo) {
				maximo = tiempos[i];
			}
		}
		return maximo;
	}

	/**
	 * C�lcula el tiempo medio de las "numPruebas" ejecuciones.
	 *
	 * @return el tiempo medio.
	 */
	public long getTiempoPromedio() {
		long sumaTiempos = 0;

		for (int i = 0; i < numPruebas; i++) {
			sumaTiempos += tiempos[i];
		}
		return sumaTiempos / (long) numPruebas;
	}

	/**
	 * Devuelve el n�mero de pruebas.
	 *
	 * @return el n�mero de pruebas.
	 */
	public float getNumPruebas() {
		return numPruebas;
	}

	/**
	 * Mide el tiempo de ejecuci�n del m�todo "funcionAMedir" del objeto que se le pasa. 
	 * Hace "numPruebas" ejecuciones del m�todo, almacenando el tiempo de cada una de ellas 
	 * en un elemento de "tiempos", de modo que, posteriormente, pueden calcularse medias,
	 * m�nimo, etc. sobre �l. Antes de cada ejecuci�n de "funcionAMedir" se ejecuta el m�todo
	 * "procesamientoInicial" del objeto temporizable, en el que se deben inicializar los 
	 * elementos que lo necesiten para esta ejecuc�on; despu�s de cada ejecuci�n se ejecuta 
	 * el m�todo "procesamientoFinal" del mismo objeto temporizable.
	 *
	 * @param f un objeto que implementa la interfaz "Temporizable", cuyo m�todo "funcionAMedir" se cronometra.
	 * @see EstrategiaSolucion
	 * @see EstrategiaSolucion#solucion
	 * @see EstrategiaSolucion#procesamientoInicial
	 * @see EstrategiaSolucion#procesamientoFinal
	 */
	public void cronometra(EstrategiaSolucion f) {
		long inicio, fin;

		for (int i = 0; i < numPruebas; i++) {
			f.procesamientoInicial();
			inicio = System.nanoTime();
			f.solucion(); // la funci�n que se mide
			fin = System.nanoTime();
			f.procesamientoFinal();
			tiempos[i] = fin - inicio;
		}
	}

	/**
	 * Devuelve una cadena con informaci�n sobre el tiempo promedio de ejecuci�n.
	 *
	 * @return Una cadena con informaci�n sobre el tiempo promedio de ejecuci�n.
	 */
	public String getInformeTiempoMedio() {
		String s = "Tiempo medio: " + getTiempoPromedio() + " ns";
		return s;
	}

	/**
	 * Devuelve una cadena con informaci�n sobre el tiempo m�nimo de ejecuci�n. 
	 * Se usa en el m�todo "toString".
	 *
	 * @return Una cadena con informaci�n sobre el tiempo m�nimo de ejecuci�n.
	 */
	public String getInformeTiempoMinimo() {
		String s = "Tiempo m�nimo: " + getTiempoMinimo() + " ns";
		return s;
	}

	/**
	 * Devuelve una representaci�n en cadena de la informaci�n sobre el tiempo
	 * m�nimo de ejecuci�n.
	 *
	 * @return Una cadena con informaci�n sobre el tiempo m�nimo de ejecuci�n de la "funcionAMedir".
	 */
	public String toString() {
		// por omisi�n, el m�nimo
		return getInformeTiempoMinimo();
	}
}
