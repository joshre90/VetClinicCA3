import java.util.ArrayList;

import animal.Animal;
import animal.PetAnimals;
import staff.ClinicStaff;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class ListAnimals {

	/*
	 * Method that receives a PetAnimal ArrayList (Superclass of animals) as a
	 * parameter, it lists all the animals in the array
	 */
	public void listanimals(ArrayList<PetAnimals> animals) {
		System.out.println("");
		System.out.println("\n\n--  --  --  --  --  --  --  --\nTHE ANIMALS IN THE CLINIC ARE:\n");

		// For loop used to access each element of the array
		for (PetAnimals an : animals) {
			// Prints information of every element
			System.out.println("\nType of Animal: " + getSimpleAnimalName(an) + "\nName: " + an.getName() + "\nAge: "
					+ an.getAge() + "\nCondition: " + an.getMedCondition() + "\n\n------");
		}

	}

	/*
	 * Method used to list the animals according to the type choosen by the user. It
	 * receives a PetAnimal ArrayList (Superclass of animals) as a parameter and an
	 * integer (user choice)
	 */
	public void listanimalsByType(ArrayList<PetAnimals> animals, int userChoice) {

		String type = null; // Variable used to compare the input with the subclass of each element

		// Switch case based on the user input just to print the title
		switch (userChoice) {
		case 1:
			type = "Dogs";
			break;
		case 2:
			type = "Cats";
			break;
		case 3:
			type = "Rabbits";
			break;
		case 4:
			type = "Mouses";
			break;
		case 5:
			type = "Horses";
			break;
		case 6:
			type = "Lizards";
			break;
		case 7:
			type = "Snakes";
			break;
		case 8:
			type = "Fishes";
			break;
		case 9:
			type = "Parrots";
			break;

		}

		// Printing the title based on the user input
		System.out.println("\n\n----------------------------");
		System.out.println("THE " + type.toUpperCase() + " IN THE CLINC ARE:\n");

		// For loop used to access each element of the array
		for (PetAnimals an : animals) {

			// If userchoice is # and the instanceof Animal.Any then it prints the
			// information base on those conditions for the 9 types of animals
			if (userChoice == 1 && an instanceof Animal.Dog) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 2 && an instanceof Animal.Cat) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 3 && an instanceof Animal.Rabbit) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 4 && an instanceof Animal.Mouse) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 5 && an instanceof Animal.Horse) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 6 && an instanceof Animal.Lizard) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 7 && an instanceof Animal.Sneak) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 8 && an instanceof Animal.Fish) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			} else if (userChoice == 9 && an instanceof Animal.Parrot) {
				System.out.println("\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: "
						+ an.getMedCondition() + "\n\n------");
			}

		}

	}

	// Method used to search an Animal by receiving ArrayList and name as
	// parameters
	public void listAnimalsByName(ArrayList<PetAnimals> animals, String name) {

		String animalClass = null; // Variable used to store Animal class of the element , e.g. "Parrot"

		System.out.print("\nAnimals with the name '" + name + "' are:\n");

		// For loop used to access each element of the array
		for (PetAnimals an : animals) {

			// If statement that compares the name of the animal with the name typed in by
			// the user before the method was called
			if (an.getName().toLowerCase().equals(name.toLowerCase())) {

				/*
				 * The variable stores the result for calling the method that retrieves the name
				 * of the class of the element - Line 152
				 */
				animalClass = getSimpleAnimalName(an);

				// Result printed out
				System.out.println("\nName: " + an.getName() + "\nCondition: " + an.getMedCondition()
						+ "\nAnimal Type: " + animalClass + "\n\n------\n");
			}
		}

		/*
		 * In case the if statements above does not find a match animalClass will store
		 * nothing, then the message is displayed
		 */
		if (animalClass == null) {
			System.out.println("\nThe are no animals with that name");
		}

	}

	// Method that receives an element of the parent class PetAnimals and retrieves
	// the information of the type of the element's class as a String
	public String getSimpleAnimalName(PetAnimals animal) {

		String animalName;
		// Method that gets the name of the class as a string
		animalName = animal.getClass().getSimpleName();

		// Returns the name of the class as a String
		return animalName;

	}
}
