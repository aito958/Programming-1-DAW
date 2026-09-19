
public class Persona implements Comparable<Persona> {
	int DNI;
	String nombre;

	public Persona(int dNI, String persona) {
		super();
		DNI = dNI;
		this.nombre = persona;

	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + "]";
	}

	
	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);
	}

}
