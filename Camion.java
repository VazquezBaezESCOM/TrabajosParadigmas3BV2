public class Camion extends Vehiculo{

public Camion(String marca, String modelo, int anio) {
    super(marca, modelo, anio);
    }


@Override
public void Encender(){
    System.out.print("Se enciende el camion \n");
}

@Override
public void Apagar(){
    System.out.print("Se apaga el camion \n");
    
}

public void Describir(){
    System.out.print("Es un camion de la marca " + getMarca() + " modelo " + getModelo() + " del año " + getAnio() + "\n");
    
}

}