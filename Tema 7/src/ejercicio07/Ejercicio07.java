package ejercicio07;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Ejercicio07 {

	public static void main(String[] args) {

		File f = new File("src/ejercicio07/stock.dat");
		File fSalida = new File("src/ejercicio07/reponer.txt");

		try (FileInputStream fr = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fr);
				FileWriter fw = new FileWriter(fSalida);
				BufferedWriter bw = new BufferedWriter(fw)) {

			boolean fin = false;

			XMLOutputFactory wof = XMLOutputFactory.newInstance();
			XMLStreamWriter xw = wof.createXMLStreamWriter(fw);

			xw.writeStartDocument("UTF-8", "1.0"); // Inicia el documento XML
			xw.writeStartElement("ejercicio 7"); // Crea el elemento raíz 
			
			while (!fin) {
				try {
					Stock s = (Stock) ois.readObject();
					xw.writeStartElement("stock");
					xw.writeStartElement("nombre");
					xw.writeCharacters(s.getNombre());
					xw.writeEndElement();
					xw.writeStartElement("categoria");
					xw.writeCharacters(s.getCategoria());
					xw.writeEndElement();
					xw.writeStartElement("cantidadesEnAlmacen");

					for (int i = 0; i < s.getCantidadesEnAlmacen().length; i++) {
						if (s.getCantidadesEnAlmacen()[i] < 20) {
							xw.writeStartElement("almacen" + i);
							xw.writeCharacters(Integer.toString(s.getCantidadesEnAlmacen()[i]));
							xw.writeEndElement();
						}
					}

					xw.writeEndElement(); // Cierra el elemento "stock"
					xw.writeEndDocument(); // Finaliza el documento XML
				} catch (EOFException e) {
					fin = true;
				}
			}

		} catch (IOException e) {
			System.err.println("Error al procesar el archivo: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Clase no encontrada: " + e.getMessage());
		} catch (XMLStreamException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}