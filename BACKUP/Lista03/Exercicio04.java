
import javax.swing.JOptionPane;


public class Exercicio04 {
    public static void main(String args[]){
        String resultado="";
        String aux;
        
        aux = JOptionPane.showInputDialog(null, "Informe uma frase");
        
        for(int i=0;i< aux.length();i++){
            resultado = resultado + aux.substring(0, i+1 ) + "\n";
        }
        
        for(int i=(aux.length()-1);i>0;i--){
            resultado = resultado + aux.substring(0, i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
