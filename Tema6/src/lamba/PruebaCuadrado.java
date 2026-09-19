package lamba;

public class PruebaCuadrado {

	public static void main(String[] args) {
	
		ICuadrado c =(x) ->{return x*x;};
		System.out.println(c.cuadrado(5));
		
		ClaseCuadrado cc = new ClaseCuadrado();
		System.out.println(cc.cuadrado(5));
	}

}
