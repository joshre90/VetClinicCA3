import java.util.ArrayList;

import animal.Animal;
import animal.PetAnimals;
import staff.ClinicStaff;

public class ListAnimals {


	public void listanimals(ArrayList<PetAnimals> animals) {
		System.out.println("");


		for (PetAnimals an : animals) {

				System.out.println("------\n" + "\nType of Animal: "+ getSimpleAnimalName(an) + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
		}

	}

	public void listanimalsByType(ArrayList<PetAnimals> animals, int userChoice) {
		String type = null;
		
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
		System.out.println("\nTHE " + type.toUpperCase() + "S IN THE CLINC ARE:\n");

		for (PetAnimals an : animals) {

			if(userChoice == 1 && an instanceof Animal.dog) {
			System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
			}
			else if(userChoice == 2 && an instanceof Animal.cat) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 3 && an instanceof Animal.rabbit) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 4 && an instanceof Animal.mouse) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 5 && an instanceof Animal.horse) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 6 && an instanceof Animal.lizzard) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 7 && an instanceof Animal.snek) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 8 && an instanceof Animal.fish) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}
			else if(userChoice == 9 && an instanceof Animal.parrot) {
				System.out.println("------\n" + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nCondition: " + an.getMedCondition() + "\n");
				}

			}

	}
	
	public void listAnimalsByName(ArrayList<PetAnimals> animals, String name) {
		for (PetAnimals an : animals) {
			if (an.getName().toLowerCase().equals(name.toLowerCase()) ) {
				System.out.println("------\n" + "\nName: " + an.getName() +"\nCondition: "+ an.getMedCondition() + "\nAnimal Type: " + getSimpleAnimalName(an) + "\n");
			}
		}
		
	}

	public String getSimpleAnimalName(PetAnimals animal) {
		String animalName;
		animalName =animal.getClass().getSimpleName();
		//Code taken from https://stackoverflow.com/questions/4886091/insert-space-after-capital-letter
		animalName = animalName.replaceAll("(\\p{Ll})(\\p{Lu})","$1 $2");
		
		return animalName;
		
	}
}
