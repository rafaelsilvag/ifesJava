/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
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
    private JTextField tfSenha;
    private JButton btEntrar;
    private JButton btSair;
    
    public FrmLogin(){
        lbUsuario = new JLabel("Usuário: ", JLabel.LEFT);
        lbSenha = new JLabel("Senha: ", JLabel.LEFT);
        tfUsuario = new JTextField(15);
        tfSenha = new JPasswordField(15);
        btEntrar = new JButton("Entrar");
        btSair = new JButton("Sair");
        
        JPanel pUsuario = new JPanel();
        pUsuario.setLayout(new FlowLayout());
        JPanel pSenha = new JPanel();
        pSenha.setLayout(new FlowLayout());
        JPanel pBotoes = new JPanel();
        pBotoes.setLayout(new FlowLayout());
     
        pUsuario.add(lbUsuario);
        pUsuario.add(tfUsuario);
        pSenha.add(lbSenha);
        pSenha.add(tfSenha);
        pBotoes.add(btEntrar);
        pBotoes.add(btSair);
        
        this.getContentPane().setLayout(new GridLayout(4,1));
        this.getContentPane().add(new JLabel("TELA DE LOGIN", JLabel.CENTER));
        this.getContentPane().add(pUsuario);
        this.getContentPane().add(pSenha);
        this.getContentPane().add(pBotoes);
        
        this.btEntrar.addActionListener(this);
        this.btSair.addActionListener(this);
        
        this.setTitle("Tela de Login");
        this.setSize(350, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btEntrar){
            String password = new String(((JPasswordField)tfSenha).getPassword()).trim();
            if(tfUsuario.getText().equals("admin") && ((JPasswordField)tfSenha).getText().equals("1234")){
                new FrmMenuPrincipal();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Usuário e/ou senha incorretos! "+password);
                this.tfUsuario.setText(null);
                this.tfSenha.setText(null);
                this.tfUsuario.requestFocusInWindow();
            }
        }else if(e.getSource() == btSair){
            this.dispose();
        }
    }
}
