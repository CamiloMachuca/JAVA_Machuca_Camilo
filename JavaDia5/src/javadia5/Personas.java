
package javadia5;


public class Personas {
    static int contadorId=0;
    int id;
    String nombre;
    String direccion;
    int id_hospital;

    public Personas( String nombre, String direccion, int id_hospital) {
        contadorId=contadorId+1;
        this.id = contadorId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.id_hospital = id_hospital;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }
    
    
    
    
}

