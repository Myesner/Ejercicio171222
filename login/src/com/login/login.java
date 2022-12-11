
package com.login;

import java.awt.Color;

/**
 *
 * @author yesner
 */
public class login extends javax.swing.JFrame {
    
    
    int xMouse,yMause;
    
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passrom = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passbtn = new javax.swing.JPasswordField();
        ENTRARbtn = new javax.swing.JPanel();
        LOGINTXT = new javax.swing.JLabel();
        EXITbtn = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagen/logo.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 220, 150));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("COOSERAMA");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 290, -1));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagen/city.png"))); // NOI18N
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, 500));

        title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        title.setText("INICIAR SECCION");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 260, -1));

        user.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        user.setText("USUARIO");
        bg.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, -1));

        usertxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usertxt.setForeground(new java.awt.Color(204, 204, 204));
        usertxt.setText("Ingrese su nombre de usuario");
        usertxt.setBorder(null);
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usertxtMousePressed(evt);
            }
        });
        bg.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 420, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 420, 10));

        passrom.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        passrom.setText("CONTRASEÑA");
        bg.add(passrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("");
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 420, 10));

        passbtn.setForeground(new java.awt.Color(204, 204, 204));
        passbtn.setText("********");
        passbtn.setBorder(null);
        passbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passbtnMousePressed(evt);
            }
        });
        bg.add(passbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 420, -1));

        ENTRARbtn.setBackground(new java.awt.Color(0, 134, 190));
        ENTRARbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ENTRARbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENTRARbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ENTRARbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ENTRARbtnMouseExited(evt);
            }
        });

        LOGINTXT.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        LOGINTXT.setForeground(new java.awt.Color(255, 255, 255));
        LOGINTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGINTXT.setText("ENTRAR");
        LOGINTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ENTRARbtnLayout = new javax.swing.GroupLayout(ENTRARbtn);
        ENTRARbtn.setLayout(ENTRARbtnLayout);
        ENTRARbtnLayout.setHorizontalGroup(
            ENTRARbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGINTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        ENTRARbtnLayout.setVerticalGroup(
            ENTRARbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ENTRARbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LOGINTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(ENTRARbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 90, 30));

        EXITbtn.setBackground(new java.awt.Color(255, 255, 255));
        EXITbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EXITbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EXITbtnMouseExited(evt);
            }
        });

        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");
        exittxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout EXITbtnLayout = new javax.swing.GroupLayout(EXITbtn);
        EXITbtn.setLayout(EXITbtnLayout);
        EXITbtnLayout.setHorizontalGroup(
            EXITbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EXITbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EXITbtnLayout.setVerticalGroup(
            EXITbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EXITbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exittxt)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        bg.add(EXITbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(727, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagen/favicon.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMause);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void EXITbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITbtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EXITbtnMouseClicked

    private void EXITbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITbtnMouseEntered
        EXITbtn.setBackground(Color.red);
        exittxt.setForeground(Color.white);
    }//GEN-LAST:event_EXITbtnMouseEntered

    private void EXITbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITbtnMouseExited
        EXITbtn.setBackground(Color.white);
        exittxt.setForeground(Color.black);
    }//GEN-LAST:event_EXITbtnMouseExited

    private void ENTRARbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARbtnMouseEntered
        ENTRARbtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ENTRARbtnMouseEntered

    private void ENTRARbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARbtnMouseExited
        ENTRARbtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_ENTRARbtnMouseExited

    private void usertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMousePressed
        if(usertxt.getText().equals("Ingrese su nombre de usuario")){
           usertxt.setText("");
           usertxt.setForeground(Color.black);
        }
        if(String.valueOf(passbtn.getPassword()).isEmpty()){
           passbtn.setText("********");
           passbtn.setForeground(Color.black);
        }
    }//GEN-LAST:event_usertxtMousePressed

    private void passbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passbtnMousePressed
        if(String.valueOf(passbtn.getPassword()).equals("********")){
           passbtn.setText("");
           passbtn.setForeground(Color.black);
        }
        if(usertxt.getText().isEmpty()){
           usertxt.setText("Ingrese su nombre de usuario");
           usertxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_passbtnMousePressed

    private void ENTRARbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARbtnMouseClicked
       javax.swing.JOptionPane.showMessageDialog(this,"Intento de Login con los datos:\nUsuario:" + usertxt.getText() + "\nContraseña:" + String.valueOf(passbtn.getPassword()) , "Login", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ENTRARbtnMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ENTRARbtn;
    private javax.swing.JPanel EXITbtn;
    private javax.swing.JLabel LOGINTXT;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel exittxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoname;
    private javax.swing.JPasswordField passbtn;
    private javax.swing.JLabel passrom;
    private javax.swing.JLabel title;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
