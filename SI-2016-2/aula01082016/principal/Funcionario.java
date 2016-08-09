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
public class Funcionario {
    public int id;
    public String nome;
    public double salario;
    
    public Funcionario(){
        id = 0;
        nome = "";
    }
    public Funcionario(String nome){
        id = 0;
        this.nome = nome;
    }
    
    public double salarioLiquido(double percIR, double percINSS){
        double desconto;
        desconto = this.desconto(percIR);
        desconto += this.desconto(percINSS);
        return (salario - desconto);
    }
    public double salarioLiquido(int tipo, double perc){
        double desconto=0;
        if(tipo == 1)
            desconto = (salario*perc)/100;
        else if(tipo ==2){
            desconto = (salario*perc)/100;
        }
        return (salario - desconto);
    }
    public double desconto(double perc){
        return ((salario*perc)/100);
    }
}
