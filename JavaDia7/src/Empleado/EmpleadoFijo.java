
package Empleado;


public class EmpleadoFijo extends Empleado {

    public EmpleadoFijo() {
    }

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }
    
    @Override
    public double calcularBonificacion(){
        double totall=getSalario()* 0.20;
        return totall;
    }
    
}
