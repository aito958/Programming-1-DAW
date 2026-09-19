package testRectangulo;

import java.util.Objects;

public class Punto {
	@Override
	public int hashCode() {
		return Objects.hash(puntoA, puntoB);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return puntoA == other.puntoA && puntoB == other.puntoB;
	}


	private int puntoA;
	private int puntoB;


	public  int Linea (int puntoA , int puntoB) {
		
		this.puntoA = puntoA; 
		this.puntoB = puntoB;

		return 0;
		
	}

}
