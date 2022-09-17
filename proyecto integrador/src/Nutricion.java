public class Nutricion {
    private Character alimentacion;
    private Character consejos;
    private Character consumoLiquidos;

    public Character getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Character alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Character getConsejos() {
        return consejos;
    }

    public void setConsejos(Character consejos) {
        this.consejos = consejos;
    }

    public Character getConsumoLiquidos() {
        return consumoLiquidos;
    }

    public void setConsumoLiquidos(Character consumoLiquidos) {
        this.consumoLiquidos = consumoLiquidos;
    }
    
    public Nutricion(Character alimentacion, Character consejos, Character consumoLiquidos) {
        this.alimentacion = alimentacion;
        this.consejos = consejos;
        this.consumoLiquidos = consumoLiquidos;
    }

    
    
}
