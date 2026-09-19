package RELACIONString4;

public class refuerzoCadena3 {

    public static void main(String[] args) {

        String cadena = "abcdfgh";
        String cadena2 = "123";
        String sumacadenas = cadena.concat(cadena2);

        for (int i = 0; i < sumacadenas.length(); i++) {
            cadena1(cadena, i);
            cadena2(cadena2, i);
        }
    }

    private static void cadena1(String cadena, int numero) {
        if (numero < cadena.length()) {
            System.out.print(cadena.charAt(numero));  
        }
    }

    private static void cadena2(String cadena, int numero) {
        if (numero < cadena.length()) {
            System.out.print(cadena.charAt(numero));
        }
    }
}
