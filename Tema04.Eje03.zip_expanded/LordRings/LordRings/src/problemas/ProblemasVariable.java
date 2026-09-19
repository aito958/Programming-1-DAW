package problemas;

import java.util.Random;

public class ProblemasVariable extends ProblemaAtaque{
	
	public ProblemasVariable () {
		Random ran = new Random();
		
		int numGrupos = ran.nextInt(99)+1;
		
		orcos = new int[numGrupos];
		aliados = new int[numGrupos];
		
		for (int i=0; i < numGrupos; i++) {
			orcos[i] = ran.nextInt(900)+100;
			aliados[i] = ran.nextInt(900)+100;
		}
	}

}
