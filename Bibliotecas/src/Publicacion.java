public abstract class Publicacion {
    protected int isbn;
    protected String nombre;

    public Publicacion(int isbn, String nombre) {
        this.isbn = isbn;
        this.nombre = nombre;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "ISBN: "+this.isbn+"\n" +
                "Nombre: "+this.nombre+"\n";
    }

    public Articulo buscarArticulo(){
        return null;
    }
}
