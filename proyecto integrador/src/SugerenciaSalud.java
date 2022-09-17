public class SugerenciaSalud {
    private Consejos sugerencia;
    private Resultado consecuencia;
    
    public SugerenciaSalud(Consejos sugerencia, Resultado consecuencia) {
        this.sugerencia = sugerencia;
        this.consecuencia = consecuencia;
    }


    public Consejos getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(Consejos sugerencia) {
        this.sugerencia = sugerencia;
    }

    public Resultado getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(Resultado consecuencia) {
        this.consecuencia = consecuencia;
    }
}
