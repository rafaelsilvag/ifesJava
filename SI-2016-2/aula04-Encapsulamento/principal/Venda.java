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
    private int id;
    private Cliente cliente;
    private ArrayList<Produto> lProdutos;
    private boolean fechada;
    
    public Venda(){
        lProdutos = new ArrayList<>();
        this.fechada = false;
    }
    public double totalVenda(){
        double soma=0;
        for(Produto x: lProdutos){
            soma += x.getValor();
        }
        return soma;
    }
    public double totalVenda(double d){
        double soma=0;
        for(Produto x: lProdutos){
            soma += x.getValor();
        }
        return (soma-((soma*d)/100));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getlProdutos() {
        return lProdutos;
    }

    public void setlProdutos(ArrayList<Produto> lProdutos) {
        this.lProdutos = lProdutos;
    }

    public boolean isFechada() {
        return fechada;
    }

    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }
    
}
