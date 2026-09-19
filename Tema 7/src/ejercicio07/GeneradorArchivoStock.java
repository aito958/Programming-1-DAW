package ejercicio07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GeneradorArchivoStock {
	public static void main(String[] args) {
		String archivo = "stock.dat";

		Stock[] stocks = { new Stock("HP1100", "IMPRESORAS", new int[] { 12, 25, 10, 2, 5 }),
				new Stock("HP155", "IMPRESORAS", new int[] { 3, 20, 8, 5, 9 }),
				new Stock("DD155", "DISCOS DUROS", new int[] { 25, 20, 0, 15, 9 }),
				new Stock("DD666", "DISCOS DUROS", new int[] { 1, 18, 15, 2, 5 }) };

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ejercicio07/" + archivo))) {
			for (Stock stock : stocks) {
				oos.writeObject(stock);
			}
			System.out.println("Archivo de stock generado correctamente.");
		} catch (IOException e) {
			System.err.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}
}