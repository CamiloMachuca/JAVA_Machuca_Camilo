
package javadia7;


public class Motocicleta extends Vehiculo{
    
    private String tipoManubrio;

    public Motocicleta() {
    }

    public Motocicleta(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    public Motocicleta(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }
    
    
    @Override
    public void MostrarDetalles(){
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Tipo de manubrio: "+ tipoManubrio);
    }
    
    
    
}
