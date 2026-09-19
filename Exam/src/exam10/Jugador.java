package exam10;
import java.util.Random;

public class Jugador {

    private String nombre;
    private String tipo; // fijo, random, ciclo
    private String[] ciclo = {"Piedra", "Papel", "Tijeras"}; // arrays sobre los tipos piedra , papel , tijets
    private int indiceCiclo = 0;
    private Random aleatorio = new Random();

    public Jugador(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;  // returneamos el nombre
    }

    public String jugar() {
        switch (tipo) {
            case "fijo": // como juega patricio 
                return "Piedra";

            case "random":
                return ciclo[aleatorio.nextInt(3)]; // como juega bob

            case "ciclo":
                String jugada = ciclo[indiceCiclo];
                indiceCiclo = (indiceCiclo + 1) % 3; // como juega calamardo 
                return jugada;

            default:
                return "Piedra";
        }
    }
}
