import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        biblioteca bibli = new biblioteca();
        int op, j;//j es para el isbn del libro
        j = bibli.tamLista();
        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch(op) {
                case 1:
                    System.out.println("Ingresa el titulo del libro");
                    String titulo = in.nextLine();
                    System.out.println("Ingresa el autor del libro: ");
                    String autor = in.nextLine();
                    System.out.println("ISBN del libro es: " + j);
                    bibli.agregarLibro(titulo, autor, j);
                    j++;
                    break;
                case 2:
                    System.out.println("Ingresa el ISBN del libro a buscar: ");
                    int ISBN = in.nextInt();
                    libro enco = bibli.buscarLibro(ISBN);
                    if (enco == null) {
                        System.out.println("El libro no esta en la lista.");
                    } else {
                        System.out.println("Los datos del libro son: ");
                        System.out.println("Titulo: " + enco.getTitulo());
                        System.out.println("Autor:" + enco.getAutor());
                        System.out.println("ISBN:" + enco.getIsbn());
                        System.out.println("Disponibilidad : " + enco.getEstado());
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el ISBN del libro que deseas obtener: ");
                    int lib = in.nextInt();
                    libro libro1  =bibli.prestarLibro(lib);
                    if(libro1 != null){
                        System.out.println("Te hemos prestado el libro: " + libro1.getTitulo());
                        System.out.println("Regresalo pronto.");
                    }else{
                        System.out.println("El libro no se encuentra disponible :(");
                        System.out.println("Espera a que lo devuelvan.");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el ISBN del libro a buscar: ");
                    int lib1 = in.nextInt();
                    libro libro2 =  bibli.regresarLibro(lib1);
                    if(libro2 != null){
                        System.out.println("Haz regresado el libro: " + libro2.getTitulo());
                    }else{
                        System.out.println("Nunca te prestamos ese libro");
                    }
                        break;
                case 5:
                    System.out.println("Programa finalizado con exito.");
                    break;
                default:
                    System.out.println(op + " no es una  opcion valida.");
                    break;
            }
        }while(op != 5);
    }


    public static void menu() {
        System.out.println("1.Agregar libro.");
        System.out.println("2.Buscar libro.");
        System.out.println("3.Pedir libro prestado.");
        System.out.println("4.Devolver libro");
        System.out.println("5.Salir");
        System.out.println("Ingresa la opcion que desea realizar: ");
    }
}