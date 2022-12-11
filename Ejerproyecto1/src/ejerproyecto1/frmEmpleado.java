/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerproyecto1;

import java.awt.Color;
import javax.swing.DefaultListModel;

/**
 *
 * @author yesner
 */
public class frmEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEmpleado
     */
    DefaultListModel modeloEmpleado,modeloSueldo,modeloSexo;
    public frmEmpleado() {
        initComponents();
        modeloEmpleado = new DefaultListModel();
        modeloSueldo = new DefaultListModel();
        modeloSexo = new DefaultListModel();
        
        lstnombre.setModel(modeloEmpleado);
        lstsueldo.setModel(modeloSueldo);
        lstsexo.setModel(modeloSexo);
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
        txtnombre = new javax.swing.JTextField();
        txtsueldo = new javax.swing.JTextField();
        cbosexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        btncantidad = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstsueldo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstsexo = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstnombre = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtinforme = new javax.swing.JTextArea();
        txtcantidadE = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Empleados"));

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "NOMBRE"));

        txtsueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SUELDO"));

        cbosexo.setBackground(new java.awt.Color(255, 255, 255));
        cbosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "MASCULINO", "FEMENINO" }));
        cbosexo.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "OPERACIONES"));

        btnguardar.setBackground(new java.awt.Color(153, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/com/guardar.jpeg"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnguardarMouseMoved(evt);
            }
        });
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnguardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnguardarMouseExited(evt);
            }
        });
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncantidad.setBackground(new java.awt.Color(153, 255, 255));
        btncantidad.setText("CANTIDAD");
        btncantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncantidadActionPerformed(evt);
            }
        });

        btnInforme.setBackground(new java.awt.Color(153, 255, 255));
        btnInforme.setText("INFORME");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInforme)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        lstsueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("SUELDO"));
        jScrollPane1.setViewportView(lstsueldo);

        lstsexo.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));
        jScrollPane2.setViewportView(lstsexo);

        lstnombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        jScrollPane3.setViewportView(lstnombre);

        txtinforme.setColumns(20);
        txtinforme.setRows(5);
        txtinforme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(txtinforme);

        txtcantidadE.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad Empleados"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtsueldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtcantidadE, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantidadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btncantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncantidadActionPerformed
        int n = modeloEmpleado.size();
        txtcantidadE.setText(""+n);
    }//GEN-LAST:event_btncantidadActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String nombre = txtnombre.getText();
        double sueldo = Double.parseDouble(txtsueldo.getText());
        String sexo = cbosexo.getSelectedItem().toString();
        modeloEmpleado.addElement(nombre);
        modeloSueldo.addElement(sueldo);
        modeloSexo.addElement(sexo);
        txtnombre.setText("");
        txtsueldo.setText("");
        cbosexo.setSelectedIndex(-1);
        txtnombre.requestFocus();
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseEntered
         btnguardar.setBackground(new Color(153,255,255));
    }//GEN-LAST:event_btnguardarMouseEntered

    private void btnguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseExited
       btnguardar.setBackground(Color.red);
    }//GEN-LAST:event_btnguardarMouseExited

    private void btnguardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseMoved
      
    }//GEN-LAST:event_btnguardarMouseMoved

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        //variables 
        int n = modeloEmpleado.size();
        double promedio,suma=0,mayor=-999,sueldo;
        String nombre,sexo,m="";
        for (int i = 0; i < n; i++) {
            nombre = modeloEmpleado.getElementAt(i).toString();
            sueldo =Double.parseDouble(modeloSueldo.getElementAt(i).toString());
            sexo = modeloSexo.getElementAt(i).toString();
            
            suma+=sueldo;
            if(sexo.equals("FEMENINO")){
            if(sueldo>mayor){
               mayor = sueldo;
               m = nombre;
            
            }
          }
        }
        promedio = suma/n;
        txtinforme.append("El promedio de los salarios es:" +promedio+ "\n");
        txtinforme.append("El salario mayor de las mujeres es:" +mayor+ ", " +"y le pertenece a " +m); 
    }//GEN-LAST:event_btnInformeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btncantidad;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstnombre;
    private javax.swing.JList<String> lstsexo;
    private javax.swing.JList<String> lstsueldo;
    private javax.swing.JTextField txtcantidadE;
    private javax.swing.JTextArea txtinforme;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
}