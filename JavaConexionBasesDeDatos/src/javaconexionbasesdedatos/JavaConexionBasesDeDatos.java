
package javaconexionbasesdedatos;

import java.sql.SQLException;

public class JavaConexionBasesDeDatos {

    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Crud operaciones=new Crud();
        // operaciones.insertarDato("1111111", "camilllllin", "cucuta", "12345678", "camilovega@gmail.com");
        // operaciones.leerDatos();
        // operaciones.actualizarDatos("31111111", 1);
        operaciones.eliminarDatos(3);
        operaciones.leerDatos();
        
        
    }
    
}
