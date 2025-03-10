/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        // Creación de un producto original 
        Producto productoOriginal = new Producto(); 
        productoOriginal.setNombre("Camiseta"); 
        productoOriginal.setPrecio(25.99); 
        productoOriginal.setDescripcion("Camiseta de algodón"); 


        try{ 
           // Creación de una copia del producto original usando el patrón Prototype 
           Producto copiaProducto = productoOriginal.clone(); 

           // Ahora se puede modificar el precio de la copia sin afectar al original 
           copiaProducto.setPrecio(19.99); 
            System.out.println(copiaProducto.mostrarInformacion());
           

        }catch (CloneNotSupportedException e) { 

        }
        
            }

    
}
