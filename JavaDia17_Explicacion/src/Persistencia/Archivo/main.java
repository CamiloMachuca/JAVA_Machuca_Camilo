
package Persistencia.Archivo;

import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        PersistenciaFile.guardarDatos("Hola mi nombre es camilo soy estudiante ");
        PersistenciaFile.leerDatos();
    }
    
}
