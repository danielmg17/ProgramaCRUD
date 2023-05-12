/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.*;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author danie
 */

public class EmpleadosController implements ActionListener{
    
    
    frmVistaPrincipal VistaPrincipal;
    frmEmpleados VistaEmpleados;
    ModelEmpleados ModeloEmpleados;
    Conexion MiConexion;

    public EmpleadosController(frmVistaPrincipal VistaPrincipal, frmEmpleados VistaEmpleados, ModelEmpleados ModeloEmpleados, Conexion MiConexion) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEmpleados = VistaEmpleados;
        this.ModeloEmpleados = ModeloEmpleados;
        this.MiConexion = MiConexion;
        
        this.VistaPrincipal.btnEmpleados.addActionListener(this);
        this.VistaEmpleados.btnAgregar.addActionListener(this);
        this.VistaEmpleados.btnEditar.addActionListener(this);
        this.VistaEmpleados.btnActualizar.addActionListener(this);
        this.VistaEmpleados.btnEliminar.addActionListener(this);
        
        
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_VERT);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPrincipal.btnEmpleados){
            
            this.MiConexion.Conectar();
            this.VistaPrincipal.setVisible(false);
            this.VistaEmpleados.setLocationRelativeTo(VistaEmpleados);
            this.VistaEmpleados.setVisible(true);
        }        

    }
    
    
    
    
    
    
    
}
