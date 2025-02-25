
package Empleado;

public class main {
    public static void main(String[] args) {
        
        Empleado [] nuevEmpleados= new Empleado [4];
        
        nuevEmpleados[0]=new EmpleadoFijo("Camilo Rodrigues",4000);
        nuevEmpleados[1]= new EmpleadoFijo("Jhonatan Villan",2000);
        nuevEmpleados[2]=new EmpleadoPorHoras(20,"Alejandra Ortega", 2000);
        nuevEmpleados[3]= new EmpleadoPorHoras(30,"Maria",3000);
        
        for(Empleado i: nuevEmpleados){
            System.out.println("Nombre: "+ i.getNombre());
            System.out.println("Bonificacion: "+ i.calcularBonificacion());
            System.out.println("");
        }
       
    }
    
}
