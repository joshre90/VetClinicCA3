package animal;

import java.util.ArrayList;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class AnimalList {

	// protected String animalData;
	protected String name;
	protected String condition;
	protected int age;

	// Number of animals to be generated, it has been calculated based on
	// information of averages visits to the veterinary.
	// Dog (from 65% to 45%) and cat (from 30% to 20%) percentages had been reduce
	// to leave space to other animals in the list
	private int numOfAnimals = 100; // Number of animals to be created
	private int numDogs = (int) (numOfAnimals * 0.45); // 45% of animals are dogs
	private int numCats = (int) (numOfAnimals * 0.20); // 20% cats
	private int numRabbits = (int) (numOfAnimals * .05);// 5% each
	private int numMouse = (int) (numOfAnimals * .05);
	private int numHorse = (int) (numOfAnimals * .05);
	private int numSneak = (int) (numOfAnimals * .05);
	private int numLizzard = (int) (numOfAnimals * .05);
	private int numFish = (int) (numOfAnimals * .05);
	private int numParrot = numOfAnimals - numDogs - numCats - numRabbits - numMouse - numHorse - numSneak - numLizzard
			- numFish; // In case percentages are rounded, number of parrots is the remaining from all
						// animals

	// Instance used to generate each animal
	Animal an = new Animal(name, age, condition);

	// Instance used to generate random information for each animal
	AnimalDataGenerator adg = new AnimalDataGenerator();

	// Instances of the inner classes of the class Animal
	Animal.Dog dog;
	Animal.Cat cat;
	Animal.Rabbit rabbit;
	Animal.Lizard lizzard;
	Animal.Mouse mouse;
	Animal.Fish fish;
	Animal.Horse horse;
	Animal.Sneak snek;
	Animal.Parrot parrot;

	// Method that generates the animals, takes an ArrayList of animals as a
	// parameter
	public ArrayList<PetAnimals> generateAnimals(ArrayList<PetAnimals> animals) {

		// Each for loop uses the same principle and structure, only dog loop is
		// explained

		/// Loop to generate dogs
		for (int i = 0; i < numDogs; i++) { // It will create the amount of dogs calculated above - Line 21
			String animalData = adg.getRandomData(); // String that generates random data - Class AnimalDataGenerator -
														// package animal - Line 9
			String[] animalParts = animalData.split(" "); // Splits the string into a Array elements
			dog = an.new Dog(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]); // Assigns the
																								// information to the
																								// instance created
			animals.add(dog); // Adds instance to Superclass ArrayList
		}

		/// Loop to generate cats
		for (int i = 0; i < numCats; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			cat = an.new Cat(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(cat);
		}

		/// Loop to generate rabbits
		for (int i = 0; i < numRabbits; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			rabbit = an.new Rabbit(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(rabbit);
		}

		/// Loop to generate mouses
		for (int i = 0; i < numMouse; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			mouse = an.new Mouse(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(mouse);
		}

		/// Loop to generate horse
		for (int i = 0; i < numHorse; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			horse = an.new Horse(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(horse);
		}

		/// Loop to generate lizard
		for (int i = 0; i < numLizzard; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			lizzard = an.new Lizard(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(lizzard);
		}

		/// Loop to generate sneaks
		for (int i = 0; i < numSneak; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			snek = an.new Sneak(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(snek);
		}

		/// Loop to generate fish
		for (int i = 0; i < numFish; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			fish = an.new Fish(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(fish);
		}

		/// Loop to generate parrot
		for (int i = 0; i < numParrot; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			parrot = an.new Parrot(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(parrot);
		}

		// Returns the ArrayList already filled with animals
		return animals;

	}

}