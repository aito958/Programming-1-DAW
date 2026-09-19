package HerenciasEjemplos;

public class main {
    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        Camion camion1 = new Camion();
        Camion camion2 = new Camion();

        // Asigno color a un objeto, no a la clase
        coche1.color = "naranja";

        // Ejemplo: establecer numSerie y luego leerla
        coche1.setNumSerie("ABC123");
        System.out.println("Número de serie del coche1: " + coche1.getNumSerie());

        // Llamar a método de instancia, no a la clase
        coche2.realizarItv();
    }
}
