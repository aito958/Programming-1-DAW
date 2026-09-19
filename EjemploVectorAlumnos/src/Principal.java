import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	private static Scanner teclado = new Scanner(System.in);
	private static final int TOTAL_ALUMNOS = 5;

	public static void main(String[] args) {

		Alumno[] clase = new Alumno[TOTAL_ALUMNOS];
		Alumno alumnoEncontrado=null;
		String nombre;

		cargarDatosClase(clase);

		mostrarDatosClase(clase);
		
		System.out.println("Introduce el nombre del alumno:");
		nombre=teclado.nextLine();
		
		alumnoEncontrado=buscarAlumno( nombre, clase);
		if ( alumnoEncontrado==null) {
			System.out.println("El alumno " + nombre + "no está en la clase");
		}
		else {
			System.out.println("Se encuentra en la clase. Estos son sus datos: " + alumnoEncontrado);
		}
		
		Arrays.sort(clase);
		
		System.out.println("Clase ordenada por nota:");
		mostrarDatosClase(clase);
		
	}

	/**
	 * Devuelve null si no se encuentra el alumno en la clase y el objeto alumno encontrado en caso contrario
	 * @param nombre
	 * @param clase
	 */
	private static Alumno buscarAlumno(String nombre, Alumno[] clase) {
		boolean encontrado=false;
		Alumno alumnoEncontrado=null;
		
		for (int i = 0; i < clase.length && !encontrado; i++) {
			
			if ( clase[i].getNombre().equalsIgnoreCase(nombre)) {
				encontrado=true;
				alumnoEncontrado=clase[i];
			}
		}
		return alumnoEncontrado;
	
		
		
	}

	private static void mostrarDatosClase(Alumno[] clase) {

		for (Alumno alumno: clase) {
			System.out.println(alumno);
		}
		
//		Otra forma
//		for(int i=0; i< clase.length ; i++) {
//			System.out.println(clase[i]);
//		}
	}

	private static void cargarDatosClase(Alumno[] clase) {

		String dni, nombre, direccion;
		int nota;
		int i=0;
		
		while (i < clase.length) {

			System.out.println("Alumno " + (i + 1) + ":");
			System.out.println("Introduce dni");
			dni = teclado.nextLine();

			System.out.println("Introduce nombre");
			nombre = teclado.nextLine();

			System.out.println("Introduce direccion");
			direccion = teclado.nextLine();

			System.out.println("Introduce nota final:");
			nota = Integer.parseInt(teclado.nextLine());
			
			try {
				clase[i]=new Alumno(dni, nombre, direccion, nota);
				
				i++;
			} catch (AlumnoException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
