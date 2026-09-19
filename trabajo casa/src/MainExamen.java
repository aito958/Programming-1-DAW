// Main.java
public class MainExamen {
    public static void main(String[] args) {
        // equipo de bob esponja
        Jugador bob = new Jugador("Bob", "Medusa Dorada", 28);
        Jugador calamardo = new Jugador("Calamardo", "Medusa Azul", 22);
        Jugador arenita = new Jugador("Arenita", "Barrenero", 35);
        Jugador plancton = new Jugador("Plancton", "Salpicadora", 18);
        Jugador donPaca = new Jugador("Don Paca", "Cantarina", 25);

        // equipo de patricio
        Jugador patricio = new Jugador("Patrick", "Medusa Rosa", 32); 
        Jugador pulpo = new Jugador("Pulpo", "Medusa Gigante", 20);
        Jugador perla = new Jugador("Perla", "Medusa Furiosa", 30);  
        Jugador gary = new Jugador("Gary", "Mini Medusa", 15);
        Jugador reyMedusa = new Jugador("Rey Medusa", "Reina", 40);

        Jugador[] equipoBob = {bob, calamardo, arenita, plancton, donPaca};
        Jugador[] equipoPatrick = {patricio, pulpo, perla, gary, reyMedusa};

        ConcursoMedusas concurso = new ConcursoMedusas(equipoBob, equipoPatrick);
        concurso.ganador();
    }
}


