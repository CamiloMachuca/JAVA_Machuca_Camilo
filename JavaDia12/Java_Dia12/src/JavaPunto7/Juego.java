
package JavaPunto7;

import java.util.ArrayList;
import java.util.List;

interface enemy{
    void action();
    void crear(List<enemy>enemigo);
}
public class Juego {
    private List<enemy>enemigo=new ArrayList<>();
    private boolean endgame=false;
    
    public Juego(List<enemy>enemigo){
        this.enemigo=enemigo;
    }
    
    public void run(){
    
        while(!endgame){
            for(enemy e : enemigo){
                e.action();

            }
            break;
        }
    }
    static class gunEnemy implements enemy{

        @Override
        public void action() {
            System.out.println("Ataca con pistola");
            
        }

        @Override
        public void crear(List<enemy> enemigo) {
            enemigo.add(this);
            
        }
    
    }
    static class KnifeEnemy implements enemy{

        @Override
        public void action() {
           System.out.println("Ataca con cuchilla"); 
        }

        @Override
        public void crear(List<enemy> enemigo) {
            enemigo.add(this);
        }
    }
    public static void main(String[] args) {
        
        List<enemy>enemigoList=new ArrayList<>();
        
        enemigoList.add(new KnifeEnemy());
        enemigoList.add(new gunEnemy());
        
        Juego game =new Juego(enemigoList);
        game.run();
       
    
}
}
