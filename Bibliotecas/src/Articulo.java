public class Articulo {
    private int numero;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Articulo(String autor,String titulo,int numero ,int numPaginas) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
}
