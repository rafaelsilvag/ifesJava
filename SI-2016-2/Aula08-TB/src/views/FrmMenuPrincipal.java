/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new javax.swing.JDesktopPane();
        mbPrincipal = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mCadastros = new javax.swing.JMenu();
        mClientes = new javax.swing.JMenu();
        miNovoCliente = new javax.swing.JMenuItem();
        miEditarCliente = new javax.swing.JMenuItem();
        mAlunos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mListagem = new javax.swing.JMenu();
        mAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mArquivo.setText("Arquivo");

        miSobre.setText("Sobre");
        mArquivo.add(miSobre);

        miSair.setText("Sair");
        mArquivo.add(miSair);

        mbPrincipal.add(mArquivo);

        mCadastros.setText("Cadastros");

        mClientes.setText("Clientes");

        miNovoCliente.setText("Novo Cliente");
        miNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoClienteActionPerformed(evt);
            }
        });
        mClientes.add(miNovoCliente);

        miEditarCliente.setText("Editar Cliente");
        miEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarClienteActionPerformed(evt);
            }
        });
        mClientes.add(miEditarCliente);

        mCadastros.add(mClientes);

        mAlunos.setText("Alunos");

        jMenuItem1.setText("Novo Aluno");
        mAlunos.add(jMenuItem1);

        jMenuItem2.setText("Editar Aluno");
        mAlunos.add(jMenuItem2);

        mCadastros.add(mAlunos);

        mbPrincipal.add(mCadastros);

        mListagem.setText("Listagem");
        mbPrincipal.add(mListagem);

        mAjuda.setText("Ajuda");
        mbPrincipal.add(mAjuda);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miEditarClienteActionPerformed

    private void miNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoClienteActionPerformed
        IFrmNovoCliente novocliente = new IFrmNovoCliente();
        this.dpPrincipal.add(novocliente);
        novocliente.setVisible(true);
    }//GEN-LAST:event_miNovoClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mAlunos;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenu mCadastros;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenu mListagem;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miEditarCliente;
    private javax.swing.JMenuItem miNovoCliente;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    // End of variables declaration//GEN-END:variables
}
