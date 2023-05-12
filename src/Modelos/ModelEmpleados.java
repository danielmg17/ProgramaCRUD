/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class ModelEmpleados {
    
    int codigo;
    String apellidos;
    String nombre;
    String Telefono;
    
    Conexion nuevaConexion;
    Connection MyConexion;
    ResultSet rst;

    public ModelEmpleados() {
    }

    public ModelEmpleados(int codigo, String apellidos, String nombre, String Telefono) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.Telefono = Telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    public ResultSet ListarDatos(){
        try{
            MyConexion = nuevaConexion.Conectar();
            Statement sentencia = MyConexion.createStatement();
            rst = sentencia.executeQuery("Select * from Empleados");
            return rst;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo Listar Empleados");
            return rst;
        }
    }
}
