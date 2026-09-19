package Relacion10_Ejerc2;

public class Informatico extends Empleado {

static final int SUELDO_MAX = 2500;
	
	EspecialidadInformatica especialidad;

	public Informatico(String dni, String nombre, int sueldo, EspecialidadInformatica especialidad , int Sueldo_Max)
			throws EmpleadoException {
		super(dni, nombre, sueldo, Sueldo_Max);
		this.especialidad = especialidad;
		 if (sueldo > SUELDO_MAX) {
	            throw new EmpleadoException("Sueldo del informatico incorrecto, demasiado alto. Límite es " + SUELDO_MAX);
	        }
	}

}
