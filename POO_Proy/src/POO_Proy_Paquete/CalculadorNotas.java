/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package POO_Proy_Paquete;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jemand
 */
public class CalculadorNotas extends javax.swing.JFrame implements Credenciales,textos, datos_cursos {
      DefaultTableModel modelo = new DefaultTableModel();
      Estudiante E1 = new Estudiante(idE1, passE1, nE1, appE1);
      int n[] = notasE1;
      
      
      private void columnas(){
        
        
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Pc1");
        modelo.addColumn("Pc2");
        modelo.addColumn("Pc3");
        modelo.addColumn("Examenfi");
        modelo.addColumn("Promedio");
        this.jTable1.setModel(modelo);
    }
      private void filas(){
      modelo.addRow(new Object[]{E1.getNombre(),E1.getApellido(),n[0],n[1],n[2],n[3]});
      }
      
    public CalculadorNotas() {
        initComponents();
        columnas();
        filas();
    }
    public void doc1()
    {
    jl_ndoc.setText(nD1 + " " + appD1);
    }
    
    public void doc2(){
    jl_ndoc.setText(nD2 + " " + appD2);
    }
    
    public void curs1()
    {
    curs_n.setText(cal2);
    }
    public void curs2()
    {
    curs_n.setText(mecc);
    }
    public void curs3()
    {
    curs_n.setText(Estinf);
    }
    public void curs4()
    {
    curs_n.setText(ciu);
    }
    public void curs5()
    {
    curs_n.setText(POO);
    }
    public void curs6()
    {
    curs_n.setText(Badatos);
    }
    public void curs7()
    {
    curs_n.setText(TGS);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb_calc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb_upd = new javax.swing.JButton();
        txtf_pc2 = new javax.swing.JTextField();
        txtf_pc1 = new javax.swing.JTextField();
        txtf_exmfin = new javax.swing.JTextField();
        txtf_pc3 = new javax.swing.JTextField();
        curs_n = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jl_ndoc = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jb_calc.setText("Calcular");
        jb_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcActionPerformed(evt);
            }
        });

        jLabel4.setText("Pc1");

        jLabel5.setText("Pc2");

        jLabel6.setText("Pc3");

        jLabel8.setText("ExmFin");

        jb_upd.setText("Actualizar");
        jb_upd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jb_updMouseReleased(evt);
            }
        });
        jb_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_updActionPerformed(evt);
            }
        });

        curs_n.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        curs_n.setText("curso");

        volver.setText("VOLVER");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                volverMouseReleased(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jl_ndoc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_ndoc.setName(""); // NOI18N
        jl_ndoc.setText("nombredocente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4)))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf_pc3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf_exmfin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(curs_n, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jl_ndoc, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_upd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtf_pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jl_ndoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_upd, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(curs_n, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtf_exmfin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_pc3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcActionPerformed
    
        if(jTable1.getSelectionModel().isSelectionEmpty())
        {
            {JOptionPane.showMessageDialog(this, t_noselect);}
            
        }
        
        int i = jTable1.getSelectedRow();
        Curso_general curs = new Curso_general((int)jTable1.getModel().getValueAt(i,2), (int)jTable1.getModel().getValueAt(i, 3), (int)jTable1.getModel().getValueAt(i, 4), (int)jTable1.getModel().getValueAt(i, 5), "", "");
        modelo.setValueAt(curs.promedio(), i, 6);
        System.out.println(curs.getPc1());
        System.out.println(curs.getPc2());
        System.out.println(curs.getPc3());
        System.out.println(curs.getExfin());
        System.out.println((int) curs.promedio());
        curs = null;
        /*  Cuenta alumno = new Cuenta();
      CursoMat Mat2 = new CursoMat();
      
      alumno.setNombre(this.Nombre.getText());
      alumno.setApellido(this.Apellido.getText());
     Mat2.setPc1(Integer.parseInt(this.Pc1.getText()));
     Mat2.setPc2(Integer.parseInt(this.Pc2.getText()));
       Mat2.setPc3(Integer.parseInt(this.Pc3.getText()));
            Mat2.setExp(Integer.parseInt(this.ExmParc.getText()));
       Mat2.setExf(Integer.parseInt(this.ExmFin.getText()));
      
      
      Object fila[]=new Object[8];
              fila[0]=alumno.getNombre();
               fila[1]=alumno.getApellido();
               fila[2]=Mat2.getPc1();
                fila[3]=Mat2.getPc2();
                  fila[5]=Mat2.getExp();
                 fila[4]=Mat2.getPc3();

                   fila[6]=Mat2.getExf();
                    fila[7]=Mat2.promedio();
                    modelo.addRow(fila);*/
        
    }//GEN-LAST:event_jb_calcActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        //Esto de aca se supone que debería hacer que los números en los textfields de este jtable se actualizen al seleccionar una fila
        /* if(jTable1.getSelectionModel().isSelectionEmpty())
        {
            int i = jTable1.getSelectedRow();
            txtf_pc1.setText((String) modelo.getValueAt(i, 2));
            txtf_pc2.setText((String) modelo.getValueAt(i, 3));
            txtf_pc3.setText((String) modelo.getValueAt(i, 4));
            txtf_exmfin.setText((String) modelo.getValueAt(i, 5));
        }*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void jb_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_updActionPerformed
        
        if(jTable1.getSelectionModel().isSelectionEmpty())
        {
            {JOptionPane.showMessageDialog(this, t_noselect);
        
        }

        }
        
        int i = jTable1.getSelectedRow();
        modelo.setValueAt(Integer.parseInt(txtf_pc1.getText()), i, 2);
        modelo.setValueAt(Integer.parseInt(txtf_pc2.getText()), i, 3);
        modelo.setValueAt(Integer.parseInt(txtf_pc3.getText()), i, 4);
        modelo.setValueAt(Integer.parseInt(txtf_exmfin.getText()), i, 5);
           
    }//GEN-LAST:event_jb_updActionPerformed

    private void jb_updMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_updMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_updMouseReleased

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked

    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseReleased
        App AP=new  App();
        switch(jl_ndoc.getText())
        {
            case nD1 + " " + appD1: AP.login_d1(); ;break;
            case nD2 + " " + appD2: AP.login_d2(); ;break;
        
        }
        
        
        AP.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverMouseReleased

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
            java.util.logging.Logger.getLogger(CalculadorNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadorNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadorNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadorNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadorNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curs_n;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_calc;
    private javax.swing.JButton jb_upd;
    private java.awt.Label jl_ndoc;
    private javax.swing.JTextField txtf_exmfin;
    private javax.swing.JTextField txtf_pc1;
    private javax.swing.JTextField txtf_pc2;
    private javax.swing.JTextField txtf_pc3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
