package ua.com.carmanager;

public class Carmanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Carmanager Start");

		/* records without object constructor:
		Car toyota = new Car();
		toyota.model = "Toyota Prius";
		toyota.yearOfManufacture = 2008;
		toyota.weight = 1200;
		toyota.preice = 15000;
		toyota.colour = "White";

		Car renault = new Car();
		renault.model = "Renault logan";
		renault.colour = "Green";
		renault.preice = 11000;
		renault.weight = 1300;
		renault.yearOfManufacture = 2017;
        */
		
		//record with constructor:
		
		Car toyota = new Car ("Toyota Prius", "White", 2008, 1200, 15000);
		
		Car renault = new Car ("Renault logan", "Green", 2017, 1300, 11000);
		
		System.out.println(toyota);
		System.out.println(renault);
		
	}

}
