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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btMOSTRAR = new javax.swing.JButton();
        COSTO = new javax.swing.JTextField();
        VENTA = new javax.swing.JTextField();
        btACTUALIZAR = new javax.swing.JButton();
        btDESCUENTO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btVOLVER = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 910, 148));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualización de libros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        btMOSTRAR.setText("Mostrar Todo");
        btMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMOSTRARActionPerformed(evt);
            }
        });
        getContentPane().add(btMOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 890, -1));
        getContentPane().add(COSTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 73, -1));
        getContentPane().add(VENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 90, -1));

        btACTUALIZAR.setText("Actualizar");
        btACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACTUALIZARActionPerformed(evt);
            }
        });
        getContentPane().add(btACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 90, 30));

        btDESCUENTO.setText("Descuento");
        btDESCUENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDESCUENTOActionPerformed(evt);
            }
        });
        getContentPane().add(btDESCUENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un libro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio Costo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCategoria.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMOSTRARActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_btMOSTRARActionPerformed

    private void btVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVOLVERActionPerformed
       dispose();
    }//GEN-LAST:event_btVOLVERActionPerformed

    private void btACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACTUALIZARActionPerformed
    conect =Con.Conexion();
    int fila = TABLA.getSelectedRow();
    String cod="";
    cod=TABLA.getValueAt(fila, 1).toString();
    int a = 1;
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Seguro que desea actualizar Los PRECIO?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){

    try {
        PreparedStatement pst = conect.prepareStatement("UPDATE Libros Set Precio_Costo ='"+ COSTO.getText()+"', Precio_Venta ='"+VENTA.getText()+"' WHERE  Isbn='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
    } catch (Exception e) {
    }
}
    }//GEN-LAST:event_btACTUALIZARActionPerformed
void mostrardatos(String nombre){
    conect = Con.Conexion();
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("TITULO");;
    modelo.addColumn("Nº ISBN");
    modelo.addColumn("PRECIO COSTO");
    modelo.addColumn("PRECIO VENTA");
    modelo.addColumn("DESCUENTO %");
    TABLA.setModel(modelo);
    String sql="";
    if(nombre.equals(""))
    {
        sql="SELECT Libros.Titulo, Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento\n" +
            "FROM Libros\n" +
            "ORDER BY  Libros.Titulo, Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento";
    }else
    {
        sql="SELECT Libros.Titulo, Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento\n" +
            "FROM Libros\n" +
            "WHERE Libros.Titulo='"+nombre+"'\n" +
            "ORDER BY Libros.Titulo,Libros.Isbn, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento";
    }
 
    String []datos = new String [5];
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                modelo.addRow(datos);
            }
            TABLA.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(IngresarLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
    private void btDESCUENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDESCUENTOActionPerformed
    conect =Con.Conexion();
    int fila = TABLA.getSelectedRow();
    String cod="";
    cod=TABLA.getValueAt(fila, 0).toString();
    int a = 1;
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿ Seguro que desea Aplicar el DESCUENTO?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){

    try {
        PreparedStatement pst = conect.prepareStatement("UPDATE Libros Set Precio_Venta = Precio_Venta - (Precio_Venta * Descuento)/100 ");
        pst.executeUpdate();
        mostrardatos("");
    } catch (Exception e) {
    }
}
    }//GEN-LAST:event_btDESCUENTOActionPerformed

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
    private javax.swing.JTextField COSTO;
    private javax.swing.JTable TABLA;
    private javax.swing.JTextField VENTA;
    private javax.swing.JButton btACTUALIZAR;
    private javax.swing.JButton btDESCUENTO;
    private javax.swing.JButton btMOSTRAR;
    private javax.swing.JButton btVOLVER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
