
package vista;

import Modelo.Usuario;
import java.util.List;
import java.util.Scanner;


public class UsuarioVista {
    public void mostrarUsuarios(List<Usuario> usuarios) {
        System.out.println("Lista de usuarios:");
        for(Usuario u: usuarios){
            System.out.println(u);
        }
    }
    
    public Usuario agregarUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre");
        Scanner sc=new Scanner(System.in);
        String nombre= sc.nextLine();
        System.out.println("Email");
        String email=sc.nextLine();
        return new Usuario(nombre, email);
    }
    public Usuario eliminarUsuario(){
        System.out.println("Ingrese el id del usuario a eliminar");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        return new Usuario(id);
    }
    public Usuario filtrarUsuario(){
        System.out.println("Ingrese el id del usuario ");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        return new Usuario(id);
    }
    public Usuario editarUsuario(){
        System.out.println("Datos para nuevo usuario");
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el id del usuario a editar");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre");
        String nombre= sc.nextLine();
        System.out.println("Email");
        String email=sc.nextLine();
        return new Usuario(id);
    }

   
    
}
