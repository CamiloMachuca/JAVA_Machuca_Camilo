
package Crud;

import Controlador.Controlador;
import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.ver;


public class CrudMain {
    public static void main(String[] args) {
        Persona mode=new Persona();
        ConsultasPersona modc= new ConsultasPersona();
        ver frm=new ver();
        
        Controlador ctrol=new Controlador(mode, modc,frm);
        ctrol.iniciar();
        frm.setVisible(true);
        
    }
    
}
