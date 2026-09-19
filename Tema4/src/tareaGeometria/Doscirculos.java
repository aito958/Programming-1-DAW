package tareaGeometria;

public class Doscirculos {

	public static void main(String[] args) {

		circulo miCirculo = new circulo(1, 6, 0);
		System.out.println("Circulo 1  " + miCirculo.toString());

		circulo miCirculo1 = new circulo(2, -6, -6);
		System.out.println("Circulo 2 " + miCirculo1.toString());

		try {
		miCirculo.setRadio(-1);
		} catch (CirculoConRadioNegativoException circulo) {
			try {
				miCirculo.setRadio(1);
				} catch (CirculoConRadioNegativoException circulo1) {
				
					circulo.printStackTrace();
		}
	}
	}
}
