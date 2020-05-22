package animal;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

//Sub class of PetAnimals, it is composed of inner classes that are also subclasses of PetAnimals
public class Animal extends PetAnimals {

	// Constructor
	public Animal(String name, int age, String medCondition) {
		super(name, age, medCondition);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Inner Animal classes
	 */
	public class Rabbit extends PetAnimals {

		public Rabbit(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Rabbit" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

	public class Cat extends Animal {

		public Cat(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Cat" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

	public class Dog extends PetAnimals {

		public Dog(String name, int age, String medCondition) {
			super(name, age, medCondition);
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Dog" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

	public class Mouse extends PetAnimals {

		public Mouse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Mouse" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}
	}

	public class Horse extends PetAnimals {

		public Horse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Horse" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

	public class Lizard extends PetAnimals {

		public Lizard(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Lizard" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}
	}

	public class Sneak extends PetAnimals {

		public Sneak(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Sneak" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

	public class Parrot extends PetAnimals {

		public Parrot(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Parrot" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

	public class Fish extends PetAnimals {

		public Fish(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Name: " + name + "\nType: Fish" + "\nAge: " + age + "\nMedical Condition: " + medCondition;
		}

	}

}
