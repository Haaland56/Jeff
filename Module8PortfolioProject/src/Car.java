import java.io.FileWriter;
import java.io.IOException;

public class Car {

	// attributes of car class
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;

	// default constructor
	public Car() {

	}

	// parameterized constructor
	public Car(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;

	}

	// lists car information
	public String[] listCarInfo() {
		return new String[] { make, model, color, String.valueOf(year), String.valueOf(mileage) };
	}

	// add new car method
	public String addNewCar(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "A new car was added.";
		} catch (Exception e) {
			return "The car was not added.";
		}

	}

	// remove car method
	public String removeCar() {
		try {
			this.make = "";
			this.model = "";
			this.color = "";
			this.year = 0;
			this.mileage = 0;
			return "The car was removed.";
		} catch (Exception e) {
			return "The car was not removed.";
		}

	}

	// update new car method
	public String updateCar(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "The car was updated.";
		} catch (Exception e) {
			return "The car was not updated.";
		}

	}
	
	// print car information method
	public void printFile(String file) {
		try {
			FileWriter writer=new FileWriter(file);
			writer.write("The car make is: "+make+"\n");
			writer.write("The car model is: "+model+"\n");
			writer.write("The car color is: "+color+"\n");
			writer.write("The car year is: "+year+"\n");
			writer.write("The car mileage is: "+mileage+"\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Could not write to the file");
		}
	}

	@Override
	public String toString() {
		return "[make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + ", mileage=" + mileage
				+ "]";
	}
	
	// Overridden toString method to print vehicle information
	
	
}
