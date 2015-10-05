/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabasePostgreSQL implements Database {
    private Connection conn;
    
    public Connection conectar(){
        try{
            this.conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/rafael", "rafael","");
            return this.conn;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public void desconectar(Connection conn){
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao desconectar: "+ex.getMessage());
        }
    }
}
