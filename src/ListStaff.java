import java.util.ArrayList;

import staff.ClinicStaff;
import staff.Medical;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class ListStaff {

	// variable used in the class to store the
	protected String roleClass;

	/*
	 * Method that receives a ClinicStaff ArrayList (Superclass of Medical and Admin
	 * classes) as a parameter, it lists all the staff members in the array
	 */
	public void listnames(ArrayList<ClinicStaff> staff) {

		/*
		 * If statement that checks if the first element in the ArrayList is Medical to
		 * see if the ArrayList sent is of the category medical
		 */
		if (staff.get(0) instanceof Medical.Veterinarian) {
			System.out.println("\n\n--  --  --  --  --  --  --  --  --\nTHE MEDICAL STAFF IN THE CLINIC IS:\n");

			// If the element is not medical class then is of the Admin type and prints the
			// following
		} else {
			System.out.println("\n\n--  --  --  --  --  --  --  --  --\nTHE ADMIN STAFF IN THE CLINIC IS:\n");
		}

		// For loop used to access each element of the array
		for (ClinicStaff ms : staff) {
			// Calls the method to get the name of the element's class
			roleClass = getSimpleStaffName(ms);

			// Prints out the result
			System.out.println("\nName: " + ms.getFirstName() + "\nSurname: " + ms.getSurname() + "\nRole: " + roleClass
					+ "\nEmployeed ID: " + ms.getStaffID() + "\nAnnual Salary: " + ms.getSalary() + "\n\n------");
		}

	}

	/*
	 * Method used to list the staff according to the type choosen by the user. It
	 * receives a ClinicStaff ArrayList (Superclass of Medical and Admin) as a
	 * parameter and an integer (user choice)
	 */
	public void listStaffByTitle(ArrayList<ClinicStaff> staff, int userChoice) {

		String role = null; // Variable used to compare the input with the subclass of each element

		// Switch case based on the user input just to print the title
		switch (userChoice) {
		case 1:
			role = "Veterinarian";

			break;
		case 2:
			role = "Trainee Vet";
			break;
		case 3:
			role = "Nurse";
			break;
		case 4:
			role = "Veterinarian Assistant";
			break;
		case 5:
			role = "Pet Hair Stylist";
			break;
		case 6:
			role = "Manager";
			break;
		case 7:
			role = "Assistant";
			break;
		case 8:
			role = "Receptionist";
			break;
		case 9:
			role = "Customer Service Rep";
			break;
		case 10:
			role = "Technical Support";
			break;
		}

		// Printing the title based on the user input
		System.out.println("\n----------------");
		System.out.println(role.toUpperCase() + "S");

		// For loop used to access each element of the array
		for (ClinicStaff ms : staff) {

			// Method called to get name of the class - Line*******
			roleClass = getSimpleStaffName(ms);

			// Statement that compares the role (assigned by user input) to the class of the
			// element, in case is the same, it prints out the information of the element
			if (role.equals(roleClass)) {
				System.out.println("\nName: " + ms.getFirstName() + "\nSurname: " + ms.getSurname() + "\nRole: "
						+ roleClass + "\nEmployeed ID: " + ms.getStaffID() + "\nAnnual Salary: " + ms.getSalary()
						+ "\n\n------");
			}
		}
	}

	// Method that receives the Admin ClinicStaff ArrayList to be printed out
	// according to the information needed
	public void listStaffByTask(ArrayList<ClinicStaff> staff) {
		for (ClinicStaff ms : staff) {

			// For loop used to access each element of the array
			roleClass = getSimpleStaffName(ms);

			// Prints the information of the admin staff including the task
			System.out.println("Name: " + ms.getFirstName() + " " + ms.getSurname() + "\nRole: " + roleClass
					+ "\nTask: " + ms.getTask() + "\n\n------\n");
		}
	}

	// Method used to search for a Staff memeber with the ArrayList and name
	// received as
	// parameters
	public void lookForStaff(ArrayList<ClinicStaff> staff, String staffName, String staffSurname) {

		String staffClass = null;// Variable used to store Staff class of the element , e.g. "Receptionist"

		// If statemet to check which class the array belogs either medical or admin
		if (staff.get(0) instanceof Medical.Veterinarian) {// In case the first element is medical veterinarian it runs
															// the following code

			// Message for the user
			System.out.print("\n--  --  --  --  --  --  --  --  --");
			System.out.println("\nMedical employees' names that contain Name: '" + staffName + "' or  Surname: '"
					+ staffSurname + "' are: \n");

			// For loop used to access each element of the array
			for (ClinicStaff ms : staff) {

				// If statement that compares the name and surname of the staff with the name
				// typed in by the user before the method was called
				if (ms.getFirstName().trim().toLowerCase().equals(staffName.toLowerCase())
						|| ms.getSurname().trim().toLowerCase().equals(staffSurname.toLowerCase())) {

					/*
					 * The variable stores the result for calling the method that retrieves the name
					 * of the class of the element - Line 209
					 */
					staffClass = getSimpleStaffName(ms);

					// Prints result
					System.out.println("\nName: " + ms.getFirstName() + " " + ms.getSurname() + "\nRole: " + staffClass
							+ "\n\n------");
				}
			}

			/*
			 * In case the if statements above does not find a match Medical class will
			 * store nothing, then the message is displayed
			 */
			if (staffClass == null) {
				System.out.println("\n***The are no admin staff members with that name***\n");
			}
			// in case the first element of the ArrayList does not belong to the medicla
			// staff then is populated with admin members
		} else {
			// Message for the user
			System.out.print("\n--  --  --  --  --  --  --  --  --");
			System.out.println(
					"\nAdmin employees' names that contain '" + staffName + "' or '" + staffSurname + "' are: \n");

			// For loop used to access each element of the array
			for (ClinicStaff ms : staff) {

				// If statement that compares the name and surname of the staff with the name
				// typed in by the user before the method was called
				if (ms.getFirstName().toLowerCase().equals(staffName.toLowerCase())
						|| ms.getSurname().toLowerCase().equals(staffSurname.toLowerCase())) {

					/*
					 * The variable stores the result for calling the method that retrieves the name
					 * of the class of the element - Line 209
					 */
					staffClass = getSimpleStaffName(ms);

					// Prints result
					System.out.println("\nName: " + ms.getFirstName() + " " + ms.getSurname() + "\nRole: " + staffClass
							+ "\n\n------");
				}
			}

			/*
			 * In case the if statements above does not find a match Medical class will
			 * store nothing, then the message is displayed
			 */
			if (staffClass == null) {
				System.out.println("\n***The are no admin staff members with that name***\n");
			}
		}
	}

	// Method that receives an element of the parent class ClinicStaff and retrieves
	// the information of the type of the element's class as a String
	public String getSimpleStaffName(ClinicStaff staff) {
		String staffName;

		// Method that gets the name of the class as a string
		staffName = staff.getClass().getSimpleName();

		// Method and parameters that add spaces between capital letters
		// Code taken from
		// https://stackoverflow.com/questions/4886091/insert-space-after-capital-letter
		staffName = staffName.replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2");

		// Returns the name of the class as a String already with spaces between capital
		// letters
		return staffName;

	}

}
