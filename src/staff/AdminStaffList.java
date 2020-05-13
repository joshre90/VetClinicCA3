package staff;

import java.util.ArrayList;

public class AdminStaffList {
	// protected String animalData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private String title;
	private int j = 0; // Counter used for the staffID

	// Number of medical staff to be generated
	private int numAdminStaff = 10;
	private int numManager = (int) (numAdminStaff * 0.1);
	private int numAssistant = (int) (numAdminStaff * 0.2);
	private int numReceptionist = (int) (numAdminStaff * 0.10);
	private int numCustomServ = (int) (numAdminStaff * 0.30);
	private int numIT = numAdminStaff - numManager - numAssistant - numReceptionist - numCustomServ;

	// ArrayList from the Superclass ClinicStaff where Medical will be Stored
	ArrayList<ClinicStaff> administrativeStaff = new ArrayList<ClinicStaff>();
	Admin adminStaff = new Admin(firstName, surname, staffID, salary, title);

	// Instance of the class StaffDataGenerator
	StaffDataGenerator sdg = new StaffDataGenerator();

	// Instances of the inner classes of the class Medical
	Admin.Manager manager;
	Admin.Assistant assistant;
	Admin.Receptionist receptionist;
	Admin.CustomerService customServ;
	Admin.ITSupport itGuy;

	public ArrayList<ClinicStaff> generateAdminStaff() {
		/// Loop to generate dogs
		for (int i = 0; i < numManager; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			manager = adminStaff.new Manager(adminParts[0], adminParts[1], staffID, 0, "Manager");
			administrativeStaff.add(manager);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numAssistant; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			assistant = adminStaff.new Assistant(adminParts[0], adminParts[1], staffID, 0, "Assistant");
			administrativeStaff.add(assistant);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numReceptionist; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			receptionist = adminStaff.new Receptionist(adminParts[0], adminParts[1], staffID, 0, "Receptionist");
			administrativeStaff.add(receptionist);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numCustomServ; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			customServ = adminStaff.new CustomerService(adminParts[0], adminParts[1], staffID, 0, "Customer Service Rep");
			administrativeStaff.add(customServ);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numIT; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			// Create a class for salary
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			itGuy = adminStaff.new ITSupport(adminParts[0], adminParts[1], staffID, 0, "IT Techie");
			administrativeStaff.add(itGuy);
		}


		return administrativeStaff;
	}
}