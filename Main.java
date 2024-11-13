// Clase base
class Animal {
    protected int edad;
    private String color;

    public Animal(int e) {
        this.edad = e;
        this.color = "Desconocido";
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void color() {
        System.out.println("El animal tiene un color");
    }

    public void setEdad(int e) {
        this.edad = e;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

// Clases derivadas
class Perro extends Animal {
    public Perro(int e) {
        super(e);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    public void comer() {
        System.out.println("El perro está comiendo carne.");
    }
}

class Nutria extends Animal {
    public Nutria(int e) {
        super(e);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La nutria chilla");
    }

    public void comer() {
        System.out.println("La nutria come cangrejos.");
    }
}

class Oso extends Animal {
    public Oso(int e) {
        super(e);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El oso gruñe");
    }

    public void comer() {
        System.out.println("El oso está comiendo peces.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal(5);
        miAnimal.hacerSonido();
        miAnimal.setColor("Gris");
        System.out.println("Color del animal: " + miAnimal.getColor());

        Perro miPerro = new Perro(7);
        miPerro.hacerSonido();
        miPerro.setColor("Marrón");
        System.out.println("Color del perro: " + miPerro.getColor());

        Animal miPerro2 = new Perro(10);
        miPerro2.hacerSonido();
        miPerro2.setColor("Blanco");
        System.out.println("Color del segundo perro: " + miPerro2.getColor());

        Nutria miNutria = new Nutria(4);
        miNutria.hacerSonido();
        miNutria.setColor("Café");
        System.out.println("Color de la nutria: " + miNutria.getColor());

        Oso miOso = new Oso(2);
        miOso.hacerSonido();
        miOso.setColor("Amarillo");
        System.out.println("Color del oso: " + miOso.getColor());
    }
}

