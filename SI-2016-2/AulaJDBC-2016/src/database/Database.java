/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public interface Database {
    public Connection conectar();
    public void desconectar(Connection conn);
}
