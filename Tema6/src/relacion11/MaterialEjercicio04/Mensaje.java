package relacion11.MaterialEjercicio04;

import java.time.LocalDateTime;
import java.util.Comparator;

 public class Mensaje   { 
	
	Persona remitente;
	String texto;
	LocalDateTime fecha;
	
	
	public Mensaje(Persona remitente, String texto) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.fecha = LocalDateTime.now();
	}


	@Override
	public String toString() {
		return "Mensaje [DNI=" + remitente + ", Texto: " + texto + ", Fecha y hora:" + fecha + "]";
	}

	public Persona getRemitente() {
		return remitente;
	}
	
}
