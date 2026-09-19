package Arrays_tri;

class Cofre {
    protected String posicion;
    protected int items;
    
    public Cofre(String pos) {
        this.posicion = pos;
        this.items = 0;
    }
    
    public String abrir() {
        return "Cofre vacío en " + posicion;
    }
    
    public int getItems() { return items; }
}