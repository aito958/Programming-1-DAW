package RELACION08_ARRAYS;

import java.util.Random;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> mazo = new ArrayList<>();
        
        String[] palos = {"oros", "copas", "espadas", "bastos"};
        for (String p : palos)
            for (int n = 1; n <= 12; n++)
                mazo.add(n + " de " + p);
        
        int cartas = 5;
        System.out.println("¿Cuántas cartas reparto?: " + cartas);
        
        for (int i = 0; i < cartas; i++) {
            System.out.println((i%2==0 ? "Jugador 1: " : "Jugador 2: ") + 
                             mazo.remove(r.nextInt(mazo.size())));
        }
    }
}
