/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;

/**
 *
 * @author rafael
 */
public class DatabaseMySQL implements Database {

    @Override
    public Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void desconectar(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
