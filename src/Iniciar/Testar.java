package Iniciar;

import Projeto.Banco;
import Projeto.ContaCorrente;
import Projeto.ContaPoupanca;
import javax.swing.JOptionPane;

public class Testar extends javax.swing.JFrame {

    Banco banco = new Banco();

    public Testar() {
        initComponents();
        super.pack();

        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCriarConta = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTiposConta = new javax.swing.JComboBox<>();
        jButtonSalvarConta = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDialogDeposito = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldContaDepositar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldValorDepositar = new javax.swing.JTextField();
        jButtonConcluirDepsoito = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jDialogSacar = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldContaSacar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldValorSacar = new javax.swing.JTextField();
        jButtonConcluirSaque = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jDialogTransferir = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldContaDestino = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldMontante = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButtonConcluirtransferencia = new javax.swing.JButton();
        jTextFieldContaOrigem = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jDialogRemoverConta = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldContaRemover = new javax.swing.JTextField();
        Remover = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContas = new javax.swing.JTable();
        jButtonDepositar = new javax.swing.JButton();
        jButtonSacar = new javax.swing.JButton();
        jButtonTransferir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCriarConta = new javax.swing.JButton();
        jButtonRemoverConta = new javax.swing.JButton();
        jLabelNumeroDaConta = new javax.swing.JLabel();
        jLabelTipoDeConta = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jDialogCriarConta.setLocationRelativeTo(null);

        jLabel5.setText("Tipo de conta :");

        jComboBoxTiposConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta corrente", "Conta poupança" }));

        jButtonSalvarConta.setBackground(new java.awt.Color(0, 204, 0));
        jButtonSalvarConta.setText("Salvar");
        jButtonSalvarConta.setBorderPainted(false);
        jButtonSalvarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarContaActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(0, 204, 0));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Criação de conta");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButtonSalvarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTiposConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTiposConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButtonSalvarConta)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogCriarContaLayout = new javax.swing.GroupLayout(jDialogCriarConta.getContentPane());
        jDialogCriarConta.getContentPane().setLayout(jDialogCriarContaLayout);
        jDialogCriarContaLayout.setHorizontalGroup(
            jDialogCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogCriarContaLayout.setVerticalGroup(
            jDialogCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Número da conta :");

        jTextFieldContaDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaDepositarActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor :");

        jButtonConcluirDepsoito.setBackground(new java.awt.Color(51, 255, 204));
        jButtonConcluirDepsoito.setText("Depositar");
        jButtonConcluirDepsoito.setBorderPainted(false);
        jButtonConcluirDepsoito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirDepsoitoActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(51, 255, 204));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Depósito Bancário");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldContaDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButtonConcluirDepsoito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldContaDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldValorDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButtonConcluirDepsoito)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jDialogDepositoLayout = new javax.swing.GroupLayout(jDialogDeposito.getContentPane());
        jDialogDeposito.getContentPane().setLayout(jDialogDepositoLayout);
        jDialogDepositoLayout.setHorizontalGroup(
            jDialogDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogDepositoLayout.setVerticalGroup(
            jDialogDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setText("Número da conta :");

        jTextFieldContaSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaSacarActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor :");

        jButtonConcluirSaque.setBackground(new java.awt.Color(51, 255, 204));
        jButtonConcluirSaque.setText("Sacar");
        jButtonConcluirSaque.setBorderPainted(false);
        jButtonConcluirSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirSaqueActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(51, 255, 204));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Saque Bancário");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldContaSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButtonConcluirSaque)
                .addGap(228, 228, 228))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldContaSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldValorSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButtonConcluirSaque)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogSacarLayout = new javax.swing.GroupLayout(jDialogSacar.getContentPane());
        jDialogSacar.getContentPane().setLayout(jDialogSacarLayout);
        jDialogSacarLayout.setHorizontalGroup(
            jDialogSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSacarLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialogSacarLayout.setVerticalGroup(
            jDialogSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel14.setText("Número da conta origem :");

        jLabel15.setText("Número da conta destino :");

        jLabel16.setText("Valor a tranferir :");

        jButtonConcluirtransferencia.setBackground(new java.awt.Color(51, 255, 204));
        jButtonConcluirtransferencia.setText("Transferir");
        jButtonConcluirtransferencia.setBorderPainted(false);
        jButtonConcluirtransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirtransferenciaActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(51, 255, 204));

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jLabel13.setText("Transferência Bancária");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldContaDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jTextFieldMontante, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldContaOrigem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConcluirtransferencia)
                .addGap(244, 244, 244))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButtonConcluirtransferencia))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMontante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogTransferirLayout = new javax.swing.GroupLayout(jDialogTransferir.getContentPane());
        jDialogTransferir.getContentPane().setLayout(jDialogTransferirLayout);
        jDialogTransferirLayout.setHorizontalGroup(
            jDialogTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogTransferirLayout.setVerticalGroup(
            jDialogTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogRemoverConta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Número de conta :");

        Remover.setBackground(new java.awt.Color(255, 0, 0));
        Remover.setText("Remover");
        Remover.setBorderPainted(false);
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Remoção de conta ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldContaRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Remover)
                .addGap(205, 205, 205))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldContaRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(Remover)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogRemoverContaLayout = new javax.swing.GroupLayout(jDialogRemoverConta.getContentPane());
        jDialogRemoverConta.getContentPane().setLayout(jDialogRemoverContaLayout);
        jDialogRemoverContaLayout.setHorizontalGroup(
            jDialogRemoverContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogRemoverContaLayout.setVerticalGroup(
            jDialogRemoverContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jTableContas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTableContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número de conta", "Tipo de conta", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContas);

        jButtonDepositar.setBackground(new java.awt.Color(255, 255, 51));
        jButtonDepositar.setText("Depositar ");
        jButtonDepositar.setBorderPainted(false);
        jButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        jButtonSacar.setBackground(new java.awt.Color(255, 255, 51));
        jButtonSacar.setText("Sacar");
        jButtonSacar.setBorderPainted(false);
        jButtonSacar.setFocusPainted(false);
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });

        jButtonTransferir.setBackground(new java.awt.Color(255, 255, 51));
        jButtonTransferir.setText("Transferir");
        jButtonTransferir.setBorderPainted(false);
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Contas disponíveis :");

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Gerar relatórios");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Tipo de conta :");

        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Número da conta :");

        jButtonCriarConta.setBackground(new java.awt.Color(0, 204, 0));
        jButtonCriarConta.setText("Criar Conta");
        jButtonCriarConta.setBorderPainted(false);
        jButtonCriarConta.setContentAreaFilled(false);
        jButtonCriarConta.setFocusPainted(false);
        jButtonCriarConta.setOpaque(true);
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });

        jButtonRemoverConta.setBackground(new java.awt.Color(255, 0, 51));
        jButtonRemoverConta.setText("Remover Conta");
        jButtonRemoverConta.setBorderPainted(false);
        jButtonRemoverConta.setContentAreaFilled(false);
        jButtonRemoverConta.setFocusPainted(false);
        jButtonRemoverConta.setOpaque(true);
        jButtonRemoverConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverContaActionPerformed(evt);
            }
        });

        jLabelTipoDeConta.setForeground(new java.awt.Color(240, 240, 240));

        jLabel18.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 51));
        jLabel18.setText("BANCO FBI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTransferir)
                            .addComponent(jButtonDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipoDeConta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRemoverConta)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCriarConta)
                        .addComponent(jLabel1))
                    .addComponent(jLabelNumeroDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabelTipoDeConta, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonRemoverConta)
                        .addGap(1, 1, 1)))
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonSacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTransferir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDepositar)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositarActionPerformed
        jDialogDeposito.setVisible(true);
        jDialogDeposito.pack();
        jDialogDeposito.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonDepositarActionPerformed

    private void jButtonSalvarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarContaActionPerformed
        if (jComboBoxTiposConta.getSelectedIndex() == 0) {
            ContaCorrente cc = new ContaCorrente();
            cc.setNumeroDeConta(banco.getContas().size());
            banco.inserir(cc);
        } else {
            ContaPoupanca cp = new ContaPoupanca();
            cp.setNumeroDeConta(banco.getContas().size());
            banco.inserir(cp);
        }
        jDialogCriarConta.dispose();
        jTableContas = banco.listar(jTableContas);
    }//GEN-LAST:event_jButtonSalvarContaActionPerformed

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        jDialogCriarConta.setVisible(true);
        jDialogCriarConta.pack();
        jDialogCriarConta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonCriarContaActionPerformed

    private void jTextFieldContaSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaSacarActionPerformed

    }//GEN-LAST:event_jTextFieldContaSacarActionPerformed

    private void jTextFieldContaDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaDepositarActionPerformed

    }//GEN-LAST:event_jTextFieldContaDepositarActionPerformed

    private void jButtonRemoverContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverContaActionPerformed
        jDialogRemoverConta.setVisible(true);
        jDialogRemoverConta.pack();
        jDialogRemoverConta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonRemoverContaActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        boolean flag = false;
        for (int i = 0; i < banco.getContas().size(); i++) {
            if (Integer.parseInt(jTextFieldContaRemover.getText()) == banco.getContas().get(i).getNumeroDeConta()) {
                flag = banco.remover(banco.getContas().get(i));

            }
        }
        if (flag) {
            JOptionPane.showMessageDialog(null, "Conta Removida com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "A conta que deseja remover não existe!");
        }
        jTableContas = banco.listar(jTableContas);
        jDialogRemoverConta.dispose();
    }//GEN-LAST:event_RemoverActionPerformed

    private void jButtonConcluirDepsoitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirDepsoitoActionPerformed
        double valor = Integer.parseInt(jTextFieldValorDepositar.getText());

        for (int i = 0; i < banco.getContas().size(); i++) {
            if (Integer.parseInt(jTextFieldContaDepositar.getText()) == banco.getContas().get(i).getNumeroDeConta()
                    && banco.getContas().get(i) instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) banco.getContas().get(i);
                cc.depositar(valor);
                jTableContas = banco.listar(jTableContas);
                banco.getContas().set(i, cc);
                jDialogDeposito.dispose();
                return;
            } else {
                if (Integer.parseInt(jTextFieldContaDepositar.getText()) == banco.getContas().get(i).getNumeroDeConta()
                        && banco.getContas().get(i) instanceof ContaPoupanca) {
                    banco.getContas().get(i).depositar(valor);
                    jTableContas = banco.listar(jTableContas);
                    jDialogDeposito.dispose();
                    return;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Conta inexistente!");
    }//GEN-LAST:event_jButtonConcluirDepsoitoActionPerformed

    private void jButtonConcluirSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirSaqueActionPerformed
        double valor = Integer.parseInt(jTextFieldValorSacar.getText());

        for (int i = 0; i < banco.getContas().size(); i++) {
            if (Integer.parseInt(jTextFieldContaSacar.getText()) == banco.getContas().get(i).getNumeroDeConta()
                    && banco.getContas().get(i) instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) banco.getContas().get(i);
                cc.sacar(valor);
                jTableContas = banco.listar(jTableContas);
                banco.getContas().set(i, cc);
                jDialogSacar.dispose();
                return;
            } else {
                if (Integer.parseInt(jTextFieldContaSacar.getText()) == banco.getContas().get(i).getNumeroDeConta()
                        && banco.getContas().get(i) instanceof ContaPoupanca) {
                    ContaPoupanca cp = (ContaPoupanca) banco.getContas().get(i);
                    cp.sacar(valor);
                    banco.getContas().set(i, cp);
                    jTableContas = banco.listar(jTableContas);
                    jDialogSacar.dispose();
                    return;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "A conta na qual deseja sacar não existe!");

    }//GEN-LAST:event_jButtonConcluirSaqueActionPerformed

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed
        jDialogSacar.setVisible(true);
        jDialogSacar.pack();
        jDialogSacar.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButtonSacarActionPerformed


    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed
        jDialogTransferir.setVisible(true);
        jDialogTransferir.pack();
        jDialogTransferir.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonTransferirActionPerformed


    private void jButtonConcluirtransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirtransferenciaActionPerformed
        int contaOrigem = Integer.parseInt(jTextFieldContaOrigem.getText());
        int contaDestino = Integer.parseInt(jTextFieldContaDestino.getText());
        double montante = Double.parseDouble(jTextFieldMontante.getText());

        for (int i = 0; i < banco.getContas().size(); i++) {
            if (contaOrigem == banco.getContas().get(i).getNumeroDeConta()) {
                for (int j = 0; j < banco.getContas().size(); j++) {
                    if (contaDestino == banco.getContas().get(j).getNumeroDeConta() && banco.getContas().get(j).getSaldo() >= (montante + 5)) {
                        banco.getContas().get(i).transferir(montante, banco.getContas().get(j));
                        jTableContas = banco.listar(jTableContas);
                        return;
                    }
                }

            }

        }
        JOptionPane.showMessageDialog(null, "A transferencia nao pode ser feita");
        jDialogTransferir.dispose();


    }//GEN-LAST:event_jButtonConcluirtransferenciaActionPerformed
    //Metodo responsavel por mostrar os dados na tela
    private void jTableContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContasMouseClicked

        String num = Integer.toString((int) jTableContas.getValueAt(jTableContas.getSelectedRow(), 0));
        String tipo = (String) jTableContas.getValueAt(jTableContas.getSelectedRow(), 1);
        jLabelTipoDeConta.setText(tipo);
        jLabelNumeroDaConta.setText(num);

    }//GEN-LAST:event_jTableContasMouseClicked
    //Metodo responsavel por abrir a caixa de dialogo para mostrar dados de todas contas
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        banco.mostrarDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Testar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Remover;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConcluirDepsoito;
    private javax.swing.JButton jButtonConcluirSaque;
    private javax.swing.JButton jButtonConcluirtransferencia;
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JButton jButtonDepositar;
    private javax.swing.JButton jButtonRemoverConta;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JButton jButtonSalvarConta;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JComboBox<String> jComboBoxTiposConta;
    private javax.swing.JDialog jDialogCriarConta;
    private javax.swing.JDialog jDialogDeposito;
    private javax.swing.JDialog jDialogRemoverConta;
    private javax.swing.JDialog jDialogSacar;
    private javax.swing.JDialog jDialogTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNumeroDaConta;
    private javax.swing.JLabel jLabelTipoDeConta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContas;
    private javax.swing.JTextField jTextFieldContaDepositar;
    private javax.swing.JTextField jTextFieldContaDestino;
    private javax.swing.JTextField jTextFieldContaOrigem;
    private javax.swing.JTextField jTextFieldContaRemover;
    private javax.swing.JTextField jTextFieldContaSacar;
    private javax.swing.JTextField jTextFieldMontante;
    private javax.swing.JTextField jTextFieldValorDepositar;
    private javax.swing.JTextField jTextFieldValorSacar;
    // End of variables declaration//GEN-END:variables
}
