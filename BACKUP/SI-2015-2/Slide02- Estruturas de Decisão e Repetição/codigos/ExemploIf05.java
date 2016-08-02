import javax.swing.JOptionPane;

public class ExemploIf05{
    public static void main(String args[]){
        String nome;

        nome = JOptionPane.showInputDialog("Informe o seu nome");
        // verifica se o nome do usuário é admin
        if(nome.equalsIgnoreCase("admin")){
            JOptionPane.showMessageDialog(null,
                                          "Você é um usuário Admin!");
        }else{
            JOptionPane.showMessageDialog(null,
                                          "Você é um usuário comum!");
        }
    }
}
