
public class Utilidades {

	public static <T> void volcarArray(T[] origen, T[] destino) {
		int tamaño = Math.min(origen.length, destino.length);
		for (int i = 0; i < tamaño; i++) {
			destino[i] = origen[i];
		}

	}

	public static <T> void invertirArrays(T[] origen, T[] invertir) {
		int tamaño = Math.min(origen.length, invertir.length);
		for (int i = 0; i < tamaño; i++) {
			invertir[tamaño - 1 - i] = origen[i];

		}

	}
}
