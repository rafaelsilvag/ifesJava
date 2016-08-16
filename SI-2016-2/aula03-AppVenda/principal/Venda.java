/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Venda {
    public int id;
    public Cliente cliente;
    public ArrayList<Produto> lProdutos;
    public boolean fechada;
    
    public Venda(){
        lProdutos = new ArrayList<>();
        this.fechada = false;
    }
    
    public double valorTotal(){
        double soma=0;
        
        for(Produto x: lProdutos){
            soma += x.valor;
        }
        return soma;
    }
    public double valorTotal(double desc){
        double soma=0;
        
        for(Produto x: lProdutos){
            soma += x.valor;
        }
        return (soma-((soma*desc)/100));
    }
}
