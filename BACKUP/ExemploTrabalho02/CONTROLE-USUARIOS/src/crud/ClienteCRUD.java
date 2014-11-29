
package crud;

import java.util.ArrayList;
import domain.Cliente;
import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteCRUD {
    public void inserir(Cliente cli){
        Connection conn;
        Database db = new Database();
        conn = db.conectar();
        
        try{
            PreparedStatement stmt = conn.prepareStatement(
                                "INSERT INTO cliente(nome,endereco,cidade) "+
                                "VALUES (?,?,?);");
            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getEndereco());
            stmt.setString(3, cli.getCidade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso...");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ArrayList<Cliente> ler(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        return listaClientes;
    }
    public void atualizar(Cliente cli){
        
    }
    public void deletar(Cliente cli){
        
    }
}
