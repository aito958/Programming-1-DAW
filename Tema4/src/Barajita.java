import Carta.Carta;

public class Barajita implements Carta {

    public static void main(String[] args) {

        Carta miCarta  = new Carta('7', Carta.BASTOS);
        miCarta.mostrarCarta();

        Carta miCarta2 = new Carta('2', Carta.BASTOS);
        miCarta2.mostrarCarta();

        Carta miCarta3 = new Carta('7', Carta.ESPADAS);
        miCarta3.mostrarCarta();

        System.out.println(miCarta.toString());
        System.out.println(miCarta2.toString());
        System.out.println(miCarta3.toString());

        if (miCarta.toString().equals(miCarta3.toString())) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
    }
}
