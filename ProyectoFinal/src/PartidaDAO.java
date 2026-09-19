
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO {
    private Connection conexion;

    public PartidaDAO() {
        this.conexion = ConexionBD.getConexion();
    }

    // Obtener o crear jugador
    public int obtenerOCrearJugador(String nombreJugador) {
        try {
            // Verificar si existe
            String sqlSelect = "SELECT id_jugador FROM jugadores WHERE nombre_jugador = ?";
            PreparedStatement pstmt = conexion.prepareStatement(sqlSelect);
            pstmt.setString(1, nombreJugador);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_jugador");
            }

            // Si no existe, crear
            String sqlInsert = "INSERT INTO jugadores (nombre_jugador) VALUES (?)";
            pstmt = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, nombreJugador);
            pstmt.executeUpdate();

            rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener/crear jugador: " + e.getMessage());
        }
        return -1;
    }

    // Guardar partida
    public boolean guardarPartida(Partida partida) {
        try {
            String sql = "INSERT INTO partidas (id_jugador, tiempo_objetivo, tiempo_real, diferencia, exactitud) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setInt(1, partida.getIdJugador());
            pstmt.setInt(2, partida.getTiempoObjetivo());
            pstmt.setDouble(3, partida.getTiempoReal());
            pstmt.setDouble(4, partida.getDiferencia());
            pstmt.setDouble(5, partida.getExactitud());

            pstmt.executeUpdate();
            System.out.println("✓ Partida guardada");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al guardar partida: " + e.getMessage());
            return false;
        }
    }

    // Obtener top 10 partidas
    public List<Partida> obtenerTop10() {
        List<Partida> partidas = new ArrayList<>();
        try {
            String sql = "SELECT j.nombre_jugador, p.tiempo_objetivo, p.tiempo_real, p.diferencia, p.exactitud, p.fecha_partida "
                    + "FROM partidas p "
                    + "JOIN jugadores j ON p.id_jugador = j.id_jugador "
                    + "ORDER BY p.exactitud DESC, p.diferencia ASC "
                    + "LIMIT 10";

            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Partida partida = new Partida();
                partida.setNombreJugador(rs.getString("nombre_jugador"));
                partida.setTiempoObjetivo(rs.getInt("tiempo_objetivo"));
                partida.setTiempoReal(rs.getDouble("tiempo_real"));
                partida.setDiferencia(rs.getDouble("diferencia"));
                partida.setExactitud(rs.getDouble("exactitud"));
                partidas.add(partida);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ranking: " + e.getMessage());
        }
        return partidas;
    }

    // Obtener historial de un jugador
    public List<Partida> obtenerHistorialJugador(String nombreJugador) {
        List<Partida> partidas = new ArrayList<>();
        try {
            int idJugador = obtenerOCrearJugador(nombreJugador);
            String sql = "SELECT * FROM partidas WHERE id_jugador = ? ORDER BY fecha_partida DESC LIMIT 10";

            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setInt(1, idJugador);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Partida partida = new Partida();
                partida.setIdPartida(rs.getInt("id_partida"));
                partida.setTiempoObjetivo(rs.getInt("tiempo_objetivo"));
                partida.setTiempoReal(rs.getDouble("tiempo_real"));
                partida.setDiferencia(rs.getDouble("diferencia"));
                partida.setExactitud(rs.getDouble("exactitud"));
                partida.setNombreJugador(nombreJugador);
                partidas.add(partida);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener historial: " + e.getMessage());
        }
        return partidas;
    }
}