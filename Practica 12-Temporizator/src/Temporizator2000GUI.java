import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Temporizator2000GUI {

	private static final int LIMITE_INFERIOR_NUMERO_ALEATORIO = 5;
	private static final int LIMITE_SUPERIOR_NUMERO_ALEATORIO = 15;

	private static final int NANOSEGUDOS = 1000000000;
	private static final double CANTIDAD_DECIMALES = 10000.0;

	private static final String URL_CONEXION_BBDD = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7828962?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String USUARIO_BBDD = "sql7828962";
	private static final String PASSWORD_BBDD = "neGd1jZWZC";

	private static final Color COLOR_FONDO = new Color(240, 240, 245);
	private static final Color COLOR_PRIMARIO = new Color(70, 130, 180);
	private static final Color COLOR_SECUNDARIO = new Color(100, 149, 237);
	private static final Color COLOR_EXITO = new Color(76, 175, 80);
	private static final Color COLOR_ERROR = new Color(244, 67, 54);
	private static final Font FONT_BOTON = new Font("Arial", Font.BOLD, 14);
	private static final Font FONT_TITULO = new Font("Arial", Font.BOLD, 24);

	static JLabel etiquetaNombreJugador;
	static JTextField textFieldNombreJugador;
	static JButton botonIniciarPartida;
	static JButton botonConsultarRecords;
	static JButton botonSalir;
	static JButton botonVolver;
	static JButton botonEmpezar;
	static JLabel etiquetaNumeroAleatorio;
	static JButton botonParar;
	static JTable tablaRecords;
	static JScrollPane scrollPane;

	static long timepoInicial;
	static long timepoFinal;
	static int numeroAleatorio;
	static String nombreJugador;

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Temporizator 2000");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(700, 650);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(COLOR_FONDO);

	
		JLabel titulo = new JLabel("TEMPORIZADOR 2000");
		titulo.setFont(FONT_TITULO);
		titulo.setForeground(COLOR_PRIMARIO);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0, 20, 700, 40);
		panel.add(titulo);

		// Separador visual
		JPanel separador = new JPanel();
		separador.setBackground(COLOR_SECUNDARIO);
		separador.setBounds(0, 60, 700, 3);
		panel.add(separador);

		botonIniciarPartida = crearBoton("Iniciar Partida", COLOR_SECUNDARIO, 200, 150, 300, 60);
		botonIniciarPartida.addActionListener(e -> {
			etiquetaNombreJugador.setVisible(true);
			textFieldNombreJugador.setVisible(true);
			botonVolver.setVisible(true);
			botonEmpezar.setVisible(true);
			ocultarMenu();
		});
		panel.add(botonIniciarPartida);

		botonConsultarRecords = crearBoton("Consultar Records", COLOR_SECUNDARIO, 200, 240, 300, 60);
		botonConsultarRecords.addActionListener(e -> {
			ocultarMenu();
			botonVolver.setVisible(true);
			String[] columnas = { "Jugador", "Puntuacion", "Número" };

			Object[][] datos = consultarRecords();
			tablaRecords = new JTable(datos, columnas);
			tablaRecords.setEnabled(false);
			tablaRecords.setRowHeight(25);
			tablaRecords.getTableHeader().setBackground(COLOR_PRIMARIO);
			tablaRecords.getTableHeader().setForeground(Color.WHITE);
			tablaRecords.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
			tablaRecords.setFont(new Font("Arial", Font.PLAIN, 12));

			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
			for (int i = 0; i < tablaRecords.getColumnCount(); i++) {
				tablaRecords.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			}

			if (scrollPane != null) {
				panel.remove(scrollPane);
			}
			scrollPane = new JScrollPane(tablaRecords);
			scrollPane.setBounds(50, 150, 600, 300);
			panel.add(scrollPane);
			panel.revalidate();
			panel.repaint();
		});
		panel.add(botonConsultarRecords);

		botonSalir = crearBoton("Salir", COLOR_ERROR, 200, 330, 300, 60);
		botonSalir.addActionListener(e -> System.exit(0));
		panel.add(botonSalir);

		etiquetaNombreJugador = new JLabel("Nombre del Jugador:");
		etiquetaNombreJugador.setFont(new Font("Arial", Font.BOLD, 14));
		etiquetaNombreJugador.setForeground(COLOR_PRIMARIO);
		etiquetaNombreJugador.setBounds(100, 100, 150, 30);
		panel.add(etiquetaNombreJugador);
		etiquetaNombreJugador.setVisible(false);

		textFieldNombreJugador = new JTextField(25);
		textFieldNombreJugador.setFont(new Font("Arial", Font.PLAIN, 14));
		textFieldNombreJugador.setBounds(280, 100, 350, 35);
		textFieldNombreJugador.setBorder(BorderFactory.createLineBorder(COLOR_SECUNDARIO, 2));
		panel.add(textFieldNombreJugador);
		textFieldNombreJugador.setVisible(false);

		etiquetaNumeroAleatorio = new JLabel();
		etiquetaNumeroAleatorio.setFont(new Font("Arial", Font.BOLD, 18));
		etiquetaNumeroAleatorio.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaNumeroAleatorio.setForeground(COLOR_PRIMARIO);
		etiquetaNumeroAleatorio.setBounds(50, 180, 600, 80);
		panel.add(etiquetaNumeroAleatorio);
		etiquetaNumeroAleatorio.setVisible(false);

		botonEmpezar = crearBoton("¡Empezar!", COLOR_EXITO, 200, 280, 300, 60);
		botonEmpezar.addActionListener(e -> {
			String nombre = textFieldNombreJugador.getText().trim();
			if (nombre.isEmpty()) {
				etiquetaNumeroAleatorio.setText(" Por favor, ingresa tu nombre");
				etiquetaNumeroAleatorio.setForeground(COLOR_ERROR);
				etiquetaNumeroAleatorio.setVisible(true);
				return;
			}

			Random aleatorio = new Random();
			numeroAleatorio = aleatorio.nextInt(LIMITE_INFERIOR_NUMERO_ALEATORIO,
					LIMITE_SUPERIOR_NUMERO_ALEATORIO + 1);
			nombreJugador = nombre;

			etiquetaNumeroAleatorio.setText(nombreJugador + ", debes contar hasta: " + numeroAleatorio);
			etiquetaNumeroAleatorio.setForeground(COLOR_PRIMARIO);
			etiquetaNumeroAleatorio.setVisible(true);
			botonParar.setVisible(true);

			etiquetaNombreJugador.setVisible(false);
			textFieldNombreJugador.setVisible(false);
			botonEmpezar.setVisible(false);

			timepoInicial = System.nanoTime();
		});
		panel.add(botonEmpezar);
		botonEmpezar.setVisible(false);

		botonParar = crearBoton(" ¡PARAR!", COLOR_ERROR, 200, 380, 300, 60);
		botonParar.setFont(new Font("Arial", Font.BOLD, 16));
		botonParar.addActionListener(e -> {
			timepoFinal = System.nanoTime();

			double puntuacion = Math.abs(numeroAleatorio - ((timepoFinal - timepoInicial) / (double) NANOSEGUDOS));
			puntuacion = Math.round(puntuacion * CANTIDAD_DECIMALES) / CANTIDAD_DECIMALES;

			etiquetaNumeroAleatorio.setText(nombreJugador + ", tu puntuación es: " + puntuacion);
			etiquetaNumeroAleatorio.setForeground(puntuacion < 1 ? COLOR_EXITO : COLOR_PRIMARIO);
			botonParar.setVisible(false);

			enviarDatos(numeroAleatorio, puntuacion, nombreJugador);
		});
		panel.add(botonParar);
		botonParar.setVisible(false);

		botonVolver = crearBoton("Volver al Menú", COLOR_PRIMARIO, 200, 540, 300, 60);
		botonVolver.addActionListener(e -> {
			mostrarMenu();
			if (scrollPane != null) {
				panel.remove(scrollPane);
				scrollPane = null;
			}
			textFieldNombreJugador.setText("");
			panel.revalidate();
			panel.repaint();
		});
		panel.add(botonVolver);
		botonVolver.setVisible(false);

		ventana.add(panel);
		ventana.setVisible(true);

	}

	private static JButton crearBoton(String texto, Color color, int x, int y, int ancho, int alto) {
		JButton boton = new JButton(texto);
		boton.setBounds(x, y, ancho, alto);
		boton.setBackground(color);
		boton.setForeground(Color.WHITE);
		boton.setFont(FONT_BOTON);
		boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		boton.setFocusPainted(false);
		boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		return boton;
	}

	public static void mostrarMenu() {
		botonConsultarRecords.setVisible(true);
		botonIniciarPartida.setVisible(true);
		botonSalir.setVisible(true);

		botonEmpezar.setVisible(false);
		botonVolver.setVisible(false);
		etiquetaNombreJugador.setVisible(false);
		etiquetaNumeroAleatorio.setVisible(false);
		textFieldNombreJugador.setVisible(false);
		botonParar.setVisible(false);
	}

	public static void ocultarMenu() {
		botonConsultarRecords.setVisible(false);
		botonIniciarPartida.setVisible(false);
		botonSalir.setVisible(false);
	}

	private static void enviarDatos(int numero, double puntuacion, String nombreJugador) {

		String consultaInsercion = "INSERT INTO partida VALUES(?, ?, ?)";

		try (Connection con = DriverManager.getConnection(URL_CONEXION_BBDD, USUARIO_BBDD, PASSWORD_BBDD);
				PreparedStatement ps = con.prepareStatement(consultaInsercion);) {

			ps.setString(1, nombreJugador);
			ps.setDouble(2, puntuacion);
			ps.setInt(3, numero);
			ps.execute();
			System.out.println(" Datos insertados correctamente");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static Object[][] consultarRecords() {
		String consultaRecords = "SELECT * FROM partida ORDER BY puntuacion ASC LIMIT 10";

		List<Object[]> listaDatos = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL_CONEXION_BBDD, USUARIO_BBDD, PASSWORD_BBDD);
				PreparedStatement ps = con.prepareStatement(consultaRecords);) {

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object[] fila = { rs.getString("nombreJugador"), rs.getDouble("puntuacion"),
						rs.getInt("numeroJugado") };
				listaDatos.add(fila);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaDatos.toArray(new Object[0][]);

	}

}
