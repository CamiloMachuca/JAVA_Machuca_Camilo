
package java_dia15_hilos;


public class EjecutableEjemplo implements Runnable{

    @Override
    public void run() {
        try{

            System.out.println("Hola soy un Ejecutable");
            Thread.sleep(3000);
            System.out.println("Hola soy un Ejecutable");
        }catch(InterruptedException e){
            e.printStackTrace();
        }    
    }
    
}
