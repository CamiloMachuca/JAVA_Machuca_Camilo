
package javadia16;


public class JavaDia16 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Atletas={"Camilo", "David", "Julian", "Andres"};
        
        for (String i: Atletas){
            Thread hiloAtleta= new Thread (new Carrera(i));
            hiloAtleta.start();
        }
    }
    
}
