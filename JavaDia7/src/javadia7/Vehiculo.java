/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadia7;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

   
    public void MostrarDetalles() {
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
    }
    
    
    
}
