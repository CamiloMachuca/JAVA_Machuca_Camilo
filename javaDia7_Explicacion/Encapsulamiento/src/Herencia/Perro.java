/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;


public class Perro extends Animal {
    private String raza;
    private int edad;
    private String sexo;
    
    
    public Perro(String nombreCientifico) {
        this.nombreCientifico=nombreCientifico;
    }

    public Perro(String raza, int edad, String sexo) {
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(String raza, int edad, String sexo, String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    

    public Perro(String raza, String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
        this.raza = raza;
    }
    @Override
    public void hacerSonido(){
        System.out.println("El perro "+ nombreCientifico+ " dice guaaaa!");
    }
    public void moverCola(){
        System.out.println("El perro "+ nombreCientifico+ " mueve la cola");
    }
    
    
}
