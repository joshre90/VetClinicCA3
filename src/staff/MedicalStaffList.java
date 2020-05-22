package staff;

import java.util.ArrayList;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class MedicalStaffList {

	// protected String medical staff Data;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private int j = 0;// Counter used for the staffID

	// Number of medical staff to be generated, it is calculated on a percentage
	// level in case the total of medical staff varies
	private int numMedicalStaff = 30; // Total number of medical Staff to be generated
	private int numVeterinarian = (int) (numMedicalStaff * 0.25); // 25% are Veterinarians
	private int numTraineeVet = (int) (numMedicalStaff * 0.1);// 10%
	private int numNurse = (int) (numMedicalStaff * 0.35); // 35%
	private int numVetAssistant = (int) (numMedicalStaff * 0.20); // 20%
	private int petHairStylist = numMedicalStaff - numVeterinarian - numTraineeVet - numNurse - numVetAssistant; // Remaining

	// Instance of the class Medical that will be used to create instances of its
	// inner classes
	Medical medicStaff = new Medical(firstName, surname, staffID, salary);

	// Instance of the class StaffDataGenerator, which has all the info to generate
	// Staff members
	StaffDataGenerator sdg = new StaffDataGenerator();

	// Instances of the inner classes of the class Medical that will be used to
	// populate the array of the parent class
	Medical.Veterinarian vet;
	Medical.TraineeVet trainVet;
	Medical.Nurse nurse;
	Medical.VeterinarianAssistant vetAssist;
	Medical.PetHairStylist hairStyle;

	// Method that generates all the medical staff and populates the parent class
	// array
	public ArrayList<ClinicStaff> generateMedicalStaff(ArrayList<ClinicStaff> medicalStaff) {
		/*
		 * Note the counter for the staff ID (j) is increasing with each cycle of the
		 * for loop
		 */

		// Each for loop uses the same principle and structure, only Veterinarian loop
		// is explained
		for (int i = 0; i < numVeterinarian; i++, j++) { // It will create the amount of Vets calculated above - Line 20

			String medicalData = sdg.getRandomData(); // String that generates random data - Class StaffDataGenerator -
														// package staff - Line 9

			String[] medicalParts = medicalData.split(" "); // Splits the string into a Array elements

			int staffID = sdg.generateMStaffID(j); // Method to generate the ID - Class StaffDataGenerator -
													// package staff - Line 69

			vet = medicStaff.new Veterinarian(medicalParts[0], medicalParts[1], staffID,
					Integer.parseInt(medicalParts[2])); // Assigns the information to the instance created

			medicalStaff.add(vet);// Adds the instance to the ArrayList
		}

		/// Loop to generate Trainee Veterinarians
		for (int i = 0; i < numTraineeVet; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			int staffID = sdg.generateMStaffID(j);
			trainVet = medicStaff.new TraineeVet(medicalParts[0], medicalParts[1], staffID,
					Integer.parseInt(medicalParts[2]));
			medicalStaff.add(trainVet);
		}

		/// Loop to generate Nurses
		for (int i = 0; i < numNurse; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			int staffID = sdg.generateMStaffID(j);
			nurse = medicStaff.new Nurse(medicalParts[0], medicalParts[1], staffID, Integer.parseInt(medicalParts[2]));
			medicalStaff.add(nurse);
		}

		/// Loop to Veterinarian Assistants
		for (int i = 0; i < numVetAssistant; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			int staffID = sdg.generateMStaffID(j);
			vetAssist = medicStaff.new VeterinarianAssistant(medicalParts[0], medicalParts[1], staffID,
					Integer.parseInt(medicalParts[2]));
			medicalStaff.add(vetAssist);
		}

		/// Loop to Pet Hair Stylists
		for (int i = 0; i < petHairStylist; i++, j++) {
			String medicalData = sdg.getRandomData();
			String[] medicalParts = medicalData.split(" ");
			int staffID = sdg.generateMStaffID(j);
			hairStyle = medicStaff.new PetHairStylist(medicalParts[0], medicalParts[1], staffID,
					Integer.parseInt(medicalParts[2]));
			medicalStaff.add(hairStyle);
		}

		// Returns the ArrayList already filled with medical staff
		return medicalStaff;

	}
}