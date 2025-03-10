/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    interface Volt12{
        int getVolt12();
    }
    static class Volt120{
        int getVolt120(){
            return 120;
        }
    }
    
        
    // Adaptador que comvierte Volt120 a Volt12
    static class VoltAdapter implements Volt12{
        private Volt120 volt120;
        
        public VoltAdapter(Volt120 volt120){
            this.volt120 = volt120;
        }
        @Override
        public int getVolt12(){
            return volt120.getVolt120()/10;
        }
        
        //uso del adaptador 
        public static void main(String[] args){
            Volt120 oldSystem= new Volt120();
            Volt12 adaptedSystem= new VoltAdapter(oldSystem);
            System.out.println("Voltaje adaptado_"+ adaptedSystem.getVolt12()+ "V");
        }
    }
    
}
