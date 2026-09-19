package ARRAYS;

import java.lang.reflect.Array;
import java.util.Arrays;

import Carta.Carta;

public class EjemploOrdenacionObjeto0s {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = num1;
		num1 = 20;

		System.out.println(num1 + " | " + num2);

		Carta[] baraja = new Carta[7];
		Carta[] baraja2 = new Carta[7];

		// Inicializo la baraja
		for (int i = 0; i < baraja.length; i++) {
			baraja[i] = new Carta();
			baraja2[i] = new Carta(baraja[i].numero, baraja[i].palo);
		}
		baraja[0].numero = '0';

		for (Carta temp : baraja) {
			System.out.print(temp + " | ");

		}
		System.out.println();
		for (Carta temp : baraja2) {
			System.out.print(temp + " | ");

		}
//
//		Arrays.sort(baraja);
//		System.out.println();
//	
//		for(Carta temp : baraja) {
//			System.out.print(temp+"|");
//		}
//	 
//	
	}

}
