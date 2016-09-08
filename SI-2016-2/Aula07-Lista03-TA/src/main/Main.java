/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Fatura;
import domain.Item;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Main {
    public static void main(String args[]){
        String aux;
        String menu = "";
        int opc;
        ArrayList<Item> lstItens = new ArrayList<>();
        ArrayList<Fatura> lstFaturas = new ArrayList<>();
        
        menu = "############################\n";
        menu += "1 - Cadastrar Item         \n";
        menu += "2 - Cadastrar Fatura       \n";
        menu += "3 - Imprimir itens         \n";
        menu += "4 - Imprimir faturas       \n";
        menu += "0 - Sair                   \n";
        menu += "############################\n";
        
        while(true){
            try{
                opc = Integer.parseInt(JOptionPane
                        .showInputDialog(menu));
                if(opc == 0)
                    break;
                switch(opc){
                    case 1:
                        Item item = new Item();
                        item.setNome(JOptionPane
                                .showInputDialog("Informe o nome"));
                        item.setDescricao(JOptionPane
                                .showInputDialog("Descrição do item"));
                        item.setValor(Double.parseDouble(JOptionPane
                                .showInputDialog("Valor do item")));
                        lstItens.add(item);
                        break;
                    case 2:
                        Fatura fatura = new Fatura();
                        int auxIdItem;
                        auxIdItem = Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o id do item"));
                        for(Item i: lstItens){
                            if(i.getId() == auxIdItem){
                                fatura.setItem(i);
                                break;
                            }
                        }
                        fatura.setQtdItens(Integer.parseInt(JOptionPane
                                .showInputDialog("Informe a quantidade")));
                        
                        lstFaturas.add(fatura);
                        break;
                    case 3:
                        aux = "##################################\n";
                        for(Item i: lstItens){
                            aux += "ID: "+i.getId()+"\n";
                            aux += "NOME: "+i.getNome()+"\n";
                            aux += "DESCRIÇÃO: "+i.getDescricao()+"\n";
                            aux += "VALOR: "+i.getValor()+"\n";
                            aux += "--------------------------------------\n";
                        }
                        JOptionPane.showMessageDialog(null, aux);
                        break;
                    case 4:
                        aux = "##################################\n";
                        for(Fatura f: lstFaturas){
                            aux += "ID: "+f.getId()+"\n";
                            aux += "NOME ITEM: "+f.getItem().getNome()+"\n";
                            aux += "VALOR ITEM: "+f.getItem().getValor()+"\n";
                            aux += "QTD ITENS: "+f.getQtdItens()+"\n";
                            aux += "VALOR TOTAL: "+f.getValorTotal()+"\n";
                            aux += "--------------------------------------\n";
                        }
                        JOptionPane.showMessageDialog(null, aux);
                        break;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
