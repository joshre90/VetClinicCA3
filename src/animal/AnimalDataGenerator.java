package animal;

import java.util.Random;

public class AnimalDataGenerator {

	private String[] names = { "Chico", "Bambi", "Guido", "Mimi", "Black", "White", "Suzy", "Willy", "Suzy", "Hopper",
			"Marble", "Fluffy", "Rex", "Tido", "Morris", "Selina", "Nacho", "Sky", "Pepper", "Freddie", "Bono", "Nala",
			"Simba", "Biscuit", "Fiona", "Goofy", "Lexie", "Milo", "Rocko", "Max", "Charlie", "Spark", "Roxie", "Duke",
			"Buster", "Splinter", "Lola", "Buddy", "Rocky", "Jake", "Daisy", "Cece", "Lucky", "Bella", "Solovino",
			"Molly", "Maggie", "Penny", "Coco", "Sadie", "Zoe", "Sasha", "Angel", "Sheba", "Princess", "Smokey", "Fred",
			"Chloe" };
	
	private String[] conditions = { "Coronavirus", "Arthritis", "Cancer", "Dental_Disease", "Diabetes", "Distemper",
			"Ear_Mites", "Epilepsy", "Bloat", "Worm", "Rabies", "Parvovirus", "Acne", "Bluetongue", "Diahorrea",
			"Ticks", "Cholera", "Lumpy_Jaw", "Hendra", "Pestivirus", "Salmonellosis",
			"Encephalopathy", "Tuberculosis", "Strangles", "Nosema", "Tick_Fever", "Warts",
			"Tapeworms", "Tetanus", "Anthrax", "Mastitis", "Ringworm", "Calf_Scour" + "Lumpy_Skin", "Theileriosis",
			"Dermatitis", "Pox" };
	
	private int ages = 16;

	public AnimalDataGenerator() {

	}

	public String getRandomData() {
		// return a random name
		Random r = new Random();

		// pick a name, condition and age based on length of arrays
		String name = names[r.nextInt(names.length)];
		String condition = conditions[r.nextInt(conditions.length)];
		int age = r.nextInt(ages);

		return (name + " " + age + " " + condition);

	}

}
