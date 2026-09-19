package pasaPalabra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasapalabraLista {

	private static final int NANOSEGUNDOS = 1000000000;
	private static final int TIEMPO_LIMITE = 100;
	private static final int NUM_PREGUNTAS = 5;

	public static final Scanner teclado = new Scanner(System.in);
	static Random aleatorio = new Random();

	public static void main(String[] args) {

		List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();

		// Crear las preguntas:
		File carpetaDePreguntas = new File("preguntas");

		try {
			// Comprobar que es una carpeta
			if (carpetaDePreguntas.isDirectory()) {
				String[] listaDeArchivos = carpetaDePreguntas.list();
				for (String nombreArchivo : listaDeArchivos) {
					File archivoPregunta = new File("preguntas/" + nombreArchivo);
					FileReader fr = new FileReader(archivoPregunta);
					BufferedReader br = new BufferedReader(fr);

					// Contamos las líneas del archivo
					int cont = 0;
					while (br.readLine() != null) {
						cont++;
					}

					// Creamos un random de 1 a cont / 2
					int numeroPreguntaAleatoria = aleatorio.nextInt(1, (cont / 2) + 1);

					fr = new FileReader(archivoPregunta);
					br = new BufferedReader(fr);

					String textoPregunta = br.readLine();
					int numeroPregunta = 1;
					while (textoPregunta != null) {
						String textoRespuesta = br.readLine();
						if (numeroPregunta == numeroPreguntaAleatoria) {
							Pregunta pregunta = new Pregunta(textoPregunta, textoRespuesta);
							listaPreguntas.add(pregunta);
							break;
						}

						numeroPregunta++;
						textoPregunta = br.readLine();
					}

					fr.close();
					br.close();
				}
			}
		} catch (IOException e) {
			System.out.println("Archivo no encontrado ");
			e.printStackTrace();
		}

		System.out.println("Bienvenido al pasapalabra v4.0");
		System.out.println("Empezamos.....");

		long tiempoInicial = System.nanoTime();
		double tiempoTranscurrido = 0;
		boolean dentroDeTiempo = true;

		do {
			for (Pregunta p : listaPreguntas) {
				if (dentroDeTiempo && p.getEstado() == Pregunta.ESTADO_NO_CONESTADO) {
					p.comprobar();
				}
				dentroDeTiempo = compruebaTiempo(tiempoInicial);
			}

		} while (Pregunta.contadorRespuestasCorrectas + Pregunta.contadorRespuestasIncorrectas < NUM_PREGUNTAS
				&& dentroDeTiempo);

		long tiempoFinal = System.nanoTime();
		tiempoTranscurrido = (double) (tiempoFinal - tiempoInicial) / NANOSEGUNDOS;
		System.out.println("Has acertado " + Pregunta.contadorRespuestasCorrectas + " preguntas en "
				+ tiempoTranscurrido + " segundos");

		if (tiempoTranscurrido <= TIEMPO_LIMITE && Pregunta.contadorRespuestasCorrectas == NUM_PREGUNTAS) {
			System.out.println("Has ganado");
		} else {
			if (tiempoTranscurrido > TIEMPO_LIMITE) {
				System.out.println("Has perdido, has tardado mas de " + TIEMPO_LIMITE + " segundos");
			}
			if (Pregunta.contadorRespuestasCorrectas != NUM_PREGUNTAS) {
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