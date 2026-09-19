package problemas;

public class ProblemaAtaque {
/*
 * arrays de cada ejercitos con sus guerros
 */
	int[] orcos = { 10, 15, 5, 50, 70 };
	int[] aliados = { 10, 10, 3, 100, 60 };

	public ProblemaAtaque() {

	}
/*
 * devuelve orcos
 */
	public int[] getOrcos() {
		return orcos;
	}

	public void setOrcos(int[] orcos) {
		this.orcos = orcos;
	}
	/*
	 * devuelve aliados
	 */
	public int[] getAliados() {
		return aliados;
	}

	public void setAliados(int[] aliados) {
		this.aliados = aliados;
	}

}
