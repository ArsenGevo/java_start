package ua.com.carmanager;

//оголошення класу:

public class Car {

	// поля класу:

	String model;

	int yearOfManufacture;

	int preice;

	int weight;

	String colour;

	// Constructor (default):
	public Car(String model, String colour, int yearOfManufacture, int weight, int preice) {
		super();

		this.model = model;
		this.colour = colour;
		this.yearOfManufacture = yearOfManufacture;
		this.weight = weight;
		this.preice = preice;
		
		//Ключевое слово this в Java означает - текущий объект, внутри которого сейчас выполняется код.
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", yearOfManufacture=" + yearOfManufacture + ", preice=" + preice + ", weight="
				+ weight + ", colour=" + colour + "]";
	}

	
	
	
}
