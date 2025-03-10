/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;


public class main {
    
    //Interfaz para la implementacion
    interface Color{
        void applyColor();
    }
    
    //implementaciones concretas
    static class RedColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color rojo");
        }
    }
    static class BlueColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color azul");
        }
    }
    
    // clase base que usa una implementación
    
    static abstract class Shape{
        protected Color color;
        
        public Shape(Color color){
            this.color=color;
        }
        
        abstract void draw();
    }
    
    static class Circle extends Shape{
        public Circle(Color color){
            super(color);
        }
        
        public void draw(){
            System.out.println("Dibujando circulo");
            color.applyColor();
        }
    }
        
        public static void main(String[] args){
            Shape redCircle=new Circle(new RedColor());
            Shape blueCircle= new Circle(new BlueColor());

            redCircle.draw();
            blueCircle.draw();
        }
    
    
    
    
}


