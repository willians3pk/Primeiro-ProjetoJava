
package br.com.Telas.Cadastros;

import br.com.Class.Curso;
import br.com.Class.Endereco;
import br.com.Class.Pessoa;
import br.com.conexoes.TabelaBanco.BancoSQLite;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cadastro extends javax.swing.JFrame {
    
    BancoSQLite bancoSQL;

    public void setBancoSQL(BancoSQLite bancoSQL) {
        this.bancoSQL = bancoSQL;
    }
    
    public Cadastro() {
    initComponents();
    }
/*------------------------------------------------------------------------------
 ---------------------- OBJETOS DAS CLASSES ------------------------------------
 ------------------------------------------------------------------------------*/
    
    ArrayList<Pessoa> listCadastro;
    Curso curso;    
        
    public void setListPessoa(ArrayList<Pessoa> listAlunos) {
        this.listCadastro = listAlunos;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        camp_Nome = new javax.swing.JTextField();
        camp_DataNascimento = new javax.swing.JFormattedTextField();
        camp_Cpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        camp_Contato = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        camp_Email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        box_Sexo = new javax.swing.JComboBox();
        box_Imprimir = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        camp_Rua = new javax.swing.JTextField();
        camp_Cidade = new javax.swing.JTextField();
        camp_Bairro = new javax.swing.JTextField();
        camp_Estado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        camp_Numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();
        NumeroCadastrado = new javax.swing.JLabel();
        btn_Cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 3, 24), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 16), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(camp_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 314, -1));

        try {
            camp_DataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_DataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(camp_DataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 70, -1));

        try {
            camp_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(camp_Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome Completo:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data de Nascimento:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contato:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        try {
            camp_Contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(camp_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, -1));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cpf:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("E-Mail:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel3.add(camp_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sexo:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, 20));

        box_Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel3.add(box_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, -1));

        box_Imprimir.setBackground(new java.awt.Color(51, 51, 51));
        box_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        box_Imprimir.setText("Imprimir txt");
        jPanel3.add(box_Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 530, 199));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 16), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(camp_Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 270, -1));
        jPanel4.add(camp_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, 128, -1));
        jPanel4.add(camp_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 54, 125, -1));
        jPanel4.add(camp_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 104, 37, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Rua:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cidade:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Bairro:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 34, -1, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Estado:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 85, -1, -1));
        jPanel4.add(camp_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 104, 68, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Numero:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 85, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 223, 530, 153));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTabela.setBackground(new java.awt.Color(102, 102, 102));
        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cpf", "Contato", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabela);

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        NumeroCadastrado.setForeground(new java.awt.Color(204, 204, 204));
        NumeroCadastrado.setText("Nenhum Aluno cadastrado");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(NumeroCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroCadastrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 450, 340));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 35, 1020, 390));

        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Limpar(){
        
        camp_Nome.setText("");
        camp_DataNascimento.setText("");
        camp_Cpf.setText("");
        camp_Contato.setText("");
        camp_Email.setText("");
        camp_Rua.setText("");
        camp_Bairro.setText("");
        camp_Cidade.setText("");
        camp_Estado.setText("");
        camp_Numero.setText("");
            
    }
    
    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
                
        if(camp_Nome.getText().equals("") & camp_Email.getText().equals("") 
            & camp_Rua.getText().equals("") & camp_Bairro.getText().equals("") 
                & camp_Cidade.getText().equals("") & camp_Estado.getText().equals("") 
                    & camp_Numero.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de Cadastro!!!");
            
        }else{
            //------ CRIA NOVO ALUNO ------
            Pessoa pessoa = new Pessoa();
            Endereco end = new Endereco();
            //-----------------------------
            
//------------------- Endereco do Aluno ----------------------------------------   
            
            end.setRua(camp_Rua.getText());
            end.setBairro(camp_Bairro.getText());
            end.setCidade(camp_Cidade.getText());
            end.setEstado(camp_Estado.getText());
            end.setNumeroCasa(camp_Numero.getHeight());
            
//------------------- Dados do Aluno -------------------------------------------           
            pessoa.setNome(camp_Nome.getText());
            pessoa.setDataNascimento(camp_DataNascimento.getText());
            pessoa.setCpf(camp_Cpf.getText());
            pessoa.setTelefone(camp_Contato.getText());
            pessoa.setEmail(camp_Email.getText());
            pessoa.setEndereco(end);
            
            String Sexo = (String) box_Sexo.getSelectedItem();
            if(Sexo.equals("Femenino")){
                pessoa.setSexo("Femenino");
            }else if(Sexo.equals("Masculino")){
                pessoa.setSexo("Masculino");
            }
            
            
//------------------- Adiciona os dados a lista de cadastro --------------------
                listCadastro.add(pessoa);
            try {
                
                bancoSQL.insertPessoa(pessoa); //ADICIONA NO BANCO DE DADOS
                
            } catch (SQLException ex) {
                Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            if(box_Imprimir.isSelected()){pessoa.SalvarBlocoNotas();} // SALVA BLOCO DE NOTAS NA AREA DE TRABALHO
            //ATUALIZA O NUMERO DE CADASTRADOS
            NumeroCadastrado.setText("Quant.Cadastrados: " +curso.quantidadeAluno());

//------------------- Alimenta a Tabela de alunos Cadastrados ------------------            
            DefaultTableModel val = (DefaultTableModel) jTabela.getModel();

                val.addRow(new Object[]{
                    pessoa.getNome(),
                    pessoa.getCpf(),
                    pessoa.getTelefone(),
                    pessoa.getEmail()
                });
            
            
                camp_Nome.requestFocus();// Volta o Cursor do mouse:
               
//------------------- Limpar todos os Campos ----------------------------------           
                Limpar(); // LIMPA OS CAMPOS:
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
        }
        
    }//GEN-LAST:event_btn_CadastrarActionPerformed
 // BOTAO EXCLUIR CADASTROS
    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
 
        int posicao  = jTabela.getSelectedRow();                              // Pega a posicao selecionada e colocar em uma variavel
        listCadastro.remove(posicao);                                         // Remove a posicao da lista
        NumeroCadastrado.setText("Quant.Cadastrados: "+listCadastro.size());  // Atualiza o numero de cadastrados
        
        DefaultTableModel val = (DefaultTableModel) jTabela.getModel();
            val.removeRow(posicao);   //Remove da Tabela o Item Selecionado       
        camp_Nome.requestFocus();    // Volta o Cursor do mouse:
        
    }//GEN-LAST:event_btn_ExcluirActionPerformed
    
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumeroCadastrado;
    private javax.swing.JCheckBox box_Imprimir;
    private javax.swing.JComboBox box_Sexo;
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JTextField camp_Bairro;
    private javax.swing.JTextField camp_Cidade;
    private javax.swing.JFormattedTextField camp_Contato;
    private javax.swing.JFormattedTextField camp_Cpf;
    private javax.swing.JFormattedTextField camp_DataNascimento;
    private javax.swing.JTextField camp_Email;
    private javax.swing.JTextField camp_Estado;
    private javax.swing.JTextField camp_Nome;
    private javax.swing.JTextField camp_Numero;
    private javax.swing.JTextField camp_Rua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables

    
}
