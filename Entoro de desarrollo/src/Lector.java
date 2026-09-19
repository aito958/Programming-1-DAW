
import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private List<Prestamo> prestamos;
    private Multa multa;

    public Lector(String nombre, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.prestamos = new ArrayList<>();
        this.multa = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public boolean estaMultado() {
        return multa != null && multa.isActiva();
    }

    public boolean puedePedirPrestamo() {
        return prestamos.size() < 3 && !estaMultado();
    }

    @Override
    public String toString() {
        return nombre + " (" + prestamos.size() + " préstamos)";
    }
}