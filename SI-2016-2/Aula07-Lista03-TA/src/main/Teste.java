/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class Teste extends JFrame {
    private JTextField tf;
    
    public Teste(){
        tf = new JTextField(10);
        
        this.add(tf);
        
        Dimension d = new Dimension(10, 20);
        
        tf.setBounds(10, 20, d.width, d.height);
        
        this.setSize(100,200);
        this.setVisible(true);
    }
    public static void main(String args[]){
        Teste t = new Teste();
    }
}
