package Parte2_Fichero;

public class Ejemplos {
    public static void main(String[] args) {

        String cadena = "abababababa";

        if (cadena.matches("[ab]+")) {
            System.out.println("La cadena coincide");
        } else {
            System.out.println("La cadena no coincide ");
        }

        String movil = "612345678";
        String dni = "12345678Z";
        String email = "alumno@gmail.com";
        String matricula = "1234BCD";

        System.out.println("Movil: " + movil.matches("^[67]\\d{8}$"));
        System.out.println("DNI: " + dni.matches("^\\d{8}[A-Za-z]$"));
        System.out.println("Email: " + email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"));
        System.out.println("Matricula: " + matricula.matches("^\\d{4}[A-Z]{3}$"));
    }
}
