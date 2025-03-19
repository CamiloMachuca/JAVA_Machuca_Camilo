/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadia20_explicacion;

import Modelo.UsuarioDAO;
import controlador.UsuarioControlador;
import vista.UsuarioVista;

/**
 *
 * @author Uniminuto Tibu
 */
public class JavaDia20_Explicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioVista usuarioVista = new UsuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO,usuarioVista);

        usuarioControlador.iniciar();
        
    }
    
}
