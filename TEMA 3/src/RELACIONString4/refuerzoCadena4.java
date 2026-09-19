package RELACIONString4;

public class refuerzoCadena4 {

	private static final int LONGUITUD = 4;

	public static void main(String[] args) {

		System.out.println(metodoGuay("Manolo juega Balonmano"));
	}

	private static boolean metodoGuay(String frase) {
		boolean resultado = false;

		if (frase.length() > LONGUITUD * 2) {
			String inicio = frase.substring(0, 4);
			String fin = frase.substring(frase.length() - LONGUITUD, frase.length());
			if (inicio.equalsIgnoreCase(fin)) {
				resultado = true;
			}
		}
		return resultado;
	}
}
