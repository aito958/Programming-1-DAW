package esquemas;

public abstract class EsquemaVZ {
	public void voraz() {
		inicializa();
		while (!fin()) {
			seleccionaYElimina();
			if (prometedor()) {
				anotaEnSolucion();
			}
		}
	}

	abstract protected void inicializa();

	abstract protected boolean fin();

	abstract protected void seleccionaYElimina();

	abstract protected boolean prometedor();

	abstract protected void anotaEnSolucion();

}
