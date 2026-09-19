import java.util.Arrays;

public class Ejemplos {

	public static void main(String[] args) {

//		int x = 123456789;
//		
//		String texto  =String.valueOf(x);
//		String alReves = new StringBuilder(texto).reverse().toString();
//		
//		int res  = Integer.parseInt(alReves);
//		System.out.println(res);

		Persona p1 = new Persona(123, "Fernando Alonso");
		Persona p2 = new Persona(234, "Carlos Sainz");

		Persona[] pilotos = { p1, p2 };
		System.out.println(Arrays.toString(pilotos));

		Persona[] pilotos2 = new Persona[2];
		System.out.println(Arrays.toString(pilotos2));

		Utilidades.volcarArray(pilotos, pilotos2);
		System.out.println(Arrays.toString(pilotos2));

		Coche c1 = new Coche(1, "Ferrari", p1);
		Coche c2 = new Coche(2, "Lamborghini", p1);
		Coche c3 = new Coche(3, "Aston Martin", p2);

		Coche[] garaje = { c1, c2, c3 };
		System.out.println(Arrays.toString(garaje));

		Coche[] garaje2 = new Coche[3];
		Utilidades.volcarArray(garaje, garaje2);

		System.out.println(Arrays.toString(garaje2));

		Utilidades.volcarArray(garaje, garaje2);
		System.out.println(Arrays.toString(garaje2));
		
		Utilidades.volcarArray(pilotos, pilotos2);
		System.out.println(Arrays.toString(pilotos2));
	}
}