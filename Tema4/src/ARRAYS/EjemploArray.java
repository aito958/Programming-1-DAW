package ARRAYS;

public class EjemploArray {

	public static void main(String[] args) {

		String[] bestPiloto = { "Fernando alonso", "lauda", "senna" ," mika", "vettel " };

		for (String tempotal : bestPiloto) {
			System.out.println(tempotal);
		}
		System.out.println("---------------");
		for (int i = bestPiloto.length-1; i >= 0; i--) {
			System.out.println(bestPiloto[i]);
		}
	}

}
