/**
 * como logre descifrar las clave
 * 
 * METODOLOGÍA:
 * 1. Ejecuté Clave.main() → Observé: "y_usBaT_ae" y "N-4V5aa!!4-n1_i4Hlo0L_a--dvnRe-aVD_ui!"
 * 2. Analicé patrón → divide en mitad + mezcla carácter por carácter (1-2, 3-4, 5-6...)
 * 3. Implementé algoritmo inverso → 1ªmitad[0]+2ªmitad[0], 1ªmitad[1]+2ªmitad[1]...
 * 4. Verifiqué con Clave.comprobarClaveDebil() y Clave.comprobarClaveFuerte()
 */
 
import seguridad.Clave;            // import de la librería que genera/comprueba contraseñas

public class Contraseña {
    
    public static void main(String[] args) {
     
    	//  Paso 1 : claves cifradas  (lo que genera Clave.main())
        String claveDebilCifrada = "y_usBaT_ae";           // 9 caracteres mezclados
        String claveFuerteCifrada = "N-4V5aa!!4-n1_i4Hlo0L_a--dvnRe-aVD_ui!"; // 32 caracteres mezclados
        
        System.out.println("   Débil:  '" + claveDebilCifrada + "'");
        System.out.println("   Fuerte: '" + claveFuerteCifrada + "'\n");
       
        // paso 2: descifrar claves originales 
        String claveDebilOriginal = reconstruirPassword(claveDebilCifrada);     // Aplica algoritmo de la clave débil
        String claveFuerteOriginal = reconstruirPassword(claveFuerteCifrada);   // Aplica algoritmo de la clave fuerte

        // paso 3: mostar resultado del descifrado
        System.out.println("   Débil:  '" + claveDebilOriginal + "'"); 
        System.out.println("   Fuerte: '" + claveFuerteOriginal + "'");
     
        // paso 4: verificar con la librería oficial
   
        if (Clave.comprobarClaveDebil(claveDebilOriginal)) { // Comprobar si la contraseña débil es correcta 
            System.out.println(" La clave débil es CORRECTA ");
        } else {
            System.out.println(" La clave débil no es correcta");
        }

        if (Clave.comprobarClaveFuerte(claveFuerteOriginal)) { // Comprobar si la contraseña fuerte es correcta
            System.out.println(" La clave fuerte es CORRECTA ");
        } else {
            System.out.println(" La clave fuerte no es correcta");
        }
    }

    //  descifrador del patrón 1-2, 3-4, 5-6... 
    public static String reconstruirPassword(String texto) {
        
        // Divide el texto en dos mitades exactas
        int mitad = texto.length() / 2;                    // Ej: 9/2 = 4
        
        String primeraMitad = texto.substring(0, mitad);   // Ej: "y_us" (0-4)
        String segundaMitad = texto.substring(mitad);      // Ej: "BaT_ae" (4-fin)
        
        StringBuilder resultado = new StringBuilder();     // Para construir la clave original

        //  : Une carácter por carácter de cada mitad
        for (int i = 0; i < mitad; i++) {
            resultado.append(primeraMitad.charAt(i));      // 1º mitad -> posición i
            resultado.append(segundaMitad.charAt(i));      // 2º mitad -> posición i
        }

        return resultado.toString();                       // Devuelve clave descifrada  en String
    }
}
