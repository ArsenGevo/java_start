package ua.com.carmanager;

public class Carmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Carmanager Start");

		/*
		 * records without object constructor: Car toyota = new Car(); toyota.model =
		 * "Toyota Prius"; toyota.yearOfManufacture = 2008; toyota.weight = 1200;
		 * toyota.preice = 15000; toyota.color = "White";
		 * 
		 * Car renault = new Car(); renault.model = "Renault logan"; renault.color =
		 * "Green"; renault.preice = 11000; renault.weight = 1300;
		 * renault.yearOfManufacture = 2017;
		 */

		// record with constructor and enum:
		PassengerCar toyota = new PassengerCar("Toyota Prius", Color.WHITE, 2008, 1200, 15000);

		Bus renault = new Bus("Renault logan", Color.GREEN, 2017, 1300, 11000);

		// frenault2 for equals prakticy
		Bus renault2 = new Bus("Renault logan", Color.GREEN, 2017, 1300, 11000);

		System.out.println(toyota);
		System.out.println(renault);

		// equals prakticy with genetated methods Hash and Equals:
		//System.out.println("(equals)renault = toyota is - " + renault.equals(toyota));
		//System.out.println("(equals)renault = renault2 is - " + renault.equals(renault2));

		// for check int distance:
		toyota.addDistance(10000);
		renault.addDistance(50000);
		
		//lesoon3.2 check workflow of methods:
		System.out.println("toyota distance is: " + toyota.getDistance());
		System.out.println("toyota distance on service is: " + toyota.getDistanceOnService());
		System.out.println("is toyota ReadyToService: " + toyota.isReadyToService());

		System.out.println("renault distance is: " + renault.getDistance());
		System.out.println("is renault ReadyToService: " + renault.isReadyToService());
		
		toyota.addDistance(5000);
		toyota.setDistanceOnService(0);
		System.out.println("toyota distance is: " + toyota.getDistance());
		System.out.println("toyota distance on service is: " + toyota.getDistanceOnService());
		System.out.println("is toyota ReadyToService: " + toyota.isReadyToService());
		

		
		//проверка доступности методов подкласса PassengerCar для объекта toyota
		toyota.openTrunk();
		
		

	}

}
