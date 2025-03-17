
package Normalito;
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
    
    public void insertUsuario(String nombre, String email){
        String sql="insert into usuarios(nombre, email) values (?, ?)";
        try(
            Connection conexionInterna=conectar();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            
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
    public void actualizarUsuario(String nombre, String email, int id){
        String sql="update usuarios set nombre=?, email=? where id=?";
        try(
            Connection conexionInterna=conectar();
            PreparedStatement solicitud= conexionInterna.prepareStatement(sql)){
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);
            
            int filas=solicitud.executeUpdate();
            
            if(filas> 0){
                System.out.println("Usuario modificado de manera exitosa");
            }else{
                System.out.println("No se pudo modificado el usuario con el id "+ id);

            }
       
        }catch(SQLException e){
            e.printStackTrace();

        }
    }
    
}
