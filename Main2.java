import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa una coordenada X:");
        float x = in.nextFloat();
        System.out.println("Ingresa una coordenada Y:");
        float y = in.nextFloat();
        cuadrante(x,y);
    }

    public static void cuadrante(float x, float y) {
        if (x == 0 && y == 0) {
            System.out.println("El punto se encuentra en el origen");
        }else if(x >= 0 && y>= 0){
            System.out.println("El punto se encuentra en el cuadrante 1");
        }else if(x <= 0 && y>= 0 ){
            System.out.printf("El punto se encuentra en el cuadrante 2");
        }else if(x <= 0 && y <= 0){
            System.out.printf("El punto se encuentra en el cuadrante 3");
        }else if(x >= 0 && y <= 0){
            System.out.printf("El punto se encuentra en el cuadrante 4");
        }
    }
}