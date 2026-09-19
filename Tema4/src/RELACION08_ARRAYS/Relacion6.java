package RELACION08_ARRAYS;

public class Relacion6 {
	/**
	 * Clase Habitacion que representa una habitación de un hotel
	 */
	public class Habitacion {
	    private final int numero;           // No modificable
	    private final String tipo;          // No modificable (simple, doble, triple)
	    private boolean ocupada;            // Modificable

	    /**
	     * Constructor de la clase Habitacion
	     * @param numero El número único de la habitación
	     * @param tipo El tipo de habitación (simple, doble, triple)
	     */
	    public Habitacion(int numero, String tipo) {
	        this.numero = numero;
	        this.tipo = tipo;
	        this.ocupada = false;  // Al crear, la habitación está libre
	    }

	    // Getters
	    public int getNumero() {
	        return numero;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public boolean isOcupada() {
	        return ocupada;
	    }

	    // Setters (solo para ocupada)
	    public void setOcupada(boolean ocupada) {
	        this.ocupada = ocupada;
	    }

	    @Override
	    public String toString() {
	        return "Habitacion{" +
	                "numero=" + numero +
	                ", tipo='" + tipo + '\'' +
	                ", ocupada=" + ocupada +
	                '}';
	    }
	}
}
