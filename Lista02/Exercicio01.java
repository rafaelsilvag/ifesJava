
import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String args[]) {
        String aux;
        double soma = 0;
        double media, valor = 0;
        int cont = 0;

        while (true) {
            try {
                aux = JOptionPane.showInputDialog("Informe um valor: ");
                valor = Double.parseDouble(aux);

                if (valor == 0) {
                    break;
                } else {
                    soma = soma + valor;
                    cont++;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Informe um numero: ");
            }
            JOptionPane.showMessageDialog(null, "Soma: " + soma
                    + "\nMedia: " + (soma / cont) + "\n\n");
        }
    }
}
