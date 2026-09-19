// Jugador.java
public class Jugador {
    private String nombre;
    private String tipoRed;
    private int medusasCazadas;

    public Jugador(String nombre, String tipoRed, int medusasCazadas) { 
        if (medusasCazadas < 1 || medusasCazadas > 50) { 
            throw new IllegalArgumentException("Medusas deben estar entre 1-50");
        }
        this.nombre = nombre;
        this.tipoRed = tipoRed;
        this.medusasCazadas = medusasCazadas;
    }

    // getters
    public String getNombre() { return nombre; }
    public String getTipoRed() { return tipoRed; }
    public int getMedusasCazadas() { return medusasCazadas; }

    @Override
    public String toString() {
        return nombre + " (" + tipoRed + "): " + medusasCazadas + " medusas";
    }
}
