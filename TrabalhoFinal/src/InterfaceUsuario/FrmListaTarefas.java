/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author paulo_000
 */
public class FrmListaTarefas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListaTarefas
     */
    public FrmListaTarefas() {
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

        PnlListaTarefa = new javax.swing.JPanel();
        SpnlListaTarefa = new javax.swing.JScrollPane();
        TblListaProdutos = new javax.swing.JTable();
        TxtPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        setTitle("Lista de Tarefas");

        PnlListaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        PnlListaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Tarefas", 0, 0, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TblListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descroção"
            }
        ));
        TblListaProdutos.getTableHeader().setReorderingAllowed(false);
        SpnlListaTarefa.setViewportView(TblListaProdutos);

        BtnPesquisar.setText("Pesquisar");

        BtnVoltar.setText("Voltar");

        javax.swing.GroupLayout PnlListaTarefaLayout = new javax.swing.GroupLayout(PnlListaTarefa);
        PnlListaTarefa.setLayout(PnlListaTarefaLayout);
        PnlListaTarefaLayout.setHorizontalGroup(
            PnlListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpnlListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlListaTarefaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPesquisar)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListaTarefaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );
        PnlListaTarefaLayout.setVerticalGroup(
            PnlListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaTarefaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar))
                .addGap(26, 26, 26)
                .addComponent(SpnlListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JPanel PnlListaTarefa;
    private javax.swing.JScrollPane SpnlListaTarefa;
    private javax.swing.JTable TblListaProdutos;
    private javax.swing.JTextField TxtPesquisar;
    // End of variables declaration//GEN-END:variables
}
