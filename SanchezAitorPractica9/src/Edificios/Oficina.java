package Edificios;

public class Oficina {
    public int planta;
    public int metrosCuadrados;
    
    public Oficina(int planta, int metrosCuadrados) {
        this.planta = planta;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    public double precioAlquiler(int precioBase) {
    	//devulve el precio del alquiler multiplicado el precio de la base por planta y por los metros cuadrados
        return precioBase * planta * metrosCuadrados;
    }
}