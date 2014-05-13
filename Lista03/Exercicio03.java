
import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String args[]) {
        String aux;
        double volume, lado;

        while (true) {
            try {
                aux = JOptionPane.showInputDialog(null, "Informe o valor do lado");
                lado = Double.parseDouble(aux);
                volume = Math.pow(lado, 3);
                JOptionPane.showMessageDialog(null, "Volume: "+Math.floor(volume));
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Informe um número real");
            } catch (NullPointerException ex){
                break;
            }
        }

    }
}
