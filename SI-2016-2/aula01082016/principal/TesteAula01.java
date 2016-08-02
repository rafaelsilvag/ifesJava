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
public class TesteAula01 {

    public static void main(String args[]) {
        int opc;
        String menutxt = "";
        double salario = 0, percIr = 0, percInss = 0, salarioLiquido = 0;

        menutxt = "################ MENU ################\n";
        menutxt += "1 - Cadastrar Salário                \n";
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

            switch (opc) {
                case 1:
                    salario = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o salário:"));
                    break;
                case 2:
                    percIr = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o percentual do IR"));
                    break;
                case 3:
                    percInss = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o percentual do INSS"));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,
                            "Salario Bruto: " + salario);
                    break;
                case 5:
                    // Retirar o valor do IR
                    salarioLiquido = salario - ((salario * percIr) / 100);
                    // Retirar o valor do INSS
                    salarioLiquido -= ((salario * percInss) / 100);

                    JOptionPane.showMessageDialog(null,
                            "Salário Líquido: " + salarioLiquido);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, 
                            "Percentual do IR: "+((salario*percIr)/100));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, 
                            "Percentual do INSS: "+((salario*percInss)/100));
                    break;
                case 8:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção Inválida!");
            }

        } while (opc != 8);
    }
}
