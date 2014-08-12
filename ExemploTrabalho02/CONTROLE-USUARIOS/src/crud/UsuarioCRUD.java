package crud;

import domain.Usuario;
import java.sql.Connection;
import database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioCRUD {

    public void inserir(Usuario usuario) {
        Connection conn;
        Database db = new Database();
        conn = db.conectar();

        try {
            //Preparo a String SQL a ser executada.
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO usuario(nome,senha)"
                    + " VALUES(?,MD5(?));");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            // Executar a query SQL
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario criado com sucesso...");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public ArrayList<Usuario> ler() {
        Connection conn;
        Database db = new Database();
        conn = db.conectar();
        ResultSet resultado;
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        try{
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT nome,senha"
                            + " FROM usuario;");
            //Executa a query SQL do tipo SELECT
            resultado = stmt.executeQuery();
            
            //Percorrer todo o resultado do comando SELECT
            while(resultado.next()){
                //Instância de um novo objeto do tipo Usuario
                Usuario usuario = new Usuario();
                //Modifico os atributos do objeto em questão.
                usuario.setNome(resultado.getString("nome"));
                usuario.setSenha(resultado.getString("senha"));
                //Adiciono o objeto usuário criado para a lista listaUsuarios
                listaUsuarios.add(usuario);
            }
            //Retorno a lista de usuários criada.
            return listaUsuarios;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return listaUsuarios;
        }
    }

    public void atualizar(Usuario usuario) {
        Connection conn;
        Database db = new Database();
        conn = db.conectar();

        try {
            //Preparo a String SQL a ser executada.
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE FROM usuario"
                    + " SET senha = ? WHERE nome = ?;");
            stmt.setString(1, usuario.getSenha());
            stmt.setString(2, usuario.getNome());
            // Executar a query SQL
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso...");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void deletar(Usuario usuario) {
        Connection conn;
        Database db = new Database();
        conn = db.conectar();

        try {
            //Preparo a String SQL a ser executada.
            PreparedStatement stmt = conn.prepareStatement(
                    "DELETE FROM usuario"
                    + " WHERE nome = ?;");
            stmt.setString(1, usuario.getNome());
            // Executar a query SQL
            JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso...");
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
