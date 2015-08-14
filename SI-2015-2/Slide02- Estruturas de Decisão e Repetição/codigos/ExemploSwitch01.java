import javax.swing.JOptionPane;

public class ExemploSwitch01{
    public static void main(String args[]){
        String valor;
        int opc;

        valor = JOptionPane.showInputDialog("Informe um valor: ");
        // Convertendo os valor String para Integer.
        opc = Integer.parseInt(valor);

        switch(opc){
            case 1: JOptionPane.showMessageDialog("Valor 1!"); break;
            case 2: JOptionPane.showMessageDialog("Valor 2!"); break;
            case 3: JOptionPane.showMessageDialog("Valor 3!"); break;
            default: JOptionPane.showMessageDialog("Desconhecido!");
        }
    }
}
