package soluciones;

/**
 * @author y0rg
 * Deben implementarla los objetos para los que se quieran medir sus tiempos de
 * ejecuci�n.
 * 
 * @version 1.1, 
 * @since 10/03/2022
 */

public interface EstrategiaSolucion {

	/**
	 * Debe contener lo que haya que hacer antes de ejecutar el algoritmo que
	 * queramos temporizar. T�picamente contiene inicializaciones o
	 * reinicializaciones de los datos del problema.
	 */
	public void procesamientoInicial();

	/**
	 * La funci�n cuyo tiempo de ejecuci�n se quiere medir. T�picamente contendr�
	 * una llamada al algoritmo que resuelva el problema planteado, pas�ndole los
	 * valores iniciales que necesite.
	 */
	public void solucion();

	/**
	 * Debe contener lo que haya que hacer despu�s de ejecutar el algoritmo que se
	 * quiere temporizar.
	 */
	public void procesamientoFinal();

}
