package Ejemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemEscrituraArchivo {
	public static void main(String[] args) throws IOException {

		File archivo = new File("adios.txt");
		if (!archivo.exists()) {
			archivo.createNewFile();
		}

		FileWriter fw = new FileWriter(archivo, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Hola que haces\n");
		bw.write("Nada \n");
		bw.write("Vale tio");

		

		bw.close();
		fw.close();

	}

}
