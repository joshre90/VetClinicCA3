package staff;

import java.util.Random;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class StaffDataGenerator {

	// Array that contains all the first names (32)
	private String[] firstNames = { "Bruce", "Alan", "Richard", "Victoria", "Vivian", "Joe", "Diana", "Santiago",
			"John", "Ivan", "Robert", "Lucy", "Rebecca", "Maria", "Diana", "Alejandra", "Jennifer", "Jose", "Oliver",
			"Pablo", "Federico", "Amanda", "Mark", "James", "Alexandre", "Thomas", "Justin", "Daniela", "Pamela",
			"Aoife", "Shona", "Conor" }; // 32

	// Array that contains all the surnames (32)
	private String[] surnames = { "Lee", "Dillinger", "Smith", "Gonzalez", "O'Keefe", "Hernandez", "Lopez", "Byrne",
			"Ivern", "Scalci", "Scott", "Halpert", "Beesly", "Castello", "Dunne", "McGregor", "Ferreira", "Vettel",
			"Perez", "McQueen", "Weiss", "Santos", "Cavini", "Patton", "Keenan", "Ryan", "Saladino", "Reina",
			"Esposito", "Saleem", "Gomez", "Spironello" };// 32

	// Number of existing salary bands
	private int salary = 6;

	public StaffDataGenerator() {

	}

	/*
	 * Code taken from Ken Healy College Scenario code, Week 27 Apr - 3 May
	 */
	public String getRandomData() {
		// return a random name

		Random r = new Random();

		// pick a name, surname based on length of arrays, picks a random number for
		// salary band
		String name = firstNames[r.nextInt(firstNames.length)];
		String surname = surnames[r.nextInt(surnames.length)];
		int salaryBand = generateSalary(r.nextInt(salary));

		return (name + " " + surname + " " + salaryBand);

	}

	// Salary band conversion method
	public int generateSalary(int salaryBand) {
		if (salaryBand <= 1) {
			salaryBand = 40000;
		} else if (salaryBand == 2) {
			salaryBand = 36000;
		} else if (salaryBand == 3) {
			salaryBand = 32000;
		} else if (salaryBand == 4) {
			salaryBand = 28000;
		} else {
			salaryBand = 24000;
		}

		// Return the actual salary in thousands
		return salaryBand;

	}

	//// Method that generates the medical number ID
	public int generateMStaffID(int i) {
		int staffID = 1000; // ID for medical staff start in 1000
		staffID += i;
		return staffID;
	}

	//// Method that generates the admin number ID
	public int generateStaffID(int i) {
		int staffID = 2000; // ID for medical staff starts in 2000
		staffID += i;
		return staffID;
	}

}