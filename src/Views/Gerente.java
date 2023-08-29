
package Views;


import Controllers.ContaController;
import Controllers.PessoaController;
import Models.Conta;
import Models.Pessoa;
import javax.swing.JOptionPane;
import opp.Opp;


public class Gerente extends javax.swing.JFrame {
    
    private final PessoaController pessoaController;
    private final ContaController contaController;
    
    public Gerente() {
        initComponents();
        pessoaController = new PessoaController();
        contaController = new ContaController();
        
        this.setLocationRelativeTo(null);
    }
    
    
    private void limparCampos() {
        this.digTitular.setText("");
        this.digPfPj.setText("");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tipoTitular = new javax.swing.JComboBox<>();
        contaCorrente = new javax.swing.JRadioButton();
        contaSalario = new javax.swing.JRadioButton();
        contaPoupanca = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        nmTitular = new javax.swing.JLabel();
        digTitular = new javax.swing.JTextField();
        cpfCnpj = new javax.swing.JLabel();
        digPfPj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        criaConta = new javax.swing.JButton();
        voltaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tipoTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica " }));

        buttonGroup1.add(contaCorrente);
        contaCorrente.setFont(new java.awt.Font("Felix Titling", 1, 10)); // NOI18N
        contaCorrente.setText("Conta Corrente");
        contaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaCorrenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(contaSalario);
        contaSalario.setFont(new java.awt.Font("Felix Titling", 1, 10)); // NOI18N
        contaSalario.setText("Conta Salário");

        buttonGroup1.add(contaPoupanca);
        contaPoupanca.setFont(new java.awt.Font("Felix Titling", 1, 10)); // NOI18N
        contaPoupanca.setText("Conta Poupança");

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerente");
        jLabel1.setToolTipText("");

        nmTitular.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        nmTitular.setText("Nome Titular");

        digTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digTitularActionPerformed(evt);
            }
        });

        cpfCnpj.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        cpfCnpj.setText("cpf / cnpj");

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Pessoa");

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Conta");

        criaConta.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        criaConta.setText("CRIAR CONTA");
        criaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaContaActionPerformed(evt);
            }
        });

        voltaCliente.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        voltaCliente.setText("Cliente");
        voltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltaCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(digTitular))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nmTitular)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(contaPoupanca)
                                .addGap(18, 18, 18)
                                .addComponent(contaSalario))
                            .addComponent(contaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfCnpj)
                                    .addComponent(digPfPj, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(criaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(nmTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfCnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digPfPj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contaCorrente)
                    .addComponent(contaSalario)
                    .addComponent(contaPoupanca))
                .addGap(18, 18, 18)
                .addComponent(criaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digTitularActionPerformed
       
    }//GEN-LAST:event_digTitularActionPerformed

    private void criaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaContaActionPerformed
        // PEGA INFORMAÇÕES DO TITULAR
        String nome = this.digTitular.getText();
        String cpfOuCnpj = this.digPfPj.getText();
        String tipoPessoa = (String) this.tipoTitular.getSelectedItem(); 
        
        // CHAMA QUEM CRIA TITULAR
        Pessoa titular = pessoaController.criarPessoa(nome, cpfOuCnpj, tipoPessoa);
           
        // PEGA INFORMAÇÕES DA CONTA
        boolean corrente = this.contaCorrente.isSelected();
        boolean poupanca = this.contaPoupanca.isSelected();
        boolean salario = this.contaSalario.isSelected();     
        
        // CHAMA QUEM CRIA CONTA
        int numeroConta = contaController.criarConta(titular, corrente, poupanca, salario);
            
        JOptionPane.showMessageDialog(this, "Sua conta foi criada com sucesso. O número dela é: " + numeroConta);
        limparCampos();
        
        for(Conta c : Opp.banco){
            System.out.println("Nº: " + c.getNumero() + " Titular: " + c.getTitular().getNome());
        }
         
    }//GEN-LAST:event_criaContaActionPerformed

    private void contaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaCorrenteActionPerformed
        
    }//GEN-LAST:event_contaCorrenteActionPerformed

    private void voltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaClienteActionPerformed
      this.dispose();
      new Cliente().setVisible(true);
    }//GEN-LAST:event_voltaClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton contaCorrente;
    private javax.swing.JRadioButton contaPoupanca;
    private javax.swing.JRadioButton contaSalario;
    private javax.swing.JLabel cpfCnpj;
    private javax.swing.JButton criaConta;
    private javax.swing.JTextField digPfPj;
    private javax.swing.JTextField digTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nmTitular;
    private javax.swing.JComboBox<String> tipoTitular;
    private javax.swing.JButton voltaCliente;
    // End of variables declaration//GEN-END:variables
}
