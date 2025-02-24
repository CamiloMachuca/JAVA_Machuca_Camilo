/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dia6_encapsulamiento;

import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class InventarioTest {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Producto pr= new Producto("abc1", "camisa", 20, 20000);
        
        // Actualizar stock
        pr.actualizarStock(15);
        
        // ver productos a la venta;
        System.out.println(pr.VerProductos());
        
        //Ingrese la cantidad que desea del producto
        int cantidadCompr= 10;
        // Se actualiza el stock del producto
        pr.actualizarStock(cantidadCompr);
        // se muestra el estock actualizado
        System.out.println(pr.VerProductos());
        
    }
    
}
