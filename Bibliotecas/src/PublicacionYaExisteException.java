public class PublicacionYaExisteException extends Exception{
    private int isbn;

    public PublicacionYaExisteException(int isbn) {
        this.isbn = isbn;
    }

    public String toString(){
        return "La publicacion con numero ISBN: "+this.isbn+" ya existe";
    }
}
