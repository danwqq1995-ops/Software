public class Software {

    private String tipo;
    private String nombre;
    private boolean activo;

    private void setNombre(String nombre_) {
        this.nombre = CadenasNOespacios(nombre_);
    }
    private void setTipo(String tipo_) {
        this.tipo = CadenasNOespacios(tipo_);
    }
    private void setActivo(boolean activo) {
        this.activo = activo;
    }
    private String CadenasNOespacios(String texto){
        return (texto == null || texto.isBlank())?"NO DEFINIDO":texto;
    }
    public void definirSoftware(String new_nombre, String new_tipo, boolean new_activo){

        setNombre(new_nombre);
        setTipo(new_tipo);
        setActivo(new_activo);

    }

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public boolean isActivo(){
        return activo;
    }

    public void mostrarInformacion(){
        System.out.println("NOMBRE DEL SOFTWARE: " + getNombre());
        System.out.println("TIPO DEL SOFTWARE: " + getTipo());
        System.out.println("ESTADO DISPONIBLE: " + isActivo());
        System.out.println("\n");
    }
    public void mostrarEstadoTEXTO(){
        if (activo)
            System.out.println("\nEl software esta activo\n");
        else
            System.out.println("\nEl software no esta activo\n");
    }
}
