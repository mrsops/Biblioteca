public class ArticuloNoCorrelativoException extends Exception{
    private int num;

    public ArticuloNoCorrelativoException(int num) {
        this.num = num;
    }

    public String toString(){
        return "El numero de articulo deberia ser: "+this.num;
    }
}
