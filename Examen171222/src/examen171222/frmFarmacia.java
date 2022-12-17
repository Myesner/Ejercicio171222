/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package examen171222;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yesner
 */
public class frmFarmacia extends javax.swing.JInternalFrame {

  
  DefaultTableModel modelo;
  /**
   * Creates new form frmFarmacia
   */
  public frmFarmacia() {
    initComponents();
    conf();
  }
  
  public void conf(){
    modelo = new DefaultTableModel();
    tbfarmacia.setModel(modelo);
    modelo.addColumn("Cliente");
    modelo.addColumn("Producto");
    modelo.addColumn("precio");
    modelo.addColumn("Monto a Pagar");
  
  
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
    jLabel1 = new javax.swing.JLabel();
    txtcategoria = new javax.swing.JTextField();
    txtnombre = new javax.swing.JTextField();
    txtapellido = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtmontoapagar = new javax.swing.JTextField();
    txttelefono = new javax.swing.JTextField();
    txtprecio = new javax.swing.JTextField();
    txtcantidad = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtproducto = new javax.swing.JTextField();
    txtdescuento = new javax.swing.JTextField();
    btncalcular = new javax.swing.JButton();
    btnregistrar = new javax.swing.JButton();
    txtdia = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    tbfarmacia = new javax.swing.JTable();
    btnlimpiar1 = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    jPanel1.setBackground(new java.awt.Color(153, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos Farmacéuticos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
    jLabel1.setText("Cliente");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));

    txtcategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Categoria"));
    jPanel1.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 40));

    txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Nombre"));
    jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 40));

    txtapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Apellido"));
    jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 220, 40));

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
    jLabel2.setText("Detalles de pago");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

    txtmontoapagar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Monto a Pagar"));
    jPanel1.add(txtmontoapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 180, 40));

    txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Teléfono"));
    jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 180, 40));

    txtprecio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Precio"));
    jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 130, 40));

    txtcantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Cantidad"));
    jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 130, 40));

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
    jLabel3.setText("Datos del Producto");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

    txtproducto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Producto"));
    jPanel1.add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 40));

    txtdescuento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Descuento"));
    jPanel1.add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 40));

    btncalcular.setText("Calcular");
    btncalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btncalcular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btncalcularActionPerformed(evt);
      }
    });
    jPanel1.add(btncalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 259, 110, 40));

    btnregistrar.setText("Registrar");
    btnregistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnregistrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnregistrarActionPerformed(evt);
      }
    });
    jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 40));

    txtdia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Hoy es"));
    jPanel1.add(txtdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 140, -1));

    tbfarmacia.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane2.setViewportView(tbfarmacia);

    jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 700, 360));

    btnlimpiar1.setText("Limpiar");
    btnlimpiar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnlimpiar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnlimpiar1ActionPerformed(evt);
      }
    });
    jPanel1.add(btnlimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, 40));

    jButton1.setText("Salir");
    jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 110, 40));

    jButton2.setText("Eliminar");
    jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 100, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
   validarC();
   Descuento();
   validarR();
  }//GEN-LAST:event_btncalcularActionPerformed

  private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
    try {
      LlenarTabla();
      JOptionPane.showMessageDialog(null, "Los Datos se Guardaron Correctamente");
    } catch (Exception e) {
       JOptionPane.showMessageDialog(null, "Los Datos no guardaron" +e);
    }
   
   
   txtnombre.requestFocus();
  }//GEN-LAST:event_btnregistrarActionPerformed

  private void btnlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar1ActionPerformed
    Limpiar();
  }//GEN-LAST:event_btnlimpiar1ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Eliminar();
  }//GEN-LAST:event_jButton2ActionPerformed
   
  public void LlenarTabla(){
    Object[] Datosf = new Object[4];
      Datosf [0] = txtnombre.getText() +" "+txtapellido.getText();
      Datosf [1] = txtproducto.getText();
      Datosf [2] = txtprecio.getText();
      Datosf [3] = txtmontoapagar.getText();
     modelo.addRow(Datosf);
     Limpiar();
  }
  
  
  void validarC(){
    String dia = txtdia.getText();
    String precio = txtprecio.getText();
    String cantidad = txtcantidad.getText();
    
    if(dia.equalsIgnoreCase("") || precio.equalsIgnoreCase("") || cantidad.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Llene los campos");
             
             }
  
  }
  
  void validarR(){
     String datosc = (txtnombre.getText()+txtapellido.getText());
    String datosp = txtproducto.getText();
    String montop = txtmontoapagar.getText();
     if(datosc.equalsIgnoreCase("") || datosp.equalsIgnoreCase("") || montop.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Llene los campos");
             
             }
  
  }
  
  void Descuento(){
    double precio = Double.parseDouble(txtprecio.getText());
    int cantidad = Integer.parseInt(txtcantidad.getText());
    String dia = txtdia.getText();
    String categoria = txtcategoria.getText();
    String descuento;
    String montop;
    double total;
    double des;
    
  if(dia.equals("jueves") && categoria.equals("analgesico")){
         total = precio*cantidad;
         des = (total*0.30);
         descuento = String.valueOf(des);
         montop = String.valueOf(total-des);
         txtdescuento.setText(descuento);
         txtmontoapagar.setText(montop);
  
    }else {
      
       total = precio*cantidad;
       montop = String.valueOf(total);
       txtmontoapagar.setText(montop);
       
  
  }
  
  
  
  
  
  
  }
  
  void Limpiar(){
      txtnombre.setText("");
      txtapellido.setText("");
      txttelefono.setText("");
      txtproducto.setText("");
      txtprecio.setText("");
      txtcantidad.setText("");
      txtcategoria.setText("");
      txtdia.setText("");
      
  
  }
  
  public void Eliminar(){
     int fila = tbfarmacia.getSelectedRow();
     if(fila != -1){
       modelo.removeRow(fila);
     }else
         JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
    }
  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btncalcular;
  private javax.swing.JButton btnlimpiar1;
  private javax.swing.JButton btnregistrar;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable tbfarmacia;
  private javax.swing.JTextField txtapellido;
  private javax.swing.JTextField txtcantidad;
  private javax.swing.JTextField txtcategoria;
  private javax.swing.JTextField txtdescuento;
  private javax.swing.JTextField txtdia;
  private javax.swing.JTextField txtmontoapagar;
  private javax.swing.JTextField txtnombre;
  private javax.swing.JTextField txtprecio;
  private javax.swing.JTextField txtproducto;
  private javax.swing.JTextField txttelefono;
  // End of variables declaration//GEN-END:variables
}
