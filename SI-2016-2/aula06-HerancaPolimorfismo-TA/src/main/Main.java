/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import crud.BlocoCRUD;
import crud.ClienteCRUD;
import crud.PedidoCRUD;
import domain.Bloco;
import domain.Cliente;
import domain.ClientePF;
import domain.ClientePJ;
import domain.Pedido;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Main {
    public static void main(String args[]){
        int opc;
        String aux;
        Pedido auxPedido;
        Cliente auxCliente;
        Bloco auxBloco;
        
        ClienteCRUD clientecrud = new ClienteCRUD();
        BlocoCRUD blococrud = new BlocoCRUD();
        PedidoCRUD pedidocrud = new PedidoCRUD();
        
        while(true){
            String menutxt;

            menutxt = "################# MENU ################\n";
            menutxt += " 1 - Cadastrar Cliente                \n";
            menutxt += " 2 - Cadastrar Bloco                  \n";
            menutxt += " 3 - Abrir  Pedido                    \n";
            menutxt += " 4 - Fechar Pedido                    \n";
            menutxt += " 5 - Exibir Clientes                  \n";
            menutxt += " 6 - Exibir Bloco                     \n";
            menutxt += " 7 - Exibir Pedido                    \n";
            menutxt += " 0 - Sair                             \n";
            menutxt += "######################################\n";
            menutxt += "Informe uma opção:                    \n";

            try{
            
                opc = Integer.parseInt(JOptionPane.showInputDialog(menutxt));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                break;
            }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                break;
            }
            if(opc == 0)
                break;
            else{
                switch(opc){
                    case 1:
                        int tipoCliente;
                        tipoCliente = Integer.parseInt(JOptionPane
                                .showInputDialog("Tipo de cliente (1)PF (2)PJ"));
                        if(tipoCliente == 1){
                            auxCliente = new ClientePF();
                            auxCliente.setId(Integer.parseInt(JOptionPane
                                    .showInputDialog("Informe o ID")));
                            auxCliente.setNome(JOptionPane
                                    .showInputDialog("Informe o nome"));
                            ((ClientePF)auxCliente).setCpf(JOptionPane
                                    .showInputDialog("Informe o CPF"));
                            ((ClientePF)auxCliente).setIdade(Integer.parseInt(
                                    JOptionPane.showInputDialog("Informe a idade")));
                            clientecrud.inserir(auxCliente);
                        }else if(tipoCliente == 2){
                            auxCliente = new ClientePJ();
                            auxCliente.setId(Integer.parseInt(JOptionPane
                                    .showInputDialog("Informe o ID")));
                            auxCliente.setNome(JOptionPane
                                    .showInputDialog("Informe o nome"));
                            ((ClientePJ)auxCliente).setCnpj(JOptionPane
                                    .showInputDialog("Informe o CNPJ"));
                            clientecrud.inserir(auxCliente);
                        }else{
                            JOptionPane.showMessageDialog(null, "Tipo Inválido");
                            break;
                        }
                    case 2:
                        auxBloco = new Bloco();
                        auxBloco.setId(Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID")));
                        auxBloco.setNome(JOptionPane
                                .showInputDialog("Informe o nome do bloco"));
                        auxBloco.setPeso(Double.parseDouble(JOptionPane
                                .showInputDialog("Informe o peso do bloco")));
                        auxBloco.setValor(Double.parseDouble(JOptionPane
                                .showInputDialog("Informe o valor do bloco")));;
                        blococrud.inserir(auxBloco);
                        break;
                    
                    case 3:
                        auxPedido = new Pedido();
                        auxPedido.setId(Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID")));
                        int auxID = Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID do cliente"));
                        
                        auxCliente = clientecrud.ler(auxID);
                        if(auxCliente != null)
                            auxPedido.setCliente(auxCliente);
                        else{
                            JOptionPane.showMessageDialog(null, "ID Cliente Inválido");
                            break;
                        }
                        auxID = Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID do bloco"));
                        auxBloco = blococrud.ler(auxID);
                        if(auxBloco != null)
                            auxPedido.setBloco(auxBloco);
                        else{
                            JOptionPane.showMessageDialog(null, "ID Bloco Inválido");
                            break;
                        }
                        
                }
            }
        }
    }
}
