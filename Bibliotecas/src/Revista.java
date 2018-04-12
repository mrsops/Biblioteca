import java.util.ArrayList;

public class Revista extends Publicacion{
    private ArrayList<Articulo> articulos;

    public Revista(int isbn, String nombre) {
        super(isbn, nombre);
        this.articulos = new ArrayList<Articulo>();
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void añadirArticulo(Articulo a)throws Exception {
        if (a.getNumero()!=this.articulos.size()-1){
            throw new ArticuloNoCorrelativoException(this.articulos.size()-1);
        }

        for (Articulo a1:this.articulos) {
            if (a.getTitulo().equals(a1.getTitulo())){
                throw new ArticuloYaExisteException(a.getTitulo());
            }
        }
        try {
            this.articulos.add(a);
        }catch (Exception e){
            throw new Exception(e);
        }

    }

    public String toString(){
        return super.toString()+"Numero Articulos: "+(this.articulos.size()-1);
    }


}
