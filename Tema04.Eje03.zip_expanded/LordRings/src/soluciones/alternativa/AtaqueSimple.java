package soluciones.alternativa;

import esquemas.EsquemaVZ;
import problemas.ProblemaAtaque;
import soluciones.EstrategiaSolucion;

public class AtaqueSimple extends EsquemaVZ implements EstrategiaSolucion {
    /** Número de orcos por grupo */
    int[] numOrcos;
    /** Número de aliados por grupo */
    int[] numAliados;
    
    /** Mapeo: aliados[i] → orcos[j] o -1 si no asignado */
    int[] aliadosContraatacaOrcos;
    
    /** Índice aliado actual en iteración voraz */
    int aliadosActual;
    /** Próximo orco candidato */
    int orcosAAtacar;
    /** Marcador orcos ya asignados */
    boolean[] orcosContraatacados;

    /**
     * Constructor: recibe problema y extrae arrays de entrada
     * PROBLEMA: No inicializa aliadosContraatacaOrcos
     */
    public AtaqueSimple(ProblemaAtaque pa) {
        this.numOrcos = pa.getOrcos();
        this.numAliados = pa.getAliados();
    }

    /** Sin preprocesamiento */
    public void procesamientoInicial() {}

   
    protected void inicializa() {
        aliadosContraatacaOrcos = new int[numOrcos.length]; // ← FALTA = -1
        orcosContraatacados = new boolean[numOrcos.length];
        for (int i = 0; i < orcosContraatacados.length; i++) {
            orcosContraatacados[i] = false;
        }
        aliadosActual = 0;
        orcosAAtacar = 0;
    }

    /** Condición fin: todos los aliados asignados */
    protected boolean fin() {
        return (aliadosActual == numOrcos.length); // ← Debería ser numAliados.length
    }

    /**
     * No selecciona el mejor orco, solo avanza secuencialmente
     */
    protected void seleccionaYElimina() {
        // FALTA: buscar orco con menor numOrcos[orcosAAtacar] 
        //        que numAliados[aliadosActual] y marcar orcosContraatacados
    }

    /** Siempre prometedor (sin poda) */
    protected boolean prometedor() {
        return true;
    }

    /**
     *  Asigna asignación diagonal y avanza índices 
     */
    protected void anotaEnSolucion() {
        aliadosContraatacaOrcos[aliadosActual] = orcosAAtacar;
        aliadosActual++;
        orcosAAtacar++;
    }

    /** 
     * Ejecuta plantilla voraz
     */
    public void solucion() {
        voraz(); //  Llama EsquemaVZ.voraz()
    }

    /**
     * Evalúa solución: cuenta victorias (aliados ≥ orcos) vs derrotas
     * resultado: Asignación 1:1 sin optimización
     */
    public String toString() {
        int derrotas = 0, victorias = 0;
        String reparto = "El reparto ha sido:";
        
        for (int i = 0; i < aliadosContraatacaOrcos.length; i++) {
            if (aliadosContraatacaOrcos[i] != -1) { //  siempre sera true 
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
                derrotas++; 
                reparto += "\nLos aliados " + i + " contraataca a los orcos " + 
                          aliadosContraatacaOrcos[i] + " DERROTA\n";
            }
        }

        if (victorias > derrotas) {
            reparto += "\nAragorn ha ganado la batalla " + victorias + "/" + derrotas + ". Hoy, se come!\n";
        } else {
            reparto += "\nLos orcos ganan la batalla " + derrotas + "/" + victorias + ". Aragorn, pa tu casa!\n";
        }
        return reparto;
    }

    public void procesamientoFinal() {}
}
