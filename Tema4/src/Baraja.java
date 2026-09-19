import java.util.Scanner;

import Carta.Carta;  

public class Baraja {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        do {
            System.out.println("--- MENÚ BARAJA ESPAÑOLA ---");
            System.out.println("1. Mostrar un palo");
            System.out.println("2. Mostrar baraja");
            System.out.println("3. Mostrar carta aleatoria");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");

            int opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Baraja española, elige el palo (B/C/E/O):");
                    char palo = Character.toUpperCase(teclado.next().charAt(0));
                    mostrarPalo(palo);
                    break;
                case 2:
                    mostrarBaraja();
                    break;
                case 3:
                    generarCartaAleatoria();
                    break;
                case 4:
                    System.out.println("¡HASTA LUEGO!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Error, valor no válido");
                    break;
            }
            System.out.println(); 
        } while (continuar);
    }

    private static void generarCartaAleatoria() {
        Carta cartaAleatoria = new Carta();  
        System.out.println("Carta aleatoria: " + cartaAleatoria);
    }

    private static void mostrarBaraja() {
        mostrarPalo(Carta.BASTOS);
        mostrarPalo(Carta.COPAS);
        mostrarPalo(Carta.ESPADAS);
        mostrarPalo(Carta.OROS);
        System.out.println("--- BARAJA COMPLETA ---");
    }

    private static void mostrarPalo(char palo) {
        if (palo == Carta.BASTOS || palo == Carta.COPAS || 
            palo == Carta.ESPADAS || palo == Carta.OROS) {
            
            System.out.println("=== PALO " + palo + " ===");
            
            
            for (int i = 1; i <= 7; i++) {
                Carta carta = new Carta(("" + i).charAt(0), palo);
                System.out.println(carta);
            }
            
            System.out.println(new Carta('S', palo));
            System.out.println(new Carta('C', palo));
            System.out.println(new Carta('R', palo));
            
        } else {
            System.out.println("ERROR: Palo no válido");
        }
    }
}
