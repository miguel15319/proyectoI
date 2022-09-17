public class Consejo extends SugerenciaSalud{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String tipo;

    public Consejo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    

    
}
