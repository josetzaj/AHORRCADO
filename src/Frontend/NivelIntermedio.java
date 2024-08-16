/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.NIntermedio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class NivelIntermedio extends javax.swing.JFrame {

    /**
     * Creates new form NivelIntermedio
     */
    NIntermedio nivelIntermedio = new NIntermedio();
    //String palabraElegida = nivelFacil.obtenerPalabra(nivelFacil.palabrasFaciles);
    String palabraElegida;
    ArrayList<String> palabrasUsadas = new ArrayList<String>();
    final static int INTENTOS = 4;

    public NivelIntermedio() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Bienvenido, tienes 4 intentos para jugar este nivel.");
        btnNuevaPalabra.setVisible(false);
        palabraElegida = nivelIntermedio.obtenerPalabra(nivelIntermedio.palabrasIntermedio);
        nivelIntermedio.setPalabraElegida(palabraElegida);
        nivelIntermedio.mostrarFrase(lblFigura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        btnNuevaPalabra = new javax.swing.JButton();
        lblCaracter0 = new javax.swing.JLabel();
        lblCaracter1 = new javax.swing.JLabel();
        lblCaracter2 = new javax.swing.JLabel();
        lblCaracter3 = new javax.swing.JLabel();
        lblCaracter4 = new javax.swing.JLabel();
        lblCaracter5 = new javax.swing.JLabel();
        lblCaracter6 = new javax.swing.JLabel();
        lblPersonaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblFigura = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Flecha.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 530, 110, 80));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 40, 40));

        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 40, 40));

        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 40, 40));

        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 40, 40));

        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 40, 40));

        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 40, 40));

        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 40, 40));

        jButton9.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 30, 40));

        jButton10.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 40, 40));

        jButton11.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 40, 40));

        jButton12.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 30, 40));

        jButton13.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 30, 40));

        jButton14.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 40, 40));

        jButton15.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 40, 40));

        jButton16.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton16.setContentAreaFilled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 30, 40));

        jButton17.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 30, 40));

        jButton18.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton18.setContentAreaFilled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 40, 40));

        jButton19.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton19.setContentAreaFilled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 40, 40));

        jButton20.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 40, 40));

        jButton21.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 30, 40));

        jButton22.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 40, 40));

        jButton23.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 40, 40));

        jButton24.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 40, 40));

        jButton25.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 30, 40));

        jButton26.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 40, 40));

        jButton27.setFont(new java.awt.Font("Dialog", 1, 3)); // NOI18N
        jButton27.setContentAreaFilled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 40, 40));

        btnNuevaPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/siguientepalabra.png"))); // NOI18N
        btnNuevaPalabra.setContentAreaFilled(false);
        btnNuevaPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPalabraActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevaPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        lblCaracter0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter0, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 50, 50));

        lblCaracter1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 40, 50));

        lblCaracter2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 50, 50));

        lblCaracter3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 50));

        lblCaracter4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 40, 50));

        lblCaracter5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 40, 50));

        lblCaracter6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCaracter6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracter6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaracter6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 50, 50));
        jPanel1.add(lblPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 200));

        lblFigura.setEditable(false);
        lblFigura.setColumns(20);
        lblFigura.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFigura.setLineWrap(true);
        lblFigura.setRows(5);
        lblFigura.setAutoscrolls(false);
        jScrollPane1.setViewportView(lblFigura);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 220, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nivelintermedio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        char letra = 'P';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        char letra = 'N';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        char letra = 'M';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        char letra = 'A';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        char letra = 'Q';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        char letra = 'Z';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        char letra = 'W';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        char letra = 'E';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        char letra = 'R';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        char letra = 'T';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        char letra = 'Y';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        char letra = 'U';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        char letra = 'I';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        char letra = 'O';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        char letra = 'S';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        char letra = 'D';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        char letra = 'F';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        char letra = 'G';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        char letra = 'H';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        char letra = 'J';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        char letra = 'K';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        char letra = 'L';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        char letra = 'X';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        char letra = 'C';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        char letra = 'V';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        char letra = 'B';
        nivelIntermedio.compararLetra(letra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6, lblPersonaje, this);
        nivelIntermedio.camposCaracter(btnNuevaPalabra, lblCaracter0, lblCaracter1, lblCaracter2, lblCaracter3, lblCaracter4, lblCaracter5, lblCaracter6);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void btnNuevaPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPalabraActionPerformed
        int repetido = 0;
        lblCaracter0.setText("");
        lblCaracter1.setText("");
        lblCaracter2.setText("");
        lblCaracter3.setText("");
        lblCaracter4.setText("");
        lblCaracter5.setText("");
        lblCaracter6.setText("");
        lblFigura.setText("");
        palabrasUsadas.add(palabraElegida);
        //JOptionPane.showMessageDialog(null, "Enhorabuena!!! Has completado la palabra");
        if (palabrasUsadas.size() <= 4) {
            do {
                repetido = 0;
                palabraElegida = nivelIntermedio.obtenerPalabra(nivelIntermedio.palabrasIntermedio);
                for (int i = 0; i < palabrasUsadas.size(); i++) {
                    if (palabraElegida.equals(palabrasUsadas.get(i))) { //palabrasUsadas.get(i).equals(palabraElegida)
                        repetido = 1;
                    }
                }
            } while (repetido == 1);
            nivelIntermedio.setPalabraElegida(palabraElegida);
            nivelIntermedio.mostrarFrase(lblFigura);
            btnNuevaPalabra.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Enhorabuena!!! Has ganado el Nivel Intermedio.");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnNuevaPalabraActionPerformed

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
            java.util.logging.Logger.getLogger(NivelIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaPalabra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaracter0;
    private javax.swing.JLabel lblCaracter1;
    private javax.swing.JLabel lblCaracter2;
    private javax.swing.JLabel lblCaracter3;
    private javax.swing.JLabel lblCaracter4;
    private javax.swing.JLabel lblCaracter5;
    private javax.swing.JLabel lblCaracter6;
    private javax.swing.JTextArea lblFigura;
    private javax.swing.JLabel lblPersonaje;
    // End of variables declaration//GEN-END:variables
}
