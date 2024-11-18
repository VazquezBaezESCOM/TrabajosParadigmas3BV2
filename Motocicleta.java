public class Motocicleta extends Vehiculo{

public Motocicleta(String marca, String modelo, int anio) {
    super(marca, modelo, anio);
    }


@Override
public void Encender(){
    System.out.print("Se enciende el motocicleta \n");
}

@Override
public void Apagar(){
    System.out.print("Se apaga la motocicleta \n");
    
}

public void Describir(){
    System.out.print("Es una motocicleta de la marca " + getMarca() + " modelo " + getModelo() + " del año " + getAnio() + "\n");
    
}

}