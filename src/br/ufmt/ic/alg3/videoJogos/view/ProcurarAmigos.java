
package br.ufmt.ic.alg3.videoJogos.view;

/**
 *
 * @author Moacyr
 */
public class ProcurarAmigos extends javax.swing.JPanel {

    /**
     * Creates new form ProcurarAmigos
     */
    public ProcurarAmigos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProcurarAmigosjTable = new javax.swing.JTable();
        conteudoProcurarAmigosjLabel = new javax.swing.JLabel();
        conteudoProcurarAmigos2jLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(600, 450));
        setRequestFocusEnabled(false);

        tabelaProcurarAmigosjTable.setModel(new UsuarioTableModel(banco.getAll()));
        jScrollPane1.setViewportView(tabelaProcurarAmigosjTable);

        conteudoProcurarAmigosjLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        conteudoProcurarAmigosjLabel.setForeground(new java.awt.Color(0, 0, 200));
        conteudoProcurarAmigosjLabel.setText("Procurar amigos");

        conteudoProcurarAmigos2jLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        conteudoProcurarAmigos2jLabel.setForeground(new java.awt.Color(200, 0, 0));
        conteudoProcurarAmigos2jLabel.setText("Encontre amigos para socializar e se divertir!");
        conteudoProcurarAmigos2jLabel.setAlignmentX(0.5F);
        conteudoProcurarAmigos2jLabel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conteudoProcurarAmigosjLabel)
                            .addComponent(conteudoProcurarAmigos2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(conteudoProcurarAmigosjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conteudoProcurarAmigos2jLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conteudoProcurarAmigos2jLabel;
    private javax.swing.JLabel conteudoProcurarAmigosjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProcurarAmigosjTable;
    // End of variables declaration//GEN-END:variables

   
}
