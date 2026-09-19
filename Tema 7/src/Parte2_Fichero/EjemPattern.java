package Parte2_Fichero;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemPattern {

	public static void main(String[] args) {
		
		// Expresion regular valide nombre de archivo 
		// No puede contener caracteres especiales como / \ : * ? " < > |
		// tamaño maximo 255 caracteres
		//.extension de archivo opcional tamaño 1-255 caracteres

		Pattern patron = Pattern.compile (" ^[^/\\\\:*?\"<>|]{1,255}(\\.[^/\\\\:*?\"<>|]{1,255})?$");
		Matcher m = patron.matcher("nuevo.txt");
		
		if(m.matches()) {
			System.out.println("El nombre del fichero es correcto");
		} else {
			System.out.println("El nombre del fichero no es correcto");
		}
		
		
		
	}

}
