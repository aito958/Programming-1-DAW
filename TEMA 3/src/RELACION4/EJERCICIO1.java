package RELACION4;

import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {

        int numeroElegido = solicitarNumeroEnRango(10, 20);
        System.out.println("Número elegido entre 10 y 20: " + numeroElegido);
    }

    public static int solicitarNumeroEnRango(int limInf, int limSup) {

        Scanner teclado = new Scanner(System.in);

        if (limSup < limInf) {
            int aux = limSup;
            limSup = limInf;
            limInf = aux;
        }

        int numero = 0;

        System.out.println("Introduce un número entre " + limInf + " y " + limSup + ":");

        do {
            numero = teclado.nextInt();
            if (numero < limInf || numero > limSup) {
                System.out.println("Número fuera de rango. Intenta de nuevo:");
            }
        } while (numero < limInf || numero > limSup);

        teclado.close();

        return numero;
    }
}
