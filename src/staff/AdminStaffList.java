package staff;

import java.util.ArrayList;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class AdminStaffList {

	// protected String animalData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private String task;
	private int j = 0; // Counter used for the staffID

	// Number of admin staff to be generated, it is calculated on a percentage
	// level in case the total of admin staff varies
	private int numAdminStaff = 10; // Total of Admin Staff to be generated
	private int numManager = (int) (numAdminStaff * 0.1); // 10% are managers
	private int numAssistant = (int) (numAdminStaff * 0.1); // 10% are Assitant
	private int numReceptionist = (int) (numAdminStaff * 0.20); // 20% Receptionist
	private int numCustomServ = (int) (numAdminStaff * 0.30); // 30% Customer Service
	private int numIT = numAdminStaff - numManager - numAssistant - numReceptionist - numCustomServ; // Remaining

	// Instance of the class Admin that will be used to create instances of its
	// inner classes
	Admin adminStaff = new Admin(firstName, surname, staffID, salary, task);

	// Instance of the class StaffDataGenerator
	StaffDataGenerator sdg = new StaffDataGenerator();

	// Instance to create a random task
	AdminTaskGenerator atg = new AdminTaskGenerator();

	// Instances of the inner classes of the class Medical
	Admin.Manager manager;
	Admin.Assistant assistant;
	Admin.Receptionist receptionist;
	Admin.CustomerServiceRep customServ;
	Admin.TechnicalSupport itGuy;

	// Method that generates all the admin staff and populates the parent class
	// array
	public ArrayList<ClinicStaff> generateAdminStaff(ArrayList<ClinicStaff> administrativeStaff) {
		/*
		 * Note the counter for the staff ID (j) is increasing with each cycle of the
		 * for loop
		 */
		// Each for loop uses the same principle and structure, only Manager loop is
		// explained
		for (int i = 0; i < numManager; i++, j++) { // It will create the amount of managers calculated above - Line 21
			String adminData = sdg.getRandomData();// String that generates random data - Class StaffDataGenerator -
													// package staff - Line 9

			String[] adminParts = adminData.split(" "); // Splits the string into a Array elements

			task = atg.getRandomData(); // String that get a random task for the staff - Class AdminTaskGenerator -
										// package staff - line 26

			staffID = sdg.generateStaffID(j); // Method to generate the ID - Class StaffDataGenerator -
												// package staff - Line 69

			manager = adminStaff.new Manager(adminParts[0], adminParts[1], staffID, Integer.parseInt(adminParts[2]),
					task); // Assigns the information to the instance created

			administrativeStaff.add(manager);// Adds the instance to the ArrayList
		}

		/// Loop to generate Assistants
		for (int i = 0; i < numAssistant; i++, j++) {
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			staffID = sdg.generateStaffID(j);
			assistant = adminStaff.new Assistant(adminParts[0], adminParts[1], staffID, Integer.parseInt(adminParts[2]),
					task);
			administrativeStaff.add(assistant);
		}

		/// Loop to generate Receptionists
		for (int i = 0; i < numReceptionist; i++, j++) {
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			staffID = sdg.generateStaffID(j);
			receptionist = adminStaff.new Receptionist(adminParts[0], adminParts[1], staffID,
					Integer.parseInt(adminParts[2]), task);
			administrativeStaff.add(receptionist);
		}

		/// Loop to generate Customer Service Representatives
		for (int i = 0; i < numCustomServ; i++, j++) {
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			staffID = sdg.generateStaffID(j);
			customServ = adminStaff.new CustomerServiceRep(adminParts[0], adminParts[1], staffID,
					Integer.parseInt(adminParts[2]), task);
			administrativeStaff.add(customServ);
		}

		/// Loop to generate IT Support Guys
		for (int i = 0; i < numIT; i++, j++) {
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			staffID = sdg.generateStaffID(j);
			itGuy = adminStaff.new TechnicalSupport(adminParts[0], adminParts[1], staffID,
					Integer.parseInt(adminParts[2]), task);
			administrativeStaff.add(itGuy);
		}

		// Returns the ArrayList already filled with admin staff
		return administrativeStaff;
	}
}