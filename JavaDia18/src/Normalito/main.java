
package Normalito;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao=new UsuarioDAO();
        usuarioDao.insertUsuario("Pedrito", "Pedrogomez.campuslads@gmail.com");
        usuarioDao.insertUsuario("Valentina", "Valentina.campuslads@gmail.com");
        usuarioDao.insertUsuario("Zully", "Zully.campuslads@gmail.com");
        
        List<String> listaUsuarios= usuarioDao.obtenerUsuario();
        for (String usuario: listaUsuarios){
            System.out.println(usuario);
        }
        
        usuarioDao.actualizarUsuario("Jaime", "jaimeBarrera@gmail.com", 3);
        listaUsuarios= usuarioDao.obtenerUsuario();
        System.out.println("####################");
        for (String usuario: listaUsuarios){
            System.out.println(usuario);
        }
        
        usuarioDao.eliminarUsuario(1);
        
        List<String> listaUsuariosFiltro= usuarioDao.filtrarUsuario("3");
        for (String usuario: listaUsuariosFiltro){
            System.out.println(usuario);
        }

    }
    
}
