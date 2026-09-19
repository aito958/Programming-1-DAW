package RELACION4;

import java.util.Scanner;

public class Bonus {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un caracter:");
        char caracter = teclado.next().charAt(0); 
        MetodoDigita(caracter);
    }

    private static void MetodoDigita(char caracter) {
        if (esDigito(caracter)) {
            System.out.println("Es un dígito.");
        } else if (esMinuscula(caracter)) {
            System.out.println("Es una letra minúscula.");
        } else if (esMayuscula(caracter)) {
            System.out.println("Es una letra mayúscula.");
        }
    }

    private static boolean esDigito(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean esMinuscula(char c) {
        return c >= 'a' && c <= 'z';
    }

    private static boolean esMayuscula(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
