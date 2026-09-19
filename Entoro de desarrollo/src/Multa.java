
public class Multa {
    private int diasSinPrestar;
    private boolean activa;

    public Multa(int diasSinPrestar) {
        this.diasSinPrestar = diasSinPrestar;
        this.activa = true;
    }

    public int getDiasSinPrestar() {
        return diasSinPrestar;
    }

    public boolean isActiva() {
        return activa;
    }

    public void disminuirDias() {
        if (diasSinPrestar > 0) {
            diasSinPrestar--;
        }
        if (diasSinPrestar == 0) {
            activa = false;
        }
    }

    @Override
    public String toString() {
        return "Multa: " + diasSinPrestar + " días restantes";
    }
}