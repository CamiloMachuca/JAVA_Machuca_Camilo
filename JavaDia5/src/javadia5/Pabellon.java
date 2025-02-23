
package javadia5;

public class Pabellon {
    int id;
    String nombre;
    String diagnosticoValido;
    int capacidad_personas;
    int id_departamento;
    

    public Pabellon(int id, String nombre,String diagnosticoValido, int capacidad_personas, int id_departamento) {
        this.id = id;
        this.nombre = nombre;
        this.diagnosticoValido=diagnosticoValido;
        this.capacidad_personas = capacidad_personas;
        this.id_departamento = id_departamento;
       
    }

    @Override
    public String toString() {
        return "Pabellon" + " id= " + id + ", nombre= " + nombre + ", diagnosticoValido= " + diagnosticoValido + ", capacidad_personas= " + capacidad_personas + ", id_departamento= " + id_departamento ;
    }

    int getId() {
        return id;
    }

    boolean diagnosticoValido(String diagnostico) {
        return this.diagnosticoValido.equals(diagnostico);
    }
    
    
    
    
    
}
