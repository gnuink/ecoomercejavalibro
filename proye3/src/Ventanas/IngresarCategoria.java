package Ventanas;

import funci.num;
import funci.verificar;
import funci.Ingresar;
import ddas.ccategoria;
import nocone.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class IngresarCategoria extends javax.swing.JFrame {

    Conectar Con = new Conectar();

    static Connection conect;

    public IngresarCategoria() {
        initComponents();
        numeros();
        setLocationRelativeTo(null);
        ID.setVisible(true);

    }

    void limpiar() {
        ID.setText("");
        NOMBRE.setText("");
    }

    void numeros() {
        conect = Con.Conexion();
        int j;

        String c = "";
        String Num = "SELECT MAX(Id_Categoria) AS Id_Categoria FROM Categoria";

        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Num);
            if (rs.next()) {
                c = rs.getString("Id_Categoria");
            }
            if (c == null) {
                ID.setText("0001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);

                String juntar = "" + r1 + r2;

                int var = Integer.parseInt(juntar);
                num gen = new num();
                gen.generar(var);

                ID.setText(gen.serie());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        btIngresar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        jNombre1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("ID");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, -1));
        getContentPane().add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 77, 130, -1));

        btIngresar.setText("INGRESO");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 132, -1, -1));

        btVolver.setText("VOLVER");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 132, -1, -1));

        jNombre1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jNombre1.setText("Nombre");
        getContentPane().add(jNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoCategoria.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed

        if (NOMBRE.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            NOMBRE.requestFocus();
            return;
        }

        ccategoria datos = new ccategoria();
        Ingresar funcion = new Ingresar();
        verificar verificar = new verificar();

        int login = verificar.verificarCategoria();
        if (login == 1) {
            JOptionPane.showMessageDialog(null, "Este categoria : " + NOMBRE.getText() + ", ya fue ingresada.");
            NOMBRE.setText("");
            NOMBRE.requestFocus();
            return;

        }
        datos.setId_Categoria(ID.getText());
        datos.setDescripcion(NOMBRE.getText());

        if (funcion.CrearCategoria(datos)) {
            JOptionPane.showMessageDialog(null, "La categoria fue ingresado al sistema!!");
            limpiar();
            numeros();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar la categoria");
        }
    }//GEN-LAST:event_btIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    public static javax.swing.JTextField NOMBRE;
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jNombre1;
    // End of variables declaration//GEN-END:variables
}
