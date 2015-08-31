
package domain;


public class ContaCorrente {
    private int id;
    private Cliente clientePrincipal;
    private Cliente clienteDependente;
    private double saldo;
    
    public ContaCorrente(){
        this.clienteDependente = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getClientePrincipal() {
        return clientePrincipal;
    }

    public void setClientePrincipal(Cliente clientePrincipal) {
        this.clientePrincipal = clientePrincipal;
    }

    public Cliente getClienteDependente() {
        return clienteDependente;
    }

    public void setClienteDependente(Cliente clienteDependente) {
        this.clienteDependente = clienteDependente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferir(ContaCorrente conta, double valor){
        if(this.sacar(valor)){
            conta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}
