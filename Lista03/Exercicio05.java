
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String args[]){
        String frase;
        String vogais = "aeiouáéíóúãõàâêô";
        int contVogais = 0;
        
        frase = JOptionPane.showInputDialog(null, "Informe uma frase");
        frase = frase.toLowerCase();
        for(int i=0;i<frase.length();i++){
            for(int j=0;j<vogais.length();j++){
                if(frase.charAt(i)==vogais.charAt(j)){
                    contVogais++;
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Numero de vogais: "+contVogais);
    }
}
