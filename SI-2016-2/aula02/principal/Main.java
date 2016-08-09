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
public class Main {
    public static void main(String args[]){
        Cliente c;
        c = new Cliente();
        
        c.nome = "João";
        c.id = 1;
        
        c.cc.id = 1;
        c.cc.depositar(1000);
        c.cc.sacar(100);
    }
}
