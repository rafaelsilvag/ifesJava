
package crud;

import java.sql.Connection;
import domain.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioCRUD {
    public boolean criar(Connection conn, Usuario usuario ){
        try{
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO usuario(nome,senha)"
                    + " VALUES(?,MD5(?));");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            return stmt.execute();
        }catch(SQLException ex){
            return false;
        }
    }
    public ArrayList<Usuario> ler(Connection conn){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try{
            PreparedStatement stmt = conn.prepareStatement(
                            "SELECT id,nome,senha "
                            + "FROM usuario;");
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next()){
                Usuario aux = new Usuario();
                aux.setId(resultado.getInt("id"));
                aux.setUsuario(resultado.getString("nome"));
                aux.setSenha(resultado.getString("senha"));
                
                listaUsuarios.add(aux);
            }
            return listaUsuarios;
        }catch(SQLException ex){
            return null;
        }
    }
    public Usuario ler(Connection conn, Usuario usuario){
        try{
            PreparedStatement stmt = conn.prepareStatement(
                            "SELECT id,nome,senha "
                            + "FROM usuario WHERE nome=? LIMIT 1;");
            stmt.setString(1, usuario.getUsuario());
            ResultSet resultado = stmt.executeQuery();
            if(resultado.next()){
                Usuario aux = new Usuario();
                aux.setId(resultado.getInt("id"));
                aux.setUsuario(resultado.getString("nome"));
                aux.setSenha(resultado.getString("senha"));
                return aux;
            }else{
                return null;
            }
        }catch(SQLException ex){
            return null;
        }
    }
    public boolean atualizar(Connection conn, Usuario usuario){
        try{
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE usuario" +
                    "   SET nome=?, senha=?, descricao=?" +
                    " WHERE id=?;");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getDescricao());
            stmt.setInt(4, usuario.getId());
            return stmt.execute();
        }catch(SQLException ex){
            return false;
        } 
    }
    public boolean deletar(Connection conn, Usuario usuario){
        try{
            PreparedStatement stmt = conn.prepareStatement(
                    "DELETE FROM usuario" +
                    " WHERE id=?;");
            stmt.setInt(1, usuario.getId());
            return stmt.execute();
        }catch(SQLException ex){
            return false;
        }     
    }
}