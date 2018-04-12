public class BibliotecaNoExisteException extends Exception {
    private String id;

    public BibliotecaNoExisteException(String id) {
        this.id = id;
    }

    public String toString(){
        return "No existe una biblioteca con nombre de id: "+this.id;
    }
}
