import java.util.Scanner;

public class examan_02 {

	private static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {


		int presupuesto = 0;
		int coste_proyecto = 0;
		int tiempo = 0;
		float coste_real;
		float beneficio_mensual;

		System.out.println("Bienvenido al simulador de viabilidad de proyecto");

		System.out.println("Introduzca el valor del presupuesto para el cliente ");
		presupuesto = teclado.nextInt();

		System.out.println("Introduzca el coste ");
		coste_proyecto = teclado.nextInt();

		System.out.println("Introduzca cuánto tiempo tardará en desarrollar el proyecto (en meses) ");
		tiempo = teclado.nextInt();

		coste_real = coste_proyecto + 21 * 100 / coste_proyecto;

		beneficio_mensual = (presupuesto - coste_real) - tiempo;

		if (presupuesto < 0) {
		} else if (coste_proyecto < 0) {
		} else if (tiempo < 0)
			System.out.println("datos incorrecto vuelve a intentarlo  ");

		if (coste_real > presupuesto) {
			System.out.println("El proyecto no es viable, no cubres los costes");
		}

		if (beneficio_mensual < 1000) {
			System.out.println("Piensatelo , no ganaras mucho");

		} else if (beneficio_mensual > 1000 && beneficio_mensual < 2000) {
			System.out.println("No esta mal, adelante ");

		} else if (beneficio_mensual > 2000 && beneficio_mensual < 5000) {
			System.out.println("Buen negocio ");

		} else if (beneficio_mensual > 5000) {
			System.out.println("Que pelotazo !!");

			{

			}
		}
	}
}
