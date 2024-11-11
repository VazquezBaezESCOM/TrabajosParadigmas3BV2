public class trabajador {
    protected String nombre;
    protected String id;
    protected Double salario;


    public trabajador(String nombre, String id, Double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getSalario() {
         return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
