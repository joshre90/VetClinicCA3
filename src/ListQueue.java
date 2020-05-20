import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import animal.PetAnimals;
import staff.ClinicStaff;

public class ListQueue {

	public ArrayList<ClinicStaff> FillQueue(ArrayList<ClinicStaff> medicalStaff, ArrayList<PetAnimals> animals) {
		PetAnimals queueAnimal;
		int i = 0, j = 0;
		do {
			queueAnimal = animals.get(i);
			medicalStaff.get(j).setAnimalQueue(queueAnimal);
			i++;
			j++;

			if (j == medicalStaff.size()) {
				j = 0;
			}
		} while (i < animals.size());

		return medicalStaff;
	}

	public void printQueue(ArrayList<ClinicStaff> medicalStaff) {
		System.out.println("Medical Staff is in charge of the following animals: \n");
		for (ClinicStaff ms : medicalStaff) {
			System.out.println("\n--------------------\n");
			System.out.println(ms.getFirstName().toUpperCase() + " " + ms.getSurname().toUpperCase() + "\n");
			System.out.println(ms.getAnimalQueue().toString());
		}
	}

	public void staffSearchQueue(ArrayList<ClinicStaff> medicalStaff, String name, String surname, int ID) {
		String staffClass = null;

		for (ClinicStaff ms : medicalStaff) {
			if ((ms.getFirstName().trim().toLowerCase().equals(name.toLowerCase())
					&& ms.getSurname().trim().toLowerCase().equals(surname.toLowerCase()))) {
				staffClass = getSimpleStaffName(ms);

				System.out.println(
						ms.getFirstName().toUpperCase() + " " + ms.getSurname().toUpperCase() + "- Will attend: \n");
				System.out.println(ms.getAnimalQueue().toString());
			} else if (ms.getStaffID() == ID) {
				staffClass = getSimpleStaffName(ms);

				System.out.println(
						ms.getFirstName().toUpperCase() + " " + ms.getSurname().toUpperCase() + "  -   Is attening: ");
				System.out.println(ms.getAnimalQueue().toString());
			}
		}
		if (staffClass == null) {
			System.out.println("\nThe are no medical staff members with those credentials");
		}

	}

	public ArrayList<ClinicStaff> staffQueue(ArrayList<ClinicStaff> medicalStaff, String name, String surname, int ID) {
		String staffClass = null;

		for (ClinicStaff ms : medicalStaff) {
			if ((ms.getFirstName().trim().toLowerCase().equals(name.toLowerCase())
					&& ms.getSurname().trim().toLowerCase().equals(surname.toLowerCase()))) {
				staffClass = getSimpleStaffName(ms);
				searchValidator(ms);

			} else if (ms.getStaffID() == ID) {
				staffClass = getSimpleStaffName(ms);
				searchValidator(ms);
			}
		}
		if (staffClass == null) {
			System.out.println("\nThe are no medical staff members with those credentials");
		}

		return medicalStaff;
	}

	public void searchValidator(ClinicStaff staff) {
		boolean flag = false;
		boolean flagSize;
		String userChoice;
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------\n");

		do {
			System.out.println(staff.getFirstName() + " " + staff.getSurname() + " is now attending:");
			System.out.println(staff.getAnimalQueue().getFirst().toString() + "\n");
			System.out.print("Would you like " + staff.getFirstName() + " " + staff.getSurname()+ " attend the next pet? Please type Yes(y) or No(n): ");
			
			try {
				userChoice = myReader.readLine();
				System.out.println("\n----------------");

				if (userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")) {

					flagSize = staff.getAnimalQueue().remove();
					if (flagSize == true) {
						flag = false;
					} else {
						flag = true;
					}
				} else if (userChoice.equalsIgnoreCase("no") || userChoice.equalsIgnoreCase("n")) {
					flag = true;
				} else {
					System.out.println("\nPlease write Yes(y) o No(n)");
					flag = false;
				}

			} catch (Exception e) {
				flag = false;
				System.out.println("ERROR! Please type the correct answer");

			}
		} while (!flag && staff.getAnimalQueue().getSize() > 0);

		if (staff.getAnimalQueue().getSize() == 0) {
			System.out.println("\nThere are not more animals being attended by " + staff.getFirstName() + " "
					+ staff.getSurname());
			System.out.println("\n------------------------------------\n\n");
		}

	}

	public String getSimpleStaffName(ClinicStaff staff) {
		String staffName;
		staffName = staff.getClass().getSimpleName();
		// Code taken from
		// https://stackoverflow.com/questions/4886091/insert-space-after-capital-letter
		staffName = staffName.replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2");

		return staffName;

	}

}
