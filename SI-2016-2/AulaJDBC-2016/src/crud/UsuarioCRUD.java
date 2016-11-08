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
                            " VALUES(?,MD5(?),?);");
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getDescricao());
            pstm.execute();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    public void update(Connection conn, Usuario usuario){
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "UPDATE usuario "+
                    "  SET nome=?, senha=MD5(?), descricao=?"+
                    "  WHERE id=?;"
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
    public ArrayList<Usuario> read(Connection conn){
        ArrayList<Usuario> lista = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id,nome,senha,descricao"+
                    "  FROM usuario;"
            );
            ResultSet rst = pstm.executeQuery();
            while(rst.next()){
                Usuario aux = new Usuario();
                aux.setId(rst.getInt("id"));
                aux.setNome(rst.getString("nome"));
                aux.setSenha(rst.getString("senha"));
                aux.setDescricao(rst.getString("descricao"));
                lista.add(aux);
            }
            return lista;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return lista;
        }
    }
    public Usuario read(Connection conn, int id){
        Usuario aux = null;
        
        try{
            PreparedStatement pstm = conn.prepareStatement(
                    "SELECT id,nome,senha,descricao"+
                    "  FROM usuario"+
                    "  WHERE id=? LIMIT 1;"
            );
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();
            
            if(rst.next()){
                aux = new Usuario();
                aux.setId(rst.getInt("id"));
                aux.setNome(rst.getString("nome"));
                aux.setSenha(rst.getString("senha"));
                aux.setDescricao(rst.getString("descricao"));
                return aux;
            }else{
                return aux;
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return aux;
        }
    }
}
