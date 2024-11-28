/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package POO_Proy_Paquete;
import POO_Proy_Paquete.Main_inicial;
import static POO_Proy_Paquete.textos.t_nodata;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class App extends javax.swing.JFrame implements Credenciales, datos_cursos,textos {

    /**
     * Creates new form App
     */

    public App() {
        initComponents();
    }
    
    public void login_d1()
    {
    jLabel4.setText(nD1 + " " + appD1);
    Curso_general c1 = new Curso_general(0, 0, 0, 0, cal2, secc1);
    Curso_general c2 = new Curso_general(0, 0, 0, 0, mecc,secc2);
    Curso_general c3 = new Curso_general(0, 0, 0, 0, Estinf,secc3);
    jl_curso1.setText(c1.getNombre() + " " + "(" + c1.getIdseccion() + ")");
    jl_curso2.setText(c2.getNombre() + " " + "(" + c2.getIdseccion() + ")");
    jl_curso3.setText(c3.getNombre() + " " + "(" + c3.getIdseccion() + ")");
    
    }
    
    
    public void login_d2()
    {
    jLabel4.setText(nD2 + " " + appD2);
    Curso_general c1 = new Curso_general(0, 0, 0, 0, POO, secc4);
    Curso_general c2 = new Curso_general(0, 0, 0, 0, Badatos,secc5);
    Curso_general c3 = new Curso_general(0, 0, 0, 0, TGS,secc6);
    Curso_general c4 = new Curso_general(0, 0, 0, 0, ciu,secc7);
    jl_curso1.setText(c1.getNombre() + " " + "(" + c1.getIdseccion() + ")");
    jl_curso2.setText(c2.getNombre() + " " + "(" + c2.getIdseccion() + ")");
    jl_curso3.setText(c3.getNombre() + " " + "(" + c3.getIdseccion() + ")");
    jl_curso4.setText(c3.getNombre() + " " + "(" + c3.getIdseccion() + ")");
    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jp_curs4 = new javax.swing.JLabel();
        jl_curso4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jp_curs1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jl_curso1 = new javax.swing.JLabel();
        jp_curs5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jl_curso5 = new javax.swing.JLabel();
        jp_curs2 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jl_curso2 = new javax.swing.JLabel();
        jp_curs3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jl_curso3 = new javax.swing.JLabel();
        jp_curs6 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jl_curso6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/Nexon-(1).png"));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/usuario-de-perfil (2).png"));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 200, 210));

        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PERSONA DEL PERFIL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 270, 50));

        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE Y APELLIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 210, 50));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Cursos asiganados");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/Rojo.jpg"));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 610));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 670, 20));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

        jp_curs4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jp_curs4MouseReleased(evt);
            }
        });

        jl_curso4.setText("Sin curso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_curso4, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jp_curs4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_curs4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jl_curso4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 200, 170));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/POO_Proy_Paquete_img/pngwing.com-(8)-(1).png"));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 190, 180));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setText("2024-CICLO 2  AGOSTO ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 20));

        jp_curs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_curs1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jp_curs1MouseReleased(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

        jl_curso1.setText("Sin curso");

        javax.swing.GroupLayout jp_curs1Layout = new javax.swing.GroupLayout(jp_curs1);
        jp_curs1.setLayout(jp_curs1Layout);
        jp_curs1Layout.setHorizontalGroup(
            jp_curs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(jp_curs1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_curso1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_curs1Layout.setVerticalGroup(
            jp_curs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_curso1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jp_curs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 200, 170));

        jp_curs5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jp_curs5MouseReleased(evt);
            }
        });

        jl_curso5.setText("Sin curso");

        javax.swing.GroupLayout jp_curs5Layout = new javax.swing.GroupLayout(jp_curs5);
        jp_curs5.setLayout(jp_curs5Layout);
        jp_curs5Layout.setHorizontalGroup(
            jp_curs5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_curs5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_curs5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_curso5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_curs5Layout.setVerticalGroup(
            jp_curs5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs5Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_curso5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel1.add(jp_curs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 210, 170));

        jp_curs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jp_curs2MouseReleased(evt);
            }
        });

        jl_curso2.setText("Sin curso");

        javax.swing.GroupLayout jp_curs2Layout = new javax.swing.GroupLayout(jp_curs2);
        jp_curs2.setLayout(jp_curs2Layout);
        jp_curs2Layout.setHorizontalGroup(
            jp_curs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addGroup(jp_curs2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_curso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_curs2Layout.setVerticalGroup(
            jp_curs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs2Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_curso2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel1.add(jp_curs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 210, 170));

        jp_curs3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jp_curs3MouseReleased(evt);
            }
        });

        jl_curso3.setText("Sin curso");

        javax.swing.GroupLayout jp_curs3Layout = new javax.swing.GroupLayout(jp_curs3);
        jp_curs3.setLayout(jp_curs3Layout);
        jp_curs3Layout.setHorizontalGroup(
            jp_curs3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_curso3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_curs3Layout.setVerticalGroup(
            jp_curs3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs3Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_curso3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel1.add(jp_curs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        jp_curs6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jp_curs6MouseReleased(evt);
            }
        });

        jl_curso6.setText("Sin curso");

        javax.swing.GroupLayout jp_curs6Layout = new javax.swing.GroupLayout(jp_curs6);
        jp_curs6.setLayout(jp_curs6Layout);
        jp_curs6Layout.setHorizontalGroup(
            jp_curs6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_curso6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_curs6Layout.setVerticalGroup(
            jp_curs6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_curs6Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_curso6)
                .addGap(7, 7, 7))
        );

        jPanel1.add(jp_curs6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp_curs1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jp_curs1MouseEntered

    private void jp_curs1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs1MouseReleased
                                
                        CalculadorNotas CN = new CalculadorNotas();
                        switch (jl_curso1.getText())
                        {
                            case cal2 + " " + "(" + secc1 + ")": CN.curs1(); CN.setVisible(true); dispose(); break;
                            case mecc + " " + "(" + secc2 + ")": CN.curs2(); CN.setVisible(true); dispose(); break;
                            case Estinf + " " + "(" + secc3 + ")": CN.curs3(); CN.setVisible(true); dispose(); break;
                            case ciu + " " + "(" + secc4 + ")": CN.curs4(); CN.setVisible(true); dispose(); break;
                            case POO + " " + "(" + secc5 + ")": CN.curs5(); CN.setVisible(true); dispose(); break;
                            case Badatos + " " + "(" + secc6 + ")": CN.curs6(); CN.setVisible(true); dispose(); break;
                            case TGS + " " + "(" + secc7 + ")": CN.curs7(); CN.setVisible(true); dispose(); break;
                            case t_sincurso: JOptionPane.showMessageDialog(this, t_nocurso); break;
                        }
    }//GEN-LAST:event_jp_curs1MouseReleased

    private void jp_curs2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs2MouseReleased
                                
                        CalculadorNotas CN = new CalculadorNotas();
                        switch (jl_curso2.getText())
                        {
                            case cal2 + " " + "(" + secc1 + ")": CN.curs1(); CN.setVisible(true); dispose(); break;
                            case mecc + " " + "(" + secc2 + ")": CN.curs2(); CN.setVisible(true); dispose(); break;
                            case Estinf + " " + "(" + secc3 + ")": CN.curs3(); CN.setVisible(true); dispose(); break;
                            case ciu + " " + "(" + secc4 + ")": CN.curs4(); CN.setVisible(true); dispose(); break;
                            case POO + " " + "(" + secc5 + ")": CN.curs5(); CN.setVisible(true); dispose(); break;
                            case Badatos + " " + "(" + secc6 + ")": CN.curs6(); CN.setVisible(true); dispose(); break;
                            case TGS + " " + "(" + secc7 + ")": CN.curs7(); CN.setVisible(true); dispose(); break;
                            case t_sincurso: JOptionPane.showMessageDialog(this, t_nocurso); break;
                        }
    }//GEN-LAST:event_jp_curs2MouseReleased

    private void jp_curs4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs4MouseReleased
                                
                                
                        CalculadorNotas CN = new CalculadorNotas();
                        switch (jl_curso4.getText())
                        {
                            case cal2 + " " + "(" + secc1 + ")": CN.curs1(); CN.setVisible(true); dispose(); break;
                            case mecc + " " + "(" + secc2 + ")": CN.curs2(); CN.setVisible(true); dispose(); break;
                            case Estinf + " " + "(" + secc3 + ")": CN.curs3(); CN.setVisible(true); dispose(); break;
                            case ciu + " " + "(" + secc4 + ")": CN.curs4(); CN.setVisible(true); dispose(); break;
                            case POO + " " + "(" + secc5 + ")": CN.curs5(); CN.setVisible(true); dispose(); break;
                            case Badatos + " " + "(" + secc6 + ")": CN.curs6(); CN.setVisible(true); dispose(); break;
                            case TGS + " " + "(" + secc7 + ")": CN.curs7(); CN.setVisible(true); dispose(); break;
                            case t_sincurso: JOptionPane.showMessageDialog(this, t_nocurso); break;
                        }
    }//GEN-LAST:event_jp_curs4MouseReleased

    private void jp_curs5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs5MouseReleased
                                
                                
                        CalculadorNotas CN = new CalculadorNotas();
                        switch (jl_curso5.getText())
                        {
                            case cal2 + " " + "(" + secc1 + ")": CN.curs1(); CN.setVisible(true); dispose(); break;
                            case mecc + " " + "(" + secc2 + ")": CN.curs2(); CN.setVisible(true); dispose(); break;
                            case Estinf + " " + "(" + secc3 + ")": CN.curs3(); CN.setVisible(true); dispose(); break;
                            case ciu + " " + "(" + secc4 + ")": CN.curs4(); CN.setVisible(true); dispose(); break;
                            case POO + " " + "(" + secc5 + ")": CN.curs5(); CN.setVisible(true); dispose(); break;
                            case Badatos + " " + "(" + secc6 + ")": CN.curs6(); CN.setVisible(true); dispose(); break;
                            case TGS + " " + "(" + secc7 + ")": CN.curs7(); CN.setVisible(true); dispose(); break;
                            case t_sincurso: JOptionPane.showMessageDialog(this, t_nocurso); break;
                        }
    }//GEN-LAST:event_jp_curs5MouseReleased

    private void jp_curs3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs3MouseReleased
                                
                                
                        CalculadorNotas CN = new CalculadorNotas();
                        switch (jl_curso3.getText())
                        {
                            case cal2 + " " + "(" + secc1 + ")": CN.curs1(); CN.setVisible(true); dispose(); break;
                            case mecc + " " + "(" + secc2 + ")": CN.curs2(); CN.setVisible(true); dispose(); break;
                            case Estinf + " " + "(" + secc3 + ")": CN.curs3(); CN.setVisible(true); dispose(); break;
                            case ciu + " " + "(" + secc4 + ")": CN.curs4(); CN.setVisible(true); dispose(); break;
                            case POO + " " + "(" + secc5 + ")": CN.curs5(); CN.setVisible(true); dispose(); break;
                            case Badatos + " " + "(" + secc6 + ")": CN.curs6(); CN.setVisible(true); dispose(); break;
                            case TGS + " " + "(" + secc7 + ")": CN.curs7(); CN.setVisible(true); dispose(); break;
                            case t_sincurso: JOptionPane.showMessageDialog(this, t_nocurso); break;
                        }
    }//GEN-LAST:event_jp_curs3MouseReleased

    private void jp_curs6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_curs6MouseReleased
                                
                                
                        CalculadorNotas CN = new CalculadorNotas();
                        switch (jl_curso6.getText())
                        {
                            case cal2 + " " + "(" + secc1 + ")": CN.curs1(); CN.setVisible(true); dispose(); break;
                            case mecc + " " + "(" + secc2 + ")": CN.curs2(); CN.setVisible(true); dispose(); break;
                            case Estinf + " " + "(" + secc3 + ")": CN.curs3(); CN.setVisible(true); dispose(); break;
                            case ciu + " " + "(" + secc4 + ")": CN.curs4(); CN.setVisible(true); dispose(); break;
                            case POO + " " + "(" + secc5 + ")": CN.curs5(); CN.setVisible(true); dispose(); break;
                            case Badatos + " " + "(" + secc6 + ")": CN.curs6(); CN.setVisible(true); dispose(); break;
                            case TGS + " " + "(" + secc7 + ")": CN.curs7(); CN.setVisible(true); dispose(); break;
                            case t_sincurso: JOptionPane.showMessageDialog(this, t_nocurso); break;
                        }
    }//GEN-LAST:event_jp_curs6MouseReleased

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel jl_curso1;
    private javax.swing.JLabel jl_curso2;
    private javax.swing.JLabel jl_curso3;
    private javax.swing.JLabel jl_curso4;
    private javax.swing.JLabel jl_curso5;
    private javax.swing.JLabel jl_curso6;
    private javax.swing.JPanel jp_curs1;
    private javax.swing.JPanel jp_curs2;
    private javax.swing.JPanel jp_curs3;
    private javax.swing.JLabel jp_curs4;
    private javax.swing.JPanel jp_curs5;
    private javax.swing.JPanel jp_curs6;
    // End of variables declaration//GEN-END:variables
}
