/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Produto {
    protected String nome;
    protected double preco;
    protected String codigoBarras;
    
    public Produto(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    public boolean comparar(Produto p){
        return this.codigoBarras.equals(p.codigoBarras);
    }
}
