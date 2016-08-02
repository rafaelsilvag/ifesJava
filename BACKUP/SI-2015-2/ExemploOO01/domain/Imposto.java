
package domain;


public class Imposto {
    private int id;
    private double percentual;
    private String descricao;
    
    public Imposto(){
        this.percentual = 0;
    }
    
    public Imposto(Double percentual){
        this.percentual = percentual;
    }
    
    public Imposto(String descricao){
        this.descricao = descricao;
    }
    
    public Imposto(Double percentual, String descricao){
        this.percentual = percentual;
        this.descricao = descricao;        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
