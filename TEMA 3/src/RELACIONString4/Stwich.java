package RELACIONString4;

import java.util.Scanner;

public class Stwich {

	private static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {

		String cadena1 = "Hola";
		String cadena2 = cadena1 + " , ¿que tal?";
		System.out.println(cadena2);
		{
			{
			}
		}

		String cadena3 = "asdf";
		String cadena4 = cadena3.replace('a', 'n');
		System.out.println(cadena4);

		{
			{

			}

		}
		String cadena5 = "   hola mundo   ";
		String cadena6 = cadena5.trim();
		System.out.println(cadena6);

		{
			{

			}

		}

		String cadena7 = "   hola mundo   ";
		String cadena8 = cadena7.replace(" ", "");
		System.out.println(cadena8);

		{
			{

			}

		}

		String cadena9 = "hamburgesa";
		String cadena10 = cadena9.substring(3, 5);
		System.out.println(cadena10);

		{
			{

			}
		}

		String cadena11 = "abcdabd";

		System.out.println(cadena11.indexOf("abc"));

		{
			{
			}
		}

		String cadena12 = "hamburguesa";
		String cadena13 = "esa";
		System.out.println(cadena12.indexOf(cadena13.toLowerCase()));

		String cadena14 = "hamburguesa";
		String cadena15 = "esa";
		System.out.println(cadena14.startsWith("ham"));
		System.out.println("lol");

		String cadena16 = new String("hamburguesa");
		String cadena17 = new String("hamburguesa");

		if (cadena16.equals(cadena17)) {
			System.out.println("Que rico");

			
			String valorBoolean = String.valueOf(true);

			String valorInt = String.valueOf(3.1440);
			double num  =Double.parseDouble(valorInt);
			boolean valorRealBoolean = true;
			
			System.out.println(valorBoolean);
			System.out.println(valorRealBoolean);
			System.out.println(num);

			}

		}
	}

