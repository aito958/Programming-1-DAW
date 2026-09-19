package RELACION08_ARRAYS;

import RELACION08_ARRAYS.Relacion6.Habitacion;

public class Hotel {
    /**
     * Clase Hotel que gestiona un conjunto de habitaciones
     */
    private String nombre;
    private String[] habitaciones;
    private int totalHabitaciones;

    /**
     * Constructor del Hotel
     */
    public Hotel(String nombre, int simples, int dobles, int triples) {
        this.nombre = nombre;
        this.totalHabitaciones = simples + dobles + triples;
        this.habitaciones = new String[this.totalHabitaciones];

        int numero = 1;

        // Habitaciones simples
        for (int i = 0; i < simples; i++) {
            habitaciones[numero - 1] = new String("simple");
            numero++;
        }

        // Habitaciones dobles
        for (int i = 0; i < dobles; i++) {
            habitaciones[numero - 1] = new String("doble");
            numero++;
        }

        // Habitaciones triples
        for (int i = 0; i < triples; i++) {
            habitaciones[numero - 1] = new String("triple");
            numero++;
        }
    }

    // ✅ MÉTODOS PRINCIPALES (nombres corregidos)
    public int checkIn(String tipo) throws Exception {
        if (!tipo.equalsIgnoreCase("simple") && 
            !tipo.equalsIgnoreCase("doble") && 
            !tipo.equalsIgnoreCase("triple")) {
            throw new Exception("Tipo inválido: simple, doble, triple");
        }

        for (Habitacion hab : habitaciones) {
            if (hab.getTipo().equalsIgnoreCase(tipo) && !hab.isOcupada()) {
                hab.setOcupada(true);
                return hab.getNumero();
            }
        }
        throw new Exception("No hay " + tipo + " libres");
    }

    public void checkOut(int numero) throws Exception {
        if (numero < 1 || numero > totalHabitaciones) {
            throw new Exception("Habitación inválida: " + numero);
        }

        String hab = habitaciones[numero - 1];
        if (!hab.isOcupada()) {
            throw new Exception("Habitación " + numero + " ya libre");
        }
        hab.setOcupada(false);
    }

    public String getHabitacion(int numero) throws Exception {
        if (numero < 1 || numero > totalHabitaciones) {
            throw new Exception("Habitación inválida: " + numero);
        }
        return habitaciones[numero - 1];
    }

    // ✅ MÉTODOS AUXILIARES (sin 1 al final)
    public void mostrarEstado() {
        System.out.println("\n=== " + nombre + " ===");
        System.out.println("Total habitaciones: " + totalHabitaciones);
        for (String hab : habitaciones) {
            System.out.println("Hab " + hab.getNumero() + " (" + hab.getTipo() + 
                             "): " + (hab.isOcupada() ? "OCUPADA" : "LIBRE"));
        }
    }

    public int contarLibresPorTipo(String tipo) {
        int cont = 0;
        for (String hab : habitaciones) {
            if (hab.getTipo().equalsIgnoreCase(tipo) && !hab.isOcupada()) {
                cont++;
            }
        }
        return cont;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getTotalHabitaciones() { return totalHabitaciones; }
    public String[] getHabitaciones() { return habitaciones; }
}