import java.util.ArrayList;
import java.util.Scanner;

public class Weeklytemp {

	public static void main(String[] args) {

		// import scanner class for user input
		Scanner input = new Scanner(System.in);
		// initialize sum variable for calculation
		double sum = 0;

		// array lists for adding data
		ArrayList<String> days = new ArrayList<>();
		ArrayList<Double> temps = new ArrayList<>();

		// seven day loop to get user input
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter the day of the week -\"monday-sunday\"- or \"week\" for weekly temp report: ");
			String day = input.nextLine();
			// condition to break from the loop to get average temperatures
			if (day.equalsIgnoreCase("week")) {
				break;
			}
			// populates day list
			days.add(day);
			// asks user to input day data (i.e Monday)
			System.out.print("Enter the average temperature for " + day + ": ");
			double temp = input.nextDouble();
			// cleans up buffer stream
			String cleanUpstr = input.nextLine();
			// populates temperature list
			temps.add(temp);
			// total sum of all temperatures
			sum += temp;
		}

		// displays daily average temperature
		System.out.println("The daily average temperature is: ");
		for (int i = 0; i < days.size(); i++) {
			System.out.println(days.get(i) + "'s average temperature is: " + temps.get(i));
		}

		// ternary operator to calculate average
		double average = days.isEmpty() ? 0 : sum / days.size();

		// prints the weekly average temperature
		System.out.printf("This weeks average temperature is: %.2f", average);

		// resource input close
		input.close();

	}

}
