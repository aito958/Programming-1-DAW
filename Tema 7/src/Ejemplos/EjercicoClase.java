package Ejemplos;

import java.io.File;

public class EjercicoClase {

	public static void main(String[] args) {
// crear una carpeta con su nombre  en el escritorio y dentro un archivo.txt vacio de cada modulo del curso 
		
		 File carpeta = new File("C:\\Users\\Aitor\\Desktop\\Aitor");
		 carpeta.mkdir();
		 
		 File archivo1 = new File(carpeta, "Modulo1.txt");
		 File archivo2 = new File(carpeta, "Modulo2.txt");
		 File archivo3 = new File(carpeta, "Modulo3.txt");
		 File archivo4 = new File(carpeta, "Modulo3.txt");

		 try {
			 archivo1.createNewFile();
			 archivo2.createNewFile();
			 archivo3.createNewFile();
			 archivo4.createNewFile();
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 

	}

}
