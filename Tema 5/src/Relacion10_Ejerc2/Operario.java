package Relacion10_Ejerc2;

public class Operario extends Empleado {

    static final int SUELDO_MAX = 1200;

    int nave;

    public Operario(String dni, String nombre, int sueldo, int nave , int Sueldo_Max) throws EmpleadoException {
        super(dni, nombre, sueldo, Sueldo_Max);
        
        
        if (sueldo > SUELDO_MAX) {
            throw new EmpleadoException("Sueldo del operario incorrecto, demasiado alto. Límite es " + SUELDO_MAX);
        }

        if (nave >= 1 && nave <= 5) {
            this.nave = nave;
        } else {
            throw new EmpleadoException("Nave de operario incorrecta");
        }
    }
}
