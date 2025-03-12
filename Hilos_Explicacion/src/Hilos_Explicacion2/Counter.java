
package Hilos_Explicacion2;


public class Counter extends Thread {
    private int c=0;
    
    public synchronized void increment(){c++;}
    public synchronized void decrement(){c--;}
    public synchronized void run(){
        for(int i=0;i<10000;i++){
            increment();
            decrement();
        }
    }
    public synchronized int value(){return c;}
    
    
}
