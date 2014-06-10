package exercicio04;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {
        //Objeto do tipo agenda.
        Agenda agendaRafael = new Agenda();
        String aux;
        int opc = 0;

        while (opc != 9) {
            aux = JOptionPane.showInputDialog("---- MENU ----\n"
                    + "1 - Adicionar Agenda\n"
                    + "2 - Adicionar Registro\n"
                    + "3 - Remover Registro\n"
                    + "4 - Atualizar Registro\n"
                    + "5 - Exibir Agenda\n"
                    + "9 - Sair");
            try {
                opc = Integer.parseInt(aux);

                switch (opc) {
                    case 1:
                        // Iniciar a agenda.
                        aux = JOptionPane.showInputDialog("Informe o ID da Agenda");
                        agendaRafael.setId_agenda(Integer.parseInt(aux));
                        aux = JOptionPane.showInputDialog("Descrição da Agenda");
                        agendaRafael.setDescricaoAgenda(aux);
                        break;
                    case 2:
                        // Adicionar Registro na agenda
                        RegistroAgenda registro = new RegistroAgenda();
                        aux = JOptionPane.showInputDialog("Informe o nome");
                        registro.setNome(aux);
                        aux = JOptionPane.showInputDialog("Informe o telefone");
                        registro.setTelefone(aux);
                        aux = JOptionPane.showInputDialog("Informe o email");
                        registro.setEmail(aux);
                        aux = JOptionPane.showInputDialog("Informe o ID");
                        registro.setId_regAgenda(Integer.parseInt(aux));
                        
                        agendaRafael.adicionarRegistro(registro);
                        break;
                    case 3:
                        //Remover Registro na agenda.
                        aux = JOptionPane.showInputDialog("Informe o nome");
                        for(int i=0;i<agendaRafael.getRegistro().size();i++){
                            if(agendaRafael.getRegistro().get(i).getNome().equalsIgnoreCase(aux)){
                                agendaRafael.getRegistro().remove(i);
                                break;
                            }
                        }
                        break;
                    case 4:

                        break;
                    case 5:
                        String msg="";
                        msg = msg + agendaRafael.getId_agenda()+"\n";
                        // Exibir os registros da Agenda.
                        for(int i=0;i<agendaRafael.getRegistro().size();i++){
                            msg = msg + "\n---------------------------";
                            msg = msg + "\nNome: "+agendaRafael.getRegistro().get(i).getNome();
                            msg = msg + "\nTelefone: "+agendaRafael.getRegistro().get(i).getTelefone();
                            msg = msg + "\nE-Mail: "+agendaRafael.getRegistro().get(i).getEmail();
                        }
                        JOptionPane.showMessageDialog(null,msg);
                        break;
                }
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Valor incorreto");
            }
        }
    }
}
