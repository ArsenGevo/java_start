package ua.com.carmanager;

//наследник класса Car lesson3.1
public class PassengerCar extends Car {

	// method для проверки доступности методов подкласса (наследника)
	public void openTrunk() {
		System.out.println("Trunk is open");
	}

	//lesson3.2 перевизначення метода батьківського классу car
	@Override
	public boolean isReadyToService() {
		if (distanceOnService >= 10000) {
			return true;
		} else {
			return false;
		}
	}

	public PassengerCar(String model, Color color, int yearOfManufacture, int weight, int preice) {
		super(model, color, yearOfManufacture, weight, preice);
		// TODO Auto-generated constructor stub
	}

}
