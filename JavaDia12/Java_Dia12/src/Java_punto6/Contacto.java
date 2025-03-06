/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_punto6;

/**
 *
 * @author Uniminuto Tibu
 */
public class Contacto {
    public String Nombre;
    public String CuentaBancaria;
    public String Email;

    public Contacto(String Nombre, String CuentaBancaria, String Email) {
        this.Nombre = Nombre;
        this.CuentaBancaria = CuentaBancaria;
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Contacto{" + "Nombre=" + Nombre + ", CuentaBancaria=" + CuentaBancaria + ", Email=" + Email + '}';
    }
    
    
    
    
    
}
