/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import Model.Cliente;
import Controller.ClienteC;

/**
 *
 * @author juan
 */
public class ModifcaClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ModifcaClienteView
     */
    public ModifcaClienteView() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PnlDadosPesoal = new javax.swing.JPanel();
        lblIDCliente = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        cFmtCPF = new javax.swing.JFormattedTextField();
        lblNacimento = new javax.swing.JLabel();
        cFmtNacimento = new javax.swing.JFormattedTextField();
        lblSexo = new javax.swing.JLabel();
        cBoxSexo = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        jFmtCelular = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        PnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        jFmtCEP = new javax.swing.JFormattedTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblPonto = new javax.swing.JLabel();
        txtPonto = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        jFmtUF = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        BmnuBarra = new javax.swing.JMenuBar();
        JmnuExecutar = new javax.swing.JMenu();
        mItemSalvar = new javax.swing.JMenuItem();
        mItemCancelar = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modifica Cliente");
        setResizable(false);

        lblIDCliente.setText("ID Cliente:");

        txtIDCliente.setEditable(false);

        lblNome.setText("Nome:");

        lblCPF.setText("CPF:");

        try {
            cFmtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNacimento.setText("Nacimento:");

        try {
            cFmtNacimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblSexo.setText("Sexo:");

        cBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        cBoxSexo.setToolTipText("Sexo");
        cBoxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTelefone.setText("Telefone:");

        try {
            jFmtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFmtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtTelefoneActionPerformed(evt);
            }
        });

        lblCelular.setText("Celular:");

        try {
            jFmtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFmtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCelularActionPerformed(evt);
            }
        });

        lblEmail.setText("E-mail:");

        javax.swing.GroupLayout PnlDadosPesoalLayout = new javax.swing.GroupLayout(PnlDadosPesoal);
        PnlDadosPesoal.setLayout(PnlDadosPesoalLayout);
        PnlDadosPesoalLayout.setHorizontalGroup(
            PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDadosPesoalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlDadosPesoalLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(PnlDadosPesoalLayout.createSequentialGroup()
                        .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblCelular))
                        .addGap(10, 10, 10)
                        .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFmtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jFmtCelular)))
                    .addGroup(PnlDadosPesoalLayout.createSequentialGroup()
                        .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(lblNome)
                            .addComponent(lblSexo)
                            .addComponent(lblIDCliente))
                        .addGap(6, 6, 6)
                        .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PnlDadosPesoalLayout.createSequentialGroup()
                                    .addComponent(cFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNacimento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cFmtNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PnlDadosPesoalLayout.setVerticalGroup(
            PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDadosPesoalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCliente)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(cFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacimento)
                    .addComponent(cFmtNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(cBoxSexo))
                .addGap(18, 18, 18)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDadosPesoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(212, 212, 212))
        );

        jTabbedPane1.addTab("Dados Pessoais", PnlDadosPesoal);

        lblRua.setText("Rua:");

        lblNumero.setText("Numero:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        lblComplemento.setText("Complemento:");

        lblCEP.setText("CEP:");

        lblBairro.setText("Bairro:");

        lblPonto.setText("Ponto de referencia:");

        lblPais.setText("Pais:");

        lblCidade.setText("Cidade:");

        lblUF.setText("UF:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Atualizar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlEnderecoLayout = new javax.swing.GroupLayout(PnlEndereco);
        PnlEndereco.setLayout(PnlEnderecoLayout);
        PnlEnderecoLayout.setHorizontalGroup(
            PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlEnderecoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlEnderecoLayout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade)
                        .addGap(18, 18, 18)
                        .addComponent(lblUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlEnderecoLayout.createSequentialGroup()
                        .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlEnderecoLayout.createSequentialGroup()
                                .addComponent(lblPais)
                                .addGap(26, 26, 26)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PnlEnderecoLayout.createSequentialGroup()
                                    .addComponent(btnCancelar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlEnderecoLayout.createSequentialGroup()
                                        .addComponent(lblPonto)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPonto))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlEnderecoLayout.createSequentialGroup()
                                        .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBairro)
                                            .addComponent(lblCEP))
                                        .addGap(22, 22, 22)
                                        .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PnlEnderecoLayout.createSequentialGroup()
                                                .addComponent(jFmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtBairro)))
                                    .addGroup(PnlEnderecoLayout.createSequentialGroup()
                                        .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRua)
                                            .addComponent(lblNumero))
                                        .addGap(4, 12, Short.MAX_VALUE)
                                        .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PnlEnderecoLayout.createSequentialGroup()
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(lblComplemento)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField3))
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        PnlEnderecoLayout.setVerticalGroup(
            PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEnderecoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblComplemento)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(jFmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPonto)
                    .addComponent(txtPonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblUF)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(PnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Endereço", PnlEndereco);

        JmnuExecutar.setText("Executar");
        JmnuExecutar.setToolTipText("");

        mItemSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mItemSalvar.setText("Salvar");
        JmnuExecutar.add(mItemSalvar);

        mItemCancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mItemCancelar.setText("Cancelar");
        JmnuExecutar.add(mItemCancelar);

        mItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Exit-18dp.png"))); // NOI18N
        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        JmnuExecutar.add(mItemSair);

        BmnuBarra.add(JmnuExecutar);

        setJMenuBar(BmnuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void jFmtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtTelefoneActionPerformed

    private void jFmtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCelularActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
       this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        JOptionPane.showMessageDialog(null,"Salvo!");
        new ListaCliente().setVisible(true);
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(ModifcaClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifcaClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifcaClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifcaClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifcaClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BmnuBarra;
    private javax.swing.JMenu JmnuExecutar;
    private javax.swing.JPanel PnlDadosPesoal;
    private javax.swing.JPanel PnlEndereco;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cBoxSexo;
    private javax.swing.JFormattedTextField cFmtCPF;
    private javax.swing.JFormattedTextField cFmtNacimento;
    private javax.swing.JFormattedTextField jFmtCEP;
    private javax.swing.JFormattedTextField jFmtCelular;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JFormattedTextField jFmtUF;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNacimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPonto;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JMenuItem mItemCancelar;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JMenuItem mItemSalvar;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPonto;
    // End of variables declaration//GEN-END:variables

    
}
