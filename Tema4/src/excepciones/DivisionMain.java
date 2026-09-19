package excepciones;

public class DivisionMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		Math.floorDiv (3,4);
		
		try {
			division(x, y);
			throw new ArithmeticException();
			
		} catch (DivisionEntreCeroException divisionEntreCero) {
			System.out.println( divisionEntreCero.getMessage());
			System.out.println("No puedes dividir entre cero campeon");
		}
	
	}

	private static double division(int x, int y) throws DivisionEntreCeroException {
		if ( y == 0) {
			throw new DivisionEntreCeroException();
		}
		return x / y ;
		}
	}

