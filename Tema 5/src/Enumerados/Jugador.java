package Enumerados;

public class Jugador {
	String nombre;
	PiedraPapelTijeras jugada;

	public Jugador(String nombre, PiedraPapelTijeras jugada) {
		this.nombre = nombre;
		this.jugada = jugada;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", jugada=" + jugada + "]";
	}

}
