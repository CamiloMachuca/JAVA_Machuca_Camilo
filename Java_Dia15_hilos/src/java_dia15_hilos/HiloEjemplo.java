
package java_dia15_hilos;


public class HiloEjemplo extends Thread {
 @Override
 public void run(){
     try{
     
         System.out.println("Hola soy un hilo");
         Thread.sleep(4000);
         System.out.println("Hola soy un hilo");
     }catch(InterruptedException e){
         e.printStackTrace();
     }
 
 }
    
}
