package ua.com.carmanager;

//наследник класса Car lesson3.1
public class PassengerCar extends Car {
	
	//method для проверки доступности методов подкласса 
	    public void openTrunk() {
	        System.out.println("Trunk is open");
	    }


	public PassengerCar(String model, Color color, int yearOfManufacture, int weight, int preice) {
		super(model, color, yearOfManufacture, weight, preice);
		// TODO Auto-generated constructor stub
	}

}
