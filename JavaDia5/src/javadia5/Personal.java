
package javadia5;

import java.time.LocalDate;

public class Personal extends Personas{
   
    LocalDate fechaVinculacion;
    int salario;
    int id_departamento;
    String tipo_trabajo;
   

    public Personal( String nombre,String direccion,int id_hospital, int salario, int id_departamento, String tipo_trabajo) {
        super( nombre, direccion, id_hospital);
        this.fechaVinculacion = LocalDate.now();
        this.salario = salario;
        this.id_departamento = id_departamento;
        this.tipo_trabajo = tipo_trabajo;
    }

    @Override
    public String toString() {
        return "Personal" +" id= " + id + ", nombre= " + nombre +", direccion= "+direccion+", id_hospital= "+id_hospital+ ", fechaVinculacion= " + fechaVinculacion + ", salario= " + salario + ", id_departamento= " + id_departamento + ", tipo_trabajo= " + tipo_trabajo ;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }
    
    public int getId(){
        return id;
    }
    
    
    
}
