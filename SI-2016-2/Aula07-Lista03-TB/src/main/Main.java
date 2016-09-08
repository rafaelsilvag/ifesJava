/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Fatura;
import domain.Item;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Main {
    public static void main(String args[]){
        int opc;
        String menu = "";
        String aux;
        ArrayList<Item> lstItens = new ArrayList<>();
        ArrayList<Fatura> lstFaturas = new ArrayList<>();
        
        menu += "#############################\n";
        menu += " 1 - Faturar Item            \n";
        menu += " 2 - Cadastrar Item          \n";
        menu += " 3 - Imprimir Faturas        \n";
        menu += " 4 - Imprimir Itens          \n";
        menu += " 0 - Sair                    \n";
        menu += "#############################\n";
        
        while(true){
            try{
                opc = Integer.parseInt(JOptionPane
                        .showInputDialog(menu));
                if(opc == 0)
                    break;
                switch(opc){
                    case 1:
                        Fatura f = new Fatura();
                        int idItemAux;
                        
                        idItemAux = Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID do Item"));
                        for(Item i: lstItens){
                            if(i.getId() == idItemAux){
                                f.setItem(i);
                                break;
                            }
                        }
                        f.setQtdItem(Integer.parseInt(JOptionPane
                                .showInputDialog("Quantidade de itens")));
                        lstFaturas.add(f);
                        break;
                    case 2:
                        Item i = new Item();
                        i.setNome(JOptionPane
                                .showInputDialog("Informe o nome"));
                        i.setDescricao(JOptionPane
                                .showInputDialog("Descrição do item"));
                        i.setValor(Double.parseDouble(JOptionPane
                                .showInputDialog("Informe o valor do item")));
                        
                        lstItens.add(i);
                        break;
                    case 3:
                        aux="##########################################\n";
                        for(Fatura fat: lstFaturas){
                            aux += "ID Fatura: "+fat.getId()+"\n";
                            aux += "Nome item: "+fat.getItem().getNome()+"\n";
                            aux += "Valor item: "+fat.getItem().getValor()+"\n";
                            aux += "Quantidade: "+fat.getQtdItem()+"\n";
                            aux += "Valor total: "+fat.getValorTotal()+"\n";
                            aux += "---------------------------------------\n";
                        }
                        JOptionPane.showMessageDialog(null, aux);
                        break;
                    case 4:
                        aux="##########################################\n";
                        for(Item itens: lstItens){
                            aux += "ID Item: "+itens.getId()+"\n";
                            aux += "Nome: "+itens.getNome()+"\n";
                            aux += "Descrição: "+itens.getDescricao()+"\n";
                            aux += "Valor: "+itens.getValor()+"\n";
                            aux += "---------------------------------------\n";
                        }
                        JOptionPane.showMessageDialog(null, aux);
                        break;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Não é permitido valores negativos!");
            }
        }
    }
}
