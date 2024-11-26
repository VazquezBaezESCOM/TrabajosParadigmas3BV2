import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la cuenta de banco:  ");
        String cuenta = in.nextLine();
        System.out.println("Ingresa la cantidad inicial: ");
        float cantidad = in.nextFloat();
        CuentaBancaria c1 = new CuentaBancaria(cuenta, cantidad);
        int op = 0;
        do{
            menu();
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingresa la cantidad a ingresar:");
                    cantidad = in.nextFloat();
                    c1.depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a retirar:");
                    cantidad = in.nextFloat();
                    c1.retirar(cantidad);
                    break;
                case 3:
                    System.out.println("Programa finalizado con exito.");
                    break;
                default:
                    System.out.println("Opcion no valida. ");
                    break;
            }
        }while(op != 3);
    }

    public static  void menu(){
        System.out.println("1.Ingresa dinero ");
        System.out.println("2.Retirar dinero ");
        System.out.println("3.Salir");
    }
}