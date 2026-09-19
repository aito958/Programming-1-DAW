

public class Paciente {

	private static final int GRAVEDAD_MINIMA = 1;
	private static final int GRAVEDAD_MAXIMA = 5;
	private String dni;
	private String nombre;
	private int gravedad;
	public Paciente(String dni, String nombre, int gravedad) throws UrgenciasException {
		super();
		this.dni = dni;
		this.nombre = nombre;
		setGravedad( gravedad);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGravedad() {
		return gravedad;
	}
	public void setGravedad(int gravedad) throws UrgenciasException {
		if ( gravedad< GRAVEDAD_MINIMA || gravedad > GRAVEDAD_MAXIMA) {
			throw new UrgenciasException("Gravedad incorrecta");
		}
		this.gravedad = gravedad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", prioridad=" + gravedad + "]";
	}
	
	
}
