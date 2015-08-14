
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;


public class Exercicio02 {
    public static void main(String args[]){
        Date dataNascimento;
        Date dataAtual = new Date();
        DateFormat df = DateFormat.getDateInstance();
        long numeroDias;
        try {
            dataNascimento = df.parse("01/09/1981");
            numeroDias = (dataAtual.getTime() - dataNascimento.getTime()) / 86400000;
            JOptionPane.showMessageDialog(null, numeroDias );
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data invalida ");
        }
    }
}
