import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import animal.PetAnimals;
import staff.ClinicStaff;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class ListQueue {

	// This method receives a medical staff ArrayList and a animal ArrayList as
	// parameters
	public ArrayList<ClinicStaff> FillQueue(ArrayList<ClinicStaff> medicalStaff, ArrayList<PetAnimals> animals) {

		// Instance used to access the information of each element of the ArrayList of
		// animals
		PetAnimals queueAnimal;

		// Counters used to access the elements of each ArrayList
		int i = 0, j = 0;

		// Do-While that will run as many times as the number of animals in the
		// ArrayList
		do {

			queueAnimal = animals.get(i);// Accessing to an element of the animals ArrayList
			medicalStaff.get(j).setAnimalQueue(queueAnimal); // Assign the animal the a staff queue
			i++; // Increase counter of animals
			j++; // Increase counter of medical staff

			/*
			 * Since animals ArrayList is much larger than the medical staff, the counter
			 * for medical needs to be reseted every time it approaches its maximum size
			 */
			if (j == medicalStaff.size()) {
				j = 0;
			}
		} while (i < animals.size());

		// Returns the medical ArrayList with the queues already populated
		return medicalStaff;
	}

	// Method that prints the Queue of each medical staff
	public void printQueue(ArrayList<ClinicStaff> medicalStaff) {

		// For loop used to access each element of the array
		for (ClinicStaff ms : medicalStaff) {

			// Printing the ifromation for the user
			System.out.println("\n-----------\n");
			System.out.println(ms.getFirstName().toUpperCase() + " " + ms.getSurname().toUpperCase() + "\n");

			// In case there are no animals to be attended
			if (ms.getAnimalQueue().getSize() == 0) {
				System.out.println("There are no animals currently being attended by this staff member");

				// If there are animals in the waiting list
			} else {
				// Prints the queue for that medical staff
				System.out.println(ms.getAnimalQueue().toString());
			}

		}
	}

	/*
	 * This method searches for a medical staff based on the name, surname or ID
	 * provided previously by the user, then it prints out he queue for that
	 * particular member if found
	 */
	public void staffSearchQueue(ArrayList<ClinicStaff> medicalStaff, String name, String surname, int ID) {

		String staffClass = null; // Variable used to store Staff class of the element , e.g. "Nurse"

		// For loop used to access each element of the array
		for (ClinicStaff ms : medicalStaff) {

			/*
			 * If statement that compares the name and surname or the ID of the staff with
			 * the name typed in by the user before the method was called
			 */
			if ((ms.getFirstName().trim().toLowerCase().equals(name.toLowerCase())
					&& ms.getSurname().trim().toLowerCase().equals(surname.toLowerCase())) || ms.getStaffID() == ID) {

				// In case member is found it stores the class name in the variable
				staffClass = getSimpleStaffName(ms);

				// If a member is found, then this statement checks the size of the queue
				if (ms.getAnimalQueue().getSize() > 0) {
					// If size bigger than 0, print the queue
					System.out.println("\n" + ms.getFirstName().toUpperCase() + " " + ms.getSurname().toUpperCase()
							+ "- Will attend: \n");
					System.out.println(ms.getAnimalQueue().toString());

					// If size is 0, the prints a message
				} else {
					System.out.println("\n" + ms.getFirstName().toUpperCase() + " " + ms.getSurname().toUpperCase()
							+ "- Is currently not attending any animal");
				}
			}
		}

		// In case no member was found, it prints the following message
		if (staffClass == null) {
			System.out.println("\nThe are no medical staff members with those credentials");
		}

	}

	/*
	 * This method searches for a medical staff based on the name, surname or ID
	 * provided previously by the user, then checks if it has an animal in the
	 * queue, if so it prints is out, the checks if there is another animal in the
	 * queue and asks the user if he/she wants to assign the next animal to the
	 * medical staff member, in case there are no more animals it will display a
	 * message
	 */
	public ArrayList<ClinicStaff> staffQueue(ArrayList<ClinicStaff> medicalStaff, String name, String surname, int ID) {

		String staffClass = null;// Variable used to store Staff class of the element , e.g. "Pet Hair Stylist"

		// For loop used to access each element of the array
		for (ClinicStaff ms : medicalStaff) {

			/*
			 * If statement that compares the name and surname or the ID of the staff with
			 * the name typed in by the user before the method was called
			 */
			if ((ms.getFirstName().trim().toLowerCase().equals(name.toLowerCase())
					&& ms.getSurname().trim().toLowerCase().equals(surname.toLowerCase())) || (ms.getStaffID() == ID)) {

				// In case member is found it stores the class name in the variable
				staffClass = getSimpleStaffName(ms);

				// If a member is found, then this statement checks the size of the queue
				if (ms.getAnimalQueue().getSize() > 0) {

					// In case size is bigger than 0 it calls the method in line 174
					searchValidator(ms);

					// If size is 0, the prints a message
				} else {
					System.out.println("\n*There are not more animals being attended by " + ms.getFirstName() + " "
							+ ms.getSurname());
					System.out.println("\n----------------\n");
				}

			}
		}

		// In case no member was found, it prints the following message
		if (staffClass == null) {
			System.out.println("\nThe are no medical staff members with those credentials");
		}

		// Returns the medical staff ArrayList with the Queue information updated
		return medicalStaff;
	}

	/*
	 * This method requieres a staff member as a parameter, it checks if there are
	 * any animals in the queue of such memeber and if so it prints the current one.
	 * It also provide the user with a yes/no question to let the staff member to
	 * pass to next pet. Once there are no more animals for that member it will end
	 * the user interaction by displaying a message for the user notifying there are
	 * no more animals in the queue
	 */
	public void searchValidator(ClinicStaff staff) {

		boolean flag = false; // Flag used for the do-while statement
		boolean flagSize;// flag use to check is the queue size is bigger than 0
		String userChoice;// Stores the user input
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in)); // System input

		// Will run as long as the user says yes and there are animals in the queue for
		// the medical staff member
		do {
			System.out.println("\n\n" + staff.getFirstName() + " " + staff.getSurname() + " (Staff ID - "
					+ staff.getStaffID() + ") is now attending:");
			System.out.println(staff.getAnimalQueue().getFirst().toString() + "\n");
			System.out.print("Would you like " + staff.getFirstName() + " " + staff.getSurname()
					+ " attend the next pet? Please type Yes(y) or No(n): ");

			try {
				userChoice = myReader.readLine();
				System.out.println("\n----------------");

				// If the size of the queue is 0, stops the do-while and displays the message
				if (staff.getAnimalQueue().getSize() == 0) {
					System.out.println("\n*There are not more animals being attended by " + staff.getFirstName() + " "
							+ staff.getSurname());
					System.out.println("\n----------------\n");
					flag = true;
				}

				// In case there are more animals in the queue and the user chooses to assign
				// the next pet to the staff member
				if (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")) {

					/*
					 * Removes the current animal from the queue. The method returns a boolean, in
					 * case there are no more animals sends a false
					 */
					flagSize = staff.getAnimalQueue().remove();

					// If there are more animals
					if (flagSize == true) {
						flag = false; // Runs do-while again
						// no more animals
					} else {
						flag = true;// Breaks the loop
					}

					// In case there are still animals but the user does not want the staff to pass
					// to next animal
				} else if (userChoice.equalsIgnoreCase("no") || userChoice.equalsIgnoreCase("n")) {
					flag = true;// Breaks the loop

					// In case user does not type "yes" or "no", it displays the message
				} else {
					System.out.println("\nPlease write Yes(y) o No(n)");
					flag = false; // Runs do-while again
				}

				// User inputs other kind of data
			} catch (Exception e) {
				flag = false;
				System.out.println("ERROR! Please type the correct answer");

			}
			/*
			 * do-while will run as long as the flag does not changes and the size of the
			 * queue is bigger than 0
			 */
		} while (!flag && staff.getAnimalQueue().getSize() > 0);

		// In case the queue size is 0 after the do-while, the following message is
		// printed out
		if (staff.getAnimalQueue().getSize() == 0) {
			System.out.println("\n*There are not more animals being attended by " + staff.getFirstName() + " "
					+ staff.getSurname());
			System.out.println("\n----------------\n");
		}

	}

	// Converts the name of the class into a string with a space between capital
	// letters
	public String getSimpleStaffName(ClinicStaff staff) {
		String staffName;
		staffName = staff.getClass().getSimpleName();
		// Code taken from
		// https://stackoverflow.com/questions/4886091/insert-space-after-capital-letter
		staffName = staffName.replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2");

		return staffName;

	}

}
