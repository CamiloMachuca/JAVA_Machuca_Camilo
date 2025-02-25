/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author Uniminuto Tibu
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria() {
    }
    
    // no voy a crear un setter para el numero de cuenta
    // Razon: Para que no se modifique despues de haberse creado
    
    // Getter para el "saldo"
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double cantidad){
        if (cantidad>0){
            saldo=saldo+ cantidad;
            System.out.println("El deposito fue reaalizado yaa");
            
        }else{
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    public void retirar(double cantidad){
        if (cantidad>0 && cantidad<=saldo){
            System.out.println("Su retiro fue realizado!!");
        }else if(cantidad>saldo){
            System.out.println("No tienes los fondos suficientes");
        }else{
            System.out.println("Por favor debes ingresar una cantidad menor");
        }
    }
}
