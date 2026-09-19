
public class Garaje {

	public static void main(String[] args) {

		Coche miCoche = new Coche("blanco", "tesla", "model 3 ", "1234ABC");
		Coche miCoche2 = new Coche("verde", "Lamborghini ", "Aventador ", "1235BAV");

		System.out.println(Coche.ultimoId);
		
		System.out.println(miCoche);
		System.out.println(miCoche2);

		miCoche.pintar("Naranja");
		System.out.println("km recorridos" + miCoche.conducir(150));
		miCoche.cargar(50);

		System.out.println(miCoche);
	}

}
