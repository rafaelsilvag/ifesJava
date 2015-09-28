/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrmLogin extends JFrame {
    private JButton btOk;
    private JButton btSair;
    private JLabel lbUsuario;
    private JLabel lbSenha;
    private JTextField tfUsuario;
    private JPasswordField pfSenha;
    
    public FrmLogin(){
        Container panel = this.getContentPane();
        panel.setLayout(new GridLayout(3,1));
        
        this.lbUsuario = new JLabel("Usuário: ");
        this.lbSenha = new JLabel("Senha: ");
        
        this.btOk = new JButton("Ok");
        this.btOk.setMnemonic('O');
        this.btSair = new JButton("Sair");
        this.btSair.setMnemonic('S');
        
        this.tfUsuario = new JTextField(12);
        this.pfSenha = new JPasswordField(12);
        
        JPanel paneUsuario = new JPanel();
        paneUsuario.setLayout(new FlowLayout());
        paneUsuario.add(this.lbUsuario);
        paneUsuario.add(this.tfUsuario);
        
        JPanel paneSenha = new JPanel();
        paneSenha.setLayout(new FlowLayout());  
        paneSenha.add(this.lbSenha);
        paneSenha.add(this.pfSenha);
       
        
        JPanel paneButoes = new JPanel();
        paneButoes.setLayout(new FlowLayout());
        paneButoes.add(this.btOk);
        paneButoes.add(this.btSair);
                
        panel.add(paneUsuario);   
        panel.add(paneSenha);
        panel.add(paneButoes);
        
        this.setResizable(false);
        this.setSize(250, 150);
        this.setVisible(true);   
    }
}
