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
			role = "";
			break;
		case 4:
			role = "";
			break;
		case 5:
			role = "";
			break;
		case 6:
			role = "";
			break;
		case 7:
			role = "";
			break;
		case 8:
			role = "";
			break;
		}

		for (ClinicStaff ms : staff) {
			if(role.equals(ms.getTitle())) {
				System.out.println(ms);
			}
		}
	}

}