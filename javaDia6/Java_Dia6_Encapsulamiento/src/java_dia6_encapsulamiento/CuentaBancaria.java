  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dia6_encapsulamiento;

/**
 *
 * @author USUARIO
 */
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad){
        if(cantidad>0){
            saldo+=cantidad;
            System.out.println("se realizo el deposito correctamente "+ saldo);
        }else{
            System.out.println("La cantidad a depositar debe ser positiva mayor a cero");
        }
    }
    public void retirar(double cantidad){
        if(cantidad>0 && cantidad<= saldo){
            saldo-=cantidad;
            System.out.println("Se realizo correctamente el retiro "+ cantidad+ " tu saldo es: "+ saldo);
            
        }
        else{
            System.out.println("la cantidad es muy superior al saldo");
        }
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
