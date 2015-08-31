
package domain;


public class Funcionario {
    private int id;
    private double salario;
    private String nome;
    private Imposto inss;
    private Imposto ir;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Imposto getInss() {
        return inss;
    }

    public void setInss(Imposto inss) {
        this.inss = inss;
    }

    public Imposto getIr() {
        return ir;
    }

    public void setIr(Imposto ir) {
        this.ir = ir;
    }
    
    public double salarioBruto(){
        return this.salario;
    }
    public double salarioLiquido(){
        double descInss, descIr;
        descInss = (this.salario * inss.getPercentual());
        descIr = (this.salario * ir.getPercentual());
        return (this.salario - descInss) - descIr;
    }
    public double valorInss(){
        return (this.salario * inss.getPercentual());
    }
    
    public double valorIr(){
        return (this.salario * ir.getPercentual());
    }
    
    public double valorIr(int num){
        return (this.salario * ir.getPercentual()) + (100*num);
    }
}
