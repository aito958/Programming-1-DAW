package pasaPalabra;

public class PasapalabraOO {

	private static final int NANOSEGUNDOS = 1000000000;
	private static final int TIEMPO_LIMITE = 100;

	
	public static void main(String[] args) {

		Pregunta preguntaA = new Pregunta(TextosPreguntas.PREGUNTA_A, TextosPreguntas.RESPUESTA_A);
		Pregunta preguntaE = new Pregunta(TextosPreguntas.PREGUNTA_E, TextosPreguntas.RESPUESTA_E);
		Pregunta preguntaI = new Pregunta(TextosPreguntas.PREGUNTA_I, TextosPreguntas.RESPUESTA_I);
		Pregunta preguntaO = new Pregunta(TextosPreguntas.PREGUNTA_O, TextosPreguntas.RESPUESTA_O);
		Pregunta preguntaU = new Pregunta(TextosPreguntas.PREGUNTA_U, TextosPreguntas.RESPUESTA_U);

		System.out.println("Bienvenido al pasapalabra v2.0");
		System.out.println("Empezamos.....");

		long tiempoInicial = System.nanoTime();
		long tiempoActual = 0;
		double tiempoTranscurrido = 0;
		boolean dentroDeTiempo = true;

		do {

			if (dentroDeTiempo && preguntaA.getEstado() == 0) { // ESTA HECHO CON SWITCH PARA QUE VEAIS QUE TAMBIEN SE
																// PUEDE HACER, PERO ES LO
				// MISMO
				preguntaA.comprobar();
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && preguntaE.getEstado() == 0) {
				preguntaE.comprobar();
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && preguntaI.getEstado() == 0) {
				preguntaI.comprobar();
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && preguntaO.getEstado() == 0) {
				preguntaO.comprobar();
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && preguntaE.getEstado() == 0) {
				preguntaE.comprobar();
			}
			dentroDeTiempo = compruebaTiempo(tiempoInicial);

			if (dentroDeTiempo && preguntaU.getEstado() == 0) {
				preguntaU.comprobar();
			}

			dentroDeTiempo = compruebaTiempo(tiempoInicial);

		} while (Pregunta.contadorRespuestasCorrectas + Pregunta.contadorRespuestasIncorrectas < 5 && dentroDeTiempo);
		long tiempoFinal = System.nanoTime();
		tiempoTranscurrido = (double) (tiempoFinal - tiempoInicial) / NANOSEGUNDOS;
		System.out.println(
				"Has acertado " + Pregunta.contadorRespuestasCorrectas + " preguntas en " + tiempoTranscurrido + " segundos");

		if (tiempoTranscurrido <= TIEMPO_LIMITE &&  Pregunta.contadorRespuestasCorrectas  == 5) {
			System.out.println("Has ganado");
		} else {
			if (tiempoTranscurrido > TIEMPO_LIMITE) {
				System.out.println("Has perdido, has tardado mas de " + TIEMPO_LIMITE + " segundos");
			}
			if ( Pregunta.contadorRespuestasCorrectas  != 5) {
				System.out.println("Has fallado " + Pregunta.contadorRespuestasIncorrectas + " preguntas");
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
}
