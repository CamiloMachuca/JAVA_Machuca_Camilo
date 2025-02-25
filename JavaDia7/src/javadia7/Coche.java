
package javadia7;


public class Coche extends Vehiculo{
    private int numeroPuertas;


    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    

    @Override
    public void MostrarDetalles() {
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Numero de puertas: "+ numeroPuertas);
    }
    
    
    
}
