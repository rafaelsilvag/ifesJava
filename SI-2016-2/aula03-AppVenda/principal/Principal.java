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
public class Principal {

    public static void main(String args[]) {
        ArrayList<Venda> lstVendas = new ArrayList<>();
        ArrayList<Produto> lstProdutos = new ArrayList<>();
        ArrayList<Cliente> lstClientes = new ArrayList<>();
        
        Cliente cliente;
        Produto produto;
        Venda venda;
        String aux = "";
        String nome;
        int opc;

        String menutxt;

        menutxt = "################# MENU ################\n";
        menutxt += " 1 - Cadastrar Cliente                \n";
        menutxt += " 2 - Cadastrar Produto                \n";
        menutxt += " 3 - Realizar Venda                   \n";
        menutxt += " 4 - Alterar uma Venda                \n";
        menutxt += " 5 - Fechar Venda                     \n";
        menutxt += " 6 - Exibir Clientes                  \n";
        menutxt += " 7 - Exibir Produtos                  \n";
        menutxt += " 8 - Exibir Vendas                    \n";
        menutxt += " 0 - Sair                             \n";
        menutxt += "######################################\n";
        menutxt += "Informe uma opção:                    \n";

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menutxt));
            switch (opc) {
                case 1:
                    // Uma nova instância do objeto Cliente
                    cliente = new Cliente();
                    cliente.id = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID do cliente"));
                    cliente.nome = JOptionPane.showInputDialog("Nome do Cliente");
                    cliente.cpf = JOptionPane.showInputDialog("CPF do Cliente");
                    cliente.endereco = JOptionPane.showInputDialog("Endereço do Cliente");
                    // Adicionando a referência do novo objeto
                    // para a lista de clientes lstClientes
                    lstClientes.add(cliente);
                    break;
                case 2:
                    produto = new Produto();
                    produto.id = Integer.parseInt(JOptionPane
                            .showInputDialog("Id do produto"));
                    produto.desc = JOptionPane.showInputDialog("Descrição");
                    produto.nome = JOptionPane.showInputDialog("Nome");
                    produto.valor = Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o valor do produto"));
                    lstProdutos.add(produto);
                    break;
                case 3:
                    venda = new Venda();
                    String cpfAux;
                    
                    venda.id = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID da Venda"));
                    cpfAux = JOptionPane.showInputDialog("Qual o CPF do cliente?");
                    
                    for(Cliente x: lstClientes){
                        if(x.cpf.equals(cpfAux)){
                            venda.cliente = x;
                            break;
                        }
                    }
                    int idAux;
                    while(true){
                        idAux = Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID do produto"));
                        
                        for(Produto x: lstProdutos){
                            if(x.id == idAux){
                                venda.lProdutos.add(x);
                                break;
                            }
                        }
                        int sair;
                        
                        sair = Integer.parseInt(JOptionPane
                                .showInputDialog("Deseja cadastrar mais "
                                        + "produtos navenda? (1-Sim)(0-Nao)"));
                        
                        if(sair == 0){
                            break;
                        }
                    }
                    venda.fechada = false;
                    lstVendas.add(venda);
                    break;
                case 4:
                    int idVendaAux;
                    
                    idVendaAux = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID da venda"));
                    
                    for(Venda x: lstVendas){
                        if(x.id == idVendaAux){
                            if(x.fechada){
                                JOptionPane.showMessageDialog(null, 
                                        "Venda fechada! Não é possível realizar alterações na venda");
                                break;
                            }
                            while(true){
                                int opc2;
                                
                                opc2 = Integer.parseInt(JOptionPane
                                        .showInputDialog(
                                                "##########################\n"+
                                                "# 1 - Add Produto         \n"+
                                                "# 2 - Rem Produto         \n"+
                                                "# 0 - Sair                \n"+
                                                "##########################\n"
                                        ));
                                if(opc2 == 0)
                                    break;
                                switch(opc2){
                                    case 1:
                                        int idNovoProduto;
                                        
                                        idNovoProduto = Integer.parseInt(
                                            JOptionPane
                                              .showInputDialog("Informe o ID"));
                                        
                                        for(Produto y: lstProdutos){
                                            if(y.id == idNovoProduto){
                                                x.lProdutos.add(y);
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        int idDelProduto;
                                        
                                        idDelProduto = Integer.parseInt(
                                            JOptionPane
                                              .showInputDialog("Informe o ID"));
                                        
                                        for(Produto y: x.lProdutos){
                                            if(y.id == idDelProduto){
                                                x.lProdutos.remove(y);
                                                break;
                                            }
                                        }
                                        break;                  
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    int idFecharVenda;
                    
                    idFecharVenda = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID da Venda"));
                    for(Venda x: lstVendas){
                        if(x.id == idFecharVenda){
                            x.fechada = true;
                            JOptionPane.showMessageDialog(null,
                                    "Venda ID: "+x.id+" (FECHADA)");
                            break;
                        }
                    }
                    break;
                case 6:
                    aux = "";
                    for(Cliente x: lstClientes){
                        aux += "########################################\n";
                        aux += "# ID Cliente: "+x.id+"\n";
                        aux += "# Nome: "+x.nome+"\n";
                        aux += "# Endereço: "+x.endereco+"\n";
                        aux += "# CPF: "+x.cpf+"\n";
                        aux += "#\n";
                    }
                    aux += "########################################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 7:
                    aux = "";
                    for(Produto x: lstProdutos){
                        aux += "########################################\n";
                        aux += "# ID Produto: "+x.id+"\n";
                        aux += "# Nome: "+x.nome+"\n";
                        aux += "# Descrição: "+x.desc+"\n";
                        aux += "#\n";
                    }
                    aux += "########################################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 8:
                    aux = "";
                    for(Venda x: lstVendas){
                        aux += "########################################\n";
                        aux += "# ID Venda: "+x.id+"\n";
                        aux += "# Nome Cliente: "+x.cliente.nome+"\n";
                        aux += "# Fechada: "+x.fechada+"\n";
                        aux += "---------------------------------------\n";
                        for(Produto y: x.lProdutos){
                            aux += " ID Produto: "+y.id+"\n";
                            aux += " Nome Produto: "+y.nome+"\n";
                            aux += " Valor Produto: "+y.valor+"\n";
                        }
                        aux += "---------------------------------------\n";
                        aux += "# Valor Total: "+x.valorTotal()+"\n";
                        aux += "# Valor Descontos: "+x.valorTotal(10.0)+"\n";
                        aux += "#\n";
                    }
                    aux += "########################################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        } while (opc != 0);
    }
}
