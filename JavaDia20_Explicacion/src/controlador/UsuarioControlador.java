
package controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import vista.UsuarioVista;


public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = scanner = new Scanner(System.in);
    }

    public void iniciar(){
        while (true){
            System.out.println("Menu principal ");
            System.out.println("1. Crear usuario");
            System.out.println("2. Elimnar usuario");
            System.out.println("3. listar usuarios");
            System.out.println("4. Editar usuaro");
            System.out.println("5. Filtrar usuario");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.insertar(nuevoUsuario);
                    System.out.println("Usuario Agregado!");
                    break;
                    
                case 2:
                    Usuario nuevoUsuario3= usuarioVista.eliminarUsuario();
                    usuarioDAO.eliminar(nuevoUsuario3);
                    System.out.println("Usuario eliminado");
                    break;
                    
                case 3:
                   
                    List<String> usuarios2 =new ArrayList<>();
                    usuarios2=usuarioDAO.obtenerUsuario();
                    for(String Usuario : usuarios2 ){
                        System.out.println(Usuario);
                    }
                    break;
                    
                    
                case 4:
                    Usuario nuevoUsuario2 = usuarioVista.editarUsuario();
                    usuarioDAO.actualizarUsuario(nuevoUsuario2);
                    break;
                    
                case 5:
                    Usuario nuevoUsuario4= usuarioVista.filtrarUsuario();
                    usuarioDAO.filtrarUsuario(nuevoUsuario4);
                    break;
                    
                    
                    
                    
            }
        }
    }
    
}
