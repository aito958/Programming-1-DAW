package relacion11.MaterialEjercicio01;

public class Main {

	public static void main(String[] args) {

		Alumno Fernando = new Alumno("123", "Alonso");
		Alumno Oscar = new Alumno("456", "Piastri");	
		Alumno Lando = new Alumno("789", "Norris");
		Alumno Max = new Alumno("123", "Verstappen"); 
		Alumno Lance = new Alumno("123", "Stroll");
		Alumno  kimi  = new Alumno("456", "Antonelli");	
		
		Equipo equipo1 = new Equipo("Mclaren");
		Equipo equipo2 = new Equipo("Mercedes");
		Equipo equipo3 = null;
			
		try {
			equipo1.insertarAlumno(Fernando);
			equipo1.borrarAlumno(Fernando);
			equipo1.insertarAlumno(Oscar);
			equipo1.insertarAlumno(Lando);
			equipo1.borrarAlumno(Max);

			
			 equipo3= equipo1.fusionDeEquipos(equipo2 , "Equipo fusionado");
			
		} catch (EquipoException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			
		}
		System.out.println(equipo1);
		System.out.println(equipo3);

		
	}

}
