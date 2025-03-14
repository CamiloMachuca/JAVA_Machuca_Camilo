
package javadiarefuerzo_explicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CrudTXT {
    private static String archivo="./src/javadiarefuerzo_explicacion/info.txt";
    private static List<Persona> personas= new ArrayList<>();
    private static List<Producto>productos= new ArrayList<>();
    
    
    public static void cargarDatos(){
        personas.clear();
        productos.clear();
        try(BufferedReader reader= new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea= reader.readLine())!=null){
                if(linea.startsWith("P,")){
                    personas.add(Persona.fromString(linea));
                }else if(linea.startsWith("PR,")){
                    productos.add(Producto.fromString(linea));
                }
            }
        }catch(Exception e){
            System.out.println("No se puede cargar el archivo. Se producto");
            
        }
        
    }
    public static void listarPersonas(){
        if(personas.isEmpty()){
            System.out.println("No se puede listar las personas");
        }else{
            for(Persona personas: personas){
                System.out.println(personas);}
        }
        
    }
    public static void listarProductos(){
        if(personas.isEmpty()){
            System.out.println("No se puede listar los productos");
        }else{
            for(Producto productos: productos){
                System.out.println(productos);}
        }
        
    }
}
