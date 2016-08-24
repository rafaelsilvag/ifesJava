/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Produto {
    public static int nextId = 0;
    private int id;
    private String nome;
    private String desc;
    private double valor;

    public Produto(){
        
    }
    public Produto(int id){
        this.id = id;
    }
    public static void incNextId(){
        Cliente.nextID++;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    public void setValor(double valor){
        if(valor > 0)
            this.valor = valor;
        else
            JOptionPane.showMessageDialog(null, "Número inválido!");
    }
    public double getValor(){
        return this.valor;
    }
}
