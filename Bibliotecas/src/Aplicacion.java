import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        String opcion, nombre, id;
        int num, isbn;
        Publicacion publicacionActiva;
        Revista revista;
        Libro libro;
        Articulo articulo;
        ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
        Biblioteca bibliotecaActiva=null, biblioteca=null;

        do{
            menu();
            opcion = tc.nextLine();
            switch (opcion){
                case "1": //Menu Bibliotecas
                    limpiar();
                    do {
                        menuBibliotecas();
                        opcion = tc.nextLine();
                        switch (opcion){
                            case "1": // Nueva Biblioteca
                                System.out.print("Introduce el nombre de la biblioteca: ");
                                nombre = tc.nextLine();
                                System.out.print("Introduce el identificador de biblioteca: ");
                                id = tc.nextLine();
                                biblioteca = new Biblioteca(nombre, id);
                                nombre="";
                                id ="";
                                break;
                            case "2": //Seleccionar Biblioteca
                                for (Biblioteca b:bibliotecas) {
                                    System.out.println("ID: "+b.getId()+ "Nombre: "+b.getNombre());
                                }
                                System.out.print("Introduce el id de la biblioteca: ");
                                id = tc.nextLine();

                                break;
                            case "3": //Eliminar Biblioteca
                                if (bibliotecaActiva!=null){
                                    bibliotecas.remove(bibliotecaActiva);
                                }else {
                                    System.out.println("No se ha seleccionado ninguna biblioteca");
                                }
                                break;
                            case "4": //Atras
                                break;

                            default:
                                System.out.println("Opcion Incorrecta");
                                break;
                        }
                    }while (!opcion.equals("4"));
                    break;
                case "2": //Menu Publicaciones
                    limpiar();
                    if (bibliotecaActiva!=null) {
                        do {
                            menuPublicaciones();
                            opcion = tc.nextLine();
                            switch (opcion) {
                                case "1":

                                    break;
                                case "2":

                                    break;

                                case "3":

                                    break;
                                case "4":
                                    break;

                                default:
                                    System.out.println("Opcion Incorrecta");
                                    break;
                            }
                        } while (!opcion.equals("4"));
                    }else {
                        System.out.println("No se ha seleccionado ninguna biblioteca");
                    }
                case "3": //Menu Articulos
                    limpiar();
                    if (bibliotecaActiva!=null) {
                        do {
                            menuArticulos();
                            opcion = tc.nextLine();
                            switch (opcion) {
                                case "1":

                                    break;
                                case "2":


                                    break;

                                case "3":

                                    break;
                                case "4":
                                    break;

                                default:
                                    System.out.println("Opcion Incorrecta");
                                    break;
                            }
                        } while (!opcion.equals("4"));
                    }else {
                        System.out.println("No se ha seleccionado ninguna biblioteca");
                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        }while (!opcion.equals("0"));
    }


    public static void menu(){
        System.out.println("1. Gestion Bibliotecas");
        System.out.println("2. Gestion Publicaciones");
        System.out.println("3. Gestion Articulos");
        System.out.println("0. Salir");
    }

    public static void menuBibliotecas(){
        System.out.println("1. Nueva Biblioteca");
        System.out.println("2. Seleccionar Biblioteca");
        System.out.println("3. Eliminar Bilioteca");
        System.out.println("4. Atras");
    }

    public static void menuPublicaciones(){
        System.out.println("1. Alta de publicacion");
        System.out.println("2. Eliminar publicacion");
        System.out.println("3. Atras");
    }

    public static void menuArticulos(){
        System.out.println("1. Seleccionar revista");
        System.out.println("2. Añadir articulos a una revista");
        System.out.println("3. Borrar articulo de revista");
        System.out.println("4. Atras");
    }

    public static Biblioteca seleccionarBiblioteca(ArrayList<Biblioteca> b, String id)throws BibliotecaNoExisteException{
        for (Biblioteca b1:b) {
            if (id.equals(b1.getId())){
                return b1;
            }
        }
        throw new BibliotecaNoExisteException(id);
    }

    public static void limpiar(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("");
        }
    }
}
