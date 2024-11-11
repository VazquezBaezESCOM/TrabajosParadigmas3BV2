public class ETC extends trabajador {

    public ETC(String nombre, String id, Double salario) {
        super(nombre, id, salario);
    }

    public void setSalario(double salario){
        this.salario = salario + (salario * .10);
    }

}
