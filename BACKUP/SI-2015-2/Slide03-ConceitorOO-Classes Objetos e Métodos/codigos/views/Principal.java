package views;

import domain.Aluno;
import domain.Funcionario;
import domain.Imposto;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]){
        int opc;
        String aux;

        Funcionario funcionario = new Funcionario();
        
        while(true){
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(
                                "##########  MENU  ########## \n"+
                                "1 - Cadastrar Funcionário    \n"+
                                "2 - Cadastrar IR             \n"+
                                "3 - Cadastrar INSS           \n"+
                                "4 - Visualizar Sal. Bruto    \n"+
                                "5 - Visualizar Sal. Líquido  \n"+
                                "6 - Visualizar valor de IR   \n"+
                                "7 - Visualizar valor de INSS \n"+
                                "8 - Sair                     \n"        
                ));
                switch(opc){
                    case 1:
                        aux = JOptionPane.showInputDialog("Informe o nome");
                        funcionario.setNome(aux);
                        aux = JOptionPane.showInputDialog("Informe o salario");
                        funcionario.setSalario(Double.parseDouble(aux));
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Informe o % de IR");
                        break;
                    case 3:
                        Imposto imposto = new Imposto();
                        aux = JOptionPane.showInputDialog("Informe o % de INSS");
                        imposto.setPercentual(Double.parseDouble(aux));
                        aux = JOptionPane.showInputDialog("Informe a descrição do imposto");
                        imposto.setDescricao(aux);
                        funcionario.setInss(imposto);
                        break;
                    case 4:
                        Imposto imposto2 = new Imposto();
                        JOptionPane.showMessageDialog(null, "Salário Bruto: "+salario);
                        break;
                    case 5:
                        salarioLiquido=salario - (((salario*percentualIr)/100)+ ((salario*percentualIr)/100));
                        JOptionPane.showMessageDialog(null, "Salário Liquido: "+salarioLiquido);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Percentual IR: "+percentualIr);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Percentual de INSS: "+percentualInss);
                        break;
                    case 8:
                        System.exit(0);
    
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Informe uma opção válida.");
            }
        }
    }
}
