/**
  Implementar una clase llamada Complejo para realizar aritmética con números complejos
  sabiendo que los números complejos tienen la forma:

	parteReal + parteImaginaria * i

  La clase deberá proporcionar un constructor que permita inicializar un objeto cuando se
  declare. También deberá proporcionar funciones miembro de tipo public para cada una de 
  las siguientes operaciones:

	- Suma de dos números Complejo: las partes reales se suman y las partes imaginarias 
	  se suman.
	- Resta de dos números Complejo: la parte real de operando derecho se resta a la 
	  parte real del operando izquierdo, y la parte imaginaria del operando derecho se 
	  resta a la parte imaginaria del operando izquierdo.
	- Impresión de números Complejo de la forma (a, b), donde a es la parte real y b es
	  la parte imaginaria.

	NOTA: Utilizar variables double para representar datos miembros de la clase.

 *
 */
package ejercicioX;

public class Complejo {
	// Atributos
	private double parteReal;
	private double parteImaginaria;

	// Constructor
	public Complejo(double real, double imaginaria) {
		setReal(real);
		setImaginaria(imaginaria);
	}

	// Metodos set y get
	public void setReal(double parametroReal) {
		parteReal = parametroReal;
	}

	public void setImaginaria(double parametroImaginario) {
		parteImaginaria = parametroImaginario;
	}

	public double getReal() {
		return parteReal;
	}

	public double getImaginaria() {
		return parteImaginaria;
	}

	/**
	 * Método que devuelve un nuevo objeto Complejo, resultado de sumar el propio
	 * complejo que llama al método (this) y el que se pasa como parámetro (otro)
	 * 
	 * @param otro
	 * @return Complejo que representa la suma de dos Complejo
	 */
	public Complejo sumar(Complejo otro) {
		double resultadoReal, resultadoImaginario;
		Complejo sumaComplejos;

		resultadoReal = this.parteReal + otro.parteReal;
		resultadoImaginario = this.parteImaginaria + otro.parteImaginaria;

		sumaComplejos = new Complejo(resultadoReal, resultadoImaginario);

		return sumaComplejos;
	}

	/**
	 * Método que devuelve un nuevo objeto Completo, resultado de restar el propio
	 * complejo que llama al método (this) y el que se pasa como parámetro (otro)
	 * 
	 * @param otro
	 * @return Complejo que representa la resta de dos Complejo
	 */
	public Complejo restar(Complejo otro) {
		double resultadoReal, resultadoImaginario;
		Complejo restaComplejo;

		resultadoReal = this.parteReal - otro.parteImaginaria;
		resultadoImaginario = this.parteReal - otro.parteImaginaria;

		restaComplejo = new Complejo(resultadoReal, resultadoImaginario);

		return restaComplejo;
	}

	/**
	 * Método que muestra los atributos de un Complejo
	 * 
	 */
	public String toString() {
		String complejo;

		complejo = parteReal + "+" + parteImaginaria + "i";

		return complejo;
	}

	/**
	 * Método que comprueba si dos Complejo son iguales
	 * 
	 * @param otro
	 * @return verdadero si son iguales, falso si no lo son.
	 */
	public boolean equals(Complejo otro) {
		boolean iguales;

		if (this.parteReal == otro.parteReal && this.parteImaginaria == otro.parteImaginaria)
			iguales = true;
		else
			iguales = false;

		return iguales;
	}
}
