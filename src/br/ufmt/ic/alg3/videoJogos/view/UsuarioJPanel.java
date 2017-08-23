/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.view;

import br.ufmt.ic.alg3.videoJogos.view.ProcurarAmigos;
import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import br.ufmt.ic.alg3.videoJogos.persistencia.UsuarioPersistencia;
import br.ufmt.ic.alg3.videoJogos.persistencia.arquivo.UsuarioPersistenciaArquivo;
import javax.swing.JOptionPane;


/**
 *
 * @author Moacyr
 */
public class UsuarioJPanel extends javax.swing.JPanel {

    private static UsuarioPersistencia 
                banco = new UsuarioPersistenciaArquivo();
    
    /**
     * Creates new form UsuarioJPanel
     */
    public UsuarioJPanel() {
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

        nomejLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        senhajLabel = new javax.swing.JLabel();
        dataNascjLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        senhajPasswordField = new javax.swing.JPasswordField();
        dataNascjTextField = new javax.swing.JTextField();
        idjLabel = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        salvarjButton = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        nomejLabel.setText("Nome:");

        emailjLabel.setText("E-mail:");

        senhajLabel.setText("Senha:");

        dataNascjLabel.setText("DataNasc:");

        idjLabel.setText("ID:");

        idjTextField.setEnabled(false);
        idjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idjTextFieldActionPerformed(evt);
            }
        });

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 200));
        jLabel1.setText("Cadastrar Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataNascjLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senhajLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailjLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idjLabel)
                                    .addComponent(nomejLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salvarjButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                    .addComponent(cancelarjButton))
                                .addComponent(nomejTextField)
                                .addComponent(emailjTextField)
                                .addComponent(senhajPasswordField)
                                .addComponent(dataNascjTextField))
                            .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjLabel)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhajLabel)
                    .addComponent(senhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascjLabel)
                    .addComponent(dataNascjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(cancelarjButton))
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idjTextFieldActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        nomejTextField.setText("");
        emailjTextField.setText("");
        senhajPasswordField.setText("");
        dataNascjTextField.setText("");
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        Usuario novo = new Usuario();
        novo.setNome(nomejTextField.getText());
        novo.setEmail(emailjTextField.getText());
        novo.setSenha(senhajPasswordField.getText());
        novo.setDataNasc(dataNascjTextField.getText());        
        /* Aqui eu salvo os campos te texto na classe*/
        // TODO add your handling code here:
        
        //AQUI VAI FICAR A PARTE DE PERSISTIR NO BANCO DE DADOS
        banco.inserir(novo);
        
        JOptionPane.showMessageDialog(
                salvarjButton, "Cadastrado com Sucesso!");
        
        cancelarjButtonActionPerformed(null);
        
      /*  ResponsavelTableModel modelo = 
                (ResponsavelTableModel) tabelajTable.getModel();
        
        modelo.fireTableRowsInserted(0, 1);*/
      //  banco.inserir(novo);
       // banco.remover(novo);
        UsuarioTableModel modelo = 
                (UsuarioTableModel) tabelaProcurarAmigosjTable.getModel();
        
        modelo.fireTableRowsInserted(0, 1);
                 
    }//GEN-LAST:event_salvarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JLabel dataNascjLabel;
    private javax.swing.JTextField dataNascjTextField;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JLabel senhajLabel;
    private javax.swing.JPasswordField senhajPasswordField;
    // End of variables declaration//GEN-END:variables
}
