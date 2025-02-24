
package java_dia6_encapsulamiento;


public class Java_Dia6_Encapsulamiento {

  
    public static void main(String[] args) {
       
        // Taller 1
        Empleado Em= new Empleado("Juan Rodriguez",1, 200000);
        Em.setNombre("Pepito Perez");
        Em.setSalario(3000000);
        System.out.println(Em.getNombre());
        System.out.println(Em.getSalario());
        System.out.println(Em.MostrarInformacion());
        
        // Taller 2
    }
    
}
