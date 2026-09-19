package ejercicio05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejerc05 {

	public static final String RUTA_SALIDA = "src/ejercicio05/";
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el nombre del archivo de salida: ");
		String nombreArchivo = sc.nextLine();
		File f = new File("RUTA_SALIDA" + "nombreArchivo");

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {

			Pattern p = Pattern.compile("^[F] [] [A-Za-z]{3} [\\ .][A-ZA-z]{3}");
			Matcher m;

			String linea = br.readLine();
			File nuevoArchivo;
			while (linea != null) {
				m = p.matcher(linea);
				String[] division;
				if (m.matches()) {
					division = linea.split(" ");
					nuevoArchivo = new File(RUTA_SALIDA + division[2] + ".txt");
					try (FileWriter fw = new FileWriter(nuevoArchivo, true);
							BufferedWriter bwSalida = new BufferedWriter(fw)) {
						bwSalida.write(linea);
						bwSalida.newLine();
						System.out.println("Linea correcta: " + linea);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				linea = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
