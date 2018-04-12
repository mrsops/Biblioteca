public class Libro extends Publicacion {
    private String autor;

    public Libro(int isbn, String nombre, String autor) {
        super(isbn, nombre);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){
        return super.toString()+"Autor: "+this.autor;
    }
}
