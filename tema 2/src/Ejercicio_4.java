import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(100)+1;

        int num;
        int vidas = 10; 

       
        while (vidas > 0) {

          
            do {
                System.out.println("Introduce un número entre 1 al 100");
                num = teclado.nextInt();
            } while (num < 1 || num > 100);

        
            if (num == numAleatorio) {
                System.out.println("Has ganado");
                break;
            } else if (num > numAleatorio) {
                System.out.println("El número escrito es mayor que el aleatorio");
            } else {
                System.out.println("El número escrito es menor que el aleatorio");
            }

           
            vidas--;
            System.out.println("Las vidas que te quedan son: " + vidas + "\n");
        }

        if (vidas == 0) {
            System.out.println("Has perdido. El número era " + numAleatorio);
        }

        teclado.close();    }
}
