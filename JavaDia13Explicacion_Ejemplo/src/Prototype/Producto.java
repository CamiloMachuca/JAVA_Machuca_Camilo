/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Uniminuto Tibu
 */
public class Producto implements Cloneable {
    private String nombre; 
   private double precio; 
   private String descripcion; 
   //... otros atributos y métodos getter/setter     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String mostrarInformacion() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
   
   @Override 
   public Producto clone() throws CloneNotSupportedException { 
       return (Producto) super.clone(); 
   } 
    
}
