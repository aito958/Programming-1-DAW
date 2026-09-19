
public class Alumno implements Comparable<Alumno> {
	private static final int NOTA_MAXIMA = 10;
	private String dni;
	private String nombre;
	private String direccion;
	private int notaFinal;
	
	
	public Alumno(String dni, String nombre, String direccion, int notaFinal) throws AlumnoException {
		
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		setNotaFinal(notaFinal);
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
	
	
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) throws AlumnoException {
		if ( notaFinal < 0 || notaFinal > NOTA_MAXIMA) {
			throw new AlumnoException("Nota incorrecta " + notaFinal);
		}
		this.notaFinal = notaFinal;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", notaFinal=" + notaFinal
				+ "]";
	}
	@Override
	public int compareTo(Alumno otro) {
		int valor;
		
		if ( this.notaFinal== otro.notaFinal) {
			valor=0;
		}else {
			if ( this.notaFinal > otro.notaFinal) {
				valor=1; // cualquier valor positivo vale
			}
			else {
				valor=-1; // cualquier valor negativo vale
			}
		}
		
		return valor;
		
		// Igual que lo anterior
		//return Integer.compare(this.notaFinal, otro.notaFinal);
		
		// Esto ordenaría por nombre
		//return this.getNombre().compareTo(otro.getNombre());
	}
	
	
	
	
	
	
}
