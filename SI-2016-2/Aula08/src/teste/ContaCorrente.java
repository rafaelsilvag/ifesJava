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
public class ContaCorrente extends Conta {

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
