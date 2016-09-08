/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import crud.*;
import domain.*;
import domain.ClientePF;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Main {
    public static void main(String args[]){
        int opc;
        String aux;
        Cliente auxCliente;
        Pedido auxPedido;
        Bloco auxBloco;
        
        ClienteCRUD clientecrud = new ClienteCRUD();
        BlocoCRUD blococrud = new BlocoCRUD();
        PedidoCRUD pedidocrud = new PedidoCRUD();
        
        String menutxt;

        menutxt = "################# MENU ################\n";
        menutxt += " 1 - Cadastrar Cliente                \n";
        menutxt += " 2 - Cadastrar Bloco                  \n";
        menutxt += " 3 - Abrir  Pedido                    \n";
        menutxt += " 4 - Fechar Pedido                    \n";
        menutxt += " 5 - Exibir Clientes                  \n";
        menutxt += " 6 - Exibir Blocos                    \n";
        menutxt += " 7 - Exibir Pedidos                   \n";
        menutxt += " 0 - Sair                             \n";
        menutxt += "######################################\n";
        menutxt += "Informe uma opção:";
        
        while(true){
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog(menutxt));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                opc = 20;
            }
            if (opc == 0){
                break;
            }else{
                switch(opc){
                    case 1:
                        int tipoCliente = Integer.parseInt(JOptionPane
                                .showInputDialog("Tipo de cliente (1)PF (2)PJ"));
                        if(tipoCliente == 1){
                            auxCliente = new ClientePF();
                            auxCliente.setId(Integer.parseInt(JOptionPane
                                    .showInputDialog("Informe o ID")));
                            auxCliente.setNome(JOptionPane
                                    .showInputDialog("Informe o Nome"));
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
                                    .showInputDialog("Informe o Nome"));
                            ((ClientePJ)auxCliente).setCnpj(JOptionPane
                                    .showInputDialog("Informe o CNPJ"));
                            clientecrud.inserir(auxCliente);
                        }else{
                            JOptionPane.showMessageDialog(null, "Opção Inválida");
                            break;
                        }
                        break;
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
                        break;
                    case 4:
                        auxPedido = pedidocrud.remover();
                        JOptionPane.showMessageDialog(null, 
                                "Número do pedido: "+auxPedido.getId()+
                                "Nome do cliente: "+auxPedido.getCliente().getNome()+
                                "ID do bloco: "+auxPedido.getBloco().getId()
                        );
                        break;
                    case 5:
                        aux = "";
                        for(Cliente c: clientecrud.ler()){
                            aux += "####################################\n";
                            aux += "ID: "+c.getId()+"\n";
                            aux += "Nome: "+c.getNome()+"\n";
                            if(c instanceof ClientePF){
                                aux += "CPF: "+((ClientePF) c).getCpf()+"\n";
                                aux += "Idade: "+((ClientePF) c).getIdade()+"\n";
                            }else if(c instanceof ClientePJ){
                                aux += "CPF: "+((ClientePJ) c).getCnpj()+"\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, aux);
                        break;
                }
            }
        }
    }
}
