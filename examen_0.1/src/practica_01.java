import java.util.Scanner;

public class practica_01 {
	 private static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
 int edad;
 int peso;
 double altura;
 int IMC = 0;
System.out.println("escribe tu edad ( en años)");
edad = teclado.nextInt();

System.out.println(" escribe tu altura (en  metros)");
altura = teclado.nextDouble();

System.out.println("escribe tu peso ( en kilos)");
peso = teclado.nextInt();

System.out.println("Su IMC es =" + (peso/(altura*altura)));


if (edad< 45 ||IMC < 22.5 ) {
	System.out.println("Bajo");

}else if (edad< 45 ||IMC >= 22.5 ) {
	System.out.println("medio");


}else if (edad>= 45 ||IMC < 22.5 ) {
     System.out.println("Medio");


} else if (edad>= 45 ||IMC >= 22.5 ) {
	System.out.println("ALTO");

}else if (edad>= 45 ||IMC >= 30) {
		System.out.println("Visite a su médico , padece de obesidad");


	}
}

}