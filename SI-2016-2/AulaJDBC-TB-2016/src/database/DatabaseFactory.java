/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class DatabaseFactory {
    public static Database getDatabase(String type){
        if(type.equals("postgresql")){
            return new DatabasePostresql();
        }else if(type.equals("mysql")){
            return new DatabaseMysql();
        }else{
            return new DatabasePostresql();
        }
    }
}
