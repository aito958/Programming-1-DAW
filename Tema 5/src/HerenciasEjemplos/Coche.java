package HerenciasEjemplos;

public class Coche extends Vehiculo {
	private int nPuertas;
	private int numAirbags;

	public Coche() {
		super();
	}

	public Coche(String numSerie, String color, int nPuertas, int numAirbags) {
		super(numSerie, color);
		this.nPuertas = nPuertas;
		this.numAirbags = numAirbags;
	}

	// Método propio de Coche
	public void realizarItv() {
		// Llamo al método de la superclase
		super.pasarItv();
		System.out.println("ITV pasada desde Coche");

	}
}