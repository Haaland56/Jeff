import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// import scanner class for user input
		Scanner input = new Scanner(System.in);

		// declaring variables
		double number;
		double sum = 0;
		double average;
		double totalAfterInterest;
		double totalBeforeInterest;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		int i = 0;

		// declaring constants
		final double RATE = 0.2;

		// while loop for five numbers
		while (i < 5) {
			System.out.print("Enter a number: ");
			number = input.nextDouble();

			// summation of all the numbers
			sum += number;
			// iterator to stop infinite loop
			i++;

			// evaluate max/min values using Math class
			min = Math.min(min, number);
			max = Math.max(max, number);

		}

		// calculates total and average
		totalBeforeInterest = sum;
		totalAfterInterest = sum + (sum * RATE);
		average = sum / i;

		// prints results
		System.out.println("\nThe total before interest is: " + totalBeforeInterest);
		System.out.println("The total after 20% interest is: " + totalAfterInterest);
		System.out.println("The average is: " + average);
		System.out.println("The maximum is: " + max);
		System.out.println("The minimum is: " + min);

		// resource leak closure
		input.close();

	}

}
