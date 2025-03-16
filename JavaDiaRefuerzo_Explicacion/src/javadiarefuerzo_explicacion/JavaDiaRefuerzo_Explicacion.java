
package javadiarefuerzo_explicacion;
import java.util.Scanner;
import static javadiarefuerzo_explicacion.CrudTXT.*;
public class JavaDiaRefuerzo_Explicacion {

   
    public static void main(String[] args) {
        cargarDatos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CRUD Personas ---");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Listar Personas");
            System.out.println("4. Listar Productos");
            System.out.println("5. Actualizar Persona");
            System.out.println("6. Actualizar Producto");
            System.out.println("7. Eliminar Persona");
            System.out.println("8. Eliminar Persona");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Agrega los datos de la nueva persona");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    agregarPersona(id, nombre, edad);
                    guardarDatos();
                    break;
                    
                case 2:
                     System.out.println("Agrega los datos del nuevo producto");
                    System.out.print("ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    agregarProducto(id2, nombre2, precio);
                    guardarDatosProductos();
                    break;

                case 3:
                    listarPersonas();
                    break;
                    
                case 4:
                    listarProductos();
                    break;

                case 5:
                    System.out.print("ID de la persona a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    actualizarPersona(idActualizar, nuevoNombre, nuevaEdad);
                    guardarDatos();
                    break;
                    
                case 6:
                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre2 = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    double precio2= sc.nextDouble();
                    actualizarProductos(idActualizar2, nuevoNombre2, precio2);
                    guardarDatosProductos();
                    break;

                case 7:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarPersona(idEliminar);
                    guardarDatos();
                    break;
                case 8:
                    System.out.print("ID de la producto a eliminar: ");
                    int idEliminar2 = sc.nextInt();
                    eliminarProducto(idEliminar2);
                    guardarDatosProductos();
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

        sc.close();
    
        
    }
    
}
