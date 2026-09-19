package RELACION4;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		boolean bis = esBisiesto(4000);
		
		System.out.println(esBisiesto(2022));
	}

	public static boolean esBisiesto(int anio) {
		
		boolean bisiesto = false;
		
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			bisiesto = true;
		}
		
		if (bisiesto) {
			System.out.println("Es año bisiesto");
		} else {
			System.out.println("No es año bisiesto");
		}
		
		return bisiesto;
	}
}
