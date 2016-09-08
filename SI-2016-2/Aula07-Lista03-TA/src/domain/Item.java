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
public class Item {
    private int id;
    private String nome;
    private String descricao;
    private double valor;
    
    public static int nextId = 0;
    
    public Item(){
        this.id = Item.nextId;
        Item.nextId++;
        this.nome = "";
        this.descricao = "";
        this.valor = 0.0;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception{
        if(valor < 0)
            throw new Exception("Valor negativo!");
        else
            this.valor = valor;
    }
    
    
}
