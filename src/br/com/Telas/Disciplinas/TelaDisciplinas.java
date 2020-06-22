
package br.com.Telas.Disciplinas;

import br.com.Telas.Disciplinas.Metodologia;
import br.com.Telas.Disciplinas.Poo;
import br.com.Telas.Disciplinas.IntroducaoInformatica;
import br.com.Telas.Disciplinas.Estatistica;
import br.com.Telas.Disciplinas.MatematicaBasica;
import br.com.Telas.Disciplinas.EstudoCasoComputacaoMovel;
import br.com.Class.AlteraNomes;
import java.awt.Color;

public class TelaDisciplinas extends javax.swing.JPanel {

//********** Variaveis **************    
    Color FocuMouse;
    Color ExitedMouse;
    
    public TelaDisciplinas() {
        initComponents();
        
        FocuMouse = new Color(69,83,151);
        ExitedMouse = new Color(11,11,62);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jQuadro1 = new javax.swing.JPanel();
        jdisciplina1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        cargHorariaDisc1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeDisciplina1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nomeProf1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jtitulo1 = new javax.swing.JLabel();
        jQuadro2 = new javax.swing.JPanel();
        jdisciplina2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jtitulo2 = new javax.swing.JLabel();
        jQuadro4 = new javax.swing.JPanel();
        jdisciplina4 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jtitulo4 = new javax.swing.JLabel();
        jQuadro5 = new javax.swing.JPanel();
        jdisciplina5 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jtitulo5 = new javax.swing.JLabel();
        jQuadro3 = new javax.swing.JPanel();
        jdisciplina3 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtitulo3 = new javax.swing.JLabel();
        jQuadro6 = new javax.swing.JPanel();
        jdisciplina6 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jtitulo6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 153));
        setPreferredSize(new java.awt.Dimension(1230, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jQuadro1.setBackground(new java.awt.Color(11, 11, 62));
        jQuadro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuadro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuadro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuadro1MouseExited(evt);
            }
        });
        jQuadro1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina1.setBackground(new java.awt.Color(69, 33, 241));
        jdisciplina1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(102, 102, 255));
        jdisciplina1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 10));

        cargHorariaDisc1.setBackground(new java.awt.Color(0, 0, 0));
        cargHorariaDisc1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cargHorariaDisc1.setForeground(new java.awt.Color(255, 255, 255));
        cargHorariaDisc1.setText("60 horas");
        jdisciplina1.add(cargHorariaDisc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Disciplina:");
        jdisciplina1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carga Horaria:");
        jdisciplina1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        nomeDisciplina1.setBackground(new java.awt.Color(0, 0, 0));
        nomeDisciplina1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeDisciplina1.setForeground(new java.awt.Color(255, 255, 255));
        nomeDisciplina1.setText("Metodologia");
        jdisciplina1.add(nomeDisciplina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GEescola:");
        jdisciplina1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Professor:");
        jdisciplina1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        nomeProf1.setBackground(new java.awt.Color(0, 0, 0));
        nomeProf1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeProf1.setForeground(new java.awt.Color(255, 255, 255));
        nomeProf1.setText("Maria Parapkis");
        jdisciplina1.add(nomeProf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 20));

        jQuadro1.add(jdisciplina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 90));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/047.png"))); // NOI18N
        jQuadro1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jtitulo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtitulo1.setForeground(new java.awt.Color(204, 204, 204));
        jtitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo1.setText("Metodologia:");
        jQuadro1.add(jtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 210, 50));

        add(jQuadro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 330, 210));

        jQuadro2.setBackground(new java.awt.Color(11, 11, 62));
        jQuadro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuadro2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuadro2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuadro2MouseExited(evt);
            }
        });
        jQuadro2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina2.setBackground(new java.awt.Color(69, 33, 241));
        jdisciplina2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(102, 102, 255));
        jdisciplina2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 10));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disciplina:");
        jdisciplina2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("60 horas");
        jdisciplina2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Programação Orientado Objeto");
        jdisciplina2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carga Horaria:");
        jdisciplina2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GEescola:");
        jdisciplina2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 20));

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Mickael");
        jdisciplina2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, 20));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Professor:");
        jdisciplina2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        jQuadro2.add(jdisciplina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 90));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/034.png"))); // NOI18N
        jQuadro2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jtitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtitulo2.setForeground(new java.awt.Color(204, 204, 204));
        jtitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo2.setText("Program.Orien.Objeto");
        jQuadro2.add(jtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, 50));

        add(jQuadro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 330, 210));

        jQuadro4.setBackground(new java.awt.Color(11, 11, 62));
        jQuadro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuadro4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuadro4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuadro4MouseExited(evt);
            }
        });
        jQuadro4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina4.setBackground(new java.awt.Color(69, 33, 241));
        jdisciplina4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(102, 102, 255));
        jdisciplina4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 10));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Disciplina:");
        jdisciplina4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("60 horas");
        jdisciplina4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Introdução a Informatica");
        jdisciplina4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 20));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GEescola:");
        jdisciplina4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 70, 20));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Carga Horaria:");
        jdisciplina4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 20));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Professor:");
        jdisciplina4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 20));

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Vanessa");
        jdisciplina4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, 20));

        jQuadro4.add(jdisciplina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 90));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/051.png"))); // NOI18N
        jQuadro4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jtitulo4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtitulo4.setForeground(new java.awt.Color(204, 204, 204));
        jtitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo4.setText("Introdução Informatica");
        jQuadro4.add(jtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, 50));

        add(jQuadro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 330, 210));

        jQuadro5.setBackground(new java.awt.Color(11, 11, 62));
        jQuadro5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuadro5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuadro5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuadro5MouseExited(evt);
            }
        });
        jQuadro5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina5.setBackground(new java.awt.Color(69, 33, 241));
        jdisciplina5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setBackground(new java.awt.Color(102, 102, 255));
        jdisciplina5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 10));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Disciplina:");
        jdisciplina5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 20));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Matematica basica");
        jdisciplina5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, 20));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Carga Horaria:");
        jdisciplina5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("60 horas");
        jdisciplina5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("GEescola:");
        jdisciplina5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 20));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Professor:");
        jdisciplina5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Edney Loiola");
        jdisciplina5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 90, 20));

        jQuadro5.add(jdisciplina5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 90));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/007.png"))); // NOI18N
        jQuadro5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jtitulo5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtitulo5.setForeground(new java.awt.Color(204, 204, 204));
        jtitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo5.setText("Matematica Básica");
        jQuadro5.add(jtitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 220, 50));

        add(jQuadro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 330, 210));

        jQuadro3.setBackground(new java.awt.Color(11, 11, 62));
        jQuadro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuadro3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuadro3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuadro3MouseExited(evt);
            }
        });
        jQuadro3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina3.setBackground(new java.awt.Color(69, 33, 241));
        jdisciplina3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(102, 102, 255));
        jdisciplina3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 10));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Disciplina:");
        jdisciplina3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 20));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Estatistica");
        jdisciplina3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 20));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Carga Horaria:");
        jdisciplina3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("60 horas");
        jdisciplina3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("GEescola:");
        jdisciplina3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 20));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Professor:");
        jdisciplina3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        jLabel43.setBackground(new java.awt.Color(0, 0, 0));
        jLabel43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Antonio Ladeia");
        jdisciplina3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 20));

        jQuadro3.add(jdisciplina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/027.png"))); // NOI18N
        jQuadro3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jtitulo3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtitulo3.setForeground(new java.awt.Color(204, 204, 204));
        jtitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo3.setText("Estátistica");
        jQuadro3.add(jtitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 220, 70));

        add(jQuadro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 330, 210));

        jQuadro6.setBackground(new java.awt.Color(11, 11, 62));
        jQuadro6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuadro6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jQuadro6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuadro6MouseExited(evt);
            }
        });
        jQuadro6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina6.setBackground(new java.awt.Color(69, 33, 241));
        jdisciplina6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setBackground(new java.awt.Color(102, 102, 255));
        jdisciplina6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 10));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Disciplina:");
        jdisciplina6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Estudo de Casos Computação Movel");
        jdisciplina6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 20));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Carga Horaria:");
        jdisciplina6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 20));

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("60 horas");
        jdisciplina6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, 20));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("GEescola:");
        jdisciplina6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 20));

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Professor:");
        jdisciplina6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 20));

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Vieira");
        jdisciplina6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 50, 20));

        jQuadro6.add(jdisciplina6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 90));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/education/029.png"))); // NOI18N
        jQuadro6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jtitulo6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtitulo6.setForeground(new java.awt.Color(204, 204, 204));
        jtitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitulo6.setText("Estudo Caso Computação Movel");
        jQuadro6.add(jtitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 50));

        add(jQuadro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 330, 210));

        jSeparator1.setBackground(new java.awt.Color(108, 126, 236));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 1070, 20));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("2ª Periodo:");
        add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void ExportarNomes(AlteraNomes n){
        jtitulo1.setText(n.getNomeDisci1());
        nomeDisciplina1.setText(n.getNomeDisci1());
        nomeProf1.setText(n.getProfDisc1());
        cargHorariaDisc1.setText(n.getCargaHorariaDisc1());
    }
    
//////////////////////// Eventos Foco do Mouse /////////////////////////////////
    private void jQuadro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro1MouseEntered
        if(evt.getSource() == jQuadro1){
            jQuadro1.setBackground(FocuMouse);
            jdisciplina1.setBackground(FocuMouse);

            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina1.setLocation(0,210);}
                            if(i == 2){jdisciplina1.setLocation(0,200);}
                            if(i == 3){jdisciplina1.setLocation(0,180);}
                            if(i == 4){jdisciplina1.setLocation(0,170); jtitulo1.setVisible(false);}
                            if(i == 5){jdisciplina1.setLocation(0,150);}
                            if(i == 6){jdisciplina1.setLocation(0,130);}
                            if(i == 7){jdisciplina1.setLocation(0,120);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();

        }
    }//GEN-LAST:event_jQuadro1MouseEntered

    private void jQuadro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro1MouseExited
        if(evt.getSource() == jQuadro1){
            jQuadro1.setBackground(ExitedMouse);
            jdisciplina1.setBackground(ExitedMouse);  
            
            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina1.setLocation(0,120);}
                            if(i == 2){jdisciplina1.setLocation(0,130);}
                            if(i == 3){jdisciplina1.setLocation(0,150);}
                            if(i == 4){jdisciplina1.setLocation(0,170); jtitulo1.setVisible(true);}
                            if(i == 5){jdisciplina1.setLocation(0,180);}
                            if(i == 6){jdisciplina1.setLocation(0,200);}
                            if(i == 7){jdisciplina1.setLocation(0,210);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();
        }
    }//GEN-LAST:event_jQuadro1MouseExited

    private void jQuadro2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro2MouseEntered
        if(evt.getSource() == jQuadro2){
            jQuadro2.setBackground(FocuMouse);
            jdisciplina2.setBackground(FocuMouse);

            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina2.setLocation(0,210);}
                            if(i == 2){jdisciplina2.setLocation(0,200);}
                            if(i == 3){jdisciplina2.setLocation(0,180);}
                            if(i == 4){jdisciplina2.setLocation(0,170); jtitulo2.setVisible(false);}
                            if(i == 5){jdisciplina2.setLocation(0,150);}
                            if(i == 6){jdisciplina2.setLocation(0,130);}
                            if(i == 7){jdisciplina2.setLocation(0,120);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();

        }        
    }//GEN-LAST:event_jQuadro2MouseEntered

    private void jQuadro2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro2MouseExited
        if(evt.getSource() == jQuadro2){
            jQuadro2.setBackground(ExitedMouse);
            jdisciplina2.setBackground(ExitedMouse);  
            
            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina2.setLocation(0,120);}
                            if(i == 2){jdisciplina2.setLocation(0,130);}
                            if(i == 3){jdisciplina2.setLocation(0,150);}
                            if(i == 4){jdisciplina2.setLocation(0,170); jtitulo2.setVisible(true);}
                            if(i == 5){jdisciplina2.setLocation(0,180);}
                            if(i == 6){jdisciplina2.setLocation(0,200);}
                            if(i == 7){jdisciplina2.setLocation(0,210);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();
        }
    }//GEN-LAST:event_jQuadro2MouseExited

    private void jQuadro3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro3MouseEntered
        if(evt.getSource() == jQuadro3){
            jQuadro3.setBackground(FocuMouse);
            jdisciplina3.setBackground(FocuMouse);

            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina3.setLocation(0,210);}
                            if(i == 2){jdisciplina3.setLocation(0,200);}
                            if(i == 3){jdisciplina3.setLocation(0,180);}
                            if(i == 4){jdisciplina3.setLocation(0,170); jtitulo3.setVisible(false);}
                            if(i == 5){jdisciplina3.setLocation(0,150);}
                            if(i == 6){jdisciplina3.setLocation(0,130);}
                            if(i == 7){jdisciplina3.setLocation(0,120);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();

        }        
    
    }//GEN-LAST:event_jQuadro3MouseEntered

    private void jQuadro3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro3MouseExited
        if(evt.getSource() == jQuadro3){
            jQuadro3.setBackground(ExitedMouse);
            jdisciplina3.setBackground(ExitedMouse);  
            
            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina3.setLocation(0,120);}
                            if(i == 2){jdisciplina3.setLocation(0,130);}
                            if(i == 3){jdisciplina3.setLocation(0,150);}
                            if(i == 4){jdisciplina3.setLocation(0,170); jtitulo3.setVisible(true);}
                            if(i == 5){jdisciplina3.setLocation(0,180);}
                            if(i == 6){jdisciplina3.setLocation(0,200);}
                            if(i == 7){jdisciplina3.setLocation(0,210);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();
        }
    }//GEN-LAST:event_jQuadro3MouseExited

    private void jQuadro4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro4MouseEntered
        if(evt.getSource() == jQuadro4){
            jQuadro4.setBackground(FocuMouse);
            jdisciplina4.setBackground(FocuMouse);

            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina4.setLocation(0,210);}
                            if(i == 2){jdisciplina4.setLocation(0,200);}
                            if(i == 3){jdisciplina4.setLocation(0,180);}
                            if(i == 4){jdisciplina4.setLocation(0,170); jtitulo4.setVisible(false);}
                            if(i == 5){jdisciplina4.setLocation(0,150);}
                            if(i == 6){jdisciplina4.setLocation(0,130);}
                            if(i == 7){jdisciplina4.setLocation(0,120);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();

        }
    }//GEN-LAST:event_jQuadro4MouseEntered

    private void jQuadro4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro4MouseExited
        if(evt.getSource() == jQuadro4){
            jQuadro4.setBackground(ExitedMouse);
            jdisciplina4.setBackground(ExitedMouse);  
            
            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina4.setLocation(0,120);}
                            if(i == 2){jdisciplina4.setLocation(0,130);}
                            if(i == 3){jdisciplina4.setLocation(0,150);}
                            if(i == 4){jdisciplina4.setLocation(0,170); jtitulo4.setVisible(true);}
                            if(i == 5){jdisciplina4.setLocation(0,180);}
                            if(i == 6){jdisciplina4.setLocation(0,200);}
                            if(i == 7){jdisciplina4.setLocation(0,210);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();
        }
    }//GEN-LAST:event_jQuadro4MouseExited

    private void jQuadro5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro5MouseEntered
                if(evt.getSource() == jQuadro5){
            jQuadro5.setBackground(FocuMouse);
            jdisciplina5.setBackground(FocuMouse);

            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina5.setLocation(0,210);}
                            if(i == 2){jdisciplina5.setLocation(0,200);}
                            if(i == 3){jdisciplina5.setLocation(0,180);}
                            if(i == 4){jdisciplina5.setLocation(0,170); jtitulo5.setVisible(false);}
                            if(i == 5){jdisciplina5.setLocation(0,150);}
                            if(i == 6){jdisciplina5.setLocation(0,130);}
                            if(i == 7){jdisciplina5.setLocation(0,120);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();

        }
    }//GEN-LAST:event_jQuadro5MouseEntered

    private void jQuadro5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro5MouseExited
        if(evt.getSource() == jQuadro5){
            jQuadro5.setBackground(ExitedMouse);
            jdisciplina5.setBackground(ExitedMouse);  
            
            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina5.setLocation(0,120);}
                            if(i == 2){jdisciplina5.setLocation(0,130);}
                            if(i == 3){jdisciplina5.setLocation(0,150);}
                            if(i == 4){jdisciplina5.setLocation(0,170); jtitulo5.setVisible(true);}
                            if(i == 5){jdisciplina5.setLocation(0,180);}
                            if(i == 6){jdisciplina5.setLocation(0,200);}
                            if(i == 7){jdisciplina5.setLocation(0,210);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();
        }
    }//GEN-LAST:event_jQuadro5MouseExited

    private void jQuadro6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro6MouseEntered
        if(evt.getSource() == jQuadro6){
            jQuadro6.setBackground(FocuMouse);
            jdisciplina6.setBackground(FocuMouse);

            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina6.setLocation(0,210);}
                            if(i == 2){jdisciplina6.setLocation(0,200);}
                            if(i == 3){jdisciplina6.setLocation(0,180);}
                            if(i == 4){jdisciplina6.setLocation(0,170); jtitulo6.setVisible(false);}
                            if(i == 5){jdisciplina6.setLocation(0,150);}
                            if(i == 6){jdisciplina6.setLocation(0,130);}
                            if(i == 7){jdisciplina6.setLocation(0,120);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();

        }
    }//GEN-LAST:event_jQuadro6MouseEntered

    private void jQuadro6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro6MouseExited
                if(evt.getSource() == jQuadro6){
            jQuadro6.setBackground(ExitedMouse);
            jdisciplina6.setBackground(ExitedMouse);  
            
            Thread th = new Thread(){
                        @Override
                public void run (){
                    try {
                        for(int i = 0; i <=7; i++){
                            Thread.sleep(20);
                            if(i == 1){jdisciplina6.setLocation(0,120);}
                            if(i == 2){jdisciplina6.setLocation(0,130);}
                            if(i == 3){jdisciplina6.setLocation(0,150);}
                            if(i == 4){jdisciplina6.setLocation(0,170); jtitulo6.setVisible(true);}
                            if(i == 5){jdisciplina6.setLocation(0,180);}
                            if(i == 6){jdisciplina6.setLocation(0,200);}
                            if(i == 7){jdisciplina6.setLocation(0,210);}
                            }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            };th.start();
        }
    }//GEN-LAST:event_jQuadro6MouseExited

//      Evento Clicked Disciplina 
    private void jQuadro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro1MouseClicked
        Metodologia m = new Metodologia();
        m.setVisible(true);
    }//GEN-LAST:event_jQuadro1MouseClicked

    private void jQuadro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro2MouseClicked
        Poo p = new Poo();
        p.setVisible(true);
    }//GEN-LAST:event_jQuadro2MouseClicked

    private void jQuadro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro3MouseClicked
        Estatistica e = new Estatistica();
        e.setVisible(true);
    }//GEN-LAST:event_jQuadro3MouseClicked

    private void jQuadro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro4MouseClicked
        IntroducaoInformatica i = new IntroducaoInformatica();
        i.setVisible(true);
    }//GEN-LAST:event_jQuadro4MouseClicked

    private void jQuadro5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro5MouseClicked
        MatematicaBasica m = new MatematicaBasica();
        m.setVisible(true);
    }//GEN-LAST:event_jQuadro5MouseClicked

    private void jQuadro6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuadro6MouseClicked
        EstudoCasoComputacaoMovel ec = new EstudoCasoComputacaoMovel();
        ec.setVisible(true);
                
    }//GEN-LAST:event_jQuadro6MouseClicked
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cargHorariaDisc1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jQuadro1;
    private javax.swing.JPanel jQuadro2;
    private javax.swing.JPanel jQuadro3;
    public static javax.swing.JPanel jQuadro4;
    public static javax.swing.JPanel jQuadro5;
    public static javax.swing.JPanel jQuadro6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jdisciplina1;
    private javax.swing.JPanel jdisciplina2;
    private javax.swing.JPanel jdisciplina3;
    private javax.swing.JPanel jdisciplina4;
    private javax.swing.JPanel jdisciplina5;
    private javax.swing.JPanel jdisciplina6;
    public javax.swing.JLabel jtitulo1;
    private javax.swing.JLabel jtitulo2;
    private javax.swing.JLabel jtitulo3;
    private javax.swing.JLabel jtitulo4;
    private javax.swing.JLabel jtitulo5;
    private javax.swing.JLabel jtitulo6;
    public javax.swing.JLabel nomeDisciplina1;
    public javax.swing.JLabel nomeProf1;
    // End of variables declaration//GEN-END:variables
}
