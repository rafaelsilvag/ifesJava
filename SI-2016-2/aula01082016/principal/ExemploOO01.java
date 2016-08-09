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
public class ExemploOO01 {

    public static void main(String args[]) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        double percIR = 0, percINSS = 0;
        Funcionario funcAux;
        
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
                    funcAux = new Funcionario();
                    funcAux.nome = JOptionPane.showInputDialog("Informe o nome");
                    funcAux.salario = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o salário"));
                    
                    funcAux.cargo.id = 1;
                    funcAux.cargo.descricao = "Teste";
                    
                    funcAux.imprimir();
                    listaFuncionarios.add(funcAux);
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
                    for(Funcionario f: listaFuncionarios){
                        aux += "Nome: "+f.nome+"\n";
                        aux += "Salário: "+f.salario+"\n";
                        aux += "Cargo: "+f.cargo.descricao+"\n";
                    }
                    aux += "##########################################";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 5:
                    // Imprimir o salário líquido dos funcionarios
                    double desconto=0;
                    aux = "##########################################\n";
                    for(Funcionario f: listaFuncionarios){
                        aux += "Nome: "+f.nome+"\n";
                        aux += "Salário: "+f.salarioLiquido(percIR)+"\n";
                    }
                    aux += "##########################################";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 6:
                    // Imprimir o Desconto de IR de cada Funcionário
                    double descontoIR=0;
                    aux = "##########################################\n";
                    for(int i=0;i<listaNomes.size();i++){
                        aux += "Nome: "+listaNomes.get(i)+"\n";
                        descontoIR = (listaSalarios.get(i)*percIR)/100;
                        aux += "Desconto IR: "+descontoIR+"\n";
                    }
                    aux += "##########################################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 7:
                    // Imprimir o Desconto de IR de cada Funcionário
                    double descontoINSS=0;
                    aux = "##########################################\n";
                    for(int i=0;i<listaNomes.size();i++){
                        aux += "Nome: "+listaNomes.get(i)+"\n";
                        descontoINSS = (listaSalarios.get(i)*percINSS)/100;
                        aux += "Desconto IR: "+descontoINSS+"\n";
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
