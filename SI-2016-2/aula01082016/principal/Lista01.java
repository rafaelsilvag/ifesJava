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
public class Lista01 {
    public static void main(String args[]){
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<Double> listaSalarios = new ArrayList<>();
        String aux = "";
        String nome;
        int opc = 0;
        
        String menutxt = "";

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
            
            }
        } while (opc != 8);
    }
}
