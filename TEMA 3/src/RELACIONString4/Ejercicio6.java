package RELACIONString4;

import java.util.Scanner;

public class Ejercicio6 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < cadena.length(); j++) {
            char c = Character.toUpperCase(cadena.charAt(j));
            switch (c) {
                case 'A': a++; break;
                case 'E': e++; break;
                case 'I': i++; break;
                case 'O': o++; break;
                case 'U': u++; break;
            }
        }

        System.out.println("Cantidad de cada vocal:");
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

        System.out.println("Vocales únicas -> " + metodoPro(cadena));
    }

    private static String metodoPro(String cadena) {
        StringBuilder cadenaVocales = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toUpperCase(cadena.charAt(i));
            if ("AEIOU".indexOf(c) >= 0 && cadenaVocales.indexOf(Character.toString(c)) < 0) {
                cadenaVocales.append(c);
            }
        }
        return cadenaVocales.toString();
    }
}
