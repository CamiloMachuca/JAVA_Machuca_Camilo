
package Modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
     private String URL="jdbc:mysql://bq2unbq3itevqewadxmt-mysql.services.clever-cloud.com:3306/bq2unbq3itevqewadxmt";
    private String USUARIO= "udspkjxc1jqwwtjb";
    private String PASSWORD= "kZYb2u5uE72u9ypmTq64";
    
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    };
    
    public void insertar(Usuario usuario){
        String sql="insert into usuarios(nombre, email) values (?, ?)";
        try(
            Connection conexionInterna=conectar();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setString(1,usuario.getNombre());
            solicitud.setString(2, usuario.getEmail());
            
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa");
        
                
        }catch(SQLException e){
            e.printStackTrace();

        }
    }
    public List<String> obtenerUsuario(){
        String sql= "select * from usuarios";
        List<String> listaUsuarios=new ArrayList<>();
        try{
            Connection conexionInterna=conectar();
            PreparedStatement solicitud=  conexionInterna.prepareStatement(sql);
            ResultSet resultado= solicitud.executeQuery();{
            while (resultado.next()){
                listaUsuarios.add(String.valueOf(resultado.getInt("id")+"-"+ resultado.getString("nombre")+ resultado.getString("email")));
            }
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuarios;

        
    }
    
    // actualizar
    //update usuarios set nombre=?, email=? where id=?
    public void actualizarUsuario(Usuario usuario){
        String sql="update usuarios set nombre=?, email=? where id=?";
        try(
            Connection conexionInterna=conectar();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setString(1, usuario.getNombre());
            solicitud.setString(2, usuario.getEmail());
            solicitud.setInt(3, usuario.getId());
            
            int filas=solicitud.executeUpdate();
            
            if(filas> 0){
                System.out.println("Usuario modificado de manera exitosa");
            }else{
                System.out.println("No se pudo modificado el usuario con el id "+ usuario.getId());

            }
       
        }catch(SQLException e){
            e.printStackTrace();

        }
    }
    
    //eliminar
    public void eliminar(Usuario usuario){
        String sql="delete from usuarios where id=?";
        
        try(
            Connection conexionInterna=conectar();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1,usuario.getId());
            
            solicitud.executeUpdate();
            System.out.println("Usuario eliminado con exito");
           
            
        }catch(SQLException e){
            System.out.println("error al eliminar el usuario");
                e.printStackTrace();
        }
        
    }
    
    // filtrar usuarios
     public List<String> filtrarUsuario( Usuario usuario){
        String sql= "select * from usuarios where id="+ usuario.getId();
        List<String> listaUsuariosFiltro=new ArrayList<>();
        try{
            Connection conexionInterna=conectar();
            PreparedStatement solicitud=  conexionInterna.prepareStatement(sql);
            ResultSet resultado= solicitud.executeQuery();{
            while (resultado.next()){
                listaUsuariosFiltro.add(String.valueOf(resultado.getInt("id")+"-"+ resultado.getString("nombre")+ resultado.getString("email")));
            }
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuariosFiltro;
    }
}
