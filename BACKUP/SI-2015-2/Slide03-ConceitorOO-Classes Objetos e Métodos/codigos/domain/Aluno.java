package domain;


import javax.swing.JOptionPane;


public class Aluno {
    private int id;
    private String nome;
    private String endereco;
    private String curso;
    
    public void setId(int id){
        if (id < 100){
            JOptionPane.showMessageDialog(null, 
                    "IDs devem ser maiores que 100");
        }else{
            this.id = id;
        }
    }
    public int getId(){
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String mostrarDados(){
        String aux="";
        aux += "ID: "+this.id+"\n";
        aux += "NOME: "+this.nome+"\n";
        aux += "ENDERECO: "+this.endereco+"\n";
        aux += "CURSO: "+this.curso+"\n";
        return aux;
    }
}
