import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String id;
    private ArrayList<Publicacion> publicaciones;

    public Biblioteca(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.publicaciones = new ArrayList<Publicacion>();
    }

    public void añadirPublicacion(Publicacion p) throws PublicacionYaExisteException{
        for (Publicacion p1:this.publicaciones) {
            if (p.getIsbn()==p1.getIsbn()){
                throw new PublicacionYaExisteException(p.getIsbn());
            }
        }
        this.publicaciones.add(p);
    }

    public void eliminarPublicacion(Publicacion p) throws Exception{
        if (p instanceof Libro){
            this.publicaciones.remove(p);
        }else if(p instanceof Revista){
            Revista r = (Revista)p;
            if (r.getArticulos().size()>0){
                throw new RevistaConArticulosException();
            }else {
                this.publicaciones.remove(p);
            }
        }else {
            throw new TypeUndefinedException();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
