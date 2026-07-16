package ua.com.carmanager;

import java.util.Objects;

//оголошення класу:

public class Car {

	// поля класу:

	String model;

	int yearOfManufacture;

	int preice;

	int weight;
	
	//lesson2.7 distance.
	private int distance = 0;
	
	//lesson2.5 enum for color. replaced record: Srtring color = "white";
	Color color;

	// Constructor (default):
	public Car(String model, Color color, int yearOfManufacture, int weight, int preice) {
		super();

		this.model = model;
		this.color = color;
		this.yearOfManufacture = yearOfManufacture;
		this.weight = weight;
		this.preice = preice;
		//Ключевое слово this в Java означает - текущий объект, внутри которого сейчас выполняется код.
	}

	
	
	// get method для вывода переменной distance
	public int getDistance() {
		return distance;
	}
	
	//set method "addDistance" для записи переменной distance с проверкой условия
	public void addDistance(int extradistance) {
		if (extradistance > 0) {
			distance = distance + extradistance;
		}
		else {
			System.out.println("probeg tebe ne skrutit'");
		}
	}
			
	// перегруз метода "addDistance"	
	 public void addDistance(double extradistance) {
				if (extradistance > 0) {
					distance = distance + extradistance;
				}
				else {
					System.out.println("probeg tebe ne skrutit'");
		}
	}




	//genetated methods Hash and Equals:
	@Override
	public String toString() {
		return "Car [model=" + model + ", yearOfManufacture=" + yearOfManufacture + ", preice=" + preice + ", weight="
				+ weight + ", distance=" + distance + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, Integer.valueOf(distance), model, Integer.valueOf(preice), Integer.valueOf(weight),
				Integer.valueOf(yearOfManufacture));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && distance == other.distance && Objects.equals(model, other.model)
				&& preice == other.preice && weight == other.weight && yearOfManufacture == other.yearOfManufacture;
	}


	


	
	
	
}
