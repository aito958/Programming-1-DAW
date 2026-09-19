package RELACIONString4;

public class refuerzocadena {

    public static void main(String[] args) {
        String numero = "999999999";  
        
        String resultado = numtelefono(numero);
        System.out.println(resultado);
    }

    private static String numtelefono(String numero) {
        return numero.substring(0,3) + '-' + numero.substring(3,5) + '-' + numero.substring(5,7) + '-' + numero.substring(7);
    }
}
