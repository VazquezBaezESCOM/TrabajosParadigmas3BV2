import java.util.ArrayList;
import java.util.Objects;


public class biblioteca{

    private final ArrayList<libro>libros;

    public biblioteca() {
        libros = new ArrayList<>();
        libros.add(new libro("1984", "George Orwell", 0, true));
        libros.add(new libro("To Kill a Mockingbird", "Harper Lee", 1, true));
        libros.add(new libro("The Great Gatsby", "F. Scott Fitzgerald", 2, true));
        libros.add(new libro("Moby Dick", "Herman Melville", 3, true));
        libros.add(new libro("Pride and Prejudice", "Jane Austen", 4, true));
        libros.add(new libro("War and Peace", "Leo Tolstoy", 5, true));
        libros.add(new libro("The Odyssey", "Homer", 6, true));
        libros.add(new libro("Ulysses", "James Joyce", 7, true));
        libros.add(new libro("The Catcher in the Rye", "J.D. Salinger", 8, true));
        libros.add(new libro("The Divine Comedy", "Dante Alighieri", 9, true));
    }

    public  void agregarLibro(String titulo, String autor, int isbn ){
        libros.add(new libro(titulo, autor, isbn, true));
        System.out.println("Libro agregado: " + titulo);
    }

    public int tamLista(){
        return libros.size();
    }

    public libro buscarLibro(int isbb){
        if(libros.isEmpty()){
            return null;
        }
        for (libro libro1 : libros){
            if(Objects.equals(libro1.getIsbn(), isbb)){
                return libro1;
            }
        }
        return null;
    }

    public libro prestarLibro(int ISBN){
        for (libro libro1 : libros){
            if(Objects.equals(libro1.getIsbn(), ISBN) && libro1.getEstado() ){
                libro1.setEstado(false);
                return libro1;
            }
        }
        return null;
    }

    public libro regresarLibro(int ISBN){
        for (libro libro1 : libros){
            if(Objects.equals(libro1.getIsbn(), ISBN) && (!libro1.getEstado())) {
                libro1.setEstado(true);
                return libro1;
            }
        }
        return null;
    }
}
