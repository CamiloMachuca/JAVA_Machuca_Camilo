
package javadia5;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Pacientes extends Personas{
    
    LocalDate fecha_ingreso;
    LocalDate fecha_nacimiento;
    int edad;
    String diagnostico;
    int id_pabellon;

    public Pacientes( LocalDate fecha_nacimiento, String diagnostico, String nombre, String direccion, int id_hospital, ArrayList<Pabellon>pabellones) {
        super( nombre, direccion, id_hospital);
        this.fecha_ingreso = LocalDate.now();
        this.fecha_nacimiento=fecha_nacimiento;
        this.diagnostico = diagnostico;
        this.id_pabellon = AsignarPabellon(pabellones);
    }

   
    public int edadPacient(){
        return Period.between(fecha_nacimiento, fecha_ingreso).getYears();
    }
    
    public int AsignarPabellon( ArrayList<Pabellon> pabellones){
        for(Pabellon p: pabellones){
            if(p.diagnosticoValido(this.diagnostico)){
                return p.getId();
            }
        }
        return 0;
    }
    
    public int getId(){
        return id;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setId_pabellon(int id_pabellon) {
        this.id_pabellon = id_pabellon;
    }
    


    @Override
    public String toString() {
        return "Pacientes " +" id= " + id + ", nombre= " + nombre+", direccion= "+direccion+", id_hospital= "+id_hospital+ ", fecha_ingreso=" + fecha_ingreso + ", fecha_nacimiento= "+ fecha_nacimiento+", edad=" + edadPacient() + ", diagnostico=" + diagnostico + ", id_pabellon=" + id_pabellon ;
    }
    
    
    
    
}
