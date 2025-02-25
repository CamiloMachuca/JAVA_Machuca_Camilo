
package javadia7;

public class JavaDia7 {

    public static void main(String[] args) {
        
        Coche miCoche= new Coche (4,"Hilux", "2025");
        Motocicleta miMotocicleta=new Motocicleta("curvo","suzuki","suzuki GN 125" );
        miCoche.MostrarDetalles();
        System.out.println("");
        miMotocicleta.MostrarDetalles();
    }
    
}
