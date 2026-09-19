
public class METODO_ANIDADOS {

	public static void main(String[] args) {

		System.out.println("Este es el metodo main");

		metodo1();

	}

	private static void metodo1() {
		System.out.println("Este es el metodo 1");
		for (int i = 0; i < 3; i++) {
			metodo2(i);
		}
	}

	private static void metodo2(int carlo) {
		System.out.println("Este es el metodo 2 " + carlo);
		for (int j = 0; j < 3; j++) {
			metodo3(j);

		}
	}

	private static void metodo3(int mono) {
		System.out.println("Este es el metdo 3 " + mono);
	}

}
