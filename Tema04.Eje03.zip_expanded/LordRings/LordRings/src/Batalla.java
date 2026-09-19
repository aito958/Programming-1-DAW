import problemas.ProblemaAtaque;
import problemas.ProblemasVariable;
import soluciones.alternativa.AtaqueSimple;
import soluciones.alternativa.AtaqueVoraz;
import temporizador.Temporizador;

public class Batalla {
	public static void main(String[] args) {
		ProblemaAtaque p = new ProblemaAtaque();
		ProblemasVariable pV = new ProblemasVariable();

		Temporizador t = new Temporizador(100);

		AtaqueSimple solSimple = new AtaqueSimple(p);
		t.cronometra(solSimple);
		System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
		System.out.println("Problema: " + p);
		System.out.println("Solución: " + solSimple + "\n");

		AtaqueVoraz solVoraz = new AtaqueVoraz(p);
		t.cronometra(solVoraz);
		System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
		System.out.println("Problema: " + p);
		System.out.println("Solución: " + solVoraz + "\n");
		
		AtaqueSimple solSimpleVariable = new AtaqueSimple(pV);
		t.cronometra(solSimpleVariable);
		System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
		System.out.println("Problema: " + pV);
		System.out.println("Solución: " + solSimpleVariable + "\n");

		AtaqueVoraz solVorazVariable = new AtaqueVoraz(pV);
		t.cronometra(solVorazVariable);
		System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
		System.out.println("Problema: " + pV);
		System.out.println("Solución: " + solVorazVariable + "\n");

	}
}
