
package javadia10_explicacion_ejemplo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;


public class JavaDia10_Explicacion_Ejemplo {

 
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        TreeSet<String> treeSet = new TreeSet<>();

        // Agregar elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        treeSet.add("Pera");
         // Mostrar los elementos del TreeSet
        System.out.println("Elementos en TreeSet: " + treeSet);
        
        System.out.println("=========================");
        Iterator<String> iterator = treeSet.iterator();
        
        
        while (iterator.hasNext()) {
           String elemento = iterator.next();
           System.out.println(elemento);
        }
        System.out.println("=========================");
       
        
        for (String elemento : treeSet) {
            System.out.println(elemento);
        }
        
        //obtener el tamaño del conjunto
        int tamano= treeSet.size(); // Esto almacena el numero de elementos del conjunto en la variable tamaño
        System.out.println(tamano);
        
        // convertir el set en un String 
        String resultado = treeSet.toString();
        // Esto almacena una representacion en cadena del conjunto 
        //en la variable resultado
        System.out.println(resultado);
        
        Map<String, Integer> hashMap = new HashMap<>();

        // Asignar valores al mapa usando el método put()
        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Luis", 28);
        hashMap.put("Ana", 35);

        // Acceder y mostrar los valores del HashMap
        System.out.println("Edad de Juan: " + hashMap.get("Juan"));
        System.out.println("Edad de María: " + hashMap.get("María"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
        
        System.out.println("========================================");
        //Iteración de un mapa en Java
        Iterator<Map.Entry<String, Integer>> iterator2 = hashMap.entrySet().iterator();
        while (iterator2.hasNext()) {
           Map.Entry<String, Integer> entry = iterator2.next();
           String clave = entry.getKey();
           Integer valor = entry.getValue();
           System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("========================================");
        //Bucle for-each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("========================================");
        
        Pais francia= Pais.FRANCIA;
        String nombre= francia.name();
        System.out.println(nombre); // Devuelve un String con el nombre de la constante (FRANCIA)
        System.out.println(francia.toString()); // Devuelve un String con el nombre de la constante (FRANCIA)
        System.out.println(francia.ordinal());    // Devuelve un entero con la posición del enum según está declarada (1).
        System.out.println(francia.values());  // Devuelve un array que contiene todos los valores del enum
        // Acceder a las constantes de la enumeración
        
        Pais miPais = Pais.ESPANA;

        // Obtener información del país
        String nombrePais = miPais.getNombre();
        String capitalPais = miPais.getCapital();

        // Imprimir información del país
        System.out.println("País: " + nombrePais);
        System.out.println("Capital: " + capitalPais);
        */
        try{
            int numero1=10;
            int numero2=0;
            int resultado= numero1/ numero2;
            System.out.println("El resultado es: "+ resultado);
        }
        catch(Exception e){
            System.out.println("Error: No se olvide que no puedes dividir por cero"+ e.getMessage());
        
        }finally{
            System.out.println("Fin del programa");
        }
    }
    
}
