
package java_dia15_hilos;


public class Java_Dia15_hilos {

   
    public static void main(String[] args) {
        HiloEjemplo hiloEjemplo=new HiloEjemplo();
        hiloEjemplo.start();
        
        EjecutableEjemplo ejecutableEjemplo=new EjecutableEjemplo(); 
        Thread thread=new Thread(ejecutableEjemplo);
        thread.start();
    }
    
}
