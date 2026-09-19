package Relacion10_Ejerc2;

public abstract class Empleado {
	public static final int SUELDO_MINIMO=800;
	
	private String dni;
	private String nombre;
	private int sueldo;
	
	
	public Empleado(String dni, String nombre, int sueldo, int Sueldo_max) throws EmpleadoException {
		super();
		this.dni = dni;
		this.nombre = nombre;
		setSueldo(sueldo , Sueldo_max );
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
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo , int Sueldo_Max) throws EmpleadoException {
		if (sueldo < SUELDO_MINIMO && Sueldo_Max < sueldo)
			throw new EmpleadoException(" Sueldo incorrecto");
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}
