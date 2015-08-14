
import javax.swing.JOptionPane;


public class Exercicio02 {
    public static void main(String args[]){
        String aux, stringInvertida="";
        
        aux = JOptionPane.showInputDialog(null, "Informe uma palavra");
        int indiceFinal = aux.length() - 1;
        for(int i=0; i < aux.length();i++){
            stringInvertida = stringInvertida + aux.charAt(indiceFinal-i);
        }
        
        JOptionPane.showMessageDialog(null, stringInvertida);
    }
}
