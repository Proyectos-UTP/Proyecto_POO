package POO_Proy_Paquete;

import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author USUARIO
 */
public class Logintrue extends javax.swing.JFrame implements textos, login_attempts, Docente_credenciales {
int cant_at = pass_attempts;
boolean zero = z_att;
int mausex, mausey;
    /**
     * Creates new form Logintrue
     */
    public Logintrue() {
        initComponents();
        USR.setBackground(new java.awt.Color(0,0,0,1));
       contr.setBackground(new java.awt.Color(0,0,0,1));
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        USR = new javax.swing.JTextField();
        BOTON = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        contr = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        EXIT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Head = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/pngwing.com-(6).png"));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 430, 170));

        jLabel6.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/tesla-logo-png-2237.png"));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -10, 210, 260));

        USR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        USR.setForeground(new java.awt.Color(204, 204, 204));
        USR.setText("INGRESE SU USUARIO");
        USR.setBorder(null);
        USR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                USRMousePressed(evt);
            }
        });
        USR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USRActionPerformed(evt);
            }
        });
        jPanel1.add(USR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 230, 30));

        BOTON.setBackground(new java.awt.Color(181, 8, 8));
        BOTON.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        BOTON.setForeground(new java.awt.Color(255, 255, 255));
        BOTON.setText("ENTRAR");
        BOTON.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        BOTON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BOTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTONMouseClicked(evt);
            }
        });
        jPanel1.add(BOTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 110, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIAR SESION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 196, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 70, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 110, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 230, 10));

        contr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contr.setForeground(new java.awt.Color(204, 204, 204));
        contr.setText("********");
        contr.setBorder(null);
        contr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrMousePressed(evt);
            }
        });
        contr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrActionPerformed(evt);
            }
        });
        jPanel1.add(contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 230, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 230, 10));

        EXIT.setBackground(new java.awt.Color(156, 0, 1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout EXITLayout = new javax.swing.GroupLayout(EXIT);
        EXIT.setLayout(EXITLayout);
        EXITLayout.setHorizontalGroup(
            EXITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(EXITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );
        EXITLayout.setVerticalGroup(
            EXITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(EXITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );

        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/Rojo.jpg"));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        Head.setBackground(new java.awt.Color(156, 0, 1));
        Head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadMouseDragged(evt);
            }
        });
        Head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USRActionPerformed

    private void contrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrActionPerformed

    private void USRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USRMousePressed
        if(USR.getText().equals(t_in)){
        USR.setText("");
        USR.setForeground(Color.WHITE);}
        if(String.valueOf(contr.getPassword()).isEmpty()){
                contr.setText(t_hpass);
        contr.setForeground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_USRMousePressed

    private void contrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrMousePressed
        if(USR.getText().isEmpty()){
        USR.setText(t_in);
        USR.setForeground(Color.LIGHT_GRAY);}
        if(String.valueOf(contr.getPassword()).equals(t_hpass)){
        contr.setText("");
         contr.setForeground(Color.WHITE);}
    }//GEN-LAST:event_contrMousePressed

    private void HeadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadMousePressed
        mausex=evt.getX();
        mausey=evt.getY();
    }//GEN-LAST:event_HeadMousePressed

    private void HeadMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadMouseDragged
      int x=evt.getXOnScreen();
              int y=evt.getYOnScreen();
        this.setLocation(x-mausex, y-mausey);
    }//GEN-LAST:event_HeadMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
      EXIT.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        EXIT.setBackground(Head.getBackground());
    }//GEN-LAST:event_jLabel2MouseExited

    private void BOTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTONMouseClicked

                String Pass = new String(contr.getPassword());
                
                 if (zero = false){
                    if(USR.getText().equals(idD1)&&Pass.equals(passD1)){
                        App GN = new App();
                        GN.setVisible(true);
                        dispose();
                        
                    }else {
                       
                        JOptionPane.showMessageDialog(this, t_err
                                );
                        cant_at = cant_at-1;
                        
                    }}
                 else if (zero == true){
                 {JOptionPane.showMessageDialog(this, t_z_att);
                 }
                    if(cant_at <= 0 ){
                    zero = true;
                }
    }//GEN-LAST:event_BOTONMouseClicked

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
            java.util.logging.Logger.getLogger(Logintrue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logintrue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logintrue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logintrue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logintrue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON;
    private javax.swing.JPanel EXIT;
    private javax.swing.JPanel Head;
    private javax.swing.JTextField USR;
    private javax.swing.JPasswordField contr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
