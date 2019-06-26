package funci;

import ddas.ccategoria;
import ddas.llibros;
import ddas.eeditorial;
import nocone.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Ingresar {

    Conectar Con = new Conectar();

    static Connection conect;
    private String Categoria;
    private String Editorial;
    private String Libros;

    public boolean CrearCategoria(ccategoria datos) {
        conect = Con.Conexion();

        Categoria = "insert into Categoria (Id_Categoria,Descripcion)"
                + " values (?,?)";
        try {

            PreparedStatement pst3 = conect.prepareStatement(Categoria);

            pst3.setString(1, datos.getId_Categoria());
            pst3.setString(2, datos.getDescripcion());

            int N3 = pst3.executeUpdate();

            if (N3 != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean CrearEditorial(eeditorial datos) {
        conect = Con.Conexion();

        Editorial = "insert into Editorial (Id_Editorial,Nombre,Telefono)"
                + " values (?,?,?)";
        try {

            PreparedStatement pst3 = conect.prepareStatement(Editorial);

            pst3.setString(1, datos.getId_Editorial());
            pst3.setString(2, datos.getNombre());
            pst3.setInt(3, datos.getTelefono());

            int N3 = pst3.executeUpdate();

            if (N3 != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean CrearLibros(llibros datos) {
        conect = Con.Conexion();

        Libros = "insert into Libros (Id_Libro,Titulo,Autor,Categoria,Isbn,Editorial,Precio_Costo,Precio_Venta,Descuento,Stock,Nivel_Pedido)"
                + " values (?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst3 = conect.prepareStatement(Libros);

            pst3.setString(1, datos.getId_Libros());
            pst3.setString(2, datos.getTitulo());
            pst3.setString(3, datos.getAutor());
            pst3.setString(4, datos.getCategoria());
            pst3.setInt(5, datos.getIsbn());
            pst3.setString(6, datos.getEditorial());
            pst3.setInt(7, datos.getPrecio_Costo());
            pst3.setInt(8, datos.getPrecio_Venta());
            pst3.setInt(9, datos.getDescuento());
            pst3.setInt(10, datos.getStock());
            pst3.setString(11, datos.getNivel_Pedido());

            int N3 = pst3.executeUpdate();

            if (N3 != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }
}
