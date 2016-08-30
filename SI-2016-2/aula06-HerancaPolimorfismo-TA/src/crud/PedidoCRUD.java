/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import domain.Pedido;
import database.Database;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class PedidoCRUD {
    public void inserir(Pedido pedido){
        Database.filaPedidos.addLast(pedido);
    }
    public LinkedList<Pedido> ler(){
        return Database.filaPedidos;
    }
    public Pedido remove(){
        return Database.filaPedidos.removeFirst();
    }
}
