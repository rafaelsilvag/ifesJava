
import javax.swing.JOptionPane;


public class Main {
    public static void main(String args[]){
        Motor testeMotor = new Motor();
        String aux;
        int opc=0;
       
        while(opc != 9){
            aux = JOptionPane.showInputDialog("---- MENU ----\n"+
                    "1 - Cadastrar Motor\n"+
                    "2 - Ligar Motor\n"+
                    "3 - Desligar Motor\n"+
                    "4 - Verificar Motor\n"+
                    "5 - Aumentar Velocidade\n"+
                    "6 - Diminuir Velocidade\n"+
                    "9 - Sair");
            try{
                opc = Integer.parseInt(aux);
                
                switch(opc){
                    case 1:
                        aux = JOptionPane.showInputDialog("Fabricante");
                        testeMotor.setFabricante(aux);
                        aux = JOptionPane.showInputDialog("Voltagem");
                        testeMotor.setVoltagem(Double.parseDouble(aux));
                        break;
                    case 2:
                        testeMotor.ligarMotor();
                        break;
                    case 3:
                        testeMotor.desligarMotor();
                        break;
                    case 4:
                        testeMotor.verificaMotor();
                        break;
                    case 5:
                        testeMotor.aumentarVelocidade();
                        break;
                    case 6:
                        testeMotor.diminuirVelocidade();
                        break;
                }
            }catch(NumberFormatException | NullPointerException ex){
                JOptionPane.showMessageDialog(null, "Valor incorreto");
            }
        }
    }
}
