package Ejemplos;

import java.io.File;

public class LocalizarFicheros {

	public static void main(String[] args) {
		File archivo = new File("C:\\Users\\Aitor\\eclipse-workspace-PROGRAMACION\\Tema7");

		if (archivo.isFile()) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("El archivo no existe");
		}
		if (archivo.isDirectory()) {
			System.out.println("Es un directorio");
		} else {
			System.out.println("No es un directorio");
		}

		if(archivo.exists()) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("El archivo no existe");
		}
		
		if(archivo.canWrite()) {
			System.out.println("El archivo se puede escribir");
		} else {
			System.out.println("El archivo no se puede escribir");
		}
		
		if(archivo.canRead()) {
			System.out.println("El archivo se puede leer");
		} else {
			System.out.println("El archivo no se puede leer");
		}
		
		System.out.println(archivo.getPath());
		System.out.println(archivo.getAbsolutePath());
		
		
		System.out.println("Directorio actual: " + new File(".").getAbsolutePath());
		System.out.println("Archivo: " + new File("holita.txt").getAbsolutePath());
		System.out.println("Existe: " + new File("holita.txt").exists());
	}
}
