package ua.com.carmanager;

//наследник класса Car lesson3.1
public class Bus extends Car {
	
	
	//lesson3.2 перевизначення метода батьківського классу car. value is changed to 50 000.
	@Override
	public boolean isReadyToService() {
		if (distanceOnService >= 50000) {
			return true;
		} else {
			return false;
		}
	}

	public Bus(String model, Color color, int yearOfManufacture, int weight, int preice) {
		super(model, color, yearOfManufacture, weight, preice);
		// TODO Auto-generated constructor stub
	}

}
