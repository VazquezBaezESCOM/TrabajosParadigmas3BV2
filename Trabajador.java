public class Trabajador {
    private String nombre;
    private String apellido;
    private float salario;
    private int horas;
    private float pago;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void pago() {
        if (horas <=  40) {
            pago = horas * salario;
            System.out.println("El trabajador, " + nombre + ", " + apellido + " recibira un pago de: " + pago);
        }else{
            float pago1;
            pago = (float) ((horas - 40) * salario*1.5);
            pago1 = pago + (40 * salario);
            System.out.println("El trabajador, " + nombre + ", " + apellido + " recibira un pago de: " + pago1 );
        }
    }
}

