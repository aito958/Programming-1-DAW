package RELACION08_ARRAYS;

public class EjemploOrdenacionBurbuja {

	public static void main(String[] args) {

		int[] numeros = { 3, 4, 10, 5, 1, 2 };
		for(int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
		int min = numeros[i];
		int indice = i;
			for (int j = i; j < numeros.length; j++) {
			if(numeros [j]<= min) {
				min = numeros[j];
				indice = j;
			}
			}
		int temporal = numeros[i];
		numeros[i] = numeros[indice];
		numeros[indice]  =temporal;
			
		}
	for(int num : numeros) {
		System.out.print(num + " ");
	}
	
	}
}
