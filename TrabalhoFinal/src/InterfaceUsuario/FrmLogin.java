/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author paulo_000
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
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

        PnlLogin = new javax.swing.JPanel();
        LblNome = new javax.swing.JLabel();
        LblSenha = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        TxtxNome = new javax.swing.JTextField();
        TxtxSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        PnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        PnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", 0, 0, new java.awt.Font("Comic Sans MS", 2, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PnlLogin.setToolTipText("Login");
        PnlLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LblNome.setText("Nome: ");

        LblSenha.setText("Senha: ");

        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        BtnSair.setText("Sair");

        TxtxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtxNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlLoginLayout = new javax.swing.GroupLayout(PnlLogin);
        PnlLogin.setLayout(PnlLoginLayout);
        PnlLoginLayout.setHorizontalGroup(
            PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLoginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PnlLoginLayout.createSequentialGroup()
                        .addComponent(BtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtxSenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtxNome, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PnlLoginLayout.setVerticalGroup(
            PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLoginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNome)
                    .addComponent(TxtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSenha)
                    .addComponent(TxtxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(PnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEntrar)
                    .addComponent(BtnSair))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtxNomeActionPerformed

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JPanel PnlLogin;
    private javax.swing.JTextField TxtxNome;
    private javax.swing.JTextField TxtxSenha;
    // End of variables declaration//GEN-END:variables
}
