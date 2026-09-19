package RELACION08_ARRAYS;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_3 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		
		int [] boleto = new int [6];
		for(int i = 0; i < boleto.length; i++) {
			boleto[i] = aleatorio.nextInt(1, 50);
		}
		
		Arrays.sort(boleto);
		System.out.println(Arrays.toString(boleto));
	}

}
