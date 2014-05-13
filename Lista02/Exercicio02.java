
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String args[]) {
        String aux;
        String sexo;
        double peso, pesoFemininoMenor = 0;

        for (int i = 0; i < 5; i++) {
            sexo = JOptionPane.showInputDialog("Informe o sexo");
            aux = JOptionPane.showInputDialog("Informe o peso");
            peso = Double.parseDouble(aux);

            if (sexo.equals("f") || sexo.equals("F")) {
                if (pesoFemininoMenor == 0 || (peso < pesoFemininoMenor)) {
                    pesoFemininoMenor = peso;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Peso Mulher mais magra: " + pesoFemininoMenor);
    }
}
