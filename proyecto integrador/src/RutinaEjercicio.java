public class RutinaEjercicio{
    public class RutinaEjercicio{
        private String nombre;
        private String tipo;
        private Float duracion;
        private Integer repeticiones;
        private String multimedia;

        public RutinaEjercicio(String nombre, String tipo, Float duracion, Integer repeticiones, String multimedia, Integer repeticiones1, String multimedia1) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.duracion = duracion;
            this.repeticiones = repeticiones;
            this.multimedia = multimedia;
            this.repeticiones = repeticiones1;
            this.multimedia = multimedia1;
        }

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

        public Float getDuracion() {
            return duracion;
        }

        public void setDuracion(Float duracion) {
            this.duracion = duracion;
        }

        public Integer getRepeticiones() {
            return repeticiones;
        }

        public void setRepeticiones(Integer repeticiones) {
            this.repeticiones = repeticiones;
        }

        public String getMultimedia() {
            return multimedia;
        }

        public void setMultimedia(String multimedia) {
            this.multimedia = multimedia;
        }

        private Integer repeticiones;
        private String multimedia;
        
    }
    
}
