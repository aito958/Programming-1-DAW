
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Lector> lectores;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.lectores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public void addLector(Lector lector) {
        lectores.add(lector);
    }

    public boolean prestarLibro(String isbn, Lector lector, LocalDate fechaPrestamo) {
        if (!lector.puedePedirPrestamo()) return false;

        Libro libro = buscarLibroPorISBN(isbn);
        if (libro == null) return false;

        if (libro.getEstado() != EstadoLibro.EN_BIBLIOTECA) return false;

        Prestamo prestamo = new Prestamo(libro, lector, fechaPrestamo);
        prestamos.add(prestamo);
        lector.getPrestamos().add(prestamo);
        libro.setEstado(EstadoLibro.PRESTADO);

        return true;
    }

    public boolean devolverLibro(String isbn, Lector lector, LocalDate fechaDevolucion, boolean enBuenEstado) {
        Prestamo prestamo = buscarPrestamo(isbn, lector);
        if (prestamo == null) return false;

        Libro libro = prestamo.getLibro();
        prestamo.devolver(fechaDevolucion);

        lector.getPrestamos().remove(prestamo);

        if (!enBuenEstado) {
            libro.setEstado(EstadoLibro.EN_REPARACION);
            return true;
        }

        if (prestamo.getDiasRetraso() > 0) {
            lector.setMulta(new Multa(prestamo.getDiasRetraso() * 2));
            libro.setEstado(EstadoLibro.CON_RETRASO);
        } else {
            libro.setEstado(EstadoLibro.EN_BIBLIOTECA);
        }

        return true;
    }

    public void repararLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.getEstado() == EstadoLibro.EN_REPARACION) {
            libro.setEstado(EstadoLibro.EN_BIBLIOTECA);
        }
    }

    private Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    private Prestamo buscarPrestamo(String isbn, Lector lector) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().getIsbn().equals(isbn) && prestamo.getLector().equals(lector)) {
                return prestamo;
            }
        }
        return null;
    }
}