
package Herencia;


public class Animal {
    
    protected String nombreCientifico;
    protected String especie;
    protected String habitat;
    protected boolean tienePelo;
    protected int cantPatas;

    public Animal() {
    }

    public Animal(String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.habitat = habitat;
        this.tienePelo = tienePelo;
        this.cantPatas = cantPatas;
    }
    
    public void hacerSonido(){
        System.out.println("El animalito hace un sonido");
    }
    public void dormir(){
        System.out.println("estoy durmiedo");
    }
    
}
