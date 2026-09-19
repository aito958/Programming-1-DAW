package Edificios;

public class Edificio {
	public String refCatastral, direccion;
	public char eficiencia;
	public int numPlantas, numAscensores;
	public int precioBaseOficina;
	public Oficina[] oficinas;

	private double indiceEficiencia() {
		switch (eficiencia) {
		case 'A':
			return 0.1;
		case 'B':
			return 0.2;
		case 'C':
			return 0.3;
		case 'D':
			return 0.4;
		case 'E':
			return 0.4;
		default:
			return 1.0;
		}
	}

	public Edificio(String refCatastral, String direccion, char eficiencia, int numPlantas, int numAscensores, int precioBase, Oficina[] oficinas) {
		this.refCatastral = refCatastral;
		this.direccion = direccion;
		this.eficiencia = eficiencia;
		this.numPlantas = numPlantas;
		this.numAscensores = numAscensores;
		this.precioBaseOficina = precioBase;
		this.oficinas = oficinas;
	}

	public double getAlquiler() {
		// recorre el array de oficinas ,luego suma el precio del alquiler por el precio de las oficina y por ultimo devuelve 
		//la suma de todos los alquileres por su indice de eficiencia energética
		double totalOficinas = 0;
		for (Oficina o : oficinas) {
			totalOficinas += o.precioAlquiler(precioBaseOficina);
		}
		return totalOficinas + (totalOficinas * indiceEficiencia());
	}
}