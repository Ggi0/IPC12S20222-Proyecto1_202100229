
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Administrador
 */
public class VinfoClientes extends javax.swing.JFrame {

    public static String[][] TablaInfoClientes;
    public static String[][] TablaInfoCuentas;

    /**
     * Creates new form VinfoClientes
     */
    public VinfoClientes() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInfo = new javax.swing.JTable();
        btt_Buscar = new javax.swing.JButton();
        txt_BuscarCUI = new javax.swing.JTextField();
        btt_menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btt_Actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Información");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tablaInfo.setBackground(new java.awt.Color(255, 204, 102));
        tablaInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaInfo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tablaInfo.setAutoscrolls(false);
        tablaInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaInfo.setGridColor(new java.awt.Color(0, 0, 0));
        tablaInfo.setSelectionBackground(new java.awt.Color(255, 153, 51));
        tablaInfo.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaInfo);

        btt_Buscar.setBackground(new java.awt.Color(255, 204, 51));
        btt_Buscar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btt_Buscar.setText("Buscar cuentas asociadas");
        btt_Buscar.setActionCommand("");
        btt_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btt_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btt_BuscarMouseExited(evt);
            }
        });
        btt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_BuscarActionPerformed(evt);
            }
        });

        txt_BuscarCUI.setBackground(new java.awt.Color(255, 255, 255));
        txt_BuscarCUI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_BuscarCUI.setForeground(new java.awt.Color(0, 0, 0));
        txt_BuscarCUI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_BuscarCUI.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        tablaCuentas.setBackground(new java.awt.Color(255, 204, 102));
        tablaCuentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaCuentas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tablaCuentas.setAutoscrolls(false);
        tablaCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCuentas.setGridColor(new java.awt.Color(0, 0, 0));
        tablaCuentas.setSelectionBackground(new java.awt.Color(255, 153, 51));
        tablaCuentas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tablaCuentas);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CUI:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txt_BuscarCUI, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btt_Buscar))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_BuscarCUI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        btt_Actualizar.setBackground(new java.awt.Color(255, 204, 51));
        btt_Actualizar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btt_Actualizar.setText("Actualizar");
        btt_Actualizar.setActionCommand("");
        btt_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btt_ActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btt_ActualizarMouseExited(evt);
            }
        });
        btt_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btt_ActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_ActualizarMouseEntered
        // TODO add your handling code here:
        btt_Actualizar.setBackground(new java.awt.Color(255, 153, 51));
    }//GEN-LAST:event_btt_ActualizarMouseEntered

    private void btt_ActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_ActualizarMouseExited
        // TODO add your handling code here:
        btt_Actualizar.setBackground(new java.awt.Color(255, 204, 51));
    }//GEN-LAST:event_btt_ActualizarMouseExited

    private void btt_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_ActualizarActionPerformed

        //   Llamando datos de los clientes para colocarlo en la tabla
        VregistrarCliente paraTblaCliente = new VregistrarCliente();
        Cliente[] verClientes = paraTblaCliente.listaClientes;

        //---------------------------------------------------[Filas][Columnas]        
        TablaInfoClientes = new String[verClientes.length][3];

        for (int i = 0; i < verClientes.length; i++) {
            if (verClientes[i] != null) {
                //Del arreglo a la matriz
                TablaInfoClientes[i][0] = String.valueOf(verClientes[i].getCui());//las tablas solo leen texto
                TablaInfoClientes[i][1] = verClientes[i].getNombre();
                TablaInfoClientes[i][2] = verClientes[i].getApellido();
            }
        }

        //modelo de datos
        //Para los titulos de las columnas (ENCABEZADO)
        String[] titulos = {"CUI", "Nombre", "Apellido"};
        tablaInfo.setModel(new DefaultTableModel(TablaInfoClientes, titulos));
    }//GEN-LAST:event_btt_ActualizarActionPerformed

    private void btt_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_BuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_BuscarMouseEntered

    private void btt_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_BuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_BuscarMouseExited

    private void btt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_BuscarActionPerformed

        //if(txt_BuscarCUI.getText() ==)
        //VcrearCuentas tblaCA = new VcrearCuentas();
        //Cuenta[] verCuentaA = tblaCA.getCuentasAsociadas;
        VregistrarCliente paraTabla = new VregistrarCliente();
        Cliente[] verCuentasA = paraTabla.listaClientes;

        if (txt_BuscarCUI.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un CUI", "Información", JOptionPane.WARNING_MESSAGE);
        } else if (txt_BuscarCUI.getText() == "hola") {
            System.out.println("hola");
        } else {
            for (int i = 0; i < verCuentasA.length; i++) {
                if (verCuentasA[i] != null) {
                    //recorriendo para saber si que el cui ingresado sea igual 
                    if (verCuentasA[i].getCui() == Integer.parseInt(txt_BuscarCUI.getText())) {
                        //System.out.println("posicion: " + i + " " + verCuentasA[i].getCui() + " = " + "dpi ingresado : " + txt_BuscarCUI.getText());
                        TablaInfoCuentas = new String[verCuentasA[i].getCuentasAsociadas().length][1];

                        for (int j = 0; j < verCuentasA[i].getCuentasAsociadas().length; j++) {
                            if (verCuentasA[i].getCuentasAsociadas()[j] != null) {
                                TablaInfoCuentas[j][0] = String.valueOf(verCuentasA[i].getCuentasAsociadas()[j].getId());
                            } else {
                                TablaInfoCuentas[j][0] = "";
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El CUI ingresado no pertenece a ningun cliente", "Información", JOptionPane.WARNING_MESSAGE);
                    }

                }
            }
        }

        //modelo de datos
        //Para los titulos de las columnas (ENCABEZADO)
        String[] titulo = {"Cuentas Asociadas"};
        tablaCuentas.setModel(new DefaultTableModel(TablaInfoCuentas, titulo));


    }//GEN-LAST:event_btt_BuscarActionPerformed

    private void btt_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_menuMouseEntered
        // TODO add your handling code here:
        btt_menu.setBackground(new java.awt.Color(255, 153, 51));
    }//GEN-LAST:event_btt_menuMouseEntered

    private void btt_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btt_menuMouseExited
        // TODO add your handling code here:
        btt_menu.setBackground(new java.awt.Color(255, 204, 51));
    }//GEN-LAST:event_btt_menuMouseExited

    private void btt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_menuActionPerformed
        // TODO add your handling code here:
        VentanaMenu regresar = new VentanaMenu();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btt_menuActionPerformed

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
            java.util.logging.Logger.getLogger(VinfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VinfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VinfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VinfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VinfoClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_Actualizar;
    private javax.swing.JButton btt_Buscar;
    private javax.swing.JButton btt_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCuentas;
    private javax.swing.JTable tablaInfo;
    private javax.swing.JTextField txt_BuscarCUI;
    // End of variables declaration//GEN-END:variables
}
