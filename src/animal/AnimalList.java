package animal;

import java.util.ArrayList;

public class AnimalList {

	// protected String animalData;
	protected String name;
	protected String condition;
	protected int age;

	// Number of animals to be generated
	private int numOfAnimals = 100; // (1000) This can change according to user input
	private int numDogs = (int) (numOfAnimals * 0.45);
	private int numCats = (int) (numOfAnimals * 0.20);
	private int numRabbits = (int) (numOfAnimals * .05);
	private int numMouse = (int) (numOfAnimals * .05);
	private int numHorse = (int) (numOfAnimals * .05);
	private int numSneak = (int) (numOfAnimals * .05);
	private int numLizzard = (int) (numOfAnimals * .05);
	private int numFish = (int) (numOfAnimals * .05);
	private int numParrot = numOfAnimals - numDogs - numCats - numRabbits - numMouse - numHorse - numSneak - numLizzard
			- numFish;

	protected ArrayList<PetAnimals> animals = new ArrayList<PetAnimals>();
	Animal an = new Animal(name, age, condition);

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

	//		//Trying to generate random animals
	//		public ArrayList<PetAnimals> generateAnimals2() {
	//			
	//			for (int i = 0; i<= numOfAnimals; i++) {		
	//			}
	//			return animals; 
	//		}

	// Method that generates the animals
	public ArrayList<PetAnimals> generateAnimals() {
		/// Loop to generate dogs
		for (int i = 0; i < numDogs; i++) {
			String animalData = adg.getRandomData();
			String[] animalParts = animalData.split(" ");
			dog = an.new Dog(animalParts[0], Integer.parseInt(animalParts[1]), animalParts[2]);
			animals.add(dog);
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

		//	  for (PetAnimals pa : animals) {
		//		  System.out.println(pa);
		//	  }

		return animals;

	}

}