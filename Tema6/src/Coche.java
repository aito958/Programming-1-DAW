
public class Coche {

	int matricula;
	String nombre;
	Persona dueño;

	public Coche(int matricula, String nombre, Persona dueño) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.dueño = dueño;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombre=" + nombre + ", dueño=" + dueño + "]";
	}
	
	
	
}
