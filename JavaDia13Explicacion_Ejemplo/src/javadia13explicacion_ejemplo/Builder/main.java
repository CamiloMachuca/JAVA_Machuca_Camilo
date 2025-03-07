
package javadia13explicacion_ejemplo.Builder;

public class main {
    static class Computadora{
        private String procesador;
        private int ram;
        private boolean tarjetaGrafica;
        
        private Computadora(Builder builder){
            this.procesador=builder.procesador;
            this.ram=builder.ram;
            this.tarjetaGrafica=builder.tarjetaGrafica;
        }
        public void mostrarConfiguracion(){
            System.out.println("Computadora con "+ procesador+ " Ram: "+ ram+ " GB, Tarjeta Grafica: "+ tarjetaGrafica);
        }
        public static class Builder{
            private String procesador;
            private int ram;
            private boolean tarjetaGrafica;
            
            public Builder setProcesador(String procesador){
                this. procesador=procesador;
                return this;
            }
            
            public Builder setRam(int ram){
                this.ram=ram;
                return this;
            }
            public Builder setTarjetaGrafica(boolean trajetaGrafica){
                this.tarjetaGrafica=tarjetaGrafica;
                return this;
            }
            
            public Computadora build(){
                return new Computadora(this);
            }
            
        }
    }
    
    
        public static void main(String[] args){
            Computadora pc= new Computadora.Builder()
                    .setProcesador("Intel i7")
                    .setRam(16)
                    .setTarjetaGrafica(true)
                    .build();
            pc.mostrarConfiguracion();
        }
    
 
      
}
    

