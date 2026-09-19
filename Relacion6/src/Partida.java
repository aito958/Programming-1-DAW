import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una partida del juego LuL
 */
public class Partida {
	Jugador equipo1[];
	Jugador equipo2[];

	public Partida(Jugador[] equipo1, Jugador[] equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;

	}

	public void ganador() {
		int contadorPuntosEquipo1 = 0;
		int contadorPuntosEquipo2 = 0;

		int nivelesBotEquipo1 = equipo1[0].getNivel() + equipo1[1].getNivel();
		int nivelesBotEquipo2 = equipo2[0].getNivel() + equipo1[1].getNivel();

		if (nivelesBotEquipo1 > nivelesBotEquipo2) {
			contadorPuntosEquipo1++;
		} else if (nivelesBotEquipo1 < nivelesBotEquipo2) {
			contadorPuntosEquipo2++;

		}
		int nivelesMidEquipo1 = equipo1[2].getNivel();
		int nivelesMidEquipo2 = equipo2[2].getNivel();

		if (nivelesMidEquipo1 > nivelesMidEquipo2) {
			contadorPuntosEquipo1++;
		} else if (nivelesMidEquipo1 < nivelesMidEquipo2) {
			contadorPuntosEquipo2++;

		}

		int nivelesJungleEquipo1 = equipo1[3].getNivel();
		int nivelesJungleEquipo2 = equipo2[3].getNivel();

		if (nivelesJungleEquipo1 > nivelesJungleEquipo2) {
			contadorPuntosEquipo1++;
		} else if (nivelesJungleEquipo1 < nivelesJungleEquipo2) {
			contadorPuntosEquipo2++;

		}

		int nivelesTopEquipo1 = equipo1[4].getNivel();
		int nivelesTopEquipo2 = equipo2[4].getNivel();

		if (nivelesTopEquipo1 > nivelesTopEquipo2) {
			contadorPuntosEquipo1++;
		} else if (nivelesTopEquipo1 < nivelesTopEquipo2) {
			contadorPuntosEquipo2++;

		}
		if (contadorPuntosEquipo1 > contadorPuntosEquipo2) {
			System.out.println("El equipo 1 es el ganador");
		} else if (contadorPuntosEquipo1 < contadorPuntosEquipo2) {
			System.out.println("El equipoo 2 es el ganador");
		} else {
			System.out.println("Empate  ");
		}
	}

}