

public class Main {
    public static void main(String[] args){
        ETC em1 = new ETC("Uriel", "1024", 0.0);
        EMT em2 = new EMT("Fabio", "1023", 0.0);
        EPH em3 = new EPH("Omar", "1022", 0.0, 20 );
        em1.setSalario(15000.0);
        em2.setSalario(10000.0);
        em3.setSalario(150.0);
        System.out.println("El salario de " + em1.getNombre() + " es: "  + em1.getSalario() );
        System.out.println("El salario de " + em2.getNombre() + " es: " + em2.getSalario() );
        System.out.println("El salario de " + em3.getNombre() + " es: " + em3.getSalario() );
    }
}