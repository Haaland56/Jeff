import java.io.IOException;
import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) throws IOException {

		// create object for car class
		Car car = new Car();

		// add new car
		car.addNewCar("Honda", "Civic", "Green", 2006, 100000);

		// print car information
		String[] carInfo = car.listCarInfo();
		System.out.println("***Car information***");
		for (String c : carInfo) {
			System.out.println(c);
		}

		// remove car
		System.out.println(car.removeCar());

		// add new car
		car.addNewCar("Nissan", "Rogue", "Blue", 2007, 2000);
		System.out.println(car.addNewCar("Nissan", "Rogue", "Blue", 2007, 20000));

		// print car information
		carInfo = car.listCarInfo();
		System.out.println("***The new car information***");
		for (String c : carInfo) {
			System.out.println(c);

		}

		// update the car information
		System.out.println(car.updateCar("Toyota", "Corolla", "Black", 2025, 5000));

		// print updated car information
		carInfo = car.listCarInfo();
		System.out.println("***The new updated car information***");
		for (String c : carInfo) {
			System.out.println(c);

		}

		// ask user to print information to file
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter (Y/N) to enter car information to a file: ");
		String choice = input.nextLine();

		// print conditions to a file
		if (choice.equalsIgnoreCase("y")) {
			car.printFile("file.txt");
			System.out.println("Car information was added to file");
		} else {
			System.out.println("Car information was not added to file");
		}

		// resource leak input close
		input.close();
	}

}
