
package javaconexionbasesdedatos;
import java.sql.*;
public class Crud {
    
    public void insertarDato(String ccelular, String ddireccion, String cciudad, String ttelefono_fijo, String ccorreo_electronico){
        String query="INSERT INTO sucursales (celular, direccion, ciudad, telefono_fijo, correo_electronico) VALUES (?,?, ?,?,?)";
        try {
            Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,ccelular);// los datos se le asigna a los signos de interrogacion ? segun su posicion 1,2,3,4 
            ps.setString(2,ddireccion);
            ps.setString(3, cciudad);
            ps.setString(4,  ttelefono_fijo);
            ps.setString(5,  ccorreo_electronico);
            
            ps.executeUpdate();
            System.out.println("Dato insertado con exito");
        }
        catch (SQLException ex){
            System.out.println("Error al insertar datos");
            ex.printStackTrace();
            
        }
        
    }
    
    public void leerDatos(){
        String query="select * from sucursales;";
         try {
            Connection con=Conexion.conectar(); // Se establece la conexion con bd
            PreparedStatement ps=con.prepareStatement(query);// Se prepara el comando a realizar
            ResultSet rs=ps.executeQuery();
            while (rs.next()){// el bucle se va a ejecutar mientras que rs tenga registros
                int id=rs.getInt("id_sucursal");
                String celular=rs.getString("celular");
                String direccion=rs.getString("direccion");
                String ciudad=rs.getString("ciudad");
                String telefono_fijo=rs.getString("telefono_fijo");
                String correo_electronico=rs.getString("correo_electronico");
                System.out.println("id: "+ id+ "\ncelular: "+ celular+"\nDireccion:"+direccion+"\nCiudad: "+ciudad+"\nTelefono_fijo: "+ telefono_fijo+ " \nCorreo: "+ correo_electronico);
            }
            
         }
          catch (SQLException ex){
            System.out.println("Error al leer los datos");
            ex.printStackTrace();
            
        }
        
    }
    
    public void actualizarDatos(String ccelular, int id){
        String query="update sucursales set celular=? where id_sucursal=? ;";
        try {
            Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,ccelular);
            ps.setInt(2, id);
            
            ps.executeUpdate();
            System.out.println("Datos actualizados con exito");
        }
        catch (SQLException ex){
            System.out.println("Error al actualizar los datos");
            ex.printStackTrace();
            
        }
        
        
        
    }
    
    public void eliminarDatos(int id){
        String query="delete from sucursales where id_sucursal=? ;";
        try {
            Connection con=Conexion.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);
            
            
            ps.executeUpdate();
            System.out.println("Dato eliminado con exito");
        }
        catch (SQLException ex){
            System.out.println("Error al eliminar los datos");
            ex.printStackTrace();
            
        }
        
        
        
    }
    
    
}
