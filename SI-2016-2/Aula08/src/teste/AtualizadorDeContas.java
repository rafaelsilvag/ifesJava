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
public class AtualizadorDeContas {

    public double saldoTotal;
    public double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
        this.saldoTotal = 0;
    }

    public void roda(Conta c) {
        // 1 − Imprime o saldo Anterior ;
        System.out.println(c.getSaldo());
        // 2 − Atualiza a conta e depois imprime o saldo final
        c.atualiza(selic);
        System.out.println(c.getSaldo());
        // 3 − Lembrar de Somar o saldo final ao atributo Saldo Total
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
}
