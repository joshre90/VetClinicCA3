import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import animal.AnimalList;
import animal.PetAnimals;
import staff.AdminStaffList;
import staff.ClinicStaff;
import staff.MedicalStaffList;

public class Helper {

	Helper() {
		execute();
	}

	// ArrayList of the Abstract (Parent) class used to store the medical and admin
	// staff
	ArrayList<ClinicStaff> medicalStaff = new ArrayList<ClinicStaff>();
	ArrayList<ClinicStaff> adminStaff = new ArrayList<ClinicStaff>();
	ArrayList<PetAnimals> animals = new ArrayList<PetAnimals>();

	// Instances
	MedicalStaffList msl = new MedicalStaffList();
	AdminStaffList asl = new AdminStaffList();
	AnimalList al = new AnimalList();
	ListStaff ls = new ListStaff();
	ListAnimals la = new ListAnimals();

	String name;
	String surname;

	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
	boolean flag = false;

	public void execute() {

		this.medicalStaff = msl.generateMedicalStaff();
		this.adminStaff = asl.generateAdminStaff();
		this.animals = al.generateAnimals();

		boolean valid = false;// boolean flag
		int userInput = 0;

		System.out.println("*******************************************************");
		System.out.println("**      WELCOME TO THE VETERINARY CLINIC SYSTEM      **");
		System.out.println("*******************************************************");

		// Validator
		do {
			System.out.println("\n--- Please Select the number for the task you would like to perform --- \n");
			System.out.println(
					"1 - List All Staff\n2 - List All Staff By Selecting Category\n3 - List all the Admin staff performing a task"
							+ "\n4 - Search for a staff member by name\n5 - List all animals\n6 - List all animals by type \n7 - Search for an animal by their name \n---");
			System.out.println("0 - Exit the program");
			System.out.print("\nOption: ");
			try {
				userInput = Integer.parseInt(myReader.readLine());
				if (0 <= userInput && userInput <= 7) {
					switch (userInput) {
					// Exit program
					case 0:
						System.out.println("See you soon. Thank you!");
						valid = true;
						break;
					// List all Staff
					case 1:
						ls.listnames(medicalStaff);
						ls.listnames(adminStaff);
						valid = false;
						break;
					// List All Staff By Selecting Category
					case 2:

						System.out.print("\n--------------------------------------------------------\n");
						System.out.println("Select a category which you want to list the staff from: ");
						System.out.println("    MEDICAL STAFF");
						System.out.println(
								"1 - Veterinarian \n2 - Trainee Veterinarian \n3 - Nurse \n4 - Assistant Veterinarian \n5 - Pet Hair Stylist\n");
						System.out.println("    ADMINISTRATIVE STAFF");
						System.out.println(
								"6 - Manager \n7 - Assistant \n8 - Receptionist \n9 - Customer Service Representative \n10 - IT Support Representative \n---");
						System.out.println("0 - Go back to main menu \n");

						validatorCase2();

						valid = false;
						break;

					// Search for a specific member of staff by name
					case 3:
						ls.listStaffByTask(adminStaff);
						// System.out.println("three");
						valid = false;
						break;

					// Search for Staff By Name
					case 4:

						System.out.print("\n--------------------------------------------------------\n");
						System.out.print("Please type in the name of the staff you are looking for: ");
						name = myReader.readLine();

						System.out.print("Please type in the lastname of the staff you are looking for: ");
						surname = myReader.readLine();

						ls.lookForStaff(medicalStaff, name, surname);
						ls.lookForStaff(adminStaff, name, surname);
						valid = false;
						break;

					// List All Animals
					case 5:
						la.listanimals(animals);
						valid = false;
						break;

					// List Animals By Type
					case 6:
						System.out.print("\n--------------------------------------------------------\n");
						System.out.println("Select which type of animals you want to list: \n");
						System.out.println(
								"1 - Dogs \n2 - Cats \n3 - Rabbits \n4 - Mouses \n5 - Horses \n6 - Lizards \n7 - Snakes \n8 - Fishes \n9 - Parrots \n---");
						System.out.println("0 - Go back to main menu \n\n");
						validatorCase6();

						valid = false;
						break;

					// Search for animal specific by name
					case 7:

						System.out.print("\n---------------------------------------------------------\n");
						System.out.print("Please type in the name of the animal you are looking for: ");
						name = myReader.readLine();

						la.listAnimalsByName(animals, name);

						break;
					// (Redundant) In case there is an invalid input
					default:
						System.out.println("Invalid input");
						valid = false;
						break;
					}
				} else {
					System.out.println("Invalid input. PLease select a number between 0 and 6");
					valid = false;
				}

			} catch (Exception e) {
				valid = false;
				System.out.println("ERROR! You did not enter a number between 1 and 6!");
			}

		} while (!valid);

	}

	public void validatorCase2() {

		int choice;
		flag = false;
		do {
			try {
				System.out.print("Option: ");
				choice = Integer.parseInt(myReader.readLine());
				if (choice == 0) {
					flag = true;
				} else if (1 <= choice && choice <= 5) {
					ls.listStaffByTitle(medicalStaff, choice);
					flag = false;
				} else if (choice > 5 && choice <= 10) {
					ls.listStaffByTitle(adminStaff, choice);
					flag = false;
				} else {
					System.out.println("Invalid input. PLease select a number between 0 and 10");
					System.out.print("Option: ");
					flag = false;
				}
			} catch (Exception e) {
				flag = false;
				System.out.println("ERROR! You did not enter a number between 0 and 10!");
				System.out.print("Option: ");
			}
		} while (!flag);

	}

	public void validatorCase6() {
		int animalChoice;
		flag = false;
		do {
			try {
				System.out.print("Option: ");
				animalChoice = Integer.parseInt(myReader.readLine());
				if (animalChoice == 0) {
					flag = true;
				} else if (1 <= animalChoice && animalChoice <= 9) {
					la.listanimalsByType(animals, animalChoice);
					flag = false;
				} else {
					System.out.println("Invalid input. PLease select a number between 1 and 9");
					flag = false;
				}
			} catch (Exception e) {
				flag = false;
				System.out.println("ERROR! You did not enter a number between 0 and 9!");
			}
		} while (!flag);
	}

}
