import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {

	    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		vehiculos.add(new Auto("Nissan", "Platina", 0));

		vehiculos.add(new Motocicleta("Italika", "125Z", 0));

		vehiculos.add(new Camion("PACCAR", "Peterbilt 379", 0));
		
		Auto A1 = (Auto) vehiculos.get(0);
        A1.setAnio(2005);
        
        Motocicleta M1 = (Motocicleta) vehiculos.get(1);
        M1.setAnio(2020);

		Camion C1 = (Camion) vehiculos.get(2);
		C1.setAnio(2007);
		
		A1.Encender();
		
		A1.Apagar();
		
		A1.Describir();
		
		M1.Encender();
		
		M1.Apagar();
		
		M1.Describir();
		
		C1.Encender();
			
		C1.Apagar();
		
		C1.Describir();
	
	}
}
