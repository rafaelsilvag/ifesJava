package exercicio02;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {
        Porta porta01 = null;
        String aux;
        int opc = 0;

        while (opc != 9) {
            aux = JOptionPane.showInputDialog("---- MENU ----\n"
                    + "1 - Cadastrar Porta\n"
                    + "2 - Abrir Porta\n"
                    + "3 - Fechar Porta\n"
                    + "4 - Verificar Porta\n"
                    + "5 - Pintar Porta\n"
                    + "9 - Sair");
            try {
                opc = Integer.parseInt(aux);

                switch (opc) {
                    case 1:
                        // Cadastro as informações referente a porta
                        aux = JOptionPane.showInputDialog("Informe  o status da porta");
                        boolean status;
                        if (aux.equals("Aberta")) {
                            status = true;
                        } else {
                            status = false;
                        }
                        //Instancia um objeto do tipo porta passando 
                        //o argumento status
                        porta01 = new Porta(status);

                        aux = JOptionPane.showInputDialog("Dimensão e X:");
                        porta01.setDimensaoX(Double.parseDouble(aux));
                        aux = JOptionPane.showInputDialog("Dimensão e Y:");
                        porta01.setDimensaoY(Double.parseDouble(aux));
                        aux = JOptionPane.showInputDialog("Dimensão e Z:");
                        porta01.setDimensaoZ(Double.parseDouble(aux));

                        break;
                    case 2:
                        //Chamo o método de abrir a porta
                        //(Altera o valor do atributo aberto para True)
                        porta01.abrir();
                        break;
                    case 3:
                        //Chamo o método de fechar a porta
                        //(Altera o valor do atributo para False)
                        porta01.fechar();
                        break;
                    case 4:
                        //Verifica se a porta esta aberta
                        //(Verifica os valor contido no atributo "aberto")
                        porta01.estaAberta();
                        break;
                    case 5:
                        //Chamo o método pinta que muda o valor do atributo cor 
                        //filtrando por uma relação de cores permitidas.
                        aux = JOptionPane.showInputDialog("Opções de cores:\n"+
                                "BRANCA, BEGE, ROSA, AZUL  \n"+
                                "Qual a Cor?\n");
                        Cor cor = new Cor();
                        cor.setNome(aux);
                        cor.setId(100);
                        cor.setDescricao("Sei lá");
                        
                        porta01.pinta(cor);
                        break;
                    case 6:

                        break;
                }
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Valor incorreto");
            }
        }
    }
}
