import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Family child1 = new Family("James", "Bond", 20, LocalDate.of(2004, 01, 01), 'M');
		Family child2 = new Family("Jane", "Reacher", 30, LocalDate.of(1994, 01, 01), 'F');
		Family child3 = new Family("Tom", "Brady", 40, LocalDate.of(1984, 01, 01), 'M');
		Family child4 = new Family("Baby","Yoda", 50, LocalDate.of(1974, 01, 01), 'O');

		System.out.println(child1.toString() + child2.toString() + child3.toString() + child4.toString());
		printInfo();

	}

	static void printInfo() {
		System.out.println("Total Family Count: " + Family.familyCount);
	}

}
