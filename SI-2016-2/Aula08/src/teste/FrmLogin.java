/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.swing.JFrame;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class FrmLogin extends JFrame {
    public FrmLogin(){
        super("Tela de Login");
        this.setSize(400,300);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
