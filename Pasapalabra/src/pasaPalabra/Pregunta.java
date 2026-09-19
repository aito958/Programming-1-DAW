package pasaPalabra;

import java.util.Scanner;

public class Pregunta {

	private static final Scanner teclado = new Scanner(System.in);

	public static int ESTADO_NO_CONESTADO = 0;
	public static int ESTADO_CORRECTO = 1;
	public static int ESTADO_INCORRECTO = -1;

	public static int contadorRespuestasCorrectas = 0;
	public static int contadorRespuestasIncorrectas = 0;


	private String textoPregunta;
	private String textoRespuesta;

	private int estado;

	public Pregunta(String pregunta, String respuesta) {
		textoPregunta = pregunta;
		textoRespuesta = respuesta;
		this.estado = 0;
	}

	public void comprobar() {
		boolean correcta = true;
		System.out.println(this.textoPregunta);
		String respuestaJugador = teclado.nextLine();

		if (!respuestaJugador.isBlank()) {// pasapalabra

			if (respuestaJugador.equalsIgnoreCase(textoRespuesta)) {
				this.estado = ESTADO_CORRECTO;
				contadorRespuestasCorrectas++;
			} else {
				this.estado = ESTADO_INCORRECTO;
				correcta = false;
				contadorRespuestasIncorrectas++;
			}
		}
	}

	public String getTextoPregunta() {
		return textoPregunta;
	}

	public int getEstado() {
		return estado;
	}

}
