package soluciones.alternativa;

import esquemas.EsquemaVZ;
import problemas.ProblemaAtaque;
import soluciones.EstrategiaSolucion;

/*
 *  Asigna cada grupo aliados al grupo orcos MÁS GRANDE 
 *    que pueda derrotar (numOrcos[i] ≤ numAliados[j], no asignado previamente)
 */
public class AtaqueVoraz extends EsquemaVZ implements EstrategiaSolucion {
    
    /*
     *  Entrada: grupos orcos 
     */
    int[] numOrcos;
    /*
     *  Entrada: grupos aliados 
     */
    int[] numAliados;
    
    /*
     *  Solución: aliados[i] → orcos[j] o -1 
     */
    int[] aliadosContraatacaOrcos;
    
    /*
     * Estado iteración: aliado actual 
     */
    int aliadosActual;
    /*
     *  Estado iteración: orco seleccionad
     */
    int orcosAAtacar;
    /*
     *  Marcador: orcos ya asignados
     */
    boolean[] orcosContraatacados;

    public AtaqueVoraz(ProblemaAtaque pa) {
        this.numOrcos = pa.getOrcos();
        this.numAliados = pa.getAliados();
    }

    /*
     *  Sin preprocesamiento requerido 
     */
    public void procesamientoInicial() {}

    
    protected void inicializa() {
        aliadosContraatacaOrcos = new int[numOrcos.length]; 
        orcosContraatacados = new boolean[numOrcos.length];
        // Inicializar marcadores
        for (int i = 0; i < orcosContraatacados.length; i++) {
            orcosContraatacados[i] = false;
        }
        aliadosActual = 0;  // Primer aliado
    }

        protected boolean fin() {
        return (aliadosActual == numOrcos.length);  // ← Inconsistente con numAliados
    }

    
    protected void seleccionaYElimina() {
        boolean sal = false;           // Optimización: parar al encontrar perfecto
        int maxValor = Integer.MIN_VALUE;
        orcosAAtacar = -1;             // Sin candidato
        
        //  Buscar mejor (mayor) orco derrotable no asignado
        for (int i = 0; i < numOrcos.length && !sal; i++) {
            if (!orcosContraatacados[i]          // No asignado
                && numOrcos[i] <= numAliados[aliadosActual]  // Derrotable
                && maxValor < numOrcos[i]) {     // Máximo actual
                
                maxValor = numOrcos[i];
                orcosAAtacar = i;
                
                // Si coincide exactamente 
                if (numOrcos[i] == numAliados[aliadosActual]) {
                    sal = true;
                }
            }
        }
        
        // Marcar como eliminado 
        if (orcosAAtacar != -1) {
            orcosContraatacados[orcosAAtacar] = true;
        }
    }


    protected boolean prometedor() {
        return true;
    }

    /** 
     *  solución parcial
     */
    protected void anotaEnSolucion() {
        aliadosContraatacaOrcos[aliadosActual] = orcosAAtacar;
        aliadosActual++;
    }

    /**  Ejecuta plantilla voraz */
    public void solucion() {
        voraz();  // Template Method de EsquemaVZ
    }

    /**
     *  Evalúa resultado final
     * Victoria: numAliados[i] ≥ numOrcos[j]
     */
    public String toString() {
        int derrotas = 0, victorias = 0;
        String reparto = "El reparto ha sido:";

        for (int i = 0; i < aliadosContraatacaOrcos.length; i++) {
            if (aliadosContraatacaOrcos[i] != -1) {
                if (numAliados[i] < numOrcos[aliadosContraatacaOrcos[i]]) {
                    reparto += "\nLos aliados " + i + "(" + numAliados[i] + 
                              ") contraataca a los orcos " + aliadosContraatacaOrcos[i] + 
                              "(" + numOrcos[aliadosContraatacaOrcos[i]] + ") DERROTA";
                    derrotas++;
                } else {
                    reparto += "\nLos aliados " + i + "(" + numAliados[i] + 
                              ") contraataca a los orcos " + aliadosContraatacaOrcos[i] + 
                              "(" + numOrcos[aliadosContraatacaOrcos[i]] + ") VICTORIA";
                    victorias++;
                }
            } else {
                // Sin asignación
                derrotas++;
                reparto += "\nLos aliados " + i + " sin objetivo DERROTA";
            }
        }

        // Decidir ganador
        if (victorias > derrotas) {
            reparto += "\nAragorn ha ganado la batalla " + victorias + "/" + derrotas + ". Hoy, se come!\n";
        } else {
            reparto += "\nLos orcos ganan la batalla " + derrotas + "/" + victorias + ". Aragorn, pa tu casa!\n";
        }
        return reparto;
    }

    public void procesamientoFinal() {}
}
