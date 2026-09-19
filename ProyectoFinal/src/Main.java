
import com.game.ui.VentanaPrincipal;
import com.game.database.ConexionBD;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Conectar a la base de datos
        ConexionBD.conectar();

        // Iniciar interfaz
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal();
        });
    }
}