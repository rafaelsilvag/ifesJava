import javax.swing.JOptionPane;

public class ExemploWhile02{
    public static void main(String args[]){
        String aux;
        int opc;
        // Exemplo de utilização do Do...While
        do{
            aux = JOptionPane.showInputDialog(
                            "####### INFORME UMA OPÇÃO #######\n"+
                            "1 - Cadastrar Aluno\n"+
                            "2 - Editar Aluno\n"+
                            "3 - Visualizar Alunos\n"+
                            "0 - Sair\n"+
                            "#################################\n"
                        );
        }while(opc != 0);
    }
}
