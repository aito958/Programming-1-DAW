package RELACIONString4;

import java.util.Scanner;

public class palabra_escondida {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce frase oculta");
        String frase = teclado.nextLine();

        System.out.println("Introduce la palabra oculta");
        String palabraOculta = teclado.nextLine();

        if (palabraEncontrada(frase, palabraOculta)) {
            System.out.println("La palabra está escondida en la frase.");
        } else {
            System.out.println("La palabra NO está escondida en la frase.");
        }
    }

    private static boolean palabraEncontrada(String frase, String palabraOculta) {
 int j = 0;
        boolean encontrado = false;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == palabraOculta.charAt(j)) {
                j++;
            } else {
                j = 0;
            }

            if (j == palabraOculta.length()) {
                encontrado = true;
                break;
            }
        }

        return encontrado;
    }
}
