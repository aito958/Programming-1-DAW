
import Edificios.Casa;
import Edificios.Edificio;
import Edificios.Oficina;
import Edificios.Persona;
import Edificios.Piso;

public class Main {

	/**
	 * ________________________________________
	 * | NO SE PUEDE MODIFICAR LA CLASE MAIN, |
	 * | CORRE EL RIESGO DE SUSPENDER SI LO	  |
	 * |______________________________________|
	 */
	public static void main(String[] args) {
		Persona ralph = new Persona("Ralph", "Wiggun", "00000X", 666123456);

		//Referencia catastral, direccion, eficiencia energetica, cedula habitabilidad, ocupada, propietario, metros cuadrados,
		//numero de habitaciones, numero de baños, plazas garaje, numero de plantas, metros jardin, piscina
		Casa casaEnSpringfield = new Casa("asda1929asdakd", "Evergreen Terrace 21", 'A', true, true, ralph, 140, 4, 2,
				2, 2, 300, true);

		//Referencia catastral, direccion, eficiencia energetica, cedula habitabilidad, ocupada, propietario, metros cuadrados,
		//numero de habitaciones, numero de baños, plazas garaje, numero de planta, numero de puerta
		Piso pisoEnChipiona = new Piso("84thgrinjwife498u", "Virgen de regla 1", 'C', true, false, ralph, 70, 2, 1, 0,
				3, 2);

		Oficina[] oficinas = new Oficina[10];
		for (int i = 0; i < oficinas.length; i++) {
			oficinas[i] = new Oficina(i / 2, 20);
		}

		//Referencia catastral, dirección, eficiencia energetica, numero de planta, numero de ascensore, precio base oficina, oficinas
		Edificio empireState = new Edificio("ajdaldjaklja", "Quinta avenida", 'D', 5, 2, 200, oficinas);

		System.out.println(
				"Bienvenido a su casa " + ralph.nombre + " " + ralph.apellidos + ", " + casaEnSpringfield.direccion);
		System.out.println(dibujoCasa);

		System.out.println("Su factura de agua es:" + casaEnSpringfield.facturaAgua(10));
		System.out.println("Su factura de luz es:" + casaEnSpringfield.facturaLuz(3));
		System.out.println("Paga de impuestos:" + casaEnSpringfield.impuestos());

		System.out.println(
				"\nBienvenido a su piso en " + pisoEnChipiona.direccion + ", " + ralph.nombre + " " + ralph.apellidos);
		System.out.println(dibujoEdificio);
		System.out.println("Su factura de agua es:" + pisoEnChipiona.facturaAgua(20));
		System.out.println("Su factura de luz es:" + pisoEnChipiona.facturaLuz(2));
		System.out.println("Paga de impuestos:" + pisoEnChipiona.impuestos());

		System.out.println("\nBienvenido al edificio en " + empireState.direccion);
		System.out.println(dibujoEmpireState);
		System.out.println("Este bonito eficio se alquila por el modico precio de: "+ empireState.getAlquiler()+"$");

	}

	public static String dibujoCasa = "      `'::::.\r\n" + "        _____A_\r\n" + "       /      /\\\r\n"
			+ "    __/__/\\__/  \\___\r\n" + "---/__|\" '' \"| /___/\\----\r\n" + "   |''|\"'||'\"| |' '||\r\n"
			+ "   `\"\"`\"\"))\"\"`\"`\"\"\"\"`";

	public static String dibujoEdificio = "    _._._._._._._._._._._._._._._._._   ^\n"
			+ "    | ___   ___    ___    ___   ___ |\n" + "^!^ ||_|_| |_|_|  |_|_|  |_|_| |_|_||\n"
			+ "    |IIIII_IIIII__IIIII__IIIII_IIIII|      ^\n" + "    | ___   ___    ___    ___   ___ |\n"
			+ "    ||_|_| |\\O/|  |_|_|  |_|_| |_|_||\n" + "    |IIIII_IIIII__IIIII__IIIII_IIIII|\n"
			+ " _  | ___   ___    ___    ___   ___ |\n" + "    ||_|_| |_|_|  |_|_|  |_|_| |_|_||\n"
			+ "    |IIIII_IIIII__IIIII__IIIII_IIIII|    /)\n" + "    | ___   ___   _____   ___   ___ | __/ ),\n"
			+ " ~^ ||_|_| |_|_|  o~|~o  |_|_| |_|_||  ~^~^\n" + "..'.|IIIII_IIIII__|_|_|__IIIII_IIIII|'^~^'.',\n"
			+ "., .|'''''''''''' /====\\''''''''''''|.'.'.'.\n" + "`~ ` '^^~ '' ^^~'` ''     `',``~^^'' ~^^'   '~'\n";

	public static String dibujoEmpireState = " |\r\n"+ "                                |\r\n"
			+ "                                |\r\n"+ "                              _/^\\_\r\n"
			+ "                             //^^^\\\\\r\n"+ "                            //^^^^^\\\\\r\n"
			+ "                            ||.:::.||\r\n"+ "                           //.:::::.\\\\\r\n"
			+ "                           ||:::::::||\r\n"+ "                         __||_ ::: _||__\r\n"
			+ "                         |.::|.:::.|::.|\r\n"+ "                        _|:::|:::::|:::|_\r\n"
			+ "                       |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\r\n"	+ "                       |= .:::::::::::. =|\r\n"
			+ "                       |= ::::::::::::: =|\r\n"+ "                       |= ::::::::::::: =|\r\n"
			+ "                       |= ::::::::::::: =|\r\n"+ "                       |= ::::::::::::: =|\r\n"
			+ "                       |= ::::::::::::: =|\r\n"+ "                       |= ::::::::::::: =|\r\n"
			+ "                       |= ::::::::::::: =|\r\n"+ "                       |= ::::::::::::: =|\r\n"
			+ "                       |= ::::::::::::: =|\r\n"+ "                       |= ::::::::::::: =|\r\n"
			+ "                      _|_ ::::::::::::: _|_\r\n"	+ "                     |:::|:::::::::::::|:::|\r\n"
			+ "                    _|___|_:::::::::::_|___|_\r\n"+ "                   |:::::::|:::::::::|:::::::|\r\n"
			+ "                  _|_::::::|:::::::::|::::::_|_\r\n"	+ "                 |:::|:::::|:::::::::|:::::|:::|\r\n"
			+ "                 |:::|=:=:=|=:=:=:=:=|=:=:=|:::|\r\n"+ "                 |=:=|II:II|:II:I:II:|II:II|=:=|,\r\n"
			+ "              ,%8|III|----'/.\"\"\"\"\"\"\".\\`----|III|8%8,\r\n"+ "            '%&86\"\"\"\"\"    //         \\\\    \"\"\"\"\"%&6&%,  hjw\r\n"
			+ "           --------------'/           \\`--------------\r\n"	+ "           --------------'             `---------------";
}
