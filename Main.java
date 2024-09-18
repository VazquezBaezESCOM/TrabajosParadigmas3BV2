import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        do{
            menu();
            double area,perimetro;
            System.out.println("Ingresa una opcion: ");
            op = in.nextInt();
            switch(op){
                case 1 -> {
                    System.out.println("Ingresa el radio del circulo:");
                    double r = in.nextDouble();
                    area = Figuras.circuloA(r);
                    perimetro = Figuras.circuloP(r);
                    System.out.println("El area del circulo es: " + area + " cm cuadrados");
                    System.out.println("El perimetro del circulo es: " + perimetro + "  cm cuadrados");
                }
                case 2-> {
                    System.out.println("Ingresa la base del rectangulo:");
                    int b = in.nextInt();
                    System.out.println("Ingresa la altura del rectangulo:");
                    int a = in.nextInt();
                    area = Figuras.rectanguloA(b, a);
                    perimetro = Figuras.rectanguloP(b, a);
                    System.out.println("El area del rectangulo es: " + area + " cm cuadrados" );
                    System.out.println("El perimetro del rectangulo es: " + perimetro + "  cm cuadrados");
                }
                case 3 -> {
                    System.out.println("Ingresa el lado del cuadrado: ");
                    int l = in.nextInt();
                    area = Figuras.cuadradoA(l);
                    perimetro = Figuras.cuadradoP(l);
                    System.out.println("El area del cuadrado es: " + area + " cm cuadrados");
                    System.out.println("El perimetro del cuadrado es: " + perimetro + " cm cuadrados");
                }
                case 4-> {
                    System.out.println("Ingresa el lado 1 del triangulo: ");
                    int l1 = in.nextInt();
                    System.out.println("Ingresa el lado 2 del triangulo: ");
                    int l2 = in.nextInt();
                    System.out.println("Ingresa el lado 3 del triangulo: ");
                    int l3 = in.nextInt();
                    area = Figuras.trianguloA(l1, l2, l3);
                    perimetro = Figuras.trianguloP(l1, l2, l3);
                    System.out.println("El area del triangulo es: " + area + " cm cuadrados");
                    System.out.println("El perimetro del triangulo es: " + perimetro + " cm cuadrados");
                }
                case 5->{
                    System.out.println("Ingresa la base del romboide: ");
                    int b = in.nextInt();
                    System.out.println("Ingresa la altura del romboide: ");
                    int h = in.nextInt();
                    System.out.println("Ingresa el lado del romboide: " );
                    int a = in.nextInt();
                    area = Figuras.romboideA(b,h);
                    perimetro = Figuras.romboideP(a,b);
                    System.out.println("El area del romboide es: " + area + " cm cuadrados");
                    System.out.println("El perimetro del romboide: " + perimetro + " cm cuadrados");
                }
                default -> {
                    System.out.println("Programa finalizado.");
                }
            }
        }
        while (op != 6);
    }
    public static void menu(){
        System.out.println("1.Circulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Cuadrado");
        System.out.println("4.Triangulo");
        System.out.println("5.Romboide");
        System.out.println("6.Salir");
    }
}


        

