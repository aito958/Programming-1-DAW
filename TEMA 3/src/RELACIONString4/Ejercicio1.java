package RELACIONString4;

import java.util.Scanner;

public class Ejercicio1 {


	public static void main(String[] args) {

		
		String cadena = "El betis es el mejor equipo del mundo";
		char caracter = 'e';
		
		int numCaracteres  = numeroCaracteresEnCadena(cadena, caracter);
		
System.out.println("La cadena tiene " +numCaracteres+ " veces ese caracter;");
		
	}
	
	private static int numeroCaracteresEnCadena(String cadena, char caracter) {
		
		int contador=0;
		for(int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (c == caracter) {
	contador++;
		}
		}
		return contador;
	}

}
