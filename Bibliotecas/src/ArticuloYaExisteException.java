public class ArticuloYaExisteException extends Exception{
    private String titulo;

    public ArticuloYaExisteException(String titulo) {
        this.titulo = titulo;
    }

    public String toString(){
        return "El articulo con titulo: "+titulo+" Ya existe";
    }
}
