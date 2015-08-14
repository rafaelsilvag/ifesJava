import javax.swing.JOptionPane;

public class ExemploWhile01{
    public static void main(String args[]){
        int valor=10, soma=0;
        // Exemplo de utilização do While
        while(valor >= 0){
            soma += valor;
            valor--;
        }

        JOptionPane.showMessageDialog(null,"Resultado: "+soma);
    }
}
