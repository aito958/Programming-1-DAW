package HerenciasEjemplos;

public class Vehiculo {
    private String numSerie;
    public String color;

    // Constructor vacío
    public Vehiculo() {
    }

    
    public Vehiculo(String numSerie, String color) {
        this.numSerie = numSerie;
        this.color = color;
    }

    //  (no llama a un método, devuelve el atributo)
    public String getNumSerie() {
        return numSerie;
    }

    // Setter por si quieres asignarlo
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    // Método pasarItv que luego usará Coche
    public void pasarItv() {
        System.out.println("ITV pasada desde Vehiculo");
    }
}
