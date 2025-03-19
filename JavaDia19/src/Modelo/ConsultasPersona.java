
package Modelo;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ConsultasPersona extends Conexion{
    
     public boolean registrar(Persona pro) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "INSERT INTO usuarios (nombre, email) VALUES(?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getEmail());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(Persona pro) {
        PreparedStatement ps = null;
        Connection con = conectar();

        String sql = "UPDATE usuarios SET nombre=?,email=? WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getEmail());
            ps.setInt(3, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Persona pro) {
        PreparedStatement ps = null;
        Connection con = conectar();

        String sql = "DELETE FROM usuario WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscar(Persona pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM usuarios WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setId(Integer.parseInt(rs.getString("id")));
                pro.setNombre(rs.getString("nombre"));
                pro.setEmail(rs.getString("email"));
               return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public List<Persona> listar(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();
        List<Persona> datos= new ArrayList<>();
        String sql="select * from usuarios";
            try{
                ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    Persona p=new Persona();
                    p.setId(rs.getInt(1));
                    p.setNombre(rs.getString(2));
                    p.setEmail(rs.getString(3));
                    datos.add(p);
                    
                }
                
            }catch(Exception e){
            }
            return datos;
    }
    
}
