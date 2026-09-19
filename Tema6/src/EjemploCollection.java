import java.util.HashSet;
import java.util.Set;

public class EjemploCollection {

	public static void main(String[] args) {

		Persona p1 = new Persona(123, "Fernando Alonso");
		Persona p2 = new Persona(234, "Carlos Sainz");

		Set<Persona> pilotos = new HashSet<Persona>();

		pilotos.add(p1);
		pilotos.add(p2);
		System.out.println(pilotos.size());
		
	}

}
