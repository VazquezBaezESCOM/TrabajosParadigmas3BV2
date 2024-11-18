public class Auto extends Vehiculo{

public Auto(String marca, String modelo, int anio) {
    super(marca, modelo, anio);
    }

@Override
public void Encender(){
    System.out.print("Se enciende el auto \n");
}

@Override
public void Apagar(){
    System.out.print("Se apaga el auto \n");
    
}

public void Describir(){
    System.out.print("Es un auto de la marca " + getMarca() + " modelo " + getModelo() + " del año " + getAnio() + "\n");
    
}

}