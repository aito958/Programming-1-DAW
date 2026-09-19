package Relacion10_Ejerc6.clases;

// Si Edificio está en otro paquete, ajusta el import:
import Relacion10_Ejerc6.Edificio;

public class Principal {

    public static void main(String[] args) {

        Edificio[] edificios = new Edificio[5];

        PolideportivoTenis rolandGarros = new PolideportivoTenis(100, 1, "Roland Garros");
        PolideportivoTenis wimbledon    = new PolideportivoTenis(100, 1, "Wimbledon");
        PolideportivoTenis openUsa      = new PolideportivoTenis(100, 1, "Open USA");

        edificios[0] = rolandGarros;
        edificios[1] = wimbledon;
        edificios[2] = openUsa;    

        OficinaGoogle siliconValley = new OficinaGoogle(1000, 10);
        OficinaGoogle madridHub     = new OficinaGoogle(800, 8);

        edificios[3] = siliconValley;
        edificios[4] = madridHub;
 
    for(int i = 0; i < edificios.length ; i++) {
    	System.out.println(edificios[i]);
    System.out.println( );
    }
    
    }
}
