import java.util.*;

public class Main1{
    public static void main(String[] args) {
        int op ;
        do {
            Scanner in = new Scanner(System.in);
            Trabajador trabajador1 = new Trabajador();
            System.out.println("Ingresa el nombre del trabajador:");
            String nombre = in.nextLine();
            trabajador1.setNombre(nombre);

            System.out.println("Ingresa el apellido del trabajador:");
            String apellido = in.nextLine();
            trabajador1.setApellido(apellido);

            System.out.println("Ingresa el salario del trabajador:");
            float salario = in.nextFloat();
            trabajador1.setSalario(salario);

            System.out.println("Ingresa las horas trabajadas:");
            int horas = in.nextInt();
            trabajador1.setHoras(horas);

            trabajador1.pago();
            System.out.println("Si desea calcular salario de algun otro trabajador digite 1: ");
            op = in.nextInt();
        }while(op != 1);
    }
}