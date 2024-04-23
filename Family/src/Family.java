import java.time.LocalDate;

public class Family {

	private String firstName; // first name of child
	private String lastName; // last name of child
	private int age; // age of child
	private LocalDate dateOfBirth; // date of birth of child

	private char gender; // gender identification
	public static int familyCount; // variable used to incrementally count the number of families.

	public Family() {

	}

	// public constructor used to enter data information
	public Family(String firstName, String lastName, int age, LocalDate localDate, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = localDate;

		this.gender = gender;
		familyCount++;

	}

	// Getters and setters for user data

	public String getFirstName() {
		return firstName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		// input validation for negative numbers;
		if (age < 0) {
			return;
		}
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "child: Name = " + firstName + " " + lastName + ", age = " + age + ", dateOfBirth = " + dateOfBirth
				+ ", gender = " + gender + "\n";
	}

	static void printInfo() {
		System.out.println("Family Count: " + Family.familyCount);
	}

}
