package soluciones.alternativa;

import esquemas.EsquemaVZ;
import problemas.ProblemaAtaque;
import soluciones.EstrategiaSolucion;

public class AtaqueSimple extends EsquemaVZ implements EstrategiaSolucion {
	// array que almacena el número de orcos que hay en cada grupo
	int[] numOrcos;
	// array que almacena el número de aliados que hay en cada grupo
	int[] numAliados;

	/*
	 * array donde se tendrá que almacenar a qué grupo de orcos contraataca cada
	 * grupo de aliados. El grupo de aliados i contraataca al grupo de orcos
	 * aliadosContraatacaOrcos[i]. Se pondrá -1 si no contraataca.
	 */

	int[] aliadosContraatacaOrcos;

	/*
	 * en cada iteración del voraz se decide a qué grupo de orcos atacará cada grupo
	 * de aliados; este atributo tendrá el índice del grupo de aliados que se
	 * analiza en cada vuelta
	 */
	int aliadosActual;
	/*
	 * este atributo se usa para realizar la búsqueda del grupo del orcos más
	 * apropiado en cada iteración del voraz
	 */
	int orcosAAtacar;
	/*
	 * este array almacenará los grupos de orcos que ya se han asignado a un grupo
	 * de aliados.
	 */
	boolean[] orcosContraatacados;

	public AtaqueSimple(ProblemaAtaque pa) {
		this.numOrcos = pa.getOrcos();
		this.numAliados = pa.getAliados();
	}

	public void procesamientoInicial() {
	}

	protected void inicializa() {
		aliadosContraatacaOrcos = new int[numOrcos.length];
		orcosContraatacados = new boolean[numOrcos.length];
		for (int i = 0; i < orcosContraatacados.length; i++) {
			orcosContraatacados[i] = false;
		}
		aliadosActual = 0;
		orcosAAtacar = 0;
	}

	protected boolean fin() {
		return (aliadosActual == numOrcos.length);
	}

	protected void seleccionaYElimina() {
	}

	protected boolean prometedor() {
		return true;
	}

	protected void anotaEnSolucion() {
		aliadosContraatacaOrcos[aliadosActual] = orcosAAtacar;
		aliadosActual++;
		orcosAAtacar++;
	}

	public void solucion() {
		voraz();
	}

	public String toString() {
		int derrotas = 0;
		int victorias = 0;

		String reparto = "El reparto ha sido:";
		for (int i = 0; i < aliadosContraatacaOrcos.length; i++) {
			if (aliadosContraatacaOrcos[i] != -1) {
				if (numAliados[i] < numOrcos[aliadosContraatacaOrcos[i]]) {
					reparto += "\nLos aliados " + i + "(" + numAliados[i] + ") contraataca a los orcos "
							+ aliadosContraatacaOrcos[i] + "(" + numOrcos[aliadosContraatacaOrcos[i]] + ") DERROTA";
					derrotas++;
				} else {
					reparto += "\nLos aliados " + i + "(" + numAliados[i] + ") contraataca a los orcos "
							+ aliadosContraatacaOrcos[i] + "(" + numOrcos[aliadosContraatacaOrcos[i]] + ") VICTORIA";
					victorias++;
				}
			} else {
				derrotas++;
				reparto += "\nLos aliados " + i + " contraataca a los orcos " + aliadosContraatacaOrcos[i]
						+ " DERROTA\n";
			}
		}

		if (victorias > derrotas) {
			reparto += "\nAragorn ha ganado la batalla "+victorias+"/"+derrotas+". Hoy, se come!\n";
		} else {
			reparto += "\nLos orcos ganan la batalla "+derrotas+"/"+victorias+". Aragorn, pa tu casa!\n";
		}

		return reparto;
	}

	public void procesamientoFinal() {
	}
}
