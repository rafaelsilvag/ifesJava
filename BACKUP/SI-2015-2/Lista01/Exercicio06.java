
import javax.swing.JOptionPane;


public class Exercicio06 {
    public static void main(String args[]){
        int opc;
        double salario=0, salarioLiquido=0, percentualIr=0, percentualInss=0;
        String aux;
        
        while(true){
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(
                                "##########  MENU  ########## \n"+
                                "1 - Cadastrar Salário        \n"+
                                "2 - Cadastrar % de IR        \n"+
                                "3 - Cadastrar % de INSS      \n"+
                                "4 - Visualizar Sal. Bruto    \n"+
                                "5 - Visualizar Sal. Líquido  \n"+
                                "6 - Visualizar valor de IR   \n"+
                                "7 - Visualizar valor de INSS \n"+
                                "8 - Sair                     \n"        
                ));
                switch(opc){
                    case 1:
                        aux = JOptionPane.showInputDialog("Informe o salário");
                        salario = Double.parseDouble(aux);
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Informe o % de IR");
                        percentualIr = Double.parseDouble(aux);
                        break;
                    case 3:
                        aux = JOptionPane.showInputDialog("Informe o % de INSS");
                        percentualInss = Double.parseDouble(aux);
                        break;
                    case 4:
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
