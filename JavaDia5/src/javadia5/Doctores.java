
package javadia5;


public class Doctores extends Personas {
    
   
    String cargo;
    String nombreLider;
    String equipo;

    public Doctores(String nombre,String direccion,int id_hospital,String cargo, String nombreLider, String equipo) {
        super( nombre, direccion, id_hospital);
        this.cargo = cargo;
        this.nombreLider = nombreLider;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Doctores " + " id= " + id + ", nombre= " + nombre+", direccion= "+direccion+", id_hospital= "+id_hospital+ ", cargo= " + cargo + ", nombreLider= " + nombreLider + ", equipo= " + equipo ;
    }
    
    
}
