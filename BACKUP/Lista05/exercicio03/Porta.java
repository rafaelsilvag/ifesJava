
package exercicio02;

import javax.swing.JOptionPane;


public class Porta {
    private Cor cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    private boolean aberta;
    
    public Porta(){
        this.aberta = false;
        this.dimensaoX = 120;
        this.dimensaoY = 180;
        this.dimensaoZ = 4;
        this.cor = null;
    }
    public Porta(boolean aberta){
        this.aberta = aberta;
        this.dimensaoX = 120;
        this.dimensaoY = 180;
        this.dimensaoZ = 4;
        this.cor = null;
    }
    
    public void abrir(){
        if(this.aberta){
            JOptionPane.showMessageDialog(null, "Porta já esta aberta!");
        }else{
            this.aberta = true;
        }
    }
    public void fechar(){
        if(this.aberta){
            this.aberta = false;
        }else{
            JOptionPane.showMessageDialog(null, "Porta já esta fechada");
        }
    }
    public void estaAberta(){
        if(this.aberta){
            JOptionPane.showMessageDialog(null, "Porta ABERTA");
        }else{
            JOptionPane.showMessageDialog(null, "Porta FECHADA");
        }
    }

    public String getCor() {
        return this.cor.getNome();
    }

    public void pinta(Cor cor) {
        if(cor.getNome().equalsIgnoreCase("Azul")
                ||cor.getNome().equalsIgnoreCase("Rosa")
                ||cor.getNome().equalsIgnoreCase("Branca")
                ||cor.getNome().equalsIgnoreCase("Bege")){
            //Passa a referência do objeto cor do tipo de classe Cor
            this.cor = cor;
        }else{
            JOptionPane.showMessageDialog(null, "Cor inválida!");
        }
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    
}
