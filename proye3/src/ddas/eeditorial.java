package ddas;

public class eeditorial {

    private String Id_Editorial;
    private String Nombre;
    private int Telefono;

    public eeditorial() {
    }

    public eeditorial(String Id_Editorial, String Nombre, int Telefono) {
        this.Id_Editorial = Id_Editorial;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getId_Editorial() {
        return Id_Editorial;
    }

    public void setId_Editorial(String Id_Editorial) {
        this.Id_Editorial = Id_Editorial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
}
