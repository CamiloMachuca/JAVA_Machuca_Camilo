/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dia6_encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, int salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>0 ){
            this.salario = salario;
        }else{
            System.out.println("El salario no es valido ingrese un salario positivo");
        }
        
    }

    public String MostrarInformacion() {
        return "Empleado " + " nombre= " + nombre + ", id= " + id + ", salario= " + salario ;
    }
    
    
    
}
