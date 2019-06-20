package Ventanas;

import nocone.Conectar;

public class Menu extends javax.swing.JFrame {

        Conectar Con = new Conectar();
public Menu() {
        initComponents();
         Con.Conexion();
         setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Ingresar = new javax.swing.JMenu();
        IngCat = new javax.swing.JMenuItem();
        IngEdit = new javax.swing.JMenuItem();
        IngLib = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        Arreglos = new javax.swing.JMenuItem();
        Sal = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.jpg"))); // NOI18N

        Ingresar.setText("Ingreso");

        IngCat.setText("Ingresar Categoria");
        IngCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngCatActionPerformed(evt);
            }
        });
        Ingresar.add(IngCat);

        IngEdit.setText("Ingresar Editorial");
        IngEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngEditActionPerformed(evt);
            }
        });
        Ingresar.add(IngEdit);

        IngLib.setText("Ingresar Libro");
        IngLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngLibActionPerformed(evt);
            }
        });
        Ingresar.add(IngLib);

        jMenuBar1.add(Ingresar);

        Consultas.setText("Consultas");

        Arreglos.setText("Actualizar Libro");
        Arreglos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArreglosActionPerformed(evt);
            }
        });
        Consultas.add(Arreglos);

        jMenuBar1.add(Consultas);

        Sal.setText("Salir");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Sal.add(Salir);

        jMenuBar1.add(Sal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngCatActionPerformed
        IngresarCategoria men = new IngresarCategoria();
        men.setVisible(true);
    }//GEN-LAST:event_IngCatActionPerformed

    private void IngEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngEditActionPerformed
        Editorial men = new Editorial();
        men.setVisible(true);
    }//GEN-LAST:event_IngEditActionPerformed

    private void IngLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngLibActionPerformed
        IngresarLibros men = new IngresarLibros();
        men.setVisible(true);
    }//GEN-LAST:event_IngLibActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Conectar Con = new Conectar();
            Con.CerrarBD();
            System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ArreglosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArreglosActionPerformed
        actualiz men = new actualiz();
        men.setVisible(true);
    }//GEN-LAST:event_ArreglosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Arreglos;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenuItem IngCat;
    private javax.swing.JMenuItem IngEdit;
    private javax.swing.JMenuItem IngLib;
    private javax.swing.JMenu Ingresar;
    private javax.swing.JMenu Sal;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
