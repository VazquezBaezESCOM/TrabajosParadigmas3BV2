
public class Figuras {

    public static double circuloA(double r){
        return Math.PI * Math.pow((r * 100),2);
    }
    public static double circuloP(double r){
        return (2 * Math.PI) * (r* 100);
    }

    public static double rectanguloA(int b, int h){

        return (b * 100)*(h* 100);
    }

    public static double rectanguloP(int b, int h){
        return (200*b) + (200*h);
    }

    public static double cuadradoA(float b){
        return Math.pow((b * 100),2);
    }

    public static double cuadradoP(float b){
        return 400 * b;
    }
    public static double trianguloA(int l1, int l2,int l3){
        if((l1 < l2 + l3) && (l2<l3+l2) && (l3<l1+l2)){
            float s = ((100*l1)+(l2*100)+(l3*100))/2;
            return Math.sqrt(s*(s-(l1*100))*(s-(l2*100))*(s-(l3*100)));
        }else
            return 0;
      }
    public static double trianguloP(int l1, int l2, int l3){
        if((l1 < l2 + l3) && (l2<l3+l2) && (l3<l1+l2)) {
            return (l1*100) + (l2*100) + (l3*100);
        }else
            return 0;
    }

    public static double romboideA(int B, int h){
        return (B*100) * (h*100);
    }

    public static double romboideP(int a, int B){
        return 2 * ((100*a) + (B*100));
    }
}
