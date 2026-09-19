package tema8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {
    public static void main(String[] args) {

    		String url = "jdbc:mysql://localhost:3306/programacion";
    		String usuario = "programacion";
	        String contraseña = "123";
	        String sql = "SELECT nombre, apellido FROM alumno";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
	                 PreparedStatement ps = conn.prepareStatement(sql);
	                 ResultSet rs = ps.executeQuery()) {

	                System.out.println("¡Conexión establecida!");

	                while (rs.next()) {
	                    String nombre = rs.getString("nombre");
	                    String apellido = rs.getString("apellido");
	                    System.out.println("Alumno: " + nombre + " " + apellido);
	                }
	            }

	        } catch (ClassNotFoundException e) {
	            System.err.println("No se encontró el driver de MySQL.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.err.println("Error al conectar:");
	            e.printStackTrace();
	        }
	    }
	}
