package tareaGeometria;

class Cuenta {
	private double saldo;
	private int numIngresos;
	private int numReintegros;

	public Cuenta(double saldoInicial) {
		this.saldo = saldoInicial;
		this.numIngresos = 0;
		this.numReintegros = 0;
	}

	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			numIngresos++;
			System.out.println("Ingreso realizado correctamente.");
		} else {
			System.out.println("La cantidad no puede ser negativa.");
		}
	}

	public void reintegrar(double cantidad) {
		if (cantidad > 0 && cantidad <= saldo) {
			saldo -= cantidad;
			numReintegros++;
			System.out.println("Reintegro realizado correctamente.");
		} else if (cantidad > saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			System.out.println("La cantidad no puede ser negativa.");
		}
	}

	public void mostrarDatos() {
		System.out.println("Saldo actual: " + saldo + " €");
		System.out.println("Número de ingresos: " + numIngresos);
		System.out.println("Número de reintegros: " + numReintegros);
	}

	public double getSaldo() {
		return saldo;
	}

}
