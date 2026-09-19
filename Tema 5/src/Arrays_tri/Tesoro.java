package Arrays_tri;

//COFRE DE TESORO (hereda de normal)
class CofreTesoro extends CofreNormal {
 private int oro;
 
 public CofreTesoro(String pos, int oro) {
     super(pos);
     this.oro = oro;
     this.items += 2;  // +2 items especiales
 }
 
 public String abrir() {
     return super.abrir() + " + " + oro + " monedas de oro!";
 }
 
 public int getOro() { 
	 return oro; 
	 }
}