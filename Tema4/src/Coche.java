
public class Coche {

	String color;
	String marca;
	String modelo;
	String matricula;
	int nivelBateria;
	double kilometro;

	static int ultimoId = 0;

	public Coche(String color, String marca, String modelo, String matricula) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = String.valueOf(ultimoId);
		Coche.ultimoId ++;
		nivelBateria = 100;
	}

	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", nivelBateria=" + nivelBateria + "]";
	}

	// PINTAR

	public void pintar(String colorNuevo) {
		this.color = colorNuevo;

	}

	public void cargar(int porcentaje) {
		if (nivelBateria > 0) {
			System.out.println("carga erronea");
			if (porcentaje + nivelBateria >= 100) {
				nivelBateria = 100;

			} else {
				nivelBateria += porcentaje;
			}
		}

	}

	public float conducir(float kilometros) {
		float kilometroPosibles = nivelBateria * 4;
		float kilometrosRecorridos = 0;

		if (kilometroPosibles > kilometros) {
			kilometrosRecorridos = kilometros;
			nivelBateria = (int) (nivelBateria - kilometros / 4);
		} else {
			kilometrosRecorridos = nivelBateria * 4;
			nivelBateria = 0;

		}

		return kilometrosRecorridos;
	}
}
