package staff;

import java.util.ArrayList;

public class AdminStaffList {
	// protected String animalData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private String task;
	private int j = 0; // Counter used for the staffID

	// Number of medical staff to be generated
	private int numAdminStaff = 10;
	private int numManager = (int) (numAdminStaff * 0.1);
	private int numAssistant = (int) (numAdminStaff * 0.1);
	private int numReceptionist = (int) (numAdminStaff * 0.20);
	private int numCustomServ = (int) (numAdminStaff * 0.30);
	private int numIT = numAdminStaff - numManager - numAssistant - numReceptionist - numCustomServ;

	// ArrayList from the Superclass ClinicStaff where Medical will be Stored
	ArrayList<ClinicStaff> administrativeStaff = new ArrayList<ClinicStaff>();
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

	public ArrayList<ClinicStaff> generateAdminStaff() {
		/// Loop to generate dogs
		for (int i = 0; i < numManager; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			String task = atg.getRandomData();
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			task = atg.getRandomData();
			manager = adminStaff.new Manager(adminParts[0], adminParts[1], staffID, Integer.parseInt(adminParts[2]),
					task);
			administrativeStaff.add(manager);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numAssistant; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			assistant = adminStaff.new Assistant(adminParts[0], adminParts[1], staffID, Integer.parseInt(adminParts[2]),
					task);
			administrativeStaff.add(assistant);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numReceptionist; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			receptionist = adminStaff.new Receptionist(adminParts[0], adminParts[1], staffID,
					Integer.parseInt(adminParts[2]), task);
			administrativeStaff.add(receptionist);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numCustomServ; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			customServ = adminStaff.new CustomerServiceRep(adminParts[0], adminParts[1], staffID,
					Integer.parseInt(adminParts[2]), task);
			administrativeStaff.add(customServ);
		}

		/// Loop to generate dogs
		for (int i = 0; i < numIT; i++) {
			j++;
			String adminData = sdg.getRandomData();
			String[] adminParts = adminData.split(" ");
			task = atg.getRandomData();
			int staffID = adminStaff.generateStaffID(j); // Method to generate the id
			itGuy = adminStaff.new TechnicalSupport(adminParts[0], adminParts[1], staffID,
					Integer.parseInt(adminParts[2]), task);
			administrativeStaff.add(itGuy);
		}

		return administrativeStaff;
	}
}