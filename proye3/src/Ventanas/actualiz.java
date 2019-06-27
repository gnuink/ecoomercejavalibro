package Ventanas;

import nocone.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class actualiz extends javax.swing.JFrame {

    Conectar Con = new Conectar();

    static Connection conect;

    public actualiz() {
        initComponents();
        mostrardatos("");
        setLocationRelativeTo(null);
        txtventa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnmostrartdoo = new javax.swing.JButton();
        txtcosto = new javax.swing.JTextField();
        txtventa = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btndescuento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btVOLVER = new javax.swing.JButton();
        txtdescuento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 910, 148));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualización de libros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        btnmostrartdoo.setText("Mostrar Todo");
        btnmostrartdoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrartdooActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrartdoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 890, -1));

        txtcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoActionPerformed(evt);
            }
        });
        txtcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcostoKeyReleased(evt);
            }
        });
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 73, -1));
        getContentPane().add(txtventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 90, -1));

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 90, 30));

        btndescuento.setText("Descuento");
        btndescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndescuentoActionPerformed(evt);
            }
        });
        getContentPane().add(btndescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un libro ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio Costo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aplicar el descuesto ->");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 20));

        btVOLVER.setText("Volver");
        btVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(btVOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));
        getContentPane().add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 73, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmostrartdooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrartdooActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_btnmostrartdooActionPerformed

    private void btVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVOLVERActionPerformed
        dispose();
    }//GEN-LAST:event_btVOLVERActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        conect = Con.Conexion();
        int fila = tablon.getSelectedRow();
        String cod = "";
        cod = tablon.getValueAt(fila, 1).toString();
        int a = 1;
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "¿Seguro que desea actualizar Los PRECIO?",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"SI", "NO"},
                "SI");

        if (seleccion != 1) {

            try {
                PreparedStatement pst = conect.prepareStatement("UPDATE Libros Set Precio_Costo ='" + txtcosto.getText() + "', Precio_Venta ='" + txtventa.getText() + "' WHERE  Isbn='" + cod + "'");
                pst.executeUpdate();
                mostrardatos("");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnactualizarActionPerformed
    void mostrardatos(String nombre) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("TITULO");;
        modelo.addColumn("Nº ISBN");
        modelo.addColumn("PRECIO COSTO");
        modelo.addColumn("PRECIO VENTA");
        modelo.addColumn("DESCUENTO %");
        tablon.setModel(modelo);
        String sql = "";
        if (nombre.equals("")) {
            sql = "SELECT Libros.Titulo, Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento\n"
                    + "FROM Libros\n"
                    + "ORDER BY  Libros.Titulo, Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento";
        } else {
            sql = "SELECT Libros.Titulo, Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento\n"
                    + "FROM Libros\n"
                    + "WHERE Libros.Titulo='" + nombre + "'\n"
                    + "ORDER BY Libros.Titulo,Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento";
        }

        String[] datos = new String[5];
        try {
            ResultSet rs = Conectar.validaisbn(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tablon.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(IngresarLibros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void btndescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndescuentoActionPerformed
        conect = Con.Conexion();
        int fila = tablon.getSelectedRow();
        String cod = "";
        cod = tablon.getValueAt(fila, 1).toString();
        int a = 1;
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "¿desea Aplicar el DESCUENTO?",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"SI", "NO"},
                "SI");

        if (seleccion != 1) {

            try {
                PreparedStatement pst = conect.prepareStatement("UPDATE Libros Set Descuento = '" + txtdescuento.getText() + "'WHERE  Isbn='" + cod + "'");
                pst.executeUpdate();
                mostrardatos("");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btndescuentoActionPerformed

    private void txtcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostoActionPerformed

    private void txtcostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostoKeyReleased
        String Costo = txtcosto.getText();
        double costo = Integer.parseInt(Costo);
        double venta = (costo * 50) / 100;
        double b = venta + costo;
        txtventa.setText(b + "");
    }//GEN-LAST:event_txtcostoKeyReleased

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
            java.util.logging.Logger.getLogger(actualiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVOLVER;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btndescuento;
    private javax.swing.JButton btnmostrartdoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablon;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtventa;
    // End of variables declaration//GEN-END:variables
}
