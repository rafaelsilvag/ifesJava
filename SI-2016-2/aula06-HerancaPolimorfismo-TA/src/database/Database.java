/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.Bloco;
import domain.Cliente;
import domain.Pedido;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Database {
    public static ArrayList<Bloco> lstBlocos = new ArrayList<>();
    public static ArrayList<Cliente> lstClientes = new ArrayList<>();
    public static LinkedList<Pedido> filaPedidos = new LinkedList<>();
}
