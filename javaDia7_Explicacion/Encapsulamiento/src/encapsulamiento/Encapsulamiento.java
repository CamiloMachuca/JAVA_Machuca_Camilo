
package encapsulamiento;


public class Encapsulamiento {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona("zully", 19);
        System.out.println(p1);
        p1.setNombre("Alejandra");
        System.out.println(p1.getNombre());
        
        CuentaBancaria c1=new CuentaBancaria("aasdfafdd23",10000);
        System.out.println(c1.getSaldo());
        c1.depositar(2500000);
        System.out.println(c1.getSaldo());
        c1.retirar(90000);
        System.out.println(c1.getSaldo());
    }
    
}
