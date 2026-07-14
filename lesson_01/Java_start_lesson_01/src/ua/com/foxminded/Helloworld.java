package ua.com.foxminded;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String message_en = "Hello world"; String message_de = "Hallo Welt";
		 * System.out.println(message_de); int zahl = 1654; String buchstabe = "N UA";
		 * System.out.println(buchstabe + " " + zahl);
		 */

		/*
		 * //lesson 1.8 double-float // with data type change int i = 5; int j = 3;
		 * float result = (float) i / (float) j; System.out.println(result);
		 */
		/*
		 * float i = 5; float j = 3; float result = i / j; System.out.println(result);
		 * //answer with float: 1.6666666
		 */
		double i = 5;
		double j = 3;
		double result = i / j;
		System.out.println(result);
		// answer with double: 1.6666666666666667

		// lesson 1.9 boolean type

		boolean isMoreThanOne;
		/*
		 * if (result > 1) { isMoreThanOne = true; } else { isMoreThanOne = false; }
		 */
		// alternative for if:
		isMoreThanOne = result > 1 ? true : false;
		System.out.println(isMoreThanOne);
	}
}
