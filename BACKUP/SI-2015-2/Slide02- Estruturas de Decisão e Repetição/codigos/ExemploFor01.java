import javax.swing.JOptionPane;

public class ExemploFor01{
    public static void main(String args[]){
        int valor=10, soma=0;
        // Exemplo de utilização do FOR
        for(int i = 0;i <= valor;i++){
            soma += i;
        }

        JOptionPane.showMessageDialog(null,"Resultado: "+soma);
    }
}
