package ddas;

public class llibros {

    private String Id_Libros;
    private String Titulo;
    private String Autor;
    private String Categoria;
    private int Isbn;
    private String Editorial;
    private int Precio_Costo;
    private String Precio_Venta;
    private int Descuento;
    private int Stock;
    private String Nivel_Pedido;

    public llibros() {

    }

    public llibros(String Id_Libros, String Titulo, String Autor, String Categoria, int Isbn, String Editorial, int Precio_Costo, String Precio_Venta, int Descuento, int Stock, String Nivel_Pedido) {
        this.Id_Libros = Id_Libros;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Categoria = Categoria;
        this.Isbn = Isbn;
        this.Editorial = Editorial;
        this.Precio_Costo = Precio_Costo;
        this.Precio_Venta = Precio_Venta;
        this.Descuento = Descuento;
        this.Stock = Stock;
        this.Nivel_Pedido = Nivel_Pedido;
    }

    public String getId_Libros() {
        return Id_Libros;
    }

    public void setId_Libros(String Id_Libros) {
        this.Id_Libros = Id_Libros;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getPrecio_Costo() {
        return Precio_Costo;
    }

    public void setPrecio_Costo(int Precio_Costo) {
        this.Precio_Costo = Precio_Costo;
    }

    public String getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(String Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getNivel_Pedido() {
        return Nivel_Pedido;
    }

    public void setNivel_Pedido(String Nivel_Pedido) {
        this.Nivel_Pedido = Nivel_Pedido;
    }
}
