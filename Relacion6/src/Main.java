public class Main {
	public static void main(String[] args) {
	

		// Equipo 1
		Jugador j1 = new Jugador("Faker", "Ari", 100);
		Jugador j2 = new Jugador("chovi", "Nocturne", 99);
		Jugador j3 = new Jugador("Jojopin", "Bardo", 85);
		Jugador j4 = new Jugador("Ana", "Arconte", 75);
		Jugador j5 = new Jugador("Luis", "Acir", 70);

		Jugador j6 = new Jugador("Antonio ", "Picachu", 85);
		Jugador j7 = new Jugador("Javier ", "Bulbasur", 82);
		Jugador j8 = new Jugador("Paco ", "Charizar", 90);
		Jugador j9 = new Jugador("Antonio ", "Amparos", 68);
		Jugador j10 = new Jugador("Alberto ", "Butterfly", 57);

		Jugador[] equipo1 = { j1, j2, j3, j4, j5 };
		Jugador[] equipo2 = { j6, j7, j8, j9, j10 };

		Partida epicBatel = new Partida(equipo1, equipo2);
		epicBatel.ganador();


	
	}
}
