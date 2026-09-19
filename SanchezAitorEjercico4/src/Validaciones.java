
public class Validaciones {

	public static boolean validarEdad (int edad) {
		boolean resultado=true;
		
		if ( edad < 0 || edad > 30) {
			resultado=false;
		}
		
		return resultado;
	}
	

	
	public static boolean validarContrasenna(String contrasenna) {
		
		boolean resultado;
		
		if ( contrasenna.length() >= 5)
			resultado=true;
		else
			resultado=false;
		
		
		return resultado;
		
	}
	
	
}
