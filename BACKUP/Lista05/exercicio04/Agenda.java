package exercicio04;

import java.util.ArrayList;

public class Agenda {
    private int id_agenda;
    private ArrayList<RegistroAgenda> registro;
    private String descricaoAgenda;

    public Agenda(){
        this.registro = new ArrayList<RegistroAgenda>();
    }
    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public ArrayList<RegistroAgenda> getRegistro() {
        return registro;
    }

    public void adicionarRegistro(RegistroAgenda registro) {
        this.registro.add(registro);
    }

    public String getDescricaoAgenda() {
        return descricaoAgenda;
    }

    public void setDescricaoAgenda(String descricaoAgenda) {
        this.descricaoAgenda = descricaoAgenda;
    }
    
}
