/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class ExemploOO02 {

    public static void main(String args[]) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        double percIR = 0, percINSS = 0;

        Funcionario f;
        String aux = "";
        String nome;
        int opc = 0;

        String menutxt = "";

        menutxt = "################ MENU ################\n";
        menutxt += "1 - Cadastrar Nome/Salário           \n";
        menutxt += "2 - Cadastrar perc. de imp de Renda  \n";
        menutxt += "3 - Cadastrar percentual de INSS     \n";
        menutxt += "4 - Exibir valor de Salário Bruto    \n";
        menutxt += "5 - Exibir valor de Salário Liquido  \n";
        menutxt += "6 - Exibir percentual de IR          \n";
        menutxt += "7 - Exibir percentual de INSS        \n";
        menutxt += "8 - Sair                             \n";
        menutxt += "######################################\n";
        menutxt += "Informe uma opção:                   \n";

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menutxt));
            switch (opc){
                case 1:
                    // Cadastro do funcionario
                    f = new Funcionario();
                    f.nome = JOptionPane.showInputDialog("Informe o nome");
                    f.salario = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o salário"));
                    
                    listaFuncionarios.add(f);
                    break;
                case 2:
                    // Percentual de imposto de Renda
                    percIR = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o percentual do IR"));
                    break;
                case 3:
                    // Percentual de INSS
                    percINSS = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o percentual do INSS"));
                    break;
                case 4:
                    // Imprimir o salário bruto dos funcionarios
                    aux = "##########################################\n";
                    for(Funcionario x: listaFuncionarios){
                        aux += "Nome: "+x.nome+"\n";
                        aux += "Salário: "+x.salario+"\n";
                    }
                    aux += "##########################################";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 5:
                    // Imprimir o salário líquido dos funcionarios
                    double desconto=0;
                    aux = "##########################################\n";
                    for(Funcionario x: listaFuncionarios){
                        aux += "Nome: "+x.nome+"\n";
                        aux += "Salário: "+(x.salarioLiquido(2,percIR))+"\n";
                    }
                    aux += "##########################################";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 6:
                    // Imprimir o Desconto de IR de cada Funcionário
                    aux = "##########################################\n";
                    for(Funcionario x: listaFuncionarios){
                        aux += "Nome: "+x.nome+"\n";
                        aux += "Desconto IR: "+x.desconto(percIR)+"\n";
                    }
                    aux += "##########################################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 7:
                    // Imprimir o Desconto de INSS de cada Funcionário
                    double descontoINSS=0;
                    aux = "##########################################\n";
                    for(Funcionario x: listaFuncionarios){
                        aux += "Nome: "+x.nome+"\n";
                        aux += "Desconto IR: "+x.desconto(percINSS)+"\n";
                    }
                    aux += "##########################################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 8:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        } while (opc != 8);
    }
}
