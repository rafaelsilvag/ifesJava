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
public class TestaAtualizadorDeContas {

    public static void main(String args[]) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas atualizador = new AtualizadorDeContas(0.05);
        atualizador.roda(c);
        atualizador.roda(cc);
        atualizador.roda(cp);
        System.out.println(atualizador.getSaldoTotal());
    }
}
