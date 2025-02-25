/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    public static void main(String[] args){
        
        System.out.println("hollaaa");
        Perro perro1=new Perro("Lucas");
        perro1.hacerSonido();;
        perro1.moverCola();
        
        Animal miAnimal=new Perro("Firulais");
        // aunque la variable es de tipo animal , ae invoca el metodo sobreescrito en Perro
        miAnimal.hacerSonido();
        miAnimal.dormir();
        
        Animal miAnimal1= new Perro("Firulais");
        
        // Para acceder a metodos especificos de Perro, es necesario realizar un casting
        if(miAnimal instanceof Perro){
            Perro miPerro=(Perro) miAnimal;
            miPerro.moverCola();
        }
    }
    
}
