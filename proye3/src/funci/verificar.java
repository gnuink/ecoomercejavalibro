package funci;

import nocone.Conectar;
import Ventanas.Editorial;
import Ventanas.IngresarLibros;
import Ventanas.IngresarCategoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class verificar {

    Conectar Con = new Conectar();
    static Connection conect;
    static String Categoria;

    public int verificarCategoria() {
        String Nombre = IngresarCategoria.NOMBRE.getText();
        Categoria = "SELECT COUNT(Descripcion) AS Descripcion FROM Categoria WHERE Descripcion = '" + Nombre + "'";
        try {
            conect = Con.Conexion();
            int loginResultante = 0;
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
            while (rs.next()) {
                loginResultante = rs.getInt("Descripcion");
            }
            return loginResultante;
        } catch (Exception e) {
            return 0;
        }
    }

    public int verificarEditorial() {
        String Nombre = Editorial.txtnombre.getText();
        Categoria = "SELECT COUNT(Nombre) AS Nombre FROM Editorial WHERE Nombre = '" + Nombre + "'";
        try {
            conect = Con.Conexion();
            int loginResultante = 0;
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
            while (rs.next()) {
                loginResultante = rs.getInt("Nombre");
            }
            return loginResultante;
        } catch (Exception e) {
            return 0;
        }
    }

    public int verificarTitulo() {
        String Titulo = IngresarLibros.txttitulo.getText();
        Categoria = "SELECT COUNT(Titulo) AS Titulo FROM Libros WHERE Titulo = '" + Titulo + "'";
        try {
            conect = Con.Conexion();
            int loginResultante = 0;
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
            while (rs.next()) {
                loginResultante = rs.getInt("Titulo");
            }
            return loginResultante;
        } catch (Exception e) {
            return 0;
        }
    }

    public int verificarIsbn() {
        String Isbn = IngresarLibros.txtISBN.getText();
        Categoria = "SELECT COUNT(Isbn) AS Isbn FROM Libros WHERE Isbn = '" + Isbn + "'";
        try {
            conect = Con.Conexion();
            int loginResultante = 0;
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(Categoria);
            while (rs.next()) {
                loginResultante = rs.getInt("Isbn");
            }
            return loginResultante;

        } catch (Exception e) {
            return 0;
        }
    }
}
