/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio02;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Teste {
    public static void main(String args[]){
        JFrame janela = new JFrame("TESTE");
        JButton bt01 = new JButton("Sair");
        JLabel lb01 = new JLabel("OLA MUNDO");
        janela.setSize(400,200);
        janela.setLayout(new FlowLayout());
        janela.add(lb01);
        janela.add(bt01);
        janela.setResizable(false);
        janela.setVisible(true);
        
    }
}
