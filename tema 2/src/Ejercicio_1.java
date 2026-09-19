import java.util.Scanner;

public class Ejercicio_1 {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

	System.out.println("Introduce el primer números");
	int num1;
	num1 = Integer.parseInt(teclado.nextLine());

	System.out.println("Introduce el segundo números");
	int num2;
	 num2 = Integer.parseInt(teclado.nextLine());

	System.out.println("Introduce el tercer números");
	int num3;
	 num3 = Integer.parseInt(teclado.nextLine());
	
	 if(num1 < num2 && num2 < num3) {
		 System.out.println(num1 + " " + num2+ " " + num3);
	 
	 } else if(num3 < num1 && num1 < num2) {
		 System.out.println(num3 + " " + num1 + " " + num2);
			 
	 } else if (num2 < num1 && num3 > num1) {
		 System.out.println(num2 + " " + num1 +  " " + num3);

	 } else if (num2 < num1 && num1 < num3) {
		 System.out.println(num2 + " " + num3 + " " + num1);
	 
	 }  else if (num3<num1 && num2 >num1) {
		 System.out.println(num3 + " " + num2 + " " + num1 );

	 } else if (num1 < num3 && num3 < num2) {
		 System.out.println(num1 + " "+ num3 + " " + num2 );
	 
	 } else if (num1 < num3 && num3 < num2 ) {
		 System.out.println(num1 + " " + num3 + " " + num2);
	 
	 
	 } 

}
}
