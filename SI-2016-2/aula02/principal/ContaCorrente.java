/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class ContaCorrente {
    public int id;
    private double saldo;
    
    public void depositar(double d){
        saldo += d;
    }
    public void sacar(double d){
        if(d > saldo){
            JOptionPane.showMessageDialog(null, "Sua conta não tem saldo!");
        }else{
            saldo -= d;
        }
    }
}
