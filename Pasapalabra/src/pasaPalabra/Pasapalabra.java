package pasaPalabra;
import java.util.Scanner;

public class Pasapalabra {

	private static final int NANOSEGUNDOS = 1000000000;
	private static final int TIEMPO_LIMITE = 100;

	private static final Scanner teclado = new Scanner(System.in);
	public static final String PREGUNTA_A = "¿Dónde podemos encontrar una rama?";
	public static final String PREGUNTA_E = "Mejor país del mundo";
	public static final String PREGUNTA_O = "Conjunto de instrumentos que suenan a la vez";
	private static final String PREGUNTA_I = "Que es un terreno pequeño rodeado de agua ";
	public static final String PREGUNTA_U = "Animal mitológico inspirado en un caballo con un cuerno";


	public static final String RESPUESTA_A = "Arbol";
	public static final String RESPUESTA_E = "España";
	public static final String RESPUESTA_I = "Isla";
	public static final String RESPUESTA_O = "Orquesta";
	public static final String RESPUESTA_U = "Unicornio";

	public static void main(String[] args) {

		int contadorRespuestasCorrectas = 0;
		int contadorRespuestasIncorrectas = 0;

		// Posibles estados: 0 no contestada, -1 error, 1 acierto
		int estadoPreguntaA = 0;
		int estadoPreguntaE = 0;
		int estadoPreguntaI = 0;
		int estadoPreguntaO = 0;
		int estadoPreguntaU = 0;

		System.out.println("Bienvenido al pasapalabra v1.0");
		System.out.println("Empezamos.....");

		long tiempoInicial = System.nanoTime();
		long tiempoActual = 0;
		double tiempoTranscurrido = 0;
		boolean dentroDeTiempo = true;

		do {

			if (dentroDeTiempo && estadoPreguntaA == 0) { // ESTA HECHO CON SWITCH PARA QUE VEAIS QUE TAMBIEN SE PUEDE HACER, PERO ES LO
										// MISMO
				int resultadoA = compruebaPregunta(PREGUNTA_A, RESPUESTA_A);
				switch (resultadoA) {
				case -1:
					contadorRespuestasIncorrectas++;
					estadoPreguntaA = -1;
					break;
				case 1:
					contadorRespuestasCorrectas++;
					estadoPreguntaA = 1;
					break;
				}
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && estadoPreguntaE == 0) {
				int resultadoE = compruebaPregunta(PREGUNTA_E, RESPUESTA_E);
				if (resultadoE == 1) {
					contadorRespuestasCorrectas++;
					estadoPreguntaE = 1;
				} else if (resultadoE == -1) {
					contadorRespuestasIncorrectas++;
					estadoPreguntaE = -1;
				}
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);
			
			if (dentroDeTiempo && estadoPreguntaI == 0) {
				int resultadoI = compruebaPregunta(PREGUNTA_I, RESPUESTA_I);
				if (resultadoI == 1) {
					contadorRespuestasCorrectas++;
					estadoPreguntaI = 1;
				} else if (resultadoI == -1) {
					contadorRespuestasIncorrectas++;
					estadoPreguntaI = -1;
				}
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);
			
			if (dentroDeTiempo && estadoPreguntaO == 0) {
				int resultadoO = compruebaPregunta(PREGUNTA_O, RESPUESTA_O);
				if (resultadoO == 1) {
					contadorRespuestasCorrectas++;
					estadoPreguntaO = 1;
				} else if (resultadoO == -1) {
					contadorRespuestasIncorrectas++;
					estadoPreguntaO = -1;
				}
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && estadoPreguntaU == 0) {
				int resultadoU = compruebaPregunta(PREGUNTA_U, RESPUESTA_U);
				if (resultadoU == 1) {
					contadorRespuestasCorrectas++;
					estadoPreguntaU = 1;
				} else if (resultadoU == -1) {
					contadorRespuestasIncorrectas++;
					estadoPreguntaU = -1;
				}
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

		} while (contadorRespuestasCorrectas + contadorRespuestasIncorrectas < 5 && dentroDeTiempo);

		long tiempoFinal = System.nanoTime();
		tiempoTranscurrido = (double) (tiempoFinal - tiempoInicial) / NANOSEGUNDOS;
		System.out.println(
				"Has acertado " + contadorRespuestasCorrectas + " preguntas en " + tiempoTranscurrido + " segundos");

		if (tiempoTranscurrido <= TIEMPO_LIMITE && contadorRespuestasCorrectas == 5) {
			System.out.println("Has ganado");
		} else {
			if (tiempoTranscurrido > TIEMPO_LIMITE) {
				System.out.println("Has perdido, has tardado mas de " + TIEMPO_LIMITE + " segundos");
			}
			if (contadorRespuestasCorrectas != 5) {
				System.out.println("Has fallado " + contadorRespuestasIncorrectas + " preguntas");
			}
		}
	}

	private static boolean compruebaTiempo(long tiempoInicial) {
		boolean dentroDeTiempo = true;
		long tiempoActual = System.nanoTime();

		double tiempoTranscurrido = (double) (tiempoActual - tiempoInicial) / NANOSEGUNDOS;
		if (tiempoTranscurrido > TIEMPO_LIMITE) {
			dentroDeTiempo = false;
		}
		return dentroDeTiempo;
	}

	public static int compruebaPregunta(String pregunta, String respuesta) {
		int correcto = 0;

		System.out.println(pregunta);
		String respuestaJugador = teclado.nextLine(); // Si leo en blanco, es pasapalbra.
		if (!respuestaJugador.isBlank()) {
			if (respuestaJugador.equals(respuesta)) {
				System.out.println("Correcto");
				correcto = 1;
			} else {
				correcto = -1;
				System.out.println("Error");
			}
		}
		return correcto;
	}
}
