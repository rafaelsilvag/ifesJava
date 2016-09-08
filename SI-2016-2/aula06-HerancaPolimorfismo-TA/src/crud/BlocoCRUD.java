/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Bloco;
import java.util.ArrayList;
import database.Database;
/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class BlocoCRUD {
    public void inserir(Bloco bloco){
        Database.lstBlocos.add(bloco);
    }
    public ArrayList<Bloco> ler(){
        return Database.lstBlocos;
    }
    public Bloco ler(int id){
        for(Bloco b: Database.lstBlocos){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }
    public void atualizar(int id, Bloco bloco){
        for(Bloco b: Database.lstBlocos){
            if(b.getId() == id){
                b.setId(bloco.getId());
                b.setPeso(bloco.getPeso());
                b.setValor(bloco.getValor());
                break;
            }
        }
    }
    public void remover(Bloco bloco){
        Database.lstBlocos.remove(bloco);
    }
}
