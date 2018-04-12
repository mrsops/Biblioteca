public class RevistaConArticulosException extends Exception{

    public RevistaConArticulosException() {
    }

    public String toString(){
        return "Imposible eliminar la revista. Esta revista contiene Articulos.";
    }
}
