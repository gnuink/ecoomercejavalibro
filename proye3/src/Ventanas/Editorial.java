package Ventanas;
import funci.Ingresar;
import funci.num;
import funci.verificar;
import ddas.eeditorial;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import nocone.Conectar;


public class Editorial extends javax.swing.JFrame {


    
    static Connection conect;

    public Editorial() {
        initComponents();
        numeros();
        setLocationRelativeTo(null);
        txtID.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtfono = new javax.swing.JTextField();
        jNombre1 = new javax.swing.JLabel();
        btIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Editorial");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, -1));

        jNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("ID :");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTelefono.setText("Telefono :");
        getContentPane().add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 60, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 121, -1));

        txtfono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, -1));

        jNombre1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jNombre1.setText("Nombre :");
        getContentPane().add(jNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoCategoria.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        if (txtnombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "ingresar un Nombre");
            txtnombre.requestFocus();
            return;
        }
         if (txtfono.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "ingresar un Telefono");
            txtfono.requestFocus();
            return;
        }
        
        eeditorial datos = new eeditorial();
        Ingresar funcion = new Ingresar();
        verificar verificar = new verificar();
        
        int login = verificar.verificarEditorial();
        if (login == 1) {
            JOptionPane.showMessageDialog(null, "Este Nombre : " + txtnombre.getText() + ", ya fue ingresado.");
            txtnombre.setText("");
            txtnombre.requestFocus();
            return;
        }
        
        datos.setId_Editorial(txtID.getText());
        datos.setNombre(txtnombre.getText());
        datos.setTelefono(Integer.parseInt(txtfono.getText()));

        if (funcion.CrearEditorial(datos)) {
            JOptionPane.showMessageDialog(null, "La editorial fue ingresado al sistema, exito");
            limpiar();
            numeros();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar la editorial, por un problema!!");
        }                                          
    }//GEN-LAST:event_btIngresarActionPerformed
 void limpiar(){
        txtID.setText("");
        txtnombre.setText("");
        txtfono.setText("");
    }
    private void txtfonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfonoKeyTyped
            char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_txtfonoKeyTyped

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
            java.util.logging.Logger.getLogger(Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editorial().setVisible(true);
            }
        });
    }
void numeros()
     {
    
        String c="";
        String Num="SELECT MAX(Id_Editorial) AS Id_Editorial FROM Editorial";
        
        try {
            
            ResultSet rs = Conectar.validaisbn(Num);
            if(rs.next())
            {              
                 c=rs.getString("Id_Editorial");
            }
            if(c==null)
             {
                 txtID.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 num gen = new num();
                 gen.generar(var);
            
                txtID.setText(gen.serie());    
                
             }
            } 
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jNombre1;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtfono;
    public static javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
