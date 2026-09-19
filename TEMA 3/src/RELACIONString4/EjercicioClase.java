package RELACIONString4;

import java.util.Scanner;

public class EjercicioClase {

	private static final int PRECIO_PALOMITAS = 6;
	private static final int PRECIO_ENTRADA_CINE = 8;

	public static void main(String[] args) {

		boolean aprobado = true;
		int dineroBanco = 20;

		if (aprobado) {
			if (dineroBanco > PRECIO_ENTRADA_CINE) {
				System.out.println("Puedes pagar la entrada");
				dineroBanco = dineroBanco - PRECIO_ENTRADA_CINE;
				if (dineroBanco > PRECIO_PALOMITAS) {
					System.out.println("Disfrura tus palomitas");
				}
			}

		} else {
			System.out.println("No puedes ir al cine , aver estudiao");
		}

	}

}
