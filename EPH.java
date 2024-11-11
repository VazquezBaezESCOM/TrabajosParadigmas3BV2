public class EPH extends trabajador{
    private int horas;

    public EPH(String nombre, String id, Double salario,int horas){
        super(nombre, id, salario);
        this.horas = horas;
    }

    @Override
    public void setSalario(Double salario){
        this.salario = (salario * horas);
    }

}
