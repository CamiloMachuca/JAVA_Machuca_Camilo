
package javadia5;

public class Hospitales {
    int id;
    String nombre;
    String direccion;

    public Hospitales(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Hospitales " + " id= " + id + ", nombre= " + nombre + ", direccion= " + direccion ;
    }
    
    
    
}
