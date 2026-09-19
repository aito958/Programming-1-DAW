package matestron.incompleto;

import java.util.Random;
import java.util.Scanner;

public class JuegoMates {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		// Creamos el menu inicial con instrucciones
		System.out.println("Bienvenido a Matestron !!!");
		System.out.println("En cada turno debes elegir la operación que obtenga mayor puntuación");

		String respuesta = "N";
		do {
			System.out.println("¿Estas preparado?");
			System.out.println("Escriba 'SI' si estas preparado o 'NO' si no estas preparado");
			respuesta = teclado.nextLine();
			if (!respuesta.equalsIgnoreCase("Si")) {
				System.out.println("Opssssss, hubo algun error ");
			} else if (respuesta.equalsIgnoreCase("No"));
				
			System.out.println("Bueno , estudia antes de jugar");

		} while (!respuesta.equalsIgnoreCase("Si"));

		System.out.println(" AL TURRONNNNN!!!!!");

		// Creamos el numero aleatorio inicial
		Random aleatorio = new Random();
		long puntuacion = aleatorio.nextInt(9) + 1;
		long puntuacionMaxPosible = puntuacion;

		boolean max = false;

		// Creamos un bucle que vaya generando operaciones, de dos en dos para elegir
		for (int i = 0; i < 5 && !max; i++) {
			System.out.println("Elige entre...");

			// Creamos las operaciones con la clase Operaciones
			Operacion operacion1 = new Operacion();
			Operacion operacion2 = new Operacion();
			System.out.println("1.->" + operacion1.toString(puntuacion));
			System.out.println("2.->" + operacion2.toString(puntuacion));

			int op = 0;
			do {
				String opcion = teclado.nextLine();
				op = Integer.parseInt(opcion);

			} while (op != 1 && op != 2);

			try {
				// Calculamos cual era el optimo
				long valorMaximo1 = operacion1.calcula(puntuacionMaxPosible);
				long valorMaximo2 = operacion2.calcula(puntuacionMaxPosible);
				puntuacionMaxPosible = (valorMaximo1 > valorMaximo2) ? valorMaximo1 : valorMaximo2;
			} catch (ArithmeticException exception) {

				puntuacionMaxPosible = Long.MAX_VALUE;
				max = true;
			}

			try {
				// Actualizamos el calculo del usuario
				puntuacion = (op == 1) ? operacion1.calcula(puntuacion) : operacion2.calcula(puntuacion);
			} catch (ArithmeticException exception) {
				System.out.println("Puntuación máxima alcanzada");
				puntuacion = Long.MAX_VALUE;
				max = true; // FIN
			}
		}

		teclado.close();

		// Mensajes finales.
		System.out.println("Has conseguido un total de " + puntuacion + " de " + puntuacionMaxPosible);
//si has conseguido la puntacion máxima imprime esto
		if (puntuacion == puntuacionMaxPosible) {
			System.out.println("Muy bien calculín!!!!");
		}
// si superas la puntuacion máxima imprime esto
		if (puntuacion > puntuacionMaxPosible) {
			System.out.println("Epaaa, ¿como lo has logrado???");
		}
	}
}
