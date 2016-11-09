/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class DatabasePostresql implements Database {
    
    private String usuario = "rafael";
    private String senha = "";
    private String ipaddress = "127.0.0.1";
    private String database = "ifes";
    private String url = "jdbc:postgresql://";
    
    @Override
    public Connection connect() {
        try{
            Connection conn;
            url += ipaddress+"/"+database;
            conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public void disconnect(Connection conn) {
        try{
            conn.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
}
