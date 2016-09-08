package domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Fatura {
    private int id;
    private Item item;
    private int qtdItem;
    
    public static int nextId = 0;

    public Fatura(){
        this.id = Fatura.nextId;
        Fatura.nextId++;
        this.item = null;
        this.qtdItem = 0;
    }
    public double getValorTotal(){
        return (item.getValor() * qtdItem);
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

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) throws Exception {
        if(qtdItem < 0)
            throw new Exception("Quantidade negativa!");
        else
            this.qtdItem = qtdItem;
    } 
}
