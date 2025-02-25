
package Empleado;


public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHoras(int horasTrabajadas, String nombre, double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularBonificacion(){
        int totalHoras=horasTrabajadas*50000;
        double total=getSalario()* 0.10 + totalHoras;
        return total;
    }
}
