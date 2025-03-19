
package Modelo;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Conexion {
    private String URL="jdbc:mysql://bq2unbq3itevqewadxmt-mysql.services.clever-cloud.com:3306/bq2unbq3itevqewadxmt";
    private String USUARIO= "udspkjxc1jqwwtjb";
    private String PASSWORD= "kZYb2u5uE72u9ypmTq64";

    public Connection conectar(){
        Connection con = null;

        try {            
            // Establecer la conexión
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa");
            
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return con;    
    };
     
    
}
