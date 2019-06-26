package Ventanas;


import funci.num;
import funci.verificar;
import funci.Ingresar;
import ddas.llibros;
import nocone.Conectar;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class IngresarLibros extends javax.swing.JFrame {
 Conectar Con = new Conectar();
    static Connection conect;
    static String Categoria;
    static String Editorial;
    public IngresarLibros() {
        initComponents();
        consultar_Categoria();
        consultar_Editorial();
        mostrardatos("");
        numeros();
        setLocationRelativeTo(null);
        txtID.setVisible(true);
        IDCATEGORIA.setVisible(false);
        IDEDITORIAL.setVisible(false);
    }
void limpiar(){
        txtID.setText("");
        txttitulo.setText("");
        txtautor.setText("");
        txtISBN.setText("");
        txtcosto.setText("");
        txtventa.setText("");
        DESCUENTO.setText("");
        txtSTOCK.setText("");
    }
void mostrardatos(String nombre){
    conect = Con.Conexion();
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("TITULO");
    modelo.addColumn("AUTOR");
    modelo.addColumn("CATEGORIA");
    modelo.addColumn("Nº ISBN");
    modelo.addColumn("EDITORIAL");
    modelo.addColumn("PRECIO COSTO");
    modelo.addColumn("PRECIO VENTA");
    modelo.addColumn("DESCUENTO");
    modelo.addColumn("STOCK");
    modelo.addColumn("Nivel Pedido");
    tablalibro.setModel(modelo);
    String sql="";
    if(nombre.equals(""))
    {
        sql="SELECT Libros.Id_Libro, Libros.Titulo, Libros.Autor, Libros.Categoria, Libros.Isbn, Libros.Editorial, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento, Libros.Stock, Libros.Nivel_Pedido\n" +
            "FROM Libros\n" +
            "ORDER BY Libros.Id_Libro, Libros.Titulo, Libros.Autor, Libros.Categoria, Libros.Isbn, Libros.Editorial, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento, Libros.Stock, Libros.Nivel_Pedido;";
    }else
    {
        sql="SELECT Libros.Id_Libro, Libros.Titulo, Libros.Autor, Libros.Categoria, Libros.Isbn, Libros.Editorial, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento, Libros.Stock, Libros.Nivel_Pedido\n" +
            "FROM Libros\n" +
            "WHERE Libros.Titulo='"+nombre+"'\n" +
            "ORDER BY Libros.Id_Libro, Libros.Titulo, Libros.Autor, Libros.Categoria, Libros.Isbn, Libros.Editorial, Libros.Precio_Costo, Libros.Precio_Venta, Libros.Descuento, Libros.Stock, Libros.Nivel_Pedido;";
    }
 
    String []datos = new String [11];
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
                modelo.addRow(datos);
            }
            tablalibro.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(IngresarLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
 void numeros()
     {
        conect = Con.Conexion();
        int j;
    
        String c="";
        String Num="SELECT MAX(Id_Libro) AS Id_Libro FROM Libros";
        
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Num);
            if(rs.next())
            {              
                 c=rs.getString("Id_Libro");
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
public void consultar_Categoria(){
        conect = Con.Conexion();
        String Categoria  = "SELECT  Descripcion FROM Categoria ORDER BY Descripcion ASC";

        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
                combocategoria.addItem("ingrese una opción");
   
            while(rs.next()){
                combocategoria.addItem(rs.getString("Descripcion"));

               
   }

} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}

}
public void consultar_Editorial(){
        conect = Con.Conexion();
        String Categoria  = "SELECT  Nombre FROM Editorial ORDER BY Nombre ASC";

        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
                comboeditorial.addItem("ingrese una opción");
   
            while(rs.next()){
                comboeditorial.addItem(rs.getString("Nombre"));

               
   }

} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jTitulo = new javax.swing.JLabel();
        JAUTOR = new javax.swing.JLabel();
        JCAT = new javax.swing.JLabel();
        JISBN = new javax.swing.JLabel();
        JCOSTO = new javax.swing.JLabel();
        JVENTA = new javax.swing.JLabel();
        JDES = new javax.swing.JLabel();
        JSTOCK = new javax.swing.JLabel();
        JEDIT = new javax.swing.JLabel();
        JPED = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        txtautor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        combocategoria = new javax.swing.JComboBox<String>();
        comboeditorial = new javax.swing.JComboBox<String>();
        txtcosto = new javax.swing.JTextField();
        txtventa = new javax.swing.JTextField();
        DESCUENTO = new javax.swing.JTextField();
        txtSTOCK = new javax.swing.JTextField();
        comboPEDIDO = new javax.swing.JComboBox<String>();
        btningresolibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalibro = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnmostrar = new javax.swing.JButton();
        jTitulo1 = new javax.swing.JLabel();
        IDEDITORIAL = new javax.swing.JTextField();
        IDCATEGORIA = new javax.swing.JTextField();
        txtbuscarlibro = new javax.swing.JTextField();
        JPED1 = new javax.swing.JLabel();
        btnbuscarlibro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" LIBRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 120, 20));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, -1));

        jTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo.setText("ID:");
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        JAUTOR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JAUTOR.setForeground(new java.awt.Color(255, 255, 255));
        JAUTOR.setText("Autor:");
        getContentPane().add(JAUTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        JCAT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JCAT.setForeground(new java.awt.Color(255, 255, 255));
        JCAT.setText("Categoria:");
        getContentPane().add(JCAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        JISBN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JISBN.setForeground(new java.awt.Color(255, 255, 255));
        JISBN.setText("Nº Isbn:");
        getContentPane().add(JISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        JCOSTO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JCOSTO.setForeground(new java.awt.Color(255, 255, 255));
        JCOSTO.setText("Precio Costo:");
        getContentPane().add(JCOSTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        JVENTA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JVENTA.setForeground(new java.awt.Color(255, 255, 255));
        JVENTA.setText("Precio Venta:");
        getContentPane().add(JVENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        JDES.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JDES.setForeground(new java.awt.Color(255, 255, 255));
        JDES.setText("Descuento:");
        getContentPane().add(JDES, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        JSTOCK.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JSTOCK.setForeground(new java.awt.Color(255, 255, 255));
        JSTOCK.setText("Stock:");
        getContentPane().add(JSTOCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        JEDIT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JEDIT.setForeground(new java.awt.Color(255, 255, 255));
        JEDIT.setText("Editorial:");
        getContentPane().add(JEDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        JPED.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JPED.setForeground(new java.awt.Color(255, 255, 255));
        JPED.setText("ingrese titulo ->");
        getContentPane().add(JPED, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        getContentPane().add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 122, -1));
        getContentPane().add(txtautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 122, -1));

        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtISBNKeyTyped(evt);
            }
        });
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 122, -1));

        combocategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        combocategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(combocategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 122, -1));

        comboeditorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        comboeditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboeditorialActionPerformed(evt);
            }
        });
        getContentPane().add(comboeditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 122, -1));

        txtcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcostoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 127, -1));

        txtventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtventaKeyTyped(evt);
            }
        });
        getContentPane().add(txtventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 127, -1));

        DESCUENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESCUENTOActionPerformed(evt);
            }
        });
        DESCUENTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DESCUENTOKeyTyped(evt);
            }
        });
        getContentPane().add(DESCUENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 127, -1));

        txtSTOCK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSTOCKKeyTyped(evt);
            }
        });
        getContentPane().add(txtSTOCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 127, -1));

        comboPEDIDO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Bajo", "Medio", "Alto"}));
        getContentPane().add(comboPEDIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 127, -1));

        btningresolibro.setText("Ingresar Libro");
        btningresolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresolibroActionPerformed(evt);
            }
        });
        getContentPane().add(btningresolibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 110, 30));

        tablalibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablalibro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, 674, 120));

        btneliminar.setText("Eliminar Libro");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 573, -1, -1));

        btnsalir.setText("Volver");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 573, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE UN LIBRO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        btnmostrar.setText("Mostrar Todo");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 390, 660, -1));

        jTitulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo1.setText("Titulo:");
        getContentPane().add(jTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        IDEDITORIAL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        IDEDITORIAL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(IDEDITORIAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 25, -1));
        getContentPane().add(IDCATEGORIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 25, -1));

        txtbuscarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarlibroActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscarlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 181, -1));

        JPED1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JPED1.setForeground(new java.awt.Color(255, 255, 255));
        JPED1.setText("Nivel Pedido:");
        getContentPane().add(JPED1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        btnbuscarlibro.setText("Buscar ");
        btnbuscarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarlibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscarlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoLibros.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DESCUENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESCUENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESCUENTOActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
       mostrardatos("");
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void combocategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocategoriaActionPerformed
        conect = Con.Conexion();
        Categoria = "SELECT  Id_Categoria FROM Categoria Where Descripcion = '"+ this.combocategoria.getSelectedItem()+"'";

        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
   
            while(rs.next()){
                this.IDCATEGORIA.setText(String.valueOf(rs.getString("Id_Categoria")));

               
   }

} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}
    }//GEN-LAST:event_combocategoriaActionPerformed

    private void comboeditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboeditorialActionPerformed
        conect = Con.Conexion();
        Editorial = "SELECT  Id_Editorial FROM Editorial Where Nombre = '"+ this.comboeditorial.getSelectedItem()+"'";

        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Editorial);
   
            while(rs.next()){
                this.IDEDITORIAL.setText(String.valueOf(rs.getString("Id_Editorial")));

               
   }

} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}
    }//GEN-LAST:event_comboeditorialActionPerformed

    private void btningresolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresolibroActionPerformed
        if (txttitulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar un TITULO");
            txttitulo.requestFocus();
            return;
        }
         if (txtautor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar un AUTOR");
            txtautor.requestFocus();
            return;
        }
        if (txtISBN.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar un numero ISBN");
            txtISBN.requestFocus();
            return;
        }
        if (txtcosto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar un precio COSTO");
            txtcosto.requestFocus();
            return;
        }
        if (txtventa.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar un precio VENTA");
            txtventa.requestFocus();
            return;
        }
        if (DESCUENTO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar un DESCUENTO");
            DESCUENTO.requestFocus();
            return;
        }
        if (txtSTOCK.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, " ingresar una cantidad de STOCK");
            txtSTOCK.requestFocus();
            return;
        }
        
        llibros datos = new llibros();
        Ingresar funcion = new Ingresar();
        verificar verificar = new verificar();
        
        int Titulo = verificar.verificarTitulo();
        if (Titulo == 1) {
            JOptionPane.showMessageDialog(null, " titulo : " + txttitulo.getText() + ", ya fue ingresado.");
            txttitulo.setText("");
            txttitulo.requestFocus();
            return;

        }
        
        int Isbn = verificar.verificarIsbn();
        if (Isbn == 1) {
            JOptionPane.showMessageDialog(null, " numero de ISBN : " + txtISBN.getText() + ", ya fue ingresado.");
            txtISBN.setText("");
            txtISBN.requestFocus();
            return;

        }
        
        datos.setId_Libros(txtID.getText());
        datos.setTitulo(txttitulo.getText());
        datos.setAutor(txtautor.getText());
        datos.setCategoria(IDCATEGORIA.getText());
        datos.setIsbn(Integer.parseInt(txtISBN.getText()));
        datos.setEditorial(IDEDITORIAL.getText());
        datos.setPrecio_Costo(Integer.parseInt(txtcosto.getText()));
        datos.setPrecio_Venta(Integer.parseInt(txtventa.getText()));
        datos.setDescuento(Integer.parseInt(DESCUENTO.getText()));
        datos.setStock(Integer.parseInt(txtSTOCK.getText()));
        int Nivel = comboPEDIDO.getSelectedIndex();
        datos.setNivel_Pedido((String) comboPEDIDO.getItemAt(Nivel));
        
        if (funcion.CrearLibros(datos)) {
            JOptionPane.showMessageDialog(null, " libro fue ingresado al sistema, exicto!");
            limpiar();
            numeros();
            mostrardatos("");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar la editorial");
        }                                          
                                              
    }//GEN-LAST:event_btningresolibroActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    conect =Con.Conexion();
    int fila = tablalibro.getSelectedRow();
    String cod="";
    cod=tablalibro.getValueAt(fila, 0).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Seguro que desea Elimnar el Libro?", 
   "opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
    try {
        PreparedStatement pst = conect.prepareStatement("DELETE FROM Libros WHERE Id_Libro ='"+cod+"'");
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, " Libro fue eliminado con exito");
        mostrardatos("");
    } catch (Exception e) {
    }
}     
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_txtISBNKeyTyped

    private void txtcostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostoKeyTyped
            char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_txtcostoKeyTyped

    private void txtventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtventaKeyTyped
            char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_txtventaKeyTyped

    private void DESCUENTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DESCUENTOKeyTyped
            char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_DESCUENTOKeyTyped

    private void txtSTOCKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSTOCKKeyTyped
            char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_txtSTOCKKeyTyped

    private void btnbuscarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarlibroActionPerformed
        mostrardatos(txtbuscarlibro.getText());
    }//GEN-LAST:event_btnbuscarlibroActionPerformed

    private void txtbuscarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarlibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarlibroActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DESCUENTO;
    private javax.swing.JTextField IDCATEGORIA;
    private javax.swing.JTextField IDEDITORIAL;
    private javax.swing.JLabel JAUTOR;
    private javax.swing.JLabel JCAT;
    private javax.swing.JLabel JCOSTO;
    private javax.swing.JLabel JDES;
    private javax.swing.JLabel JEDIT;
    private javax.swing.JLabel JISBN;
    private javax.swing.JLabel JPED;
    private javax.swing.JLabel JPED1;
    private javax.swing.JLabel JSTOCK;
    private javax.swing.JLabel JVENTA;
    private javax.swing.JButton btnbuscarlibro;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btningresolibro;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnsalir;
    public static javax.swing.JComboBox<String> comboPEDIDO;
    private javax.swing.JComboBox<String> combocategoria;
    private javax.swing.JComboBox<String> comboeditorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JTable tablalibro;
    private javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtSTOCK;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtbuscarlibro;
    private javax.swing.JTextField txtcosto;
    public static javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtventa;
    // End of variables declaration//GEN-END:variables
}
