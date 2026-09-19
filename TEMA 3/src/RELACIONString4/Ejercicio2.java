package RELACIONString4;

import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un texto:");
        String cadena = teclado.nextLine();

        contadorCaracterMayuscula(cadena);  
    }

    private static void contadorCaracterMayuscula(String cadena) {
        int contadorMayuscula = 0;
        int contadorMinuscula = 0;
        int contadorNumero = 0;
     

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isUpperCase(c)) {
                contadorMayuscula++;
            } else if (Character.isLowerCase(c)) {
                contadorMinuscula++;
            } else if (Character.isDigit(c)) {
                contadorNumero++;
            
            }
        }

        System.out.println("Tiene " + contadorMayuscula + " mayúsculas, "+ contadorMinuscula + " minúsculas, " + contadorNumero + " números, ");
    }

}
