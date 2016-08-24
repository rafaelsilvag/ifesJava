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
                    cliente.setId(Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID do cliente")));
                    cliente.setNome(JOptionPane
                            .showInputDialog("Nome do Cliente"));
                    cliente.setCpf(JOptionPane
                            .showInputDialog("CPF do Cliente"));
                    cliente.setEndereco(JOptionPane
                            .showInputDialog("Endereço do Cliente"));
                    // Adicionando a referência do novo objeto
                    // para a lista de clientes lstClientes
                    lstClientes.add(cliente);
                    break;
                case 2:
                    produto = new Produto();
                    produto.setId(Integer.parseInt(JOptionPane
                            .showInputDialog("Id do produto")));
                    produto.setDesc(JOptionPane.showInputDialog("Descrição"));
                    produto.setNome(JOptionPane.showInputDialog("Nome"));
                    produto.setValor(Double.parseDouble(JOptionPane
                            .showInputDialog("Informe o valor do produto")));
                    lstProdutos.add(produto);
                    break;
                case 3:
                    venda = new Venda();
                    String cpfAux;
                    
                    venda.setId(Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID da Venda")));
                    cpfAux = JOptionPane.showInputDialog("Qual o CPF do cliente?");
                    
                    for(Cliente x: lstClientes){
                        if(x.getCpf().equals(cpfAux)){
                            venda.setCliente(x);
                            break;
                        }
                    }
                    int idAux;
                    while(true){
                        idAux = Integer.parseInt(JOptionPane
                                .showInputDialog("Informe o ID do produto"));
                        
                        for(Produto x: lstProdutos){
                            if(x.getId() == idAux){
                                venda.getlProdutos().add(x);
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
                    venda.setFechada(false);
                    lstVendas.add(venda);
                    break;
                case 4:
                    int idVenda;
                    
                    idVenda = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID da Venda"));
                    
                    for(Venda x: lstVendas){
                        if(x.getId() == idVenda){
                            if(x.isFechada()){
                                JOptionPane.showMessageDialog(null, 
                                        "Venda Fechada! Não realizar alterações na venda");
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
                                if(opc2 == 0){
                                    break;
                                }
                                switch(opc2){
                                    case 1:
                                        int idNovoProduto;
                                        idNovoProduto = Integer.parseInt(
                                                JOptionPane
                                                .showInputDialog("ID Novo Produto"));
                                        
                                        for(Produto y: lstProdutos){
                                            if(idNovoProduto == y.getId()){
                                                x.getlProdutos().add(y);
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        int idProdutoRem;
                                        
                                        idProdutoRem = Integer.parseInt(
                                                JOptionPane
                                                .showInputDialog("ID Produto"));
                                        
                                        for(Produto y: x.getlProdutos()){
                                            if(y.getId() == idProdutoRem){
                                                x.getlProdutos().remove(y);
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
                    int idVendaFechar;
                    
                    idVendaFechar = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe o ID da Venda"));
                    for(Venda x: lstVendas){
                        if(x.getId() == idVendaFechar){
                            x.setFechada(true);
                            JOptionPane.showMessageDialog(null, 
                                    "Venda ID: "+x.getId()+" (FECHADA)");
                            break;
                        }
                    }
                    break;
                case 6:
                    aux = "";
                    
                    for(Cliente x: lstClientes){
                        aux += "###############################\n";
                        aux += "# ID Cliente: "+x.getId()+"\n";
                        aux += "# Nome: "+x.getNome()+"\n";
                        aux += "# CPF: "+x.getCpf()+"\n";
                        aux += "# Endereço: "+x.getEndereco()+"\n";
                        aux += "#\n";
                    }
                    aux += "###############################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 7:
                    aux = "";
                    
                    for(Produto x: lstProdutos){
                        aux += "###############################\n";
                        aux += "# ID Produto: "+x.getId()+"\n";
                        aux += "# Nome: "+x.getNome()+"\n";
                        aux += "# Descrição: "+x.getDesc()+"\n";
                        aux += "# Preço: "+x.getValor()+"\n";
                        aux += "#\n";
                    }
                    aux += "###############################\n";
                    JOptionPane.showMessageDialog(null, aux);
                    break;
                case 8:
                    aux = "";
                    
                    for(Venda x: lstVendas){
                        aux += "###############################\n";
                        aux += "# ID Venda: "+x.getId()+"\n";
                        aux += "# Nome de Cliente: "+x.getCliente().getNome()+"\n";
                        aux += "# CPF do Cliente: "+x.getCliente().getCpf()+"\n";
                        aux += "# Fechada: "+x.isFechada()+"\n";
                        aux += "-------------------------------\n";
                        for(Produto y: x.getlProdutos()){
                            aux += "Nome: "+y.getNome()+"\n";
                            aux += "Valor: "+y.getValor()+"\n";
                        }
                        aux += "-------------------------------\n";
                        aux += "Total da Venda: "+x.totalVenda()+"\n";
                        aux += "Total da Venda(descontos): "+x.totalVenda(10.0)+"\n";
                        aux += "#\n";
                    }
                    aux += "###############################\n";
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
