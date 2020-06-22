
package br.com.Telas.Cadastros;

import br.com.Class.Aluno;
import br.com.Class.Curso;
import java.util.ArrayList;

public class PesquisaCadastro extends javax.swing.JFrame {

    
    
    
    public PesquisaCadastro() {
        initComponents();
    }
    
    
    Curso curso;
    ArrayList<Aluno> listCadastro;

    public void setListAlunos(ArrayList<Aluno> listAlunos) {
        this.listCadastro = listAlunos;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        box_Selecione = new javax.swing.JComboBox();
        camp_pesquisa = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        returno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Alunos  Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 520, 180));

        box_Selecione.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Nome", "Cpf", " " }));
        jPanel1.add(box_Selecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, 30));
        jPanel1.add(camp_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 290, 30));

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar por:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 110, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 590, 320));

        returno.setForeground(new java.awt.Color(255, 255, 255));
        returno.setText("jLabel2");
        jPanel2.add(returno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        
        String nome = camp_pesquisa.getText();
        String Dados = curso.buscaPorDadosAluno(nome);
        jTextArea1.setText(Dados);
        
//----------------- PESQUISAR DA LISTA POR NOME OU CPF --------------------
        
        /*String buscarPor = (String) box_Selecione.getSelectedItem();
        ArrayList<Aluno> Localizar = new ArrayList<>();
        
        try {
        //----------------- PESQUISA POR NOMES: -----------------
        if(buscarPor.equals("Nome")){
        for(int i = 0; i< listCadastro.size(); i++){
        if(listCadastro.get(i).getNome().contains(camp_pesquisa.getText())){
        Localizar.add(listCadastro.get(i));
        
        }
        
        }
        //----------------- PESQUISA POR CPF: ------------------
        }else if(buscarPor.equals("Cpf")){
        for(int i = 0; i< listCadastro.size(); i++){
        if(listCadastro.get(i).getCpf().contains(camp_pesquisa.getText())){
        Localizar.add(listCadastro.get(i));
        
        }
        
        }
        
        }else {JOptionPane.showMessageDialog(null, "Selecione a opçao pela qual voce quer buscar!");}
        
        jTextArea1.setText(Localizar.toString());
        
        } catch (Exception e) {
        System.out.println("Erro!!"+e);
        JOptionPane.showMessageDialog(null, "Erro"+e+" voce escreveu algum caractere indevido");
        }*/
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_Selecione;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JTextField camp_pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel returno;
    // End of variables declaration//GEN-END:variables
}
