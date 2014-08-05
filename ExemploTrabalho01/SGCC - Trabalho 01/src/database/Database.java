package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {

    private Connection conn=null;

    public Connection conectar() {
        try {
            this.conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/ifes", "rafaelguimaraes", "");
            return this.conn;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return this.conn;
        }
    }

    public void desconectar(Connection conn) {
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
