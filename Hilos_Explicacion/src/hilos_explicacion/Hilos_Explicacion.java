
package hilos_explicacion;

public class Hilos_Explicacion {

   
    public static void main(String[] args) {
        Thread t1= new PingPong("P");
        Thread t2=new PingPong("S");
        t1.start();
        t2.start();
      
    }
    
}
