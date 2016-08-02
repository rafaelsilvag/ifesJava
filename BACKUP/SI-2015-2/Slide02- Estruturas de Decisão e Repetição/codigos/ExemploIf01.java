import javax.swing.JOptionPane;
// Importação da classe responsável por criar uma
// interface de interação com o usuário
public class ExemploIf01{
    public static void main(String args[]){
        int valor=0;
        // Retiramos o System.out.println por JOptionPane
        if (valor == 0){
            JOptionPane.showMessageDialog(
                                null,
                                "Valor igual a 0");
        }else{
            JOptionPane.showMessageDialog(
                                null,
                                "Valor não é igual a 0");
        }
    }
}
