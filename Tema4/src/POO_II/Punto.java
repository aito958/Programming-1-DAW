package POO_II;

import java.util.Objects;

public class Punto {
	private int cordX;
	private int cordY;
	private int cordX2;
	private int cordY2;
	
	public  int Linea (int puntoA , int puntoB) {
		
		this.cordX = puntoA; 
		this.cordY = puntoA;
		this.cordX2 = puntoB; 
		this.cordY2 = puntoB;
		return 0;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(cordX, cordX2, cordY, cordY2);
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
		return cordX == other.cordX && cordX2 == other.cordX2 && cordY == other.cordY && cordY2 == other.cordY2;
	}

	@Override
	public String toString() {
		return "Punto [cordX=" + cordX + ", cordY=" + cordY + ", cordX2=" + cordX2 + ", cordY2=" + cordY2 + "]";
	}


	
}
