
import Controladores.EmpleadosController;
import Modelos.*;
import Vistas.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author danie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal();
        frmEmpleados VistaEmpleados = new frmEmpleados(null, true);
        ModelEmpleados modeloEmpleado = new ModelEmpleados();
        Conexion MiConexion = new Conexion();
        
        
        EmpleadosController Levantar = new EmpleadosController(VistaPrincipal,VistaEmpleados, modeloEmpleado, MiConexion);
        
    }
    
}
