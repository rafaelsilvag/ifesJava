
import javax.swing.JOptionPane;

public class Motor {

    private String fabricante;
    private double rpm;
    private double voltagem;
    private boolean ligado;

    public Motor() {
        this.rpm = 0;
        this.ligado = false;
    }

    public void aumentarVelocidade() {
        if (this.ligado) {
            if (this.rpm <= 50000) {
                this.rpm = this.rpm + 1000;

            } else {
                JOptionPane.showMessageDialog(null, "MOTOR ESTA NO TALO");
            }
        }else{
            JOptionPane.showMessageDialog(null, "MOTOR ESTA DESLIGADO");
        }
    }

    public void diminuirVelocidade() {
        if (this.rpm >= 1000) {
            this.rpm = this.rpm - 1000;
        } else {
            JOptionPane.showMessageDialog(null, "MOTOR JA ESTA NA V. MINIMA");
        }
    }

    public void ligarMotor() {
        if (this.ligado) {
            JOptionPane.showMessageDialog(null, "MOTOR JÁ ESTA LIGADO");
        } else {
            this.ligado = true;
        }
    }

    public void desligarMotor() {
        if (this.ligado) {
            this.ligado = false;
            this.rpm = 0;
        } else {
            JOptionPane.showMessageDialog(null, "MOTOR JÁ ESTA DESLIGADO");
        }
    }

    public void verificaMotor() {
        if (this.ligado) {
            JOptionPane.showMessageDialog(null, "MOTOR LIGADO\n"
                    + "VELOCIDADE: " + this.rpm);
        } else {
            JOptionPane.showMessageDialog(null, "MOTOR DESLIGADO\n"
                    + "VELOCIDADE: " + this.rpm);
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

}
