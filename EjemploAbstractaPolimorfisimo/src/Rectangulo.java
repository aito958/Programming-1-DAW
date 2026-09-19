
public class Rectangulo extends Figura {
	private double ancho, alto;

	public Rectangulo(int x, int y, double ancho, double alto) {
		super(x, y);
		this.ancho = ancho;
		this.alto = alto;
	}

	

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return super.toString() +  " Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}



	@Override
	public double area() {
		
		return ancho*alto;
	}
	
	
}