/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Cliente {
    public int id;
    public String nome;
    public ContaCorrente cc;
    
    public Cliente(){
        id = 0;
        nome = "";
        cc = new ContaCorrente();
    }
}
