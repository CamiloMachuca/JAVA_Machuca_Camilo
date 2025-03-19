
package Controlador;

import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.ver;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class Controlador implements ActionListener {
    ConsultasPersona conPer=new ConsultasPersona();
    DefaultTableModel modelo2=new DefaultTableModel();
    private Persona persona;
    private final Persona modelo;
    private final ConsultasPersona consultas;
    private final ver vista;

    public Controlador(Persona modelo, ConsultasPersona consultas, ver vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnListar.addActionListener(this);

    }

    public void iniciar() {
        vista.setTitle("Productos");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnGuardar) {
        
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEmail(vista.txtEmail.getText());
           

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnModificar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEmail(vista.txtEmail.getText());
            
            

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnBuscar) {
             modelo.setId(Integer.parseInt(vista.txtId.getText()));

            if (consultas.buscar(modelo)) {
                vista.txtNombre.setText(modelo.getNombre());
                vista.txtEmail.setText(modelo.getEmail());
               

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
        if (e.getSource()== vista.btnListar){
            listar(vista.tabla);
            
        }
    }

    public void limpiar() {
        vista.txtId.setText(null);
        vista.txtNombre.setText(null);
        vista.txtEmail.setText(null);
    }
    public void listar(JTable tabla){
        modelo2.setRowCount(0);
        modelo2=(DefaultTableModel)tabla.getModel();
        List<Persona>lista=conPer.listar();
        Object[] object= new Object[4];
        for ( int i=0; i<lista.size(); i++){
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getNombre();
            object[2]=lista.get(i).getEmail();
            modelo2.addRow(object);
        }
        vista.tabla.setModel(modelo2);
    }
    
    
    
    
   
    
  
    
}
