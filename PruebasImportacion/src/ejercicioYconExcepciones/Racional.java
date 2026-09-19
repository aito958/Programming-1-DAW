/**
 * Clase Racional que permita trabajar con números racionales (fracciones).
 * 
 * Incluir los siguientes métodos: sumar , restar , multiplicar , dividir ,
 * copiar , simplificar y la redefinición de equals y toSring .
 *
 *
 */
package ejercicioYconExcepciones;

public class Racional {

	// Atributos
	private int numerador;
	private int denominador;

	// Constructor
	public Racional(int numerador, int denominador) throws RacionalException {
		this.setNumerador(numerador);
		this.setDenominador(denominador);
	}

	// Métodos setter y getter
	public int getNumerador() {
		return this.numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return this.denominador;
	}

	public void setDenominador(int denominador) throws RacionalException {

		if (denominador == 0) {
			throw new RacionalException("El denominador no puede ser 0.");
		}

		this.denominador = denominador;
	}

	public String toString() {
		return this.numerador + "/" + this.denominador;
	}

	public boolean equals(Racional otro) {
		boolean resultado = false;

		this.simplificar();
		otro.simplificar();

		if (this.numerador == otro.getNumerador() && this.denominador == otro.getDenominador()) {
			resultado = true;
		}

		return resultado;
	}

	/**
	 * Método que suma dos objetos Racional
	 * 
	 * @param otro
	 * @return objeto Racional que representa la suma de dos Racional
	 */
	public Racional sumar(Racional otro) {
		int numerador1;
		int numerador2;
		int numeradorTotal;
		int denominadorComun;
		Racional resultado = null;

		denominadorComun = this.denominador * otro.denominador;
		numerador1 = otro.denominador * this.numerador;
		numerador2 = this.denominador * otro.numerador;
		numeradorTotal = numerador1 + numerador2;

		try {
			resultado = new Racional(numeradorTotal, denominadorComun);
			resultado.simplificar();
		} catch (RacionalException e) {
			// Este error nunca va a producirse, porque el denominador no va a
			// poder dar 0
		}

		return resultado;
	}

	/**
	 * Método que resta dos objetos Racional
	 * 
	 * @param otro
	 * @return objeto Racional que representa la resta de dos Racional
	 */
	public Racional restar(Racional otro) {
		int numerador1;
		int numerador2;
		int nuevoNumerador;
		int nuevoDenominador;
		Racional resultado = null;

		numerador1 = otro.denominador * this.numerador;
		numerador2 = this.denominador * otro.numerador;
		nuevoNumerador = numerador1 - numerador2;
		nuevoDenominador = this.denominador * otro.getDenominador();

		try {
			resultado = new Racional(nuevoNumerador, nuevoDenominador);
			resultado.simplificar();
		} catch (RacionalException e) {
			// Este error no se va a producir
		}

		return resultado;
	}

	/**
	 * Método que multiplica dos objetos Racional
	 * 
	 * @param otro
	 * @return objeto Racional que representa la multiplicación de dos Racional
	 */
	public Racional multiplicar(Racional otro) {
		int nuevoNumerador;
		int nuevoDenominador;
		Racional resultado = null;

		nuevoNumerador = this.numerador * otro.getNumerador();
		nuevoDenominador = this.denominador * otro.getDenominador();

		try {
			resultado = new Racional(nuevoNumerador, nuevoDenominador);
			resultado.simplificar();
		} catch (RacionalException e) {
			// Este error no se va a producir
		}

		return resultado;
	}

	/**
	 * Método que divide dos objetos Racional
	 * 
	 * @param otro
	 * @return objeto Racional que representa la division de dos Racional
	 */
	public Racional dividir(Racional otro) {
		int nuevoNumerador;
		int nuevoDenominador;
		Racional resultado = null;

		nuevoNumerador = this.numerador * otro.getDenominador();
		nuevoDenominador = this.denominador * otro.getNumerador();

		try {
			resultado = new Racional(nuevoNumerador, nuevoDenominador);
			resultado.simplificar();
		} catch (RacionalException e) {
			// Este error no se va a producir
		}

		return resultado;
	}

	public Racional copiar() {
		Racional objetoCopia = null;

		try {
			objetoCopia = new Racional(numerador, denominador);
		} catch (RacionalException e) {
			// Este error no se va a producir
		}

		return objetoCopia;
	}

	/**
	 * Método que simplifica un Racional. No devuelve nada.
	 * 
	 */
	public void simplificar() {
		int resultadoMcd;
		try {

			resultadoMcd = Matematicas.mcd(this.numerador, this.denominador);

			this.numerador = this.numerador / resultadoMcd;
			this.denominador = this.denominador / resultadoMcd;
		} catch (MatematicasException ex) {
			// Si se produce este error es porque el numerador es 0.
			// Simplificamos con 0/1
			this.denominador = 1;
		}
	}
}
