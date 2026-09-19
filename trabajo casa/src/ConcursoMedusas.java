public class ConcursoMedusas {
    private Jugador[] equipoBob;
    private Jugador[] equipoPatrick;

    public ConcursoMedusas(Jugador[] equipoBob, Jugador[] equipoPatrick) {
        this.equipoBob = equipoBob; 
        this.equipoPatrick = equipoPatrick; 
    }

    public void ganador() {
        int puntosBob = 0, puntosPatrick = 0;


        int duplaBob = equipoBob[0].getMedusasCazadas() + equipoBob[1].getMedusasCazadas();
        int duplaPatrick = equipoPatrick[0].getMedusasCazadas() + equipoPatrick[1].getMedusasCazadas();
        if (duplaBob > duplaPatrick) puntosBob++;
        else if (duplaPatrick > duplaBob) puntosPatrick++;

        
        if (equipoBob[2].getMedusasCazadas() > equipoPatrick[2].getMedusasCazadas()) puntosBob++;
        else if (equipoPatrick[2].getMedusasCazadas() > equipoBob[2].getMedusasCazadas()) puntosPatrick++;

        
        if (equipoBob[3].getMedusasCazadas() > equipoPatrick[3].getMedusasCazadas()) puntosBob++;
        else if (equipoPatrick[3].getMedusasCazadas() > equipoBob[3].getMedusasCazadas()) puntosPatrick++;

        if (equipoBob[4].getMedusasCazadas() > equipoPatrick[4].getMedusasCazadas()) puntosBob++;
        else if (equipoPatrick[4].getMedusasCazadas() > equipoBob[4].getMedusasCazadas()) puntosPatrick++;

        
        System.out.println(" RESULTADO CONCURSO MEDUSAS:");
        if (puntosBob > puntosPatrick) {
            System.out.println(" ¡BOB ESPONJA GANA!");
        } else if (puntosPatrick > puntosBob) {
            System.out.println(" ¡PATRICK GANA!");
        } else {
            System.out.println(" ¡EMPATE!");
        }
        System.out.println("Bob: " + puntosBob + " | Patrick: " + puntosPatrick);
    }
}
