package ddas;

public class ccategoria {
    
    private String Id_Categoria;
    private String Descripcion;   
    public ccategoria() {
        
    }
    public ccategoria(String Id_Categoria,String Descripcion) {
        this.Id_Categoria = Id_Categoria;
        this.Descripcion= Descripcion;
    }
    public String getId_Categoria() {
        return Id_Categoria;
    }
    public void setId_Categoria (String Id_Categoria) {
        this.Id_Categoria  = Id_Categoria ;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
