
public class cartita {

	private static final char BASTOS = 'B';
	private static final char COPAS = 'C';
	private static final char ESPADAS = 'E';
	private static final char OROS = 'O';
	
	// Atributos
	int numeroCarta;
	char palo;

	// Constructructor
	public cartita(int numeroCarta, char palo) {
		this.numeroCarta = numeroCarta;
		this.palo = palo;
	}

	// Metodoss
	void mostrarcarta() {
		System.out.println(numeroCarta + "-" + palo);
	}

	public String toString() {
		return numeroCarta + "-" + palo;
	}

		public static void  mostrarPalo(char palo) {

			if (palo == BASTOS || palo == COPAS || palo == ESPADAS || palo == OROS) {
				for (int i = 1; i <= 7; i++) {
					System.out.print(i + "-" + palo + ", ");
				}
				System.out.println("S-" + palo + ", C-" + palo + ", R-" + palo);
			} else {
				System.out.println("ERROR palo no válido");
			}
		}
	
		
	}


