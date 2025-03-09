
package javadia13.Prototype;


public class main {
      public static void main(String[] args) {
       
        /*
        // Creación de un producto original 
        Producto productoOriginal = new Producto(); 
        productoOriginal.setNombre("Camiseta"); 
        productoOriginal.setPrecio(25.99); 
        productoOriginal.setDescripcion("Camiseta de algodón");  

        // Creación de una copia del producto original 
        Producto copiaProducto = new Producto(); 
        copiaProducto.setNombre(productoOriginal.getNombre()); 
        copiaProducto.setPrecio(productoOriginal.getPrecio()); 
        copiaProducto.setDescripcion(productoOriginal.getDescripcion());  

        // Ahora se puede modificar el precio de la copia sin afectar al original 
        copiaProducto.setPrecio(19.99);
        */
        
        // Creación de un producto original 
        Producto productoOriginal = new Producto(); 
        productoOriginal.setNombre("Camiseta"); 
        productoOriginal.setPrecio(25.99); 
        productoOriginal.setDescripcion("Camiseta de algodón"); 


        try{ 
           // Creación de una copia del producto original usando el patrón Prototype 
           Producto copiaProducto = productoOriginal.clone(); 

           // Ahora se puede modificar el precio de la copia sin afectar al original 
           copiaProducto.setPrecio(19.99); 
           System.out.println(copiaProducto.getPrecio());
            System.out.println(productoOriginal.getPrecio());
        }catch (CloneNotSupportedException e) { 

        }
          
    }
    
}
