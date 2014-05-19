
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Exercicio01 {
    public static void main(String args[]){
        String aux, resultado="";
        Date data = new Date();
        Calendar calendario = Calendar.getInstance();
        double valorTotal = 0.0, valorPrestacao=0.0;
        double numeroPrestacoes=0;
        try{
            aux = JOptionPane.showInputDialog("Informe o valor total");
            valorTotal = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Informe o número de prestações");
            numeroPrestacoes = Double.parseDouble(aux);
            valorPrestacao = valorTotal/numeroPrestacoes;
            calendario.setTime(data);
            calendario.add(Calendar.DAY_OF_MONTH, 3);
            for(int i=1;i<=numeroPrestacoes;i++){
                SimpleDateFormat df;
                String formato = "dd/MM/yyyy";
                df = new SimpleDateFormat(formato);
                
                resultado = resultado + "Prestacao: "+i+
                        "  Valor: "+valorPrestacao+
                        "  Data Pagamento: "+
                        df.format(calendario.getTime())+
                        "\n";
                if( i == 1)
                    calendario.add(Calendar.DAY_OF_MONTH, -3);
                calendario.add(Calendar.MONTH, 1);
                
            }
            JOptionPane.showMessageDialog(null, resultado);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Informações inválidas");
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Informe um valor");
        }
    }
}
