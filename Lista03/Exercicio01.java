
import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String args[]) {
        int valor;
        int aux;
        while (true) {
            valor = ((int)(Math.random() * 6)) + 1;
            aux = JOptionPane.showConfirmDialog(null, "Jogada = " + valor);
            if (aux != 0) {
                break;
            }
        }
    }
}
