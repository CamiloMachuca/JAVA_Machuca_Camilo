
package javaconexionbasesdedatos;

import java.sql.*;

public class Conexion {

    static String url = "jdbc:mysql://localhost:3306/camiloJava";
    static String user = "root";
    static String password = "1090397640";


    public Conexion() {
    }

    public static Connection conectar() {
        Connection con = null;
        try {            
            // Establecer la conexión
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
            
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return con;
    }

   
}
