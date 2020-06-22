package br.com.Telas;

import br.com.Telas.Cadastros.Cadastro;
import br.com.Telas.Cadastros.PesquisaCadastro;
import br.com.Telas.Disciplinas.TelaDisciplinas;
import br.com.Class.Aluno;
import br.com.Class.Curso;
import br.com.Class.Pessoa;
import br.com.Telas.Disciplinas.TelaCadFuncionarios;
import br.com.Telas.Professores.TelaProfessor;
import br.com.conexoes.ConexaoSQLite;
import br.com.conexoes.TabelaBanco.BancoSQLite;
import java.awt.Color;
import java.util.ArrayList;


public class MenuPrincipal extends javax.swing.JFrame {

/////////////////////////// Variaveis //////////////////////////////////////////
    
    Color panedefault;
    Color paneClicked;
    Color FocoMouse;
    Color ExitedMouse;
    Color focomouse;
    Color exitedmouse;
    
/*-------------------------------------------------------------------------------
------------------------------- METODO CONSTRUTOR -------------------------------
--------------------------------------------------------------------------------*/  
      
    public MenuPrincipal(){
        
        initComponents();
        //curso.addListAluno(listaCadastro);
        btn_Config2.setVisible(false);

    //---------- INSTANCIAÇÃO DAS CLASS DE CONEXAO COM BANCO ----------//
        
        ConexaoSQLite conexaoSQL = new ConexaoSQLite();
        BancoSQLite   bancoSQL   = new BancoSQLite(conexaoSQL);
        cad.setBancoSQL(bancoSQL);
        
//------------------------------------------------------------------------------//
        
        panedefault = new Color(0,62,172);
        paneClicked = new Color(255,255,255);
        panel1.setBackground(panedefault);
        panel2.setBackground(panedefault);
        panel3.setBackground(panedefault);
        panel4.setBackground(panedefault);
        panel5.setBackground(panedefault);
        
        FocoMouse = new Color(204,51,0);
        ExitedMouse = new Color(0,62,172);
        
        exitedmouse = new Color(37,51,61);
        focomouse = new Color(204,51,0);
        
    }
    
/*------------------------------------------------------------------------------
 ------------------------ OBJETOS DAS CLASSES ----------------------------------
 ------------------------------------------------------------------------------*/
    
    Curso curso = new Curso();
    Aluno aluno = new Aluno();
    ArrayList<Pessoa> listaCadastro = new ArrayList<>();
    Notas notas = new Notas();
    
/*------------------------------------------------------------------------------
 ------------------------ OBJETOS DAS TELAS ------------------------------------
 ------------------------------------------------------------------------------*/  
    
    Cadastro cad = new Cadastro();
    TelaDisciplinas d = new TelaDisciplinas();
    TelaPerfil p = new TelaPerfil();
    PesquisaCadastro pesquisa = new PesquisaCadastro();
    TelaProfessor pf = new TelaProfessor();
    TelaCadFuncionarios telacad = new TelaCadFuncionarios();

    
/*------------------------------------------------------------------------------
 ------------------------ FUNÇÕES MENU LATERAL ---------------------------------
 ------------------------------------------------------------------------------*/

    public void ClickedjpDisciplinas(){
        
//--------------- Mudar Status de "Cor" do Botão quando clicado ----------------
        
        panel1.setBackground(paneClicked);// Selecionado
        panel2.setBackground(panedefault);
        panel3.setBackground(panedefault);
        panel4.setBackground(panedefault);
        panel5.setBackground(panedefault);
        
        //Chama Tela de Disciplinas:
        try {
            
            d.setSize(1230, 620);
            d.setLocation(0,0);
            d.setVisible(true);
            jDesktopPane1.removeAll(); // Remove Objetos Limpando a Area de Trabalho:
            jDesktopPane1.add(d);// Adiciona o Objeto na Area de Trabalho:
            
//--------------- Normaliza o Menu Lateral: ---------------           
            
            Recuo_Menu.setVisible(false);
            Avanco_Menu.setVisible(true);
            RecuoMenu();
            
        } catch (Exception e) {
            System.out.println("Erro!!! "+e);// captura o erro caso ocorra!
        }

    }
    private void ClickedjpCronograma(){
        
//--------------- Mudar Status de "Cor" do Botão quando clicado ----------------         
        panel1.setBackground(panedefault); 
        panel2.setBackground(paneClicked);// Selecionado
        panel3.setBackground(panedefault);
        panel4.setBackground(panedefault);
        panel5.setBackground(panedefault);

    }
    private void ClickedjpAjustes(){
        
//--------------- Mudar Status de "Cor" do Botão quando clicado ----------------        
        panel1.setBackground(panedefault); 
        panel2.setBackground(panedefault);
        panel3.setBackground(paneClicked); // Selecionado
        panel4.setBackground(panedefault);
        panel5.setBackground(panedefault);
        
    }
    // Abri a Tela Professores //////////////////////////////////////////////////
    private void ClickedjpProfessores(){

//------------ Mudar Status de "Cor" do Botão quando clicado ------------------- 
        
        panel1.setBackground(panedefault); 
        panel2.setBackground(panedefault);
        panel3.setBackground(panedefault);
        panel4.setBackground(paneClicked);// Selecionado
        panel5.setBackground(panedefault);
        
//Chama Tela de Disciplinas:
        try {
            
            pf.setSize(1230, 620);
            pf.setLocation(0,0);
            pf.setVisible(true);
            jDesktopPane1.removeAll(); // Remove Objetos Limpando a Area de Trabalho:
            jDesktopPane1.add(pf);// Adiciona o Objeto "TelaDisciplinas" na Area de Trabalho:
            
//------------------------- Normaliza o Menu Lateral: --------------------------          
            
            Recuo_Menu.setVisible(false);
            Avanco_Menu.setVisible(true);
            RecuoMenu();
            
        } catch (Exception e) {
            System.out.println("Erro!!! "+e);// captura o erro caso ocorra!
        }
        
    }
    private void ClickedjpPerfil(){
        
 //--------------- Mudar Status de "Cor" do Botão quando clicado ---------------      
        panel1.setBackground(panedefault); 
        panel2.setBackground(panedefault);
        panel3.setBackground(panedefault);
        panel4.setBackground(panedefault);
        panel5.setBackground(paneClicked);// Selecionado
        
//----------------------------- Chama Tela Perfil -----------------------------
        
        jDesktopPane1.removeAll(); // Remove Objetos Limpando a Area de Trabalho:
        p.setVisible(true);
        p.setSize(1230, 620); // tamanho do objeto:
        p.setLocation(0,0); // Localização do objeto:
        jDesktopPane1.add(p); // Adiciona o Objeto na Area de Trabalho:
        
//--------------- Normaliza o Menu Lateral: ---------------         
        Recuo_Menu.setVisible(false);
        Avanco_Menu.setVisible(true);
        RecuoMenu();
        
    }

//--------------- Metodo Avançar Menu Lateral:    
    private void AvancoMenu(){
                    
        Thread th = new Thread(){
            @Override
            public void run (){
                try {
                    for(int a = 0; a <=8; a++){
                        Thread.sleep(20);
                        if(a==1){Menu_Lateral.setLocation(-85, 70);}
                        if(a==2){Menu_Lateral.setLocation(-75, 70);}
                        if(a==3){Menu_Lateral.setLocation(-65, 70);}
                        if(a==4){Menu_Lateral.setLocation(-55, 70);}
                        if(a==5){Menu_Lateral.setLocation(-45, 70);}
                        if(a==6){Menu_Lateral.setLocation(-35, 70);}
                        if(a==7){Menu_Lateral.setLocation(-25, 70);}
                        if(a==8){Menu_Lateral.setLocation( 0, 70);}

                        Avanco_Menu.setVisible(false);
                        Recuo_Menu.setVisible(true);

                    }

                } catch (Exception ex) {
                    System.out.println(ex);

                }

            }

        };th.start();
    }

//--------------- Metodo Recuar Menu Lateral:    
    private void RecuoMenu(){
                     
        Thread th = new Thread(){
            @Override
            public void run (){
                try {
                    for(int a = 0; a <=8; a++){
                        Thread.sleep(20);
                        if(a==1){Menu_Lateral.setLocation( 0, 70);}
                        if(a==2){Menu_Lateral.setLocation(-25, 70);}
                        if(a==3){Menu_Lateral.setLocation(-35, 70);}
                        if(a==4){Menu_Lateral.setLocation(-45, 70);}
                        if(a==5){Menu_Lateral.setLocation(-55, 70);}
                        if(a==6){Menu_Lateral.setLocation(-65, 70);}
                        if(a==7){Menu_Lateral.setLocation(-75, 70);}
                        if(a==8){Menu_Lateral.setLocation(-85, 70);}

                        Avanco_Menu.setVisible(true);
                        Recuo_Menu.setVisible(false);
                        
                    }

                } catch (Exception ex) {
                    System.out.println(ex);

                }

            }

        };th.start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Camp_Pesquisa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Avanco_Menu = new javax.swing.JLabel();
        Recuo_Menu = new javax.swing.JLabel();
        btn_Pesquisar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_Cadastro = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_Config2 = new javax.swing.JLabel();
        btn_Config = new javax.swing.JLabel();
        btn_Home = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_FecharTela = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PesquisarCadastros = new javax.swing.JLabel();
        Tela_Config = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        config_Janela = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Menu_Lateral = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        jp_Disciplinas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jp_Cronograma = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jp_Ajustes = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jp_Professores = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jp_Perfil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        panel_Notas = new javax.swing.JPanel();
        jnotas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        panel_Cursos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcursos = new javax.swing.JLabel();
        panel_Disciplinas = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jdisciplinas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_Professores = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jprofessores = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panel_Alunos = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jalunos = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 62, 172));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MousePressedRodaPe(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Camp_Pesquisa.setBackground(new java.awt.Color(204, 204, 204));
        Camp_Pesquisa.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        Camp_Pesquisa.setForeground(new java.awt.Color(0, 0, 0));
        Camp_Pesquisa.setToolTipText("");
        Camp_Pesquisa.setBorder(null);
        jPanel2.add(Camp_Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 380, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 500, 10));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Pesquisar");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 90, 20));

        Avanco_Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Avanco_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/118.png"))); // NOI18N
        Avanco_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Avanco_MenuMouseClicked(evt);
            }
        });
        jPanel2.add(Avanco_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        Recuo_Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recuo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/119.png"))); // NOI18N
        Recuo_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Recuo_MenuMouseClicked(evt);
            }
        });
        jPanel2.add(Recuo_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        btn_Pesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/32x32/Search.png"))); // NOI18N
        jPanel2.add(btn_Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 40, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, -1, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GEscola");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 40));

        btn_Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/48x48/male-user-add.png"))); // NOI18N
        btn_Cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CadastroMouseClicked(evt);
            }
        });
        jPanel2.add(btn_Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/047.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, 40));

        btn_Config2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Config2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/application.png"))); // NOI18N
        btn_Config2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Config2MouseClicked(evt);
            }
        });
        jPanel2.add(btn_Config2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, 30, 30));

        btn_Config.setBackground(new java.awt.Color(51, 51, 51));
        btn_Config.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/settings.png"))); // NOI18N
        btn_Config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ConfigMouseClicked(evt);
            }
        });
        jPanel2.add(btn_Config, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, 30, 30));

        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/32x32/House.png"))); // NOI18N
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HomeMouseClicked(evt);
            }
        });
        jPanel2.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 40));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        btn_FecharTela.setBackground(new java.awt.Color(255, 255, 255));
        btn_FecharTela.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_FecharTela.setForeground(new java.awt.Color(255, 255, 255));
        btn_FecharTela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_FecharTela.setText("X");
        btn_FecharTela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FecharTelaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_FecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_FecharTela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 30, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/32x32/communication.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/32x32/Warning.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 40, 40));

        PesquisarCadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PesquisarCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/48x48/male-user-search.png"))); // NOI18N
        PesquisarCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarCadastrosMouseClicked(evt);
            }
        });
        jPanel2.add(PesquisarCadastros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Tela_Config.setBackground(new java.awt.Color(255, 255, 255));
        Tela_Config.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tela_Config.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 51, 51));
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Sair");
        Tela_Config.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 20));

        config_Janela.setBackground(new java.awt.Color(0, 51, 51));
        config_Janela.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        config_Janela.setForeground(new java.awt.Color(0, 0, 0));
        config_Janela.setText("Renomear");
        config_Janela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                config_JanelaMouseClicked(evt);
            }
        });
        Tela_Config.add(config_Janela, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, -1));

        jLabel22.setBackground(new java.awt.Color(0, 51, 51));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Calendario");
        Tela_Config.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, -1));

        jLabel23.setBackground(new java.awt.Color(0, 51, 51));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Eventos");
        Tela_Config.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        jLabel24.setBackground(new java.awt.Color(0, 51, 51));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Notas");
        Tela_Config.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        jLabel25.setBackground(new java.awt.Color(0, 51, 51));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Horarios");
        Tela_Config.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, -1));

        getContentPane().add(Tela_Config, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, 200, 0));

        Menu_Lateral.setBackground(new java.awt.Color(0, 62, 172));
        Menu_Lateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu_Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        Menu_Lateral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 90, 10));

        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        Menu_Lateral.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 90, 20));

        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        Menu_Lateral.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 90, 10));

        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        Menu_Lateral.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 90, 10));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Menu_Lateral.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 90, 10));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Menu_Lateral.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 90, 10));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Menu_Lateral.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 90, 10));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Menu_Lateral.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 90, 10));

        jp_Disciplinas.setBackground(new java.awt.Color(0, 62, 172));
        jp_Disciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_DisciplinasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        jp_Disciplinas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Folder-Windows.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jp_Disciplinas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        Menu_Lateral.add(jp_Disciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 60));

        jp_Cronograma.setBackground(new java.awt.Color(0, 62, 172));
        jp_Cronograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_CronogramaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        jp_Cronograma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/32x32/Clock.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jp_Cronograma.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        Menu_Lateral.add(jp_Cronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 60));

        jp_Ajustes.setBackground(new java.awt.Color(0, 62, 172));
        jp_Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_AjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        jp_Ajustes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/options.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jp_Ajustes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        Menu_Lateral.add(jp_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 90, 60));

        jp_Professores.setBackground(new java.awt.Color(0, 62, 172));
        jp_Professores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_ProfessoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        jp_Professores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/48x48/users.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jp_Professores.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        Menu_Lateral.add(jp_Professores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 90, 60));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        Menu_Lateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 90, 10));

        jp_Perfil.setBackground(new java.awt.Color(0, 62, 172));
        jp_Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_PerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        jp_Perfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Folder-User.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jp_Perfil.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        Menu_Lateral.add(jp_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, 60));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Menu_Lateral.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 10));

        getContentPane().add(Menu_Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 70, 92, 560));

        jDesktopPane1.setBackground(new java.awt.Color(37, 51, 61));

        jPanel1.setBackground(new java.awt.Color(37, 51, 61));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Notas.setBackground(new java.awt.Color(37, 51, 61));
        panel_Notas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_Notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jnotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/128x128/checklist.png"))); // NOI18N
        jnotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jnotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        panel_Notas.add(jnotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 131));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Notas:");
        panel_Notas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        jPanel1.add(panel_Notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, 170));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 730, 10));

        panel_Cursos.setBackground(new java.awt.Color(37, 51, 61));
        panel_Cursos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cursos:");
        panel_Cursos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, -1));

        jcursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/128x128/shopping-bag-blue.png"))); // NOI18N
        jcursos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcursosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        panel_Cursos.add(jcursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 130));

        jPanel1.add(panel_Cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 170));

        panel_Disciplinas.setBackground(new java.awt.Color(37, 51, 61));
        panel_Disciplinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_Disciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_DisciplinasMouseClicked(evt);
            }
        });
        panel_Disciplinas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_Disciplinas.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jdisciplinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/128x128/pie-chart.png"))); // NOI18N
        jdisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdisciplinasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        panel_Disciplinas.add(jdisciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 120));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Disciplinas:");
        panel_Disciplinas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 20));

        jPanel1.add(panel_Disciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 160));

        panel_Professores.setBackground(new java.awt.Color(37, 51, 61));
        panel_Professores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_Professores.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jprofessores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/128x128/users.png"))); // NOI18N
        jprofessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jprofessoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        panel_Professores.add(jprofessores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 120));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Professores:");
        panel_Professores.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 30));

        jPanel1.add(panel_Professores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 160));

        panel_Alunos.setBackground(new java.awt.Color(37, 51, 61));
        panel_Alunos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_Alunos.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jalunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/png/128x128/user-orange.png"))); // NOI18N
        jalunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocoDoMouse(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitedFocoMouse(evt);
            }
        });
        panel_Alunos.add(jalunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 120));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Alunos:");
        panel_Alunos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 30));

        jPanel1.add(panel_Alunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 160));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/question.png"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 40, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ajuda:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 60, 30));

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1230, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitedFocoMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitedFocoMouse
        if(evt.getSource() == jcursos){
            panel_Cursos.setBackground(exitedmouse);
        }
        if(evt.getSource() == jnotas){
            panel_Notas.setBackground(exitedmouse);
        }
        if(evt.getSource() == jprofessores){
            panel_Professores.setBackground(exitedmouse);
        }
        if(evt.getSource() == jalunos){
            panel_Alunos.setBackground(exitedmouse);
        }
        if (evt.getSource() == jdisciplinas) {
            panel_Disciplinas.setBackground(exitedmouse);
        }
        if (evt.getSource() == jp_Disciplinas) {
            
            jp_Disciplinas.setBackground(ExitedMouse);

        }if (evt.getSource() == jp_Cronograma) {
            
            jp_Cronograma.setBackground(ExitedMouse);

        }if (evt.getSource() == jp_Ajustes) {

            jp_Ajustes.setBackground(ExitedMouse);

        }if (evt.getSource() == jp_Professores) {

            jp_Professores.setBackground(ExitedMouse);

        }if (evt.getSource() == jp_Perfil) {

            jp_Perfil.setBackground(ExitedMouse);

        }
    }//GEN-LAST:event_ExitedFocoMouse

    private void FocoDoMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FocoDoMouse
        
        if(evt.getSource() == jcursos){
            panel_Cursos.setBackground(focomouse);
            
        }
        if(evt.getSource() == jnotas){
            panel_Notas.setBackground(focomouse);
            
        }
        if(evt.getSource() == jprofessores){
            panel_Professores.setBackground(focomouse);
            
        }
        if(evt.getSource() == jalunos){
            panel_Alunos.setBackground(focomouse);
            
        }
        if (evt.getSource() == jdisciplinas) {
            panel_Disciplinas.setBackground(focomouse);
            
        }
        if (evt.getSource() == jp_Disciplinas) {
            Menu_Lateral.setLocation(0,70);
            jp_Disciplinas.setBackground(FocoMouse);


        }if (evt.getSource() == jp_Cronograma) {
            Menu_Lateral.setLocation(0,70);
            jp_Cronograma.setBackground(FocoMouse);


        }if (evt.getSource() == jp_Ajustes) {
            Menu_Lateral.setLocation(0,70);
            jp_Ajustes.setBackground(FocoMouse);


        }if (evt.getSource() == jp_Professores) {
            Menu_Lateral.setLocation(0,70);
            jp_Professores.setBackground(FocoMouse);


        }if (evt.getSource() == jp_Perfil) {
            Menu_Lateral.setLocation(0,70);
            jp_Perfil.setBackground(FocoMouse);


        }
    }//GEN-LAST:event_FocoDoMouse

/********************************************************************************
*************************** MENU LATERAL ****************************************                     
*********************************************************************************/    
    
    private void jp_ProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_ProfessoresMouseClicked
        ClickedjpProfessores();
    }//GEN-LAST:event_jp_ProfessoresMouseClicked

    private void jp_AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_AjustesMouseClicked
        ClickedjpAjustes();
    }//GEN-LAST:event_jp_AjustesMouseClicked

    private void jp_CronogramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_CronogramaMouseClicked
        ClickedjpCronograma();
    }//GEN-LAST:event_jp_CronogramaMouseClicked
   
    private void jp_DisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_DisciplinasMouseClicked
        telacad.setVisible(true);
    }//GEN-LAST:event_jp_DisciplinasMouseClicked

    private void jp_PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_PerfilMouseClicked
        ClickedjpPerfil();
    }//GEN-LAST:event_jp_PerfilMouseClicked

    
//------------------- Permite Arrastar tela: -------------------//
    int x,y;    
    private void MousePressedRodaPe(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MousePressedRodaPe

        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_MousePressedRodaPe

//
    private void MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragged

        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);

    }//GEN-LAST:event_MouseDragged

//          Fechar Tela do Programa:
    private void btn_FecharTelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FecharTelaMouseClicked

        System.exit(0);

    }//GEN-LAST:event_btn_FecharTelaMouseClicked

//          Abrir Tela de Configuraçao:
    private void btn_ConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfigMouseClicked

        Thread th = new Thread(){
            @Override
            public void run (){
                try {
                    for(int a = 0; a <=8; a++){
                        Thread.sleep(20);
                        if(a==1){Tela_Config.setSize(200, 40);}
                        if(a==2){Tela_Config.setSize(200, 80);}
                        if(a==3){Tela_Config.setSize(200, 120);}
                        if(a==4){Tela_Config.setSize(200, 160);}
                        if(a==5){Tela_Config.setSize(200, 200);}
                        if(a==6){Tela_Config.setSize(200, 240);}
                        if(a==7){Tela_Config.setSize(200, 280);}
                        if(a==8){Tela_Config.setSize(200, 320);}

                        btn_Config2.setVisible(true);
                        btn_Config.setVisible(false);

                    }

                } catch (Exception ex) {
                    System.out.println(ex);

                }

            }

        };th.start();

    }//GEN-LAST:event_btn_ConfigMouseClicked

//          Fechar Tela configuração:
    private void btn_Config2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Config2MouseClicked

        Thread th = new Thread(){
            @Override
            public void run (){
                try {
                    for(int a = 0; a <=8; a++){
                        Thread.sleep(30);
                        if(a==1){Tela_Config.setSize(200, 320);}
                        if(a==2){Tela_Config.setSize(200, 280);}
                        if(a==3){Tela_Config.setSize(200, 240);}
                        if(a==4){Tela_Config.setSize(200, 200);}
                        if(a==5){Tela_Config.setSize(200, 160);}
                        if(a==6){Tela_Config.setSize(200, 120);}
                        if(a==7){Tela_Config.setSize(200, 80);}
                        if(a==8){Tela_Config.setSize(200, 0);}

                        btn_Config.setVisible(true);
                        btn_Config2.setVisible(false);

                    }

                } catch (Exception ex) {
                    System.out.println(ex);

                }

            }

        };th.start();

    }//GEN-LAST:event_btn_Config2MouseClicked

//          Abrir Tela de Cadastro:
    private void btn_CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CadastroMouseClicked
        
        cad.setListPessoa(listaCadastro);
        cad.setCurso(curso);
        cad.setVisible(true);
        
    }//GEN-LAST:event_btn_CadastroMouseClicked

//          Tela De Configuração:
    private void config_JanelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_config_JanelaMouseClicked

    }//GEN-LAST:event_config_JanelaMouseClicked

//          Avanço do Menu Lateral:    
    private void Avanco_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Avanco_MenuMouseClicked
        AvancoMenu();
    }//GEN-LAST:event_Avanco_MenuMouseClicked
//          Recuo do Menu Lateral:
    private void Recuo_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Recuo_MenuMouseClicked
        RecuoMenu();
    }//GEN-LAST:event_Recuo_MenuMouseClicked
//          Volta Para Area de Trabalho:
    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
        
        d.setVisible(false);
        p.setVisible(false);
        notas.setVisible(false);
        pf.setVisible(false);
        jDesktopPane1.removeAll(); // Remove Objetos Limpando a Area de Trabalho:
        jDesktopPane1.setBackground(exitedmouse);
        jPanel1.setVisible(true);
        jDesktopPane1.add(jPanel1);
        
        RecuoMenu();
        
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void PesquisarCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarCadastrosMouseClicked
        //pesquisa.setListAlunos(listaCadastro);
        pesquisa.setCurso(curso);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_PesquisarCadastrosMouseClicked

    private void jdisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdisciplinasMouseClicked
        ClickedjpDisciplinas();
        panel_Disciplinas.setBackground(exitedmouse);
    }//GEN-LAST:event_jdisciplinasMouseClicked

    private void jnotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnotasMouseClicked
        
        jDesktopPane1.removeAll(); // REMOVE OBJETOS DA AREA DE TRABALHO
        notas.setSize(1230,620); // SETA O TAMANHO DA TELA
        notas.setLocation(0,0); // DIZ QUAL O LOCAL QUE A TELA VAI FICAR
        notas.setVisible(true); // TORNA ELA VISIVEL
        jDesktopPane1.add(notas); // ADICIONA A TELA NA AREA DE TRABALHO
        panel_Notas.setBackground(exitedmouse);
        
    }//GEN-LAST:event_jnotasMouseClicked

    private void panel_DisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_DisciplinasMouseClicked
        
    }//GEN-LAST:event_panel_DisciplinasMouseClicked
// -TELA Professor
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jcursosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcursosAncestorAdded
        
    }//GEN-LAST:event_jcursosAncestorAdded

    private void jprofessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jprofessoresMouseClicked
        ClickedjpProfessores();
    }//GEN-LAST:event_jprofessoresMouseClicked

    public static void main(String args[]) {
                       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avanco_Menu;
    private javax.swing.JTextField Camp_Pesquisa;
    private javax.swing.JPanel Menu_Lateral;
    private javax.swing.JLabel PesquisarCadastros;
    private javax.swing.JLabel Recuo_Menu;
    private javax.swing.JPanel Tela_Config;
    private javax.swing.JLabel btn_Cadastro;
    private javax.swing.JLabel btn_Config;
    private javax.swing.JLabel btn_Config2;
    private javax.swing.JLabel btn_FecharTela;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel btn_Pesquisar;
    private javax.swing.JLabel config_Janela;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jalunos;
    private javax.swing.JLabel jcursos;
    private javax.swing.JLabel jdisciplinas;
    private javax.swing.JLabel jnotas;
    private javax.swing.JPanel jp_Ajustes;
    private javax.swing.JPanel jp_Cronograma;
    private javax.swing.JPanel jp_Disciplinas;
    private javax.swing.JPanel jp_Perfil;
    private javax.swing.JPanel jp_Professores;
    private javax.swing.JLabel jprofessores;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel_Alunos;
    private javax.swing.JPanel panel_Cursos;
    private javax.swing.JPanel panel_Disciplinas;
    private javax.swing.JPanel panel_Notas;
    private javax.swing.JPanel panel_Professores;
    // End of variables declaration//GEN-END:variables
  
}
