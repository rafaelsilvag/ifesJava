/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class FrmMenu extends JFrame {
    private JButton btCadastrarCliente;
    private JButton btEditarCliente;
    private JButton btListarClientes;
    
    public FrmMenu(){
        super("Tela de Menu");
         btCadastrarCliente = new JButton("Cadastrar Cliente");
         btEditarCliente = new JButton("Editar Cliente");
         btListarClientes = new JButton("Listar Clientes");
         
         this.getContentPane().setLayout(new GridLayout(4,1));
         this.getContentPane().add(new JLabel("### MENU ###", JLabel.CENTER));
         this.getContentPane().add(btCadastrarCliente);
         this.getContentPane().add(btEditarCliente);
         this.getContentPane().add(btListarClientes);
         
         this.setSize(400,300);
         this.setResizable(false);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setVisible(true);
    }
}
