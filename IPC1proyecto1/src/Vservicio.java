/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Vservicio extends javax.swing.JFrame {

    /**
     * Creates new form Vservicio
     */
    public Vservicio() {
        initComponents();
        initComponents2();
    }
    
    public void initComponents2(){
        setLocationRelativeTo(null);
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
        jPanel4 = new javax.swing.JPanel();
        txt_cui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbx_clientes = new javax.swing.JComboBox<>();
        btt_crear = new javax.swing.JButton();
        btt_menu = new javax.swing.JButton();
        cbx_clientes1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Pago de Servicio");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txt_cui.setBackground(new java.awt.Color(255, 255, 255));
        txt_cui.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_cui.setForeground(new java.awt.Color(0, 0, 0));
        txt_cui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cui.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setBackground(new java.awt.Color(255, 51, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cuenta:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setBackground(new java.awt.Color(255, 51, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CUI:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cbx_clientes.setBackground(new java.awt.Color(255, 255, 255));
        cbx_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_clientesActionPerformed(evt);
            }
        });

        btt_crear.setBackground(new java.awt.Color(255, 204, 51));
        btt_crear.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        btt_crear.setText("Pagar");
        btt_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btt_crearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btt_crearMouseExited(evt);
            }
        });
        btt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_crearActionPerformed(evt);
            }
        });

        btt_menu.setBackground(new java.awt.Color(255, 204, 51));
        btt_menu.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        btt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        btt_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btt_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btt_menuMouseExited(evt);
            }
        });
        btt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_menuActionPerformed(evt);
            }
        });

        cbx_clientes1.setBackground(new java.awt.Color(255, 255, 255));
        cbx_clientes1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbx_clientes1.setForeground(new java.awt.Color(0, 0, 0));
        cbx_clientes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luz eléctrica", "Agua", "Servicio telefónico" }));
        cbx_clientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_clientes1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 51, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de servicio");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel6.setBackground(new java.awt.Color(255, 51, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("0.00");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(255, 51, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total a Pagar:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cui, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbx_clientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btt_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btt_menu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jLabel5)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_cui, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(cbx_clientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_crear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btt_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jLabel5)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(355, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_clientesActionPerformed
        //        //obtener la informacion de un comboBox
        //
        //        //toma el valor del combobox selecionado
        //        //lo combiete en string
        //        //y lo coloca en el lable indice
        //        lbl_indice.setText(String.valueOf(cbx_clientes.getSelectedIndex()));
        //
        //        //Toma el valor del combo box y lo pasa la entero valorElegido
        //        int valorElegido = cbx_clientes.getSelectedIndex();
        //        VregistrarCliente pf = new VregistrarCliente();
        //
        //        //-------------------------Buscar en la listaClientes el valor seleccionado del comboBox e imprimir el apellido
        //        System.out.println(pf.listaClientes[valorElegido].getApellido());
        //
    }//GEN-LAST:event_cbx_clientesActionPerformed

    private void btt_crearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_crearMouseEntered
        // TODO add your handling code here:
        btt_crear.setBackground(new java.awt.Color(255,153,51));
    }//GEN-LAST:event_btt_crearMouseEntered

    private void btt_crearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_crearMouseExited
        // TODO add your handling code here:
        btt_crear.setBackground(new java.awt.Color(255,204,51));
    }//GEN-LAST:event_btt_crearMouseExited

    private void btt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_crearActionPerformed
        // AGREGAR CLIENTES
        //Hacer un nuevo cliente
        //-----------------------------------------------Datos para REGISTRAR UN CLINETE
//
//        if (txt_cui.getText().equals("") || txt_Apellido.getText().equals("") || txt_Nombre.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "\nNo dejar campos vacios", "Alerta", JOptionPane.ERROR_MESSAGE);
//        } else {
//            Cliente nuevoCliente = new Cliente(Integer.parseInt(txt_cui.getText()), txt_Apellido.getText(), txt_Nombre.getText());
//            try {
//                boolean bandera = false;
//                //AQUI SE AGREGAN LOS CLIENTES
//                for (int i = 0; i < listaClientes.length; i++) {
//                    if (listaClientes[i] == null) {
//                        listaClientes[i] = nuevoCliente;
//                        JOptionPane.showMessageDialog(null, "Cliente creado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
//                        bandera = true;
//                        txt_cui.setText("");
//                        txt_Apellido.setText("");
//                        txt_Nombre.setText("");
//                        break;
//                    }
//                }
//                if (bandera == false) {
//                    JOptionPane.showMessageDialog(null, "No es posible crear más clientes", "Limite de usuarios", JOptionPane.ERROR_MESSAGE);
//                    txt_cui.setText("");
//                    txt_Apellido.setText("");
//                    txt_Nombre.setText("");
//                }
//                for (int i = 0; i < listaClientes.length; i++) {
//                    listaClientes[i].imprimir();
//                }
//            } catch (NullPointerException ex) {
//                System.out.println("hay error");
//            }
//        }
    }//GEN-LAST:event_btt_crearActionPerformed

    private void btt_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_menuMouseEntered
        // TODO add your handling code here:
        btt_menu.setBackground(new java.awt.Color(255,153,51));
    }//GEN-LAST:event_btt_menuMouseEntered

    private void btt_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_menuMouseExited
        // TODO add your handling code here:
        btt_menu.setBackground(new java.awt.Color(255,204,51));
    }//GEN-LAST:event_btt_menuMouseExited

    private void btt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_menuActionPerformed
        // TODO add your handling code here:
        VentanaMenu regresar = new VentanaMenu();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btt_menuActionPerformed

    private void cbx_clientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_clientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_clientes1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vservicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_crear;
    private javax.swing.JButton btt_menu;
    private javax.swing.JComboBox<String> cbx_clientes;
    private javax.swing.JComboBox<String> cbx_clientes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_cui;
    // End of variables declaration//GEN-END:variables
}
