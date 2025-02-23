
package javadia5;


public class Departamentos {
    int id;
    String tipo;
    int cantidad_personas;
    int id_hospital;

    public Departamentos(int id, String tipo, int cantidad_personas, int id_hospital) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad_personas = cantidad_personas;
        this.id_hospital = id_hospital;
    }

    @Override
    public String toString() {
        return "Departamentos " + " id= " + id + ", tipo= " + tipo + ", cantidad_personas= " + cantidad_personas + ", id_hospital= " + id_hospital ;
    }
    
    
    
}
