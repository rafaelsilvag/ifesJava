
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
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
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
