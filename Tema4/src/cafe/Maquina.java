package cafe;



/**
 * 
 */
public class Maquina {

	
	private static final int DEPOSITO_CAFE_MAX = 50;
	private static final int DEPOSITO_LECHE_MAX = 50;
	private static final int DEPOSITO_VASOS_MAX = 80;

	private static final double PRECIO_CAFE = 1;
	private static final double PRECIO_LECHE = 0.8;
	private static final double PRECIO_CAFE_CON_LECHE = 1.5;

	private int depositoCafe = DEPOSITO_CAFE_MAX;
	private int depositoLeche = DEPOSITO_LECHE_MAX;
	private int depositoVasos = DEPOSITO_VASOS_MAX;

	private double monedoro;

	public Maquina(double monedoro) {

		this.monedoro = monedoro;
	}

	public double servirCafe(double dinero) {
		double cambio = 0;
		if ((dinero - PRECIO_CAFE) >= this.monedoro) {
			System.out.println("La máquina no tiene suficiente cambio");

		} else if (dinero >= PRECIO_CAFE) {
			if (depositoCafe > 0 && depositoVasos > 0) {

				depositoCafe--;
				depositoVasos--;
				this.monedoro += PRECIO_CAFE;
				cambio = dinero - PRECIO_CAFE;
				System.out.println("Aquí tienes su café");

			} else {
				System.out.println("No hay suficientes existencias");
			}

		} else {
			System.out.println("No tienes suficiente dinero (pobre)");
			cambio = dinero;
		}
		return cambio;
	}

	public double servirLeche(double dinero) {
		double cambio = 0;

		if ((dinero - PRECIO_LECHE) >= this.monedoro) {
			System.out.println("La máquina no tiene suficiente cambio");

		} else if (dinero >= PRECIO_LECHE) {
			if (depositoLeche > 0 && depositoVasos > 0) {
				depositoLeche--;
				depositoVasos--;
				this.monedoro += PRECIO_LECHE;
				cambio = dinero - PRECIO_LECHE;

				System.out.println("Aquí tienes su leche");

			} else {
				System.out.println("No hay suficientes existencias");
			}

		} else {
			System.out.println("No tienes suficiente dinero (pobre)");
			cambio = dinero;

		}
		return cambio;

	}

	public double servirCafe_Con_Leche(double dinero) {
		double cambio = dinero;

		if ((dinero - PRECIO_CAFE_CON_LECHE) >= this.monedoro) {
			System.out.println("La máquina no tiene suficiente cambio");

		} else if (dinero >= PRECIO_CAFE_CON_LECHE) {
			if (depositoLeche > 0 && depositoCafe > 0 && depositoVasos > 0) {

				depositoCafe--;
				depositoLeche--;
				depositoVasos--;
				this.monedoro += PRECIO_CAFE_CON_LECHE;
				cambio = dinero - PRECIO_CAFE_CON_LECHE;

				System.out.println("Aquí tienes su leche  y su cafe");

			} else {
				System.out.println("No hay suficientes existencias");
			}

		} else {
			System.out.println("No tienes suficiente dinero (pobre)");
			cambio = dinero;

		}
		return cambio;

	}

	public String toString() {
		return "Maquina [depositoCafe=" + depositoCafe + ", depositoLeche=" + depositoLeche + ", depositoVasos="
				+ depositoVasos + ", monedoro=" + monedoro + "]";
	}

	public void rellenar() {
		this.depositoCafe = DEPOSITO_CAFE_MAX;
		this.depositoCafe = DEPOSITO_LECHE_MAX;
		this.depositoCafe = DEPOSITO_VASOS_MAX;

	}

	public double vaciarMonedero() {
		double dinero = this.monedoro;
		this.monedoro = 0;
		return dinero;
	}

	public double getPrecioCafe() {
		return PRECIO_CAFE;
	}

	public double getPrecioLeche() {
		return PRECIO_LECHE;

	}

	public double getPrecioCafeConLeche() {
		return PRECIO_CAFE_CON_LECHE;
	}

}
