package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class DatabasePGSQL implements Database{
    
    private Connection conn = null;
    private String endereco = "127.0.0.1";
    private String usuario = "postgres";
    private String senha = "postgres";
    private String database = "ifes";
    private String url = "jdbc:postgres://";
           
    @Override
    public Connection conectar() {
        try{
            url += endereco + "/" + database;
            this.conn = DriverManager.getConnection(url, usuario, senha);
            return this.conn;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return this.conn;
        }
    }

    @Override
    public void desconectar(Connection conn) {
        try{
            conn.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
}
