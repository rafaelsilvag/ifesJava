/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import domain.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class UsuarioCRUD {
    public void create(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "INSERT INTO usuario(nome, senha, descricao)"+
                    " VALUES(?,?,?);"
            );
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getDescricao());
            
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        
    }
    public ArrayList<Usuario> read(Connection conn){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT nome, senha, descricao"+
                    " FROM usuario"+
                    " GROUP BY nome;"
            );
            ResultSet rset = pstm.executeQuery();
            while(rset.next()){
                Usuario aux = new Usuario();
                aux.setId(rset.getInt("id"));
                aux.setNome(rset.getString("nome"));
                aux.setSenha(rset.getString("senha"));
                aux.setDescricao(rset.getString("descricao"));
                
                listaUsuarios.add(aux);
            }
            return listaUsuarios;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaUsuarios;
        }
    }
    public Usuario read(Connection conn, int id){
        Usuario aux = null;
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT nome, senha, descricao"+
                    " FROM usuario"+
                    " WHERE id=?"+
                    " LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rset = pstm.executeQuery();
            if(rset.next()){
                aux = new Usuario();
                aux.setId(rset.getInt("id"));
                aux.setNome(rset.getString("nome"));
                aux.setSenha(rset.getString("senha"));
                aux.setDescricao(rset.getString("descricao"));
                
                return aux;
            }else{
                return aux;
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return aux;
        }
    }
    public void update(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE usuario"+
                    " SET nome=?, senha=MD5(?), descricao=?"+
                    " WHERE id=?;"
            );
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getDescricao());
            pstm.setInt(4, usuario.getId());
            
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    public void delete(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "DELETE FROM usuario"+
                    "  WHERE id=?;"
            );
            pstm.setInt(1, usuario.getId());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
}
