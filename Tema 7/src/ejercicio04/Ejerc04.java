
package ejercicio04;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejerc04 {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Aitor\\eclipse-workspace-PROGRAMACION\\Tema 7\\Material relacion 13\\ejercicio04\\Ejerc04.java");
        File ficheroSalida = new File("src/Ejercicio4/MatriculosCorrectas.txt");

        try (FileReader fr = new FileReader(f);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(ficheroSalida);
             BufferedWriter bwSalida = new BufferedWriter(fw)) {

            Pattern p = Pattern.compile("^\\d{4}[A-Z]{3}$");
            Matcher m;

            String linea = br.readLine();
            while (linea != null) {
                m = p.matcher(linea);

                if (m.matches()) {
                    bwSalida.write(linea);
                    bwSalida.newLine();
                    System.out.println("Matricula correcta: " + linea);
                }

                linea = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}