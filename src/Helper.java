import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import animal.AnimalList;
import animal.PetAnimals;
import staff.AdminStaffList;
import staff.ClinicStaff;
import staff.MedicalStaffList;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class Helper {

	// Constructor calling the program executing method
	Helper() {
		execute();
	}

	// ArrayList of the Abstract (Parent) class used to store the medical and admin
	// staff
	ArrayList<ClinicStaff> medicalStaff = new ArrayList<ClinicStaff>(); // Each medical instance staff is saved here
	ArrayList<ClinicStaff> adminStaff = new ArrayList<ClinicStaff>(); // Each admin staff instance is saved here
	ArrayList<PetAnimals> animals = new ArrayList<PetAnimals>(); // Each animal instance is saved in this list

	// Instances used to populate the ArrayLists
	MedicalStaffList msl = new MedicalStaffList();// staff package
	AdminStaffList asl = new AdminStaffList();// staff package
	AnimalList al = new AnimalList();// animal package

	/*
	 * Instances used to for the classes that process the generated data from the
	 * above held in the lists above
	 */
	ListStaff ls = new ListStaff();
	ListAnimals la = new ListAnimals();
	ListQueue fq = new ListQueue();
	PetAnimals queueAnimal;

	// Variables used in this class
	String userChoice;
	String name;
	String surname;
	int ID;
	boolean flag = false;

	// Buffered reader instance used to let user input options
	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

	// When method is called the main interface is in this method
	public void execute() {

		// Populating the arrays with staff and animal data
		/*
		 * Each of this methods returns an ArrayList of the parent class type already
		 * filled with animals and staff respectively
		 */
		this.medicalStaff = msl.generateMedicalStaff(medicalStaff);// Class MedicalStaffList - staff package - Line 45
		this.adminStaff = asl.generateAdminStaff(adminStaff);// Class AdminStaffList - staff package - Line 47
		this.animals = al.generateAnimals(animals);// Class AnimalList - animal package - Line 52

		/*
		 * Calling the method FillQueue by using the medicalStaff and animals ArrayList
		 * as a parameter returns the medicalStaff ArrayList with each of the members
		 * with a queue of animals to be attended
		 */
		medicalStaff = fq.FillQueue(medicalStaff, animals);

		// Variables used for the main menu validator
		boolean valid = false;// boolean flag
		int userInput = 0; // USed to store user input in the menus

		System.out.println("*******************************************************");
		System.out.println("**      WELCOME TO THE VETERINARY CLINIC SYSTEM      **");
		System.out.println("*******************************************************");

		/*
		 * Main menu validator - It works until the user types in the number 0 (flag
		 * changes to true) - Line 112
		 */
		do {

			// Main menu interface
			System.out.println("\n--- Please Select the number for the task you would like to perform --- \n");
			System.out.println(
					"1  - List All Staff\n2  - List All Staff By Selecting Category\n3  - List All The Admin Staff Performing A Task"
							+ "\n4  - Search For A Staff Member By Name\n5  - List All Animals\n6  - List All Animals By Type \n7  - "
							+ "Search For An Animal By Their Name \n8  - List All The Animals Assigned To Staff Members \n9  - List Of "
							+ "Pets Looked After By A Member Of Staff \n10 - For A Given Member Of Medical Staff, Pass To The Next Pet \n---");
			System.out.println("0 - Exit The Program");
			System.out.print("\nOption: ");

			// Try and catch determines if the users input is a number
			try {
				userInput = Integer.parseInt(myReader.readLine());

				// If statement that narrows the user input between 0 and 10
				if (0 <= userInput && userInput <= 10) {

					/*
					 * In case user input is between 0 and 10 a switch-case statements is used to
					 * process the information according to users choice
					 */
					switch (userInput) {

					// ------------------------ Exit program ------------------------
					// If user choice is 0, flag changes to true, breaking do-while statement
					case 0:
						System.out.println("See you soon. Thank you!");
						valid = true; // Flag changes from false to true, do-while breaks
						break; // Switch-case breaks

					// ------------------------ List all Staff ------------------------
					case 1:
						/*
						 * Calling the method listnames by sending the medical and admin staff
						 * Arraylists as parameter each time - Class ListStaff - default package - Line
						 * 19
						 */
						ls.listnames(medicalStaff);
						ls.listnames(adminStaff);

						printStars();// This method only prints a line of stars(*) - Line 593
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ---------------List All Staff By Selecting Category---------------
					/*
					 * This method immediately shows a sub menu to display another set of option for
					 * the user to choose
					 */
					case 2:
						// Sub menu
						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("SELECT A CATEGORY TO LIST STAFF FROM: ");
						System.out.println("\n    MEDICAL STAFF");
						System.out.println(
								"1 - Veterinarian \n2 - Trainee Veterinarian \n3 - Nurse \n4 - Assistant Veterinarian \n5 - Pet Hair Stylist\n");
						System.out.println("    ADMINISTRATIVE STAFF");
						System.out.println(
								"6 - Manager \n7 - Assistant \n8 - Receptionist \n9 - Customer Service Representative \n10 - IT Support Representative \n---");
						System.out.println("0 - Go back to main menu \n");

						// Method used to validate user option (between 0 and 10) - line 369
						validatorCase2();

						printStars();// This method only prints a line of stars(*) - Line 591
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ---------- Search for a specific member of staff by name -----------
					case 3:
						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("THE ADMIN STAFF CURRENT ACTIVITIES ARE:\n");

						/*
						 * This method sends adminStaff ArrayList as a parameter and just prints each
						 * admin staff performing a task - Class ListStaff - default package - Line 112
						 */
						ls.listStaffByTask(adminStaff);

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// --------------------- Search for Staff By Name ----------------------
					case 4:
						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("SEARCHING FOR STAFF BY NAME");

						// Asks the user for medical staff name
						System.out.print("Please type in the first name of the staff you are looking for: ");
						name = myReader.readLine();

						// Asks the user for medical staff surname
						System.out.print("Please type in the lastname of the staff you are looking for: ");
						surname = myReader.readLine();

						/*
						 * This method send the ArrayList of staff with the name and surname as //
						 * parameters and looks if the name or surname is in any of the elements of such
						 * list - class ListStaff - default package - Line 127
						 */
						ls.lookForStaff(medicalStaff, name, surname);
						ls.lookForStaff(adminStaff, name, surname);

						/*
						 * Method used to provide the user with a choice to run the option selected
						 * again - Line 498
						 */
						validatorYesNo(4);

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ------------------------- List All Animals --------------------------
					case 5:
						/*
						 * Method that sends the animals ArrayList as a parameter and prints all the
						 * animals in the array - Class ListAnimals - default package - Line 17
						 */
						la.listanimals(animals);

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ----------------------- List Animals By Type ------------------------
					case 6:
						// Submenu to select the animal category to list
						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("LISTING ANIMALS BY TYPE\n");
						System.out.println("Select which type of animals you want to list: \n");
						System.out.println(
								"1 - Dogs \n2 - Cats \n3 - Rabbits \n4 - Mouses \n5 - Horses \n6 - Lizards \n7 - Snakes \n8 - Fishes \n9 - Parrots \n---");
						System.out.println("0 - Go back to main menu \n\n");

						// Method used to validate user option (between 0 and 9) - line 420
						validatorCase6();

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ---------------- Search for animal specific by name -----------------
					case 7:

						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("SEARCHING FOR ANIMALS BY NAME\n");
						System.out.print("Please type in the name of the animal you are looking for: ");

						// Asks for user input for animals name
						name = myReader.readLine();

						/*
						 * Method that sends animal ArrayList and the user input as a parameter an looks
						 * if the name is in any element of the array - Class ListAnimals - default
						 * package - Line 115
						 */
						la.listAnimalsByName(animals, name);

						/*
						 * Method used to provide the user with a choice to run the option selected
						 * again - Line 498
						 */
						validatorYesNo(7);

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ------ List animals being attended by each medical staff member ------
					case 8:
						// medicalStaff = fq.FillQueue(medicalStaff, animals);
						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("ANIMALS BEING ATTENDED BY STAFF MEMBERS ARE\n");

						/*
						 * This method send the medical staff ArrayList to be processed and printed out
						 * by medical staff an their queue - Class ListQueue - default package - Line 48
						 */
						fq.printQueue(medicalStaff);

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// ------- List animals being attended by a particular medical member ------
					case 9:

						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("ANIMALS BEING ATTENDED BY A PARTICULAR MEMBER OF STAFF\n");

						// Asks for the staff name
						System.out.print("Please type in the name of the staff you are looking for: ");
						name = myReader.readLine();

						// Asks for the staff surname
						System.out.print("Please type in the lastname of the staff you are looking for: ");
						surname = myReader.readLine();

						// Method used to validate staff - line 462
						ID = validatorCase9And10();

						/*
						 * This method send the medicalStaff ArrayList, name, surname and ID to be //
						 * processed and look for a particular staff member and its queue - Class
						 * ListQueue - default package - Line 75
						 */
						fq.staffSearchQueue(medicalStaff, name, surname, ID);

						/*
						 * Method used to provide the user with a choice to run the option selected
						 * again - Line 498
						 */
						validatorYesNo(9);

						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks

					// --------- Past next animals for a particular member of staff --------
					case 10:

						System.out.println("\n\n--  --  --  --  --  --  --  --  -- --");
						System.out.println("FOR A PARTICULAR MEMEBER OF STAFF, PASS TO NEXT PET\n");

						// Asks for the staff name
						System.out.print("Please type in the name of the staff you are looking for: ");
						name = myReader.readLine();

						// Asks for the staff surname
						System.out.print("Please type in the lastname of the staff you are looking for: ");
						surname = myReader.readLine();

						// Method used to validate staff - line 462
						ID = validatorCase9And10();

						/*
						 * This method send the medicalStaff ArrayList, name, surname and ID to be
						 * processed and look for a particular staff member, its queue and also provides
						 * the option to pass not next pet - Class ListQueue - default package - Line
						 * 122
						 */
						fq.staffQueue(medicalStaff, name, surname, ID);

						/*
						 * Method used to provide the user with a choice to run the option selected
						 * again - Line 498
						 */
						validatorYesNo(10);
						printStars();// This method only prints a line of stars(*)
						valid = false; // Flag does not change, do while runs again
						break;

					// (Redundant) In case there is an invalid input
					default:
						System.out.println("Invalid input");
						valid = false; // Flag does not change, do while runs again
						break;// Switch-case breaks
					}

					// In case user input is a number but not between 0 and 10
				} else {
					System.out.println("Invalid input. PLease select a number between 0 and 10");
					valid = false;
				}

				// IF user input is not a number, catch will display an exception
			} catch (Exception e) {
				valid = false;
				System.out.println("ERROR! You did not enter a number between 1 and 10!");
			}

			// if flag is false do while still running, in case true, breaks
		} while (!valid);
	}

	/*
	 * 
	 * Methods used to process the information and validate user input
	 * 
	 */

	// This method validates the user input for the second option submenu
	public void validatorCase2() {

		// Variables used in validator
		int choice; // Integer where userChoice input is saved
		flag = false;// This breaks the do-while statement

		// Do while in charge to run the submenu until user chooses to exit (option 0)
		do {
			// Try & catch in charge of making sure the input is an integer
			try {
				System.out.println("\nPlease select a category by its number or 0 to go back: ");

				// Input is converted to an integer
				choice = Integer.parseInt(myReader.readLine());

				// If statement processing user input
				// If user input i 0 it goes out from the do-while
				if (choice == 0) {
					flag = true;// Breaks do-while loop

					// If user input is between 1 and 5 calls the method sending the medical
					// ArrayList and the user input as parameters
				} else if (1 <= choice && choice <= 5) {
					ls.listStaffByTitle(medicalStaff, choice);// Method used to list the staff based on the category and
																// user option - Class ListStaff- default package - Line
																// *****
					flag = false;// Runs the loop again

					// If user input is between 6 and 10 calls the method sending the admin
					// ArrayList and the user input as parameters
				} else if (choice > 5 && choice <= 10) {
					ls.listStaffByTitle(adminStaff, choice); // Class ListStaff- default package - Line *****
					flag = false;// Runs the loop again

					// If user input is other than a number between 0 and 10, message will be
					// displayed
				} else {
					System.out.println("Invalid input. PLease select a number between 0 and 10");
					flag = false;// Runs the loop again
				}

				// In case user input is no a number catch throws and exception
			} catch (Exception e) {
				flag = false;// Runs the loop again
				System.out.println("ERROR! You did not enter a number between 0 and 10!");
			}
		} while (!flag);

	}

	// This method validates the user input for the sixth option submenu
	public void validatorCase6() {

		// Variables used in validator
		int animalChoice;// Integer where user input is saved
		flag = false;// This breaks the do-while statement

		// Do while in charge to run the submenu until user chooses to exit (option 0)
		do {
			// Try & catch in charge of making sure the input is an integer
			try {
				System.out.println("\nPlease select a category by its number or 0 to go back: ");

				// Input is converted to an integer
				animalChoice = Integer.parseInt(myReader.readLine());

				// If statement processing user input
				// If user input i 0 it goes out from the do-while
				if (animalChoice == 0) {
					flag = true; // Breaks do-while loop

					// If user input is between 1 and 9 calls the method sending the animal
					// ArrayList and the user input as parameters
				} else if (1 <= animalChoice && animalChoice <= 9) {
					la.listanimalsByType(animals, animalChoice); // Class ListAnimals- default package - Line 35
					flag = false;// Runs the loop again

					// If user input is other than a number between 0 and 9, message will be
					// displayed
				} else {
					System.out.println("Invalid input. PLease select a number between 1 and 9");
					flag = false;// Runs the loop again
				}

				// In case user input is no a number catch throws and exception
			} catch (Exception e) {
				flag = false;// Runs the loop again
				System.out.println("ERROR! You did not enter a number between 0 and 9!");
			}
		} while (!flag);
	}

	// This method validates the user input for the ninth and tenth option submenu
	public int validatorCase9And10() {

		// Variables used in validator
		ID = 0; // Integer where staff ID is stored
		flag = false;// This breaks the do-while statement

		// Do while in charge of validating the user input as number
		do {
			System.out.print("Please type in the ID of the staff (number between 1000 and "
					+ (medicalStaff.size() + 1000) + " or 0 if not known):"); // 1000 is added since the first was
																				// initiated as a 1000

			// Try & catch in charge of making sure the input is an integer, note that user
			// can type any number
			try {
				ID = Integer.parseInt(myReader.readLine());
				flag = true; // Breaks do-while loop

				// If input is not a number exception is thrown and runs the loop again
			} catch (Exception e) {
				flag = false;// Runs the loop again
				System.out.println("ERROR! You did not enter a number!");

			}
		} while (!flag);

		return ID; // ID is sent back

	}

	/*
	 * Method used in multiple options to validate of the user wants to run again
	 * another search, category selection or list. It receives the case option as a
	 * parameter to be used in the if statements inside this method
	 */
	// This method is used int options 4,7,9 and 10
	public void validatorYesNo(int cases) {

		// Do while in charge of validating the user input
		do {
			// Try & catch in charge of making sure the input is valid
			try {
				System.out.print("\nWould you like to do another search? Please type Yes(y) or No(n): ");
				userChoice = myReader.readLine(); // Reads input user

				// In case user input is "yes" or "y" and depending INTEGER which parameter was
				// sent then the respective lines will be processed
				if (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")) {

					// Statement for case 4 - Line 189
					if (cases == 4) {

						// This will run the same code of the switch case 4
						System.out.print("Please type in the first name of the staff you are looking for: ");
						name = myReader.readLine();

						System.out.print("Please type in the last name of the staff you are looking for: ");
						surname = myReader.readLine();

						ls.lookForStaff(medicalStaff, name, surname);
						ls.lookForStaff(adminStaff, name, surname);

					}

					// Statement for case 7 - Line 241
					else if (cases == 7) {

						// This will run the same code of the switch case 7
						System.out.print("\n--------------------------------------------------------\n");
						System.out.print("Please type in the name of the animal you are looking for: ");
						name = myReader.readLine();

						la.listAnimalsByName(animals, name);

					}

					// Statement for case 9 - Line 289
					else if (cases == 9) {

						// This will run the same code of the switch case 9
						System.out.print("\n--------------------------------------------------------\n");
						System.out.print("Please type in the first name of the staff you are looking for: ");
						name = myReader.readLine();

						System.out.print("Please type in the lastname of the staff you are looking for: ");
						surname = myReader.readLine();
						ID = validatorCase9And10();

						fq.staffSearchQueue(medicalStaff, name, surname, ID);

						// Statement for case 10 - Line 320
					} else if (cases == 10) {

						// This will run the same code of the switch case 10
						System.out.print("\n--------------------------------------------------------\n");
						System.out.print("Please type in the first name of the staff you are looking for: ");
						name = myReader.readLine();

						System.out.print("Please type in the lastname of the staff you are looking for: ");
						surname = myReader.readLine();
						ID = validatorCase9And10();

						fq.staffQueue(medicalStaff, name, surname, ID);

					}

					flag = false;// Runs the loop again

					// In case user input is "no" or "n" it stops the do while loop
				} else if (userChoice.equalsIgnoreCase("no") || userChoice.equalsIgnoreCase("n")) {
					flag = true;

					// In case the user input is different than "yes" or "no" it will send the
					// following message
				} else {
					System.out.println("\nPlease write Yes(y) or No(n)");
					flag = false;// Runs the loop again
				}

				// In case an unexpected input is typed in the exception will be thrown
			} catch (Exception e) {
				flag = false;// Runs the loop again
				System.out.println("ERROR! Please type the correct answer");
			}
		} while (!flag);
	}

	// This method is called everytime an option has been finished running. Is used
	// for friendlier user experience
	public void printStars() {
		System.out.println("\n\n*********************************************************************************");
	}

}
