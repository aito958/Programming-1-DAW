package ejercicio02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercico2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del fichero: ");
        String nombreFichero = sc.nextLine();

        File fichero = new File(nombreFichero);

        int totalPalabras = 0;
        String palabraBuscada;

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String texto = linea.trim();
                if (!texto.isEmpty()) {
                    String[] palabras = texto.split("\\s+");
                    totalPalabras += palabras.length;
                }
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
            sc.close();
            return;
        }

        System.out.println("El fichero tiene " + totalPalabras + " palabras.");

        System.out.print("Palabra a buscar: ");
        palabraBuscada = sc.nextLine();

        String nombreSalida = "BuscandoPalabra" + palabraBuscada + ".txt";

        boolean encontrada = false;

        try (BufferedReader br = new BufferedReader(new FileReader(fichero));
             PrintWriter pw = new PrintWriter(new FileWriter(nombreSalida))) {

            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                String[] palabras = linea.split("\\s+");

                int columna = 1;
                for (String palabra : palabras) {
                    String limpia = palabra.replaceAll("[^\\p{L}\\p{N}]", "");

                    if (limpia.equalsIgnoreCase(palabraBuscada)) {
                        pw.println("Encontrada en línea " + numeroLinea + " columna " + columna);
                        encontrada = true;
                    }

                    columna++;
                }
            }

        } catch (IOException e) {
            System.out.println("Error en la búsqueda: " + e.getMessage());
            sc.close();
            return;
        }

        if (encontrada) {
            System.out.println("La palabra se ha encontrado. Resultado guardado en " + nombreSalida);
        } else {
            System.out.println("La palabra no se encontró en el fichero.");
        }

        sc.close();
    }
}