
//Clase Circulo
public class Circulo extends Figura {
	private double radio;

	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() +  " Circulo [radio=" + radio + "]";
	}



	@Override
	public double area() {
		 return Math.PI* radio*radio;
	}

	
	
	
}