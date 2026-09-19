import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Temporizator2000 {

	private static final Scanner teclado = new Scanner(System.in);
	private static final int LIMITE_INFERIOR_NUMERO_ALEATORIO = 5;
	private static final int LIMITE_SUPERIOR_NUMERO_ALEATORIO = 15;
	private static final int NANOSEGUNDOS = 1000000000;

	private static final String URL_CONEXION_BBDD = "jdbc:mysql://localhost/eclipse";
	private static final String USUARIO_BBDD = "Eclipse";
	private static final String CONTRASEÑA_BBDD = "123";

	public static void main(String[] args) {

		System.out.println("Bienvenido a Temporizator 2000, el mejor temporizador del mundo");
		System.out.println("¿Cuál es tu nombre?");

		String nombreJuagador = teclado.nextLine();

		System.out.println("¿Preparado " + nombreJuagador + "?");
		int opciones = 0;
		do {
			System.out.println("1. Jugar una partida");
			System.out.println("2. Consultar el récord");
			System.out.println("3. Salir");

			opciones = Integer.parseInt(teclado.nextLine());

			switch (opciones) {
			case 1:
				jugarPartida(nombreJuagador);
				break;
			case 2:
				consultarRecord();
				break;
			case 3:
				System.out.println("¡Hasta luego " + nombreJuagador + "!");
				break;
			default:
				System.out.println("Opción no válida, por favor elige una opción del menú.");
				break;
			}

		} while (opciones != 3);

	}

	private static void consultarRecord() {
		String consultaRecords = " SELECT * FROM partida ORDER BY puntuacion ASC LIMIT 10;";

		try (Connection con = DriverManager.getConnection(URL_CONEXION_BBDD, USUARIO_BBDD, CONTRASEÑA_BBDD);
				PreparedStatement ps = con.prepareStatement(consultaRecords);) {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Jugador: " + rs.getString("nombreJugador") + " - Puntuación: " + rs.getDouble("puntuacion") + " segundos  " );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void jugarPartida(String nombreJuagador) {
		System.out.println("Preparado......... empieza a contar hasta ..........");
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(LIMITE_INFERIOR_NUMERO_ALEATORIO, LIMITE_SUPERIOR_NUMERO_ALEATORIO + 1);
		System.out.println(numero);
		System.out.println("¡Pulsa cualquier tecla cuando creas que has pasado el tiempo suficiente!");

		long tiempoInicio = System.nanoTime();
		teclado.nextLine();
		long tiempoFin = System.nanoTime();

		double puntuacion = Math.abs(numero - ((tiempoFin - tiempoInicio) / (double) NANOSEGUNDOS));
		puntuacion = Math.round(puntuacion * 10000) / 10000.0;
		System.out.printf("Bien, " + nombreJuagador + " tu puntuación es: %.4f segundos%n",
				Math.round(puntuacion * 10000) / 10000.0);

		enviarDatos(numero, puntuacion, nombreJuagador);
	}

	private static void enviarDatos(int numero, double puntuacion, String nombreJugador) {
		String consultaInsercion = "INSERT INTO partida VALUES (\' " + nombreJugador + "\', ' " + puntuacion + " ', ' "
				+ numero + " ');";
		try (Connection con = DriverManager.getConnection(URL_CONEXION_BBDD, USUARIO_BBDD, CONTRASEÑA_BBDD);
				PreparedStatement ps = con.prepareStatement(consultaInsercion);) {
			ps.execute();
			System.out.println("Datos enviados a la base de datos correctamente.");

		} catch (Exception e) {
			System.err.println("Error al enviar los datos a la base de datos:");
			e.printStackTrace();
		}
	}
}
