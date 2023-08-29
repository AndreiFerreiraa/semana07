
package Views;

import Controllers.ContaController;
import Models.Conta;
import javax.swing.JOptionPane;


public class Cliente extends javax.swing.JFrame {
   
    private final ContaController contaController;
    private Conta conta = null;
    
    public Cliente() {
       initComponents();
        contaController = new ContaController();
        solicitaDocumentoCliente();
        this.setLocationRelativeTo(null);    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cliSacar = new javax.swing.JButton();
        cliDep = new javax.swing.JButton();
        cliExtr = new javax.swing.JButton();
        cliTransf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroConta = new javax.swing.JLabel();
        nomeTitular = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cliSacar.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        cliSacar.setText("Sacar");
        cliSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliSacarActionPerformed(evt);
            }
        });

        cliDep.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        cliDep.setText("Depositar");
        cliDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliDepActionPerformed(evt);
            }
        });

        cliExtr.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        cliExtr.setText("Extrato");
        cliExtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliExtrActionPerformed(evt);
            }
        });

        cliTransf.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        cliTransf.setText("Transferir");
        cliTransf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliTransfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel1.setText("Nº Conta :");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setText("Titular :");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel3.setText("Saldo : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cliSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cliDep, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cliExtr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cliTransf, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(nomeTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroConta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTitular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(saldo))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliDep, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cliExtr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cliSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void solicitaDocumentoCliente() {
        do {
            String doc = JOptionPane.showInputDialog("Informe seu documento (CPF/CNPJ)");
            conta = contaController.buscarContaPorDocumentoTitular(doc);
        } while (conta == null);

        this.numeroConta.setText(String.valueOf(conta.getNumero()));
        this.nomeTitular.setText(conta.getTitular().getNome());
        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
    }
     
    
    private void cliDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliDepActionPerformed
        String valor = JOptionPane.showInputDialog("INFORME O VALOR DO DEPÓSITO.");
        double valorConvertido = Double.parseDouble(valor);

        conta = this.contaController.depositar(this.conta, valorConvertido);

        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_cliDepActionPerformed

    private void cliTransfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliTransfActionPerformed
        String pergunta = JOptionPane.showInputDialog("Digite o documento da conta para transferir:");
        Conta contaTrans = contaController.buscarContaPorDocumentoTitular(pergunta);

        Double valor = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DO SAQUE."));
        conta = contaController.transferir(this.conta, contaTrans, valor);
        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_cliTransfActionPerformed

    private void cliSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliSacarActionPerformed
        String valor = JOptionPane.showInputDialog("INFORME O VALOR DO SAQUE.");
        double valorConvertido = Double.parseDouble(valor);

        conta = this.contaController.sacar(this.conta, valorConvertido);

        this.saldo.setText("R$ " + String.valueOf(conta.getSaldo()));
    }//GEN-LAST:event_cliSacarActionPerformed

    private void cliExtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliExtrActionPerformed
        
    }//GEN-LAST:event_cliExtrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
        new Sistema().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cliDep;
    private javax.swing.JButton cliExtr;
    private javax.swing.JButton cliSacar;
    private javax.swing.JButton cliTransf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nomeTitular;
    private javax.swing.JLabel numeroConta;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
