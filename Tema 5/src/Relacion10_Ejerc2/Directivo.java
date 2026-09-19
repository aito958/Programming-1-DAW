package Relacion10_Ejerc2;

public class Directivo extends Empleado {

	static final int SUELDO_MAX = 3000;

	public Directivo(String dni, String nombre, int sueldo,  int Sueldo_Max) throws EmpleadoException {
		super(dni, nombre, sueldo, Sueldo_Max);

		if (sueldo > SUELDO_MAX) {
			throw new EmpleadoException("Sueldo del informatico incorrecto, demasiado alto. Límite es " + SUELDO_MAX);
		}

	}

}
