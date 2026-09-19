package Arrays_tri;

class CofreNormal extends Cofre {
    public CofreNormal(String pos) {
        super(pos);
        this.items = 3;  // 3 items básicos
    }
    
    public String abrir() {
        return "Cofre normal en " + posicion + ": manzanas, pan, madera";
    }
}

