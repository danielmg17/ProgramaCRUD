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
public class Conexion {
    
    Connection Conexion;
    
    public Connection conectar(String user, String pass){
        
        try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        
        String nombre_servidor="168.234.74.80";
        String numero_puerto="1521";
        String sid="umg";
        String url="jdbc:oracle:thin:@"+nombre_servidor+":"+numero_puerto+":"+sid;
        
        Conexion=DriverManager.getConnection(url,"HA5","Umg$2023");
       // return Conexion;
        JOptionPane.showMessageDialog(null,"Conexion Exitosa");
          return Conexion;
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Fallo En La Conexion"+ e);
        
        }
        
        return Conexion;
    }
}
