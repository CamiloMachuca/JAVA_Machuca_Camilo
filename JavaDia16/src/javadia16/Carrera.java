
package javadia16;


public class Carrera extends Thread {
    private String atleta;
    public Carrera(String atleta){
        this.atleta=atleta;
    }
    
    @Override
    public synchronized void run(){
        
        synchronized(getClass()){
        
            System.out.println("El atleta: "+ atleta+ " Comenzo a correr");
            getClass().notifyAll();
        try{
            Thread.sleep((int) (Math.random()*2+9)*1000);
            System.out.println("El atleta: "+ atleta+ " entrega el testigo en un tiempo de: "+ ((int) (Math.random()*2+9))+ " S");
            getClass().wait();
           
        }catch(InterruptedException e){
            getClass().notifyAll();
            
        }
        getClass().notifyAll();
        }
        
    }
    
}
