
import javax.swing.JOptionPane;


public class Exercicio03 {

    public static void main(String args[]) {
        int produto=1;
        
        for(int i=1;i<=15;i++){
            if(i % 2 != 0){
                produto = produto * i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: "+produto);
    }
}
