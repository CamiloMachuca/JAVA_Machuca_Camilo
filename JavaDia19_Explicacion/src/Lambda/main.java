
package Lambda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class main {
    
    public static void main(String[] args) {
        // funciones lambda
        // Las funciones lambda son funciones o metodos en java que se representaran de manera anonima
        // pues se define en la linea donde se vayan a utilizar. Dichas funciones pueden recibir cero o
        // mas argumentos y devolver uno o ningun valor de retorno.
        
        // sintaxis
        // (parametros)-{cuerpo  de las funciones}
        /*Parametros: Son los valores de entrada de la funcion
        Operador->: Separa los parametros de la implementacion.
        Cuerpo de la funcion: es el codigo que se ejecutara.
        Las expresiones lambda solo funcionan con interfaces funcionales, 
        es decir, interfaces que tienen un único método abstracto. Algunas 
        interfaces funcionales predefinidas en java.util.function incluyen:

        Function<T, R> -> Recibe un argumento y devuelve un resultado.

        Consumer<T> -> Recibe un argumento y no devuelve nada.

        Supplier<T> -> No recibe argumentos, pero devuelve un resultado.

        Predicate<T> -> Recibe un argumento y devuelve true o false.

        Consumer es una interfaz funcional que representa una 
        operación que acepta un solo argumento de entrada y no devuelve
        ningún resultado. La interfaz Consumer se utiliza comúnmente para realizar 
        acciones o efectos secundarios sobre un objeto, como imprimirlo en la consola,
        agregarlo a una colección, o cualquier otra operación que no requiera devolver un valor.*/
        // Creación de un Consumer<String> usando una expresión lambda
        Consumer<String> consumidor = saludo -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo concatenado con una cadena adicional
            System.out.println(saludo + " Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del Consumer con un argumento "Hola Pepe"
        consumidor.accept("Hola Pepe");
        
        // Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidor2 = (nombre,  saludo) -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del BiConsumer con dos argumentos "Pepe" y "Hola"
        consumidor2.accept("Pepe", "Hola");
        
        
        /*La interfaz funcional Supplier<T> pertenece al paquete 
        java.util.function y se utiliza para representar un proveedor 
        de resultados. Esta interfaz no toma ningún argumento y produce
        un resultado de tipo T. Es decir, se utiliza cuando se necesita
        generar o proporcionar un valor, pero no se tiene ningún argumento para hacerlo. 
        Se puede pensar en ello como una fábrica que suministra datos.*/
        
        // supplier que suministra un numero aleatorio entre 1 y 109
        Supplier<Integer> generadorAleatorio=()-> new Random().nextInt(100)+1;
        
        int numeroAleatorio= generadorAleatorio.get();
        System.out.println("Numero aleatorio: "+ numeroAleatorio);
        
        // La interfaz funcional Function<T,Q> pertenece al paquete java.util.function y se utiliza
        //para crear un metodo no explicito, que reciba parametros y retorne un valor.
        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };
        String mensaje= "Holiiiss";
        int longitud= sizeOf.apply(mensaje);
        System.out.println("Longitud del mensaje: "+ longitud);
        
        // La interfaz funcional Predicate<T> pertenece al paquete java.util.function y se utiliza
        //para retornar un valor booleano: True or false.
        
        Predicate<Integer> esPar=numero-> numero %2==0;
        System.out.println("¿4 es par? : "+ esPar.test(4) );
        System.out.println("¿7 es par? : "+ esPar.test(7) );
        
        
    }
    
}
