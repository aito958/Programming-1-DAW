package Enumerados;

public class Ejemplo {

    public static void main(String[] args) {
      
    	PiedraPapelTijeras[] jugadas = new PiedraPapelTijeras[10];

        Jugador j1 = new Jugador("Alonso", PiedraPapelTijeras.PIEDRA);
        Jugador j2 = new Jugador("Oscar", PiedraPapelTijeras.TIJERAS);

        if (j1.jugada == PiedraPapelTijeras.PIEDRA &&  j2.jugada == PiedraPapelTijeras.TIJERAS) {
            System.out.println(" Gana Alonso");
        } else {
            System.out.println("Gana Oscar");
        }

        System.out.println(j1);
        System.out.println(j2);
    }
}
