public class EMT extends trabajador{

    public EMT(String nombre, String id, Double salario){
        super(nombre, id, salario);
    }

    public void setSalario(Double salario){
        this.salario = salario / 2;
    }
}
