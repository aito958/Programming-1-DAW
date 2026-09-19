package Ejemplos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EscribirObjetosbinarios {

    public static void main(String[] args) {

        Carta2 carta1 = new Carta2('5', 'E');
        Carta2 carta2 = new Carta2('2', 'O');

        File archivo = new File("baraja.prg");

        // ESCRITURA
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos;

            if (archivo.length() > 0) {
                oos = new AppendableObjectOutputStream(fos);
            } else {
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(carta1);
            oos.writeObject(carta2);

            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LECTURA
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean fin = false;
            while (!fin) {
                try {
                    Carta2 c = (Carta2) ois.readObject();
                    System.out.println(c);
                } catch (EOFException e) {
                    fin = true;
                }
            }

            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}