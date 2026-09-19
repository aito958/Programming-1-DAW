package Ejemplo;

// Introduce un caracter y indica si es número o es letra

import java.util.Scanner;

public class Cesletraoesnum {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca un caracter:");
        char caracter = teclado.next().charAt(0);
        int num = (int) caracter;

        if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
            System.out.println("Es una letra");
        } else if (num >= 48 && num <= 57) {
            System.out.println("Es un número");
        } else {
            System.out.println("No es número ni letra");
        }
    }
}
