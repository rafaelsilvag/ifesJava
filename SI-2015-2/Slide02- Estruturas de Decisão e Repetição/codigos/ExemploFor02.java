import javax.swing.JOptionPane;

public class ExemploFor02{

    public static void main(String args[]){
        int vInteiros[] = {0,1,2,3,4,5,6,7,8,9}, soma=0;
        // Exemplo de utilização do FOREACH
        for(int v: vInteiros){
            soma += v;
        }

        JOptionPane.showMessageDialog(null,"Resultado: "+soma);
    }
}
