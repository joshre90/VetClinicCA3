import java.util.ArrayList;

import staff.Admin;
import staff.ClinicStaff;
import staff.Medical;

public class ListStaff {

	//METHOD THAT  LISTS ALL THE STAFF
	public void listnames(ArrayList<ClinicStaff> staff) {
		System.out.println("");

		for (ClinicStaff ms : staff) {
			System.out.println("------\n" + "\nName: " + ms.getFirstName() + "\nSurname: " + ms.getSurname() + "\nRole: "+ ms.getTitle() + "\nEmployeed ID: " + ms.getStaffID() + "\nAnnual Salary: " + ms.getSalary() +"\n");
		}

	}

	//METHOD THAT LISTS ALL THE STAFF BY CATEGORY
	public void listStaffByTitle(ArrayList<ClinicStaff> staff, int userChoice) {
		String role = null;

		switch (userChoice) {
		case 1:
			role = "Veterinarian";
			
			break;
		case 2:
			role = "Trainee Veterinarian";
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
			role = "IT Techie";
			break;
		}

		System.out.println("\n" + role.toUpperCase() + "S\n");
		for (ClinicStaff ms : staff) {
			if(role.equals(ms.getTitle())) {
				System.out.println("------\n" + "\nName: " + ms.getFirstName() + "\nSurname: " + ms.getSurname() + "\nRole: "+ ms.getTitle() + "\nEmployeed ID: " + ms.getStaffID() + "\nAnnual Salary: " + ms.getSalary() +"\n");
			}
		}
	}
	
	public void listStaffByTask(ArrayList<ClinicStaff> staff) {
		for (ClinicStaff ms : staff) {
			System.out.println("------\n" + "\nName: " + ms.getFirstName() +" "+ ms.getSurname() + "\nRole: "+ ms.getTitle()+ "\nTask: " + ms.getTask()+"\n");
		}
		}
	
	
		
	//METHOD THAT LOOKS FOR THE STAFF	
	public void lookForStaff(ArrayList<ClinicStaff> staff, String staffName, String staffSurname) {
		String staffClass = null;
		
		if (staff.get(0) instanceof Medical.Veterinarian) {
			System.out.print("\nMedical employees' names that contain '" + staffName + "' and '"+ staffSurname+ "' are: \n");
		for (ClinicStaff ms : staff) {
			if (ms.getFirstName().toLowerCase().equals(staffName.toLowerCase()) || ms.getSurname().toLowerCase().equals(staffSurname.toLowerCase())) {
				staffClass =ms.getClass().getSimpleName();
				
				//Code taken from https://stackoverflow.com/questions/4886091/insert-space-after-capital-letter
				staffClass = staffClass.replaceAll("(\\p{Ll})(\\p{Lu})","$1 $2");
				System.out.println("------\n" + "\nName: " + ms.getFirstName() +" "+ ms.getSurname() + "\nRole: " + staffClass + "\n");
			}
		}
		if (staffClass == null) {
			System.out.println("\nThe are no medical staff members with that name");
		}
		}
		else {
			System.out.print("\nAdmin employees' names that contain '" + staffName + "' and '"+ staffSurname+ "' are: \n");
			for (ClinicStaff ms : staff) {
				if (ms.getFirstName().toLowerCase().equals(staffName.toLowerCase()) || ms.getSurname().toLowerCase().equals(staffSurname.toLowerCase())) {
					staffClass =ms.getClass().getSimpleName();
					
					//Code taken from https://stackoverflow.com/questions/4886091/insert-space-after-capital-letter
					staffClass = staffClass.replaceAll("(\\p{Ll})(\\p{Lu})","$1 $2");
					System.out.println("------\n" + "\nName: " + ms.getFirstName() +" "+ ms.getSurname() + "\nRole: " + staffClass + "\n");
				}
			}
			if (staffClass == null) {
				System.out.println("\nThe are no admin staff members with that name");
			}
		}
	}
	
	
	}

