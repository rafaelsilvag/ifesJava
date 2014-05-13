
import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String args[]) {
        String aux;
        double salarioHora, descInss, descIr = 0, salarioBruto, salarioLiquido;
        int horasTrabalhadas, qtdDependentes;
        //Recebendo informações do usuário.
        aux = JOptionPane.showInputDialog("Informe a valor de salário da hora");
        salarioHora = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas");
        horasTrabalhadas = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Informe a qtd de dependentes");
        qtdDependentes = Integer.parseInt(aux);
        //Calculo o salario bruto.
        salarioBruto = horasTrabalhadas * salarioHora + (50 * qtdDependentes);
        //Calcular o desconto do INSS.
        if (salarioBruto <= 1000) {
            descInss = (salarioBruto * 8.5) / 100;
        } else {
            descInss = (salarioBruto * 9) / 100;
        }
        //Calcular o desconto do imposto de renda
        if(salarioBruto <= 500){
            descIr = 0;
        }else if( salarioBruto > 500 && salarioBruto <= 1000){
            descIr = (salarioBruto * 5)/100;
        }else if( salarioBruto > 1000){
            descIr = (salarioBruto * 7)/100;
        }
        //Informa o salário líquido.
        salarioLiquido = salarioBruto - descInss - descIr;
        JOptionPane.showMessageDialog(null, "Salario Bruto: "+salarioBruto+
                "\nSalario Líquido: "+salarioLiquido+
                "\nDesconto INSS: "+descInss+
                "\nDesconto IR: "+descIr);
    }
}
