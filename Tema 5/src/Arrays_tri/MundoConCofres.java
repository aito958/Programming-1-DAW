package Arrays_tri;

public class MundoConCofres {
    public static void main(String[] args) {
        // [altura][ancho][profundidad]
        Cofre[][][] mundo = new Cofre[3][4][5];
        
        // RELLENAR MUNDO CON COFRES
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 4; x++) {
                for (int z = 0; z < 5; z++) {
                    String pos = "Y" + y + " X" + x + " Z" + z;
                    
                    if (y == 0) {
                        // Superficie: cofres normales
                        mundo[y][x][z] = new CofreNormal(pos);
                    } else if (y == 1 && x == 1 && z == 2) {
                        // Cofre especial enterrado
                        mundo[y][x][z] = new CofreTesoro(pos, 50);
                    } else {
                        // Subterráneo: cofres vacíos o normales
                        if ((x + z) % 3 == 0) {
                            mundo[y][x][z] = new CofreNormal(pos);
                        } else {
                            mundo[y][x][z] = new Cofre(pos);
                        }
                    }
                }
            }
        }
        
        // EXPLORAR Y CONTABILIZAR BOTÍN
        int cofresNormales = 0;
        int oroTotal = 0;
        int itemsTotales = 0;
        
        System.out.println("=== EXPLORANDO EL MUNDO ===");
        for (int y = 0; y < mundo.length; y++) {
            System.out.println("--- Capa Y=" + y + " ---");
            for (int x = 0; x < mundo[y].length; x++) {
                for (int z = 0; z < mundo[y][x].length; z++) {
                    Cofre cofre = mundo[y][x][z];
                    if (cofre != null) {
                        System.out.println(cofre.abrir());
                        
                        // ESTADÍSTICAS CON POLIMORFISMO
                        itemsTotales += cofre.getItems();
                   
                        if (cofre instanceof CofreTesoro) {
                            oroTotal += ((CofreTesoro) cofre).getOro();
                       
                        } else if (cofre instanceof CofreNormal) {
                            cofresNormales++;
                        }
                    }
                }
            }
        }
        
        System.out.println(" === ESTADÍSTICAS ===");
        System.out.println("Cofres normales: " + cofresNormales);
        System.out.println("Oro total: " + oroTotal);
        System.out.println("Items totales: " + itemsTotales);
    }
}

