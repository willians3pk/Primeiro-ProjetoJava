
package br.com.Telas.Professores;

import br.com.Class.Endereco;
import br.com.Class.Professor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroProfessor extends javax.swing.JPanel {

   
    public CadastroProfessor() {
        initComponents();
    }
    
    ArrayList<Professor> listCadastroProf;
    
    public void setListCadastroProf(ArrayList<Professor> listProfessor){
        this.listCadastroProf = listProfessor;
        
    }
//---------------- Limpa as Caixas de Texto -------------------------------------    
    public void limpar(){
        campNomeProf.setText("");
        campDataProf.setText("");
        campCpfProf.setText("");
        campEmailProf.setText("");
        campTelefoneProf.setText("");
        campRuaProf.setText("");
        campBairroProf.setText("");
        campEstadoProf.setText("");
        campCidadeProf.setText("");
        campNumeroProf.setText("");
        
    }
 //-----------------------------------------------------------------------------
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campRuaProf = new javax.swing.JTextField();
        campBairroProf = new javax.swing.JTextField();
        campNumeroProf = new javax.swing.JTextField();
        campEstadoProf = new javax.swing.JTextField();
        campCidadeProf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();
        NumeroCadastrado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campNomeProf = new javax.swing.JTextField();
        campEmailProf = new javax.swing.JTextField();
        campTelefoneProf = new javax.swing.JTextField();
        campDataProf = new javax.swing.JFormattedTextField();
        boxSexoProf = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        box_Imprimir1 = new javax.swing.JCheckBox();
        campCpfProf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 153));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO DE PROFESSORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1230, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rua:");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bairro:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cidade:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel2.add(campRuaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 400, -1));
        jPanel2.add(campBairroProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 400, -1));
        jPanel2.add(campNumeroProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));
        jPanel2.add(campEstadoProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, 20));
        jPanel2.add(campCidadeProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 150, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 540, 260));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 540, 10));

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
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
        jTabela.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTabela);

        btn_Excluir.setForeground(new java.awt.Color(51, 51, 51));
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        NumeroCadastrado.setForeground(new java.awt.Color(255, 255, 255));
        NumeroCadastrado.setText("Nenhum Professor cadastrado");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(NumeroCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroCadastrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 450, 470));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data de Nascimento:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        try {
            campDataProf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##  /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        boxSexoProf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        boxSexoProf.setForeground(new java.awt.Color(0, 0, 0));
        boxSexoProf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        boxSexoProf.setToolTipText("");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");

        box_Imprimir1.setBackground(new java.awt.Color(0, 0, 102));
        box_Imprimir1.setForeground(new java.awt.Color(255, 255, 255));
        box_Imprimir1.setText("Imprimir txt");

        try {
            campCpfProf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campDataProf, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(box_Imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxSexoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campEmailProf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campTelefoneProf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campCpfProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campDataProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxSexoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campCpfProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campTelefoneProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campEmailProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(box_Imprimir1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 540, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//----------------------------------------------------------------------------//
    if (campNomeProf.getText().equals("") ||
        campCpfProf.getText().equals("") ||
        campTelefoneProf.getText().equals("") ||
        campDataProf.getText().equals("") ||
        campEmailProf.getText().equals("") || campRuaProf.getText().equals("") || 
        campBairroProf.getText().equals("") || campCidadeProf.getText().equals("") ||
        campEstadoProf.getText().equals("") || campNumeroProf.getText().equals("") ){
        
            JOptionPane.showMessageDialog(null, "Verifique se as informações foram preenchidas corretamente.");
        
    }else{
//--------------- Novo Professor ---------------------------------------------//        
        Professor prof = new Professor();
        Endereco end = new Endereco();
        
//--------------- Endereço Professor -----------------------------------------//
        end.setRua(campRuaProf.getText());
        end.setEstado(campEstadoProf.getText());
        end.setCidade(campCidadeProf.getText());
        end.setNumeroCasa(campNumeroProf.getHeight());
        end.setBairro(campBairroProf.getText());
        
//--------------- Dados do Professor -----------------------------------------//
        prof.setNome(campNomeProf.getText());
        prof.setCpf(campCpfProf.getText());
        prof.setDataNascimento(campDataProf.getText());
        prof.setEmail(campEmailProf.getText());
        prof.setTelefone(campTelefoneProf.getText());
        prof.setEndereco(end);
        String Sexo = (String) boxSexoProf.getSelectedItem();
        if (Sexo.equals("Masculino")){
            prof.setSexo("Masculino");
        }
        else if (Sexo.equals("Feminino")){
            prof.setSexo("Feminino");        }
        
        //------------------- Adiciona os dados a lista de cadastro -------------------- 
        
            //ADICIONA NA LISTA   ****** NAO TA FUNCIONANDO **********
            listCadastroProf.add(prof);
       //_____________________________________________________________________//
       
       
           if(box_Imprimir1.isSelected()){
                prof.SalvarBlocoNotas();} // SALVA BLOCO DE NOTAS NA AREA DE TRABALHO
              
            
       //------------------- Alimenta a Tabela de alunos Cadastrados ------------------            
            DefaultTableModel val = (DefaultTableModel) jTabela.getModel();

                val.addRow(new Object[]{
                    prof.getNome(),
                    prof.getCpf(),
                    prof.getTelefone(),
                    prof.getEmail()
                });
            
                campNomeProf.requestFocus();// Volta o Cursor do mouse:    
            
        limpar(); // Limpa os Campos
        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
        
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
/**
        int posicao  = jTabela.getSelectedRow();                              // Pega a posicao selecionada e colocar em uma variavel
        listCadastroProf.remove(posicao);                                         // Remove a posicao da lista
        NumeroCadastrado.setText("Quant.Cadastrados: "+listCadastroProf.size());  // Atualiza o numero de cadastrados

        DefaultTableModel val = (DefaultTableModel) jTabela.getModel();
        val.removeRow(posicao);   //Remove da Tabela o Item Selecionado
        campNomeProf.requestFocus();    // Volta o Cursor do mouse:
**/
    }//GEN-LAST:event_btn_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumeroCadastrado;
    private javax.swing.JComboBox<String> boxSexoProf;
    private javax.swing.JCheckBox box_Imprimir1;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JTextField campBairroProf;
    private javax.swing.JTextField campCidadeProf;
    private javax.swing.JFormattedTextField campCpfProf;
    private javax.swing.JFormattedTextField campDataProf;
    private javax.swing.JTextField campEmailProf;
    private javax.swing.JTextField campEstadoProf;
    private javax.swing.JTextField campNomeProf;
    private javax.swing.JTextField campNumeroProf;
    private javax.swing.JTextField campRuaProf;
    private javax.swing.JTextField campTelefoneProf;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
