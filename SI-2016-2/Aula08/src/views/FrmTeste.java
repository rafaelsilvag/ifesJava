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
public class FrmTeste extends javax.swing.JFrame {

    /**
     * Creates new form FrmTeste
     */
    public FrmTeste() {
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

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbSexoMasc = new javax.swing.JRadioButton();
        rbSexoFem = new javax.swing.JRadioButton();
        btOk = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbOp1 = new javax.swing.JCheckBox();
        cbOp2 = new javax.swing.JCheckBox();
        cbOp3 = new javax.swing.JCheckBox();
        dpPrincipal = new javax.swing.JDesktopPane();
        mbPrincipal = new javax.swing.JMenuBar();
        mpCadastrar = new javax.swing.JMenu();
        miCadCliente = new javax.swing.JMenuItem();
        miAluno = new javax.swing.JMenuItem();
        mEditar = new javax.swing.JMenu();
        mDeletar = new javax.swing.JMenu();
        mListar = new javax.swing.JMenu();
        mSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setSize(new java.awt.Dimension(800, 800));

        bgSexo.add(rbSexoMasc);
        rbSexoMasc.setSelected(true);
        rbSexoMasc.setText("Masculino");
        rbSexoMasc.setToolTipText("M");
        rbSexoMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSexoMascActionPerformed(evt);
            }
        });

        bgSexo.add(rbSexoFem);
        rbSexoFem.setText("Feminino");
        rbSexoFem.setToolTipText("F");
        rbSexoFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSexoFemActionPerformed(evt);
            }
        });

        btOk.setText("OK");
        btOk.setToolTipText("Cadastrar Cliente");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbOp1.setText("Opcao1");

        cbOp2.setText("Opcao2");
        cbOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOp2ActionPerformed(evt);
            }
        });

        cbOp3.setText("Opcao3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOp1)
                    .addComponent(cbOp2)
                    .addComponent(cbOp3))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cbOp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbOp3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        dpPrincipal.setSize(new java.awt.Dimension(600, 600));

        mpCadastrar.setText("Cadastrar");

        miCadCliente.setText("Cliente");
        miCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadClienteActionPerformed(evt);
            }
        });
        mpCadastrar.add(miCadCliente);

        miAluno.setText("Aluno");
        mpCadastrar.add(miAluno);

        mbPrincipal.add(mpCadastrar);

        mEditar.setText("Editar");
        mbPrincipal.add(mEditar);

        mDeletar.setText("Deletar");
        mbPrincipal.add(mDeletar);

        mListar.setText("Listar");
        mbPrincipal.add(mListar);

        mSair.setText("Sair");
        mbPrincipal.add(mSair);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(rbSexoMasc)
                        .addGap(18, 18, 18)
                        .addComponent(rbSexoFem)
                        .addGap(82, 82, 82)
                        .addComponent(btOk)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btOk)
                        .addComponent(rbSexoMasc)
                        .addComponent(rbSexoFem))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        // TODO add your handling code here:
        System.out.println("Masculino: "+rbSexoMasc.isSelected());
        System.out.println("Feminino: "+rbSexoFem.isSelected());
        System.out.println("opc1: "+cbOp1.isSelected());
        System.out.println("opc2: "+cbOp2.isSelected());
        System.out.println("opc3: "+cbOp3.isSelected());
    }//GEN-LAST:event_btOkActionPerformed

    private void cbOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOp2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbOp2ActionPerformed

    private void rbSexoMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSexoMascActionPerformed
        // TODO add your handling code here:
        this.cbOp1.setEnabled(false);
        this.cbOp2.setEnabled(true);
    }//GEN-LAST:event_rbSexoMascActionPerformed

    private void rbSexoFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSexoFemActionPerformed
        // TODO add your handling code here:
        this.cbOp1.setEnabled(true);
        this.cbOp2.setEnabled(false);
    }//GEN-LAST:event_rbSexoFemActionPerformed

    private void miCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadClienteActionPerformed
        // TODO add your handling code here:
        IFrmNovoCliente ifrmcadcliente = new IFrmNovoCliente();
        dpPrincipal.add(ifrmcadcliente);
        ifrmcadcliente.setVisible(true);
    }//GEN-LAST:event_miCadClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btOk;
    private javax.swing.JCheckBox cbOp1;
    private javax.swing.JCheckBox cbOp2;
    private javax.swing.JCheckBox cbOp3;
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mDeletar;
    private javax.swing.JMenu mEditar;
    private javax.swing.JMenu mListar;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miAluno;
    private javax.swing.JMenuItem miCadCliente;
    private javax.swing.JMenu mpCadastrar;
    private javax.swing.JRadioButton rbSexoFem;
    private javax.swing.JRadioButton rbSexoMasc;
    // End of variables declaration//GEN-END:variables
}