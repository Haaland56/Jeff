import java.util.Scanner;

public class Widthholding {

	// Static method to calculate tax withholding
	public static double taxCalc(double income) {
		// tax rate
		double taxRate;

		// conditional statements for various incomes
		if (income < 500) {
			taxRate = 0.10;

		} else if (income >= 500 && income < 1500) {
			taxRate = .15;

		} else if (income >= 1500 && income < 2500) {
			taxRate = .20;

		} else {
			taxRate = .30;
		}

		// return income by tax rate
		return income * taxRate;
	}

	public static void main(String[] args) {

		// import scanner class
		Scanner input = new Scanner(System.in);

		// variables
		double income;
		double avgTaxWidhholding;

		// user input
		System.out.println("Enter income: ");
		income = input.nextDouble();

		// calling method to calculate tax withholding
		avgTaxWidhholding = taxCalc(income);

		// print results
		System.out.printf("The weekly average tax widthholding of $%.2f is: $%.2f ", income, avgTaxWidhholding);

		// close input for resource leak
		input.close();

	}

}
