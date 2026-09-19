/**
 * Clase que representa un jugador en el juego LuL
 */
public class Jugador {
     private String nombre;
    private String Campeon ;
    private  int nivel;  // Rango 1-100
    private String posicion;

    public Jugador(String nombre, String campeon, int nivel) {
        if (nivel < 1 || nivel > 100) {
            throw new IllegalArgumentException("El nivel debe estar entre 1 y 100");
        }
        this.nombre = nombre;
        this.Campeon = Campeon;
        this.nivel = nivel;
        this.posicion = null;  // Se asignará durante la creación del equipo
    }

    public String getNombre() {
        return nombre;
    }

    public String getCampeon() {
        return Campeon;
    }

    public int getNivel() {
        return nivel;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCampeon(String campeon) {
        this.Campeon = campeon;
    }

    public void setNivel(int nivel) {
        if (nivel < 1 || nivel > 100) {
            throw new IllegalArgumentException("El nivel debe estar entre 1 y 100");
        }
        this.nivel = nivel;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre + " (" + Campeon + ") - Nivel: " + nivel;
    }
}
