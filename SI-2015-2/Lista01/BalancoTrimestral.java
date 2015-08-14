
import javax.swing.JOptionPane;


public class BalancoTrimestral {
    public static void main(String args[]){
        int gastosJaneiro = 15000, gastosFevereiro=23000;
        int gastosMarco = 17000, gastosTrimestre;
        double mediaMensal;
        String aux;
        
        while(true){
            try{
                aux = JOptionPane.showInputDialog("Informe os gastos de Janeiro:");
                gastosJaneiro = Integer.parseInt(aux);

                aux = JOptionPane.showInputDialog("Informe os gastos de Fevereiro:");
                gastosFevereiro = Integer.parseInt(aux);

                aux = JOptionPane.showInputDialog("Informe os gastos de Março:");
                gastosMarco = Integer.parseInt(aux);
                
                break;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        }
        
        gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
        
        mediaMensal = ((double)gastosTrimestre)/3;
        
        JOptionPane.showMessageDialog(null, "Valor Treimestral: "+gastosTrimestre);
        JOptionPane.showMessageDialog(null, "Média mensal = "+mediaMensal);
    }
}
