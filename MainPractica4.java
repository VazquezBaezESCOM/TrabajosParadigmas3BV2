import java.util.ArrayList;
import java.util.Scanner;

public class MainPractica4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa una cadena de caracteres: ");
        String input = in.nextLine();
        int j = 0, n = input.length();
        
        for (int i = 0; i < n - 1; i++) {
            if (input.charAt(i) == '(' && input.charAt(i + 1) == ')') {
                j++;
            }
        }
            
        j = 2*j;
        System.out.println("La cantidad de veces que aparecen '('y ')' pegados de esta forma es " + j);
    }
}