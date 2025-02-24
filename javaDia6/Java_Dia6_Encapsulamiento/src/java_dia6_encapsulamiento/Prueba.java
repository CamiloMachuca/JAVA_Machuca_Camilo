/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dia6_encapsulamiento;

/**
 *
 * @author USUARIO
 */
public class Prueba {
        public static void main(String[] args) {
            CuentaAhorro cue= new CuentaAhorro(2000,2.5);
            
            cue.depositar(500);
            cue.retirar(500);
            cue.aplicarInteres();
            
            System.out.println("El saldo final es de: "+ cue.getSaldo());
            
        }
    
}
