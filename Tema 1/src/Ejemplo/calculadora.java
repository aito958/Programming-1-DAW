////Crea un programa que declare dos números enteros.
//Dale valor (1-100) a los números directamente en el código.
//Muestra la suma de los dos números en pantalla.
////Sumale 1 al primer número y restale 1 al segundo número
//Muestra la multiplicación de los dos números.
//Guarda en una variable la división del primer numero entre el segundo.
//Guarda la división anterior con decimales.
//Muestra el resultado de comparar los dos números
package Ejemplo;

import java.util.Scanner;

public class calculadora {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Introduce el primer número");
		
		
		double numero1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Introduce el segundo número");

		
		int numero2 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("La suma es = " +(numero1+numero2));
		
		numero1++;
		numero2--;
		
	System.out.println("La multiplicación es = " +(numero1 * numero2));
		
	double div = numero1/numero2;
	System.out.println(div);
	double divDecimales = (double)numero1/numero2;
	System.out.println(divDecimales);
	div = (int) divDecimales;
	System.out.println("El resultado de comparar es :" +(numero1==numero2));
	
	char caracter = (char) numero2;
	System.out.println(caracter);
	
	}

}