package ARRAYS;

public class EjemplosArrays {

	public static void main(String[] args) {
		boolean[] arrayBoolean;
		arrayBoolean = new boolean[10];

		for (int i = 0; i < arrayBoolean.length; i++) {
			if (i % 2 == 0) {
				arrayBoolean[i] = true;
			}
		}
		for (int i = 0; i < arrayBoolean.length; i++) {
			System.out.println(arrayBoolean[i]);
		}
	}
}