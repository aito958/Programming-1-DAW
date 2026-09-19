
public class Libro {
    private String isbn;
    private String nombre;
    private TipoLibro tipo;
    private String editorial;
    private int anio;
    private Autor autor;
    private EstadoLibro estado;

    public Libro(String isbn, String nombre, TipoLibro tipo, String editorial, int anio, Autor autor) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anio = anio;
        this.autor = autor;
        this.estado = EstadoLibro.EN_BIBLIOTECA;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoLibro getTipo() {
        return tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnio() {
        return anio;
    }

    public Autor getAutor() {
        return autor;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre + " - " + autor.getNombre() + " [" + estado + "]";
    }
}