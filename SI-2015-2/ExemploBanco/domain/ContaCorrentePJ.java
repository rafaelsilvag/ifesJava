/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


public class ContaCorrentePJ extends ContaCorrente {
    
    @Override
    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + (valor * 0.98));
    }
}
