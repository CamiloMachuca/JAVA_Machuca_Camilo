/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    
    // componenete base
    
    interface Coffee{
        String getDescription();
        double cost();
    }
    
    static class SimpleCoffee implements Coffee{
        public String getDescription(){
            return "Cafe simple";
        }
        
        public double cost(){
            return 5.0;
        }
    }
    
    
    static abstract class CoffeeDecorator implements Coffee{
        protected Coffee coffee;
        
        public CoffeeDecorator(Coffee coffee){
            this.coffee=coffee;
        }
        
        public String getDescription(){
            return coffee.getDescription();
        }
        
        public double cost() {return coffee.cost();}
    
    }
    
    static class MilkDecorator extends CoffeeDecorator{
        public MilkDecorator(Coffee coffee){super(coffee);}
        
        public String getDescription(){return coffee.getDescription()+ ", con leche";}
        
        public double const(){ return coffee.cost()+ 1.5;}
    }
    
    public static void main(String[] args){
        Coffee myCoffee=new SimpleCoffee();
        System.out.println(myCoffee.getDescription()+ "$"+ myCoffee.cost());
        
        myCoffee= new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription()+ "$"+ myCoffee.cost());
    }
}
