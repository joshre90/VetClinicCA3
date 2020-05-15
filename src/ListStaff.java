import java.util.ArrayList;

import staff.ClinicStaff;

public class ListStaff {

	public void listnames(ArrayList<ClinicStaff> staff) {
		System.out.println("");

		for (ClinicStaff ms : staff) {
			// System.out.println(ms.getFirstName() + ms.getSurname() + ms.getTitle());
			System.out.println(ms);
		}

		// return null;

	}

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

		for (ClinicStaff ms : staff) {
			if(role.equals(ms.getTitle())) {
				System.out.println(ms);
			}
		}
	}

}