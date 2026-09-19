package tareaGeometria;

public class Punto {
	
	private int  x;
	private int y;
	
	public Punto(int x, int  y) {
		
		this.x = x;
		this.y = y;
	}
	
	public void mover (int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
