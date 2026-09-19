package Ejemplos;

import java.io.Serializable;
import java.util.Random;

public class Carta implements Comparable<Carta> , Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6553962276002637867L;
	public char numero;
	public char palo;

	public static final char BASTOS = 'B';
	public static final char COPAS = 'C';
	public static final char ESPADAS = 'E';
	public static final char OROS = 'O';

	public Carta(char num, char p) {
		this.numero = num;
		this.palo = p;
	}

	public Carta() {
		Random random = new Random();
		int paloIndex = random.nextInt(4);
		int numeroCarta = random.nextInt(1, 11);

		switch (paloIndex) {
		case 0:
			this.palo = BASTOS;
			break;
		case 1:
			this.palo = COPAS;
			break;
		case 2:
			this.palo = ESPADAS;
			break;
		case 3:
			this.palo = OROS;
			break;
		}

		if (numeroCarta <= 7) {
			this.numero = (char) ('0' + numeroCarta);
		} else if (numeroCarta == 8) {
			this.numero = 'S';
		} else if (numeroCarta == 9) {
			this.numero = 'C';
		} else { // 10
			this.numero = 'R';
		}
	}

	public void mostrarCarta() {
		System.out.println(numero + "-" + palo);
	}

	@Override
	public String toString() {
		return numero + "-" + palo;
	}

	@Override
	public int compareTo(Carta cartaExterior) {
		int ret = 0;
		if (this.palo < cartaExterior.palo) {
			ret = -1;
		} else if (this.palo > cartaExterior.palo) {
			ret = 1;
		} else { // Palos iguales
			if (this.numero < cartaExterior.numero) {
				ret = -1;

			} else if (this.numero > cartaExterior.numero) {
				ret = 1;
			}

			ret = 0;
		}
		return ret;

	}
}
