// Clase Abstracta Figura

public abstract class Figura {
	private int x; // posición x de la figura
	private int y; // posición y de la figura

	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract double area();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	
	
}