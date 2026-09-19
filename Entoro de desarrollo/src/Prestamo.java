import java.time.LocalDate;

public class Prestamo {

    Libro libro;
    Lector lector;
    LocalDate fPrestamo;
    LocalDate fPrev;
    LocalDate fReal;
    int retraso;

    public Prestamo(Libro l, Lector lec, LocalDate f) {
        libro = l;
        lector = lec;
        fPrestamo = f;
        fPrev = f.plusDays(30);
        retraso = 0;
    }

    public void devolver(LocalDate f) {
        fReal = f;
        if (f.isAfter(fPrev)) {
            retraso = (int) java.time.temporal.ChronoUnit.DAYS.between(fPrev, f);
        } else {
            retraso = 0;
        }
    }

    public Libro getLibro() { return libro; }
    public Lector getLector() { return lector; }
    public LocalDate getFechaPrestamo() { return fPrestamo; }
    public LocalDate getFechaPrevistaDevolucion() { return fPrev; }
    public LocalDate getFechaRealDevolucion() { return fReal; }
    public int getDiasRetraso() { return retraso; }
}
