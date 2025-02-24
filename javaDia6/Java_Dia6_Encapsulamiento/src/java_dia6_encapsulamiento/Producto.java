/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dia6_encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad>0){
            this.cantidad = cantidad;
        }
        else{
            System.out.println("Ingrese una cantidad positiva mayor a cero");
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio>0){
            this.precio = precio;
        }else{
            System.out.println("El precio tiene que ser myor a cero");
        }
        
    }
    public void actualizarStock(int cantidad2){
        if (cantidad>0){
            this.cantidad=cantidad+cantidad2;  
        }
        else if(cantidad<0){
            
            if (cantidad<0){
                System.out.println("La cantidad no puede ser negativa");
            }else {
                this.cantidad=cantidad-cantidad2;
            }
        }else{
            System.out.println("cantidad invalidad");
        
        }
    }

   
    public String VerProductos() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    

    
    
    
}
