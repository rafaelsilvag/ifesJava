
package views;

import domain.Cliente;
import domain.ClientePF;
import domain.ClientePJ;
import domain.ContaCorrente;
import domain.ContaCorrentePF;
import domain.ContaCorrentePJ;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]){
        ArrayList<ContaCorrente> listaContas = new ArrayList<>();
        int opc;
        
        while(true){
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(
                                "##############     MENU     ############## \n"+
                                "# 1 - Cadastrar Conta Corrente             \n"+
                                "# 2 - Mostrar Contas Correntes             \n"+
                                "# 3 - Transferir Valores                   \n"+
                                "# 4 - Mostrar Saldo de Conta               \n"+
                                "# 5 - Depositar Valor em Conta Corrente    \n"+
                                "# 6 - Sacar Valor em Conta Correte         \n"+
                                "# 7 - Adicionar dependente                 \n"+
                                "# 0 - Sair                                 \n"        
                ));
                switch(opc){
                    case 1:
  
                        // Instância um objeto do tipo ContaCorrente
                        ContaCorrente aux;

                        String aux2;
                        aux2 = JOptionPane.showInputDialog("Conta PF(1) ou PJ(2)");
                        
                        if(Integer.parseInt(aux2) == 1){
                            aux = new ContaCorrentePF();
                            
                            ClientePF cli = new ClientePF();
                            aux2 = JOptionPane.showInputDialog("Nome do Cliente");
                            cli.setNome(aux2);
                            aux2 = JOptionPane.showInputDialog("ID do Cliente");
                            cli.setId(Integer.parseInt(aux2));
                            aux2 = JOptionPane.showInputDialog("CPF do Cliente");
                            cli.setCpf(aux2);
                            aux.setClientePrincipal(cli);
                        }else{
                            aux = new ContaCorrentePJ();
                            ClientePJ cli = new ClientePJ();
                            aux2 = JOptionPane.showInputDialog("Nome do Cliente");
                            cli.setNome(aux2);
                            aux2 = JOptionPane.showInputDialog("ID do Cliente");
                            cli.setId(Integer.parseInt(aux2));
                            aux2 = JOptionPane.showInputDialog("CNPJ do Cliente");
                            cli.setCnpj(aux2);
                            aux.setClientePrincipal(cli);
                        }
                                                    
                        aux2 = JOptionPane.showInputDialog("ID da Conta");
                        aux.setId(Integer.parseInt(aux2));

                        aux2 = JOptionPane.showInputDialog("Saldo da Conta");
                        aux.setSaldo(Double.parseDouble(aux2));

                        listaContas.add(aux);
                        
                        break;
                    case 2:
                        String res = "";
                        for(ContaCorrente cc: listaContas){
                            res += "----------------------------------------------\n";
                            res += "ID C/C: "+cc.getId() + "\n";
                            if(cc.getClientePrincipal() instanceof ClientePF){
                                res += "CPF: "+((ClientePF) cc.getClientePrincipal()).getCpf()+"\n";
                            }else if(cc.getClientePrincipal() instanceof ClientePJ ){
                                res += "CNPJ: "+((ClientePJ) cc.getClientePrincipal()).getCnpj()+"\n";
                            }
                            res += "CORRENTISTA: "+ cc.getClientePrincipal().getNome() + "\n";
                            if(cc.getClienteDependente() != null)
                                res += "DEPENDENTE: "+cc.getClienteDependente().getNome()+ "\n";
                            res += "SALDO: "+cc.getSaldo()+"\n";
                        }
                        JOptionPane.showMessageDialog(null, res);
                        break;
                    case 3:
                        String idConta;
                        String vTrans;
                        ContaCorrente contaOrigem = null;
                        ContaCorrente contaDestino = null;
                        
                        idConta = JOptionPane.showInputDialog( "Informe a C/C Origem");
                        
                        for(ContaCorrente cc: listaContas){
                            if(cc.getId() == Integer.parseInt(idConta)){
                                contaOrigem = cc;
                                break;
                            }
                        }
                        
                        idConta = JOptionPane.showInputDialog("Informe a C/C Destino");
                        
                        for(ContaCorrente cc: listaContas){
                            if(cc.getId() == Integer.parseInt(idConta)){
                                contaDestino = cc;
                                break;
                            }
                        }
                        
                        vTrans = JOptionPane.showInputDialog("Informe o valor a ser transferido");
                        
                        if(contaOrigem != null && contaDestino != null)
                            contaOrigem.transferir(contaDestino, Double.parseDouble(vTrans));
                        
                        break;
                    case 4:
                        String idSaldo;
                        ContaCorrente conta=null;
                        idSaldo = JOptionPane.showInputDialog("Informe a C/C");
                        
                        for(ContaCorrente cc: listaContas){
                            if(cc.getId() == Integer.parseInt(idSaldo)){
                                conta = cc;
                                break;
                            }
                        }
                        if (conta != null)
                            JOptionPane.showMessageDialog(null, 
                                    "NÚMERO DA CONTA: "+conta.getId()+
                                    "SALDO: "+conta.getSaldo()
                                    );
                        else
                            JOptionPane.showMessageDialog(null,"CONTA NÃO ENCONTRADA!");
                        
                        break;
                    case 5:
                        String idDeposito;
                        String vDeposito;
                        ContaCorrente contaDeposito = null;
                        
                        idDeposito = JOptionPane.showInputDialog( "Informe a C/C Origem");
                        
                        for(ContaCorrente cc: listaContas){
                            if(cc.getId() == Integer.parseInt(idDeposito)){
                                contaDeposito = cc;
                                break;
                            }
                        }
                        vDeposito = JOptionPane.showInputDialog("Informe a valor de depósito");
                        
                        contaDeposito.depositar(Double.parseDouble(vDeposito));
                        break;
                    case 6:
                        String idSacado;
                        String vSacado;
                        ContaCorrente contaSacado = null;
                        
                        idSacado = JOptionPane.showInputDialog( "Informe a C/C Origem");
                        
                        for(ContaCorrente cc: listaContas){
                            if(cc.getId() == Integer.parseInt(idSacado)){
                                contaSacado = cc;
                                break;
                            }
                        }
                        vSacado = JOptionPane.showInputDialog("Informe a valor de depósito");
                        
                        if(contaSacado.sacar(Double.parseDouble(vSacado)))
                            JOptionPane.showMessageDialog(null, "Sacado com sucesso...");
                        else
                            JOptionPane.showMessageDialog(null, "Falha ao efetuar o saque...");
                        
                        break;
                    case 7:
                        Cliente dependente;
                        String opcCliente;
                        String idCli, auxDep;
                        
                        idCli = JOptionPane.showInputDialog("Informe o ID da C/C");
                        
                        for(ContaCorrente cc: listaContas){
                            if(cc.getId() == Integer.parseInt(idCli)){
                                if(cc instanceof ContaCorrentePF){
                                    dependente = new ClientePF();
                                    auxDep = JOptionPane.showInputDialog("Nome do Cliente");
                                    dependente.setNome(auxDep);
                                    auxDep = JOptionPane.showInputDialog("ID do Cliente");
                                    dependente.setId(Integer.parseInt(auxDep));
                                    auxDep = JOptionPane.showInputDialog("CPF do Cliente");
                                    ((ClientePF)dependente).setCpf(auxDep);
                                    cc.setClienteDependente(dependente);
                                }else{
                                    JOptionPane.showMessageDialog(null, "Não é possível cadastrar dependente para pessoas jurídicas");
                                }
                            }
                        }
                        
                        break;
                    case 0:
                        System.exit(0);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Informe uma opção válida.");
            }
        }
    }
}
