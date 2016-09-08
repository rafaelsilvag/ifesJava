/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Fatura {
    private int id;
    private Item item;
    private int qtdItens;
    
    public static int nextId = 0;

    public Fatura(){
        this.id = Fatura.nextId;
        Fatura.nextId++;
        this.item = null;
        this.qtdItens = 0;
    }
    
    public double getValorTotal(){
        return (this.item.getValor() * this.qtdItens);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) throws Exception{
        if(qtdItens < 0)
            throw new Exception("Quantidade negativa!");
        else
            this.qtdItens = qtdItens;
    }
    
}
