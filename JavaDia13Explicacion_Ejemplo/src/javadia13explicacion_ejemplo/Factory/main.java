
package javadia13explicacion_ejemplo.Factory;

// Factory Method

interface Producto{
    void usar();
}

class ProductoA implements Producto{
    
    public void usar(){
        System.out.println("Usando producto A");
    }

}

class ProdutoB implements Producto{
    public void usar(){
        System.out.println("Usando producto B");
    }
}
public class main {
    class Factory{
        public static  Producto crearProducto(String tipo){
            try{
                if(tipo.equalsIgnoreCase("A")){
                    return new ProductoA();
                }else if(tipo.equalsIgnoreCase("B")){
                    return new ProdutoB();
                }
                throw new IllegalArgumentException("Tipo desconocido");
            }catch(Exception e){
                System.out.println("Tipo desconocido");
                
            }
            return null;
            
            
            
            
        }
    }
    public static void main(String[] args){
        Producto p1=Factory.crearProducto("A");
        p1.usar();
        
        Producto p2=Factory.crearProducto("B");
        p2.usar();
    }
   
}
