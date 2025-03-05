
package javadia11.Principio3;


public class Adulto extends Persona{
    public Adulto(String nombre, String apellidos, String dni, String tarjeta) {
        super(nombre, apellidos);
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
 
    private String dni;
    private String tarjeta;
 
    public String getDni() {
        return dni;
    }
 
    public void setDni(String dni) {
        this.dni = dni;
    }
 
    public String getTarjeta() {
        return tarjeta;
    }
 
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
 
    public void pagar() {
        System.out.println("mi  dni es "+ getDni() + " con la tarjeta "  + tarjeta);
    }
    
}
