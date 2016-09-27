/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class FrmLogin extends JFrame implements ActionListener {
    private JLabel lbUsuario;
    private JLabel lbSenha;
    private JTextField tfUsuario;
    private JPasswordField tfSenha;
    private JButton btEntrar;
    private JButton btSair;
    
    public FrmLogin(){
        super("Tela de Login");
        
        JPanel pUsuario = new JPanel();
        pUsuario.setLayout(new FlowLayout());
        JPanel pSenha = new JPanel();
        pSenha.setLayout(new FlowLayout());
        JPanel pButton = new JPanel();
        pButton.setLayout(new FlowLayout());
        
        lbUsuario = new JLabel("Usuário: ");
        lbSenha = new JLabel("Senha: ");
        tfUsuario = new JTextField(15);
        tfSenha = new JPasswordField(15);
        btEntrar = new JButton("Entrar");
        btSair = new JButton("Sair");
        
        pUsuario.add(lbUsuario);
        pUsuario.add(tfUsuario);
        
        pSenha.add(lbSenha);
        pSenha.add(tfSenha);
        
        pButton.add(btEntrar);
        pButton.add(btSair);
        
        this.getContentPane().setLayout(new GridLayout(3, 1));
        this.getContentPane().add(pUsuario);
        this.getContentPane().add(pSenha);
        this.getContentPane().add(pButton);
        
        btEntrar.addActionListener(this);
        btSair.addActionListener(this);
        
        this.setSize(300,200);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btEntrar)){
            String password = new String(tfSenha.getPassword()).trim();
            if(tfUsuario.getText().equals("admin") && password.equals("123456")){
                new FrmMenu();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!");
                tfUsuario.setText(null);
                tfSenha.setText(null);
            }
            
        }else if(e.getSource().equals(btSair)){
            this.dispose();
        }
    }
}
