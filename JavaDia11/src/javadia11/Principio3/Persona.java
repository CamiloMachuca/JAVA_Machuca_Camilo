
package javadia11.Principio3;


public class Persona {
    // Principio de substitucion de Liskou
    
    private String nombre;
    private String apellidos;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Persona( String nombre, String apellidos) {
        super();
 
        this.nombre = nombre;
        this.apellidos = apellidos;
 
    }
    
}
