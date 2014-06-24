package views;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame implements ActionListener{
    private JButton btOk;
    private JButton btSair;
    private JLabel lbNome;
    private JLabel lbSenha;
    private JTextField tfNome;
    private JPasswordField tfSenha;
    
    
    public TelaLogin(){
        //Captura o container principal
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(4,4));
        //Instancia os objetos
        btOk = new JButton("OK");
        btSair = new JButton("Sair");
        lbNome = new JLabel("Nome: ");
        lbSenha = new JLabel("Senha: ");
        tfNome = new JTextField(15);
        tfSenha = new JPasswordField(15);
        
        //Cadastra os paineis para usuario e senha
        JPanel painelUsuario = new JPanel();
        JPanel painelSenha = new JPanel();
        
        //Seta o layout do painel para Flowlayout
        painelUsuario.setLayout(new FlowLayout());
        painelUsuario.add(lbNome);
        painelUsuario.add(tfNome);
        //Seta o layout do painel para Flowlayout
        painelSenha.setLayout(new FlowLayout());
        painelSenha.add(lbSenha);
        painelSenha.add(tfSenha);
        
        //Adiciona os painéis e os objetos ao painel principal.
        pane.add(painelUsuario);
        pane.add(painelSenha);
        pane.add(btOk);
        pane.add(btSair);
        
        //Adiciona o método de evento para o objeto.
        this.btSair.addActionListener(this);
        this.btOk.addActionListener(this);
        
        this.setTitle("Tela Login");
        this.setResizable(false);
        this.setSize(300,150);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.btSair){
            System.exit(0);
        }else if(e.getSource() == this.btOk){
            if(tfNome.getText().equals("admin") && tfSenha.getText().equals("123")){
                TelaMenu menu = new TelaMenu();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Login incorreto...");
            }
        }
    }
}
