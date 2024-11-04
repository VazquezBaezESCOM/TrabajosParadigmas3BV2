public class libro{
    private String titulo;
    private String autor;
    private int isbn;
    private boolean estado;

    public libro(String titulo, String autor, int isbn, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public int getIsbn(){
        return this.isbn;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public boolean getEstado(){
        return this.estado;
    }

}
