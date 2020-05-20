package animal;

public class Animal extends PetAnimals {

	
	// Constructor
	public Animal(String name, int age, String medCondition) {
		super(name, age, medCondition);
		// TODO Auto-generated constructor stub
	}

	public class Rabbit extends PetAnimals {

		public Rabbit(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Rabbit" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

	public class Cat extends Animal {

		public Cat(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Cat" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

	public class Dog extends PetAnimals {

		public Dog(String name, int age, String medCondition) {
			super(name, age, medCondition);
		}

		@Override
		public String toString() {

			return "Type: Dog" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

	public class Mouse extends PetAnimals {

		public Mouse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Mouse" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}
	}

	public class Horse extends PetAnimals {

		public Horse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Horse" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

	public class Lizard extends PetAnimals {

		public Lizard(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Lizard" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}
	}

	public class Sneak extends PetAnimals {

		public Sneak(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Sneak" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

	public class Parrot extends PetAnimals {

		public Parrot(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Parrot" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

	public class Fish extends PetAnimals {

		public Fish(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return "Type: Fish" + "\nName: " + name + "\nAge: " + age + "\nMedical Condition: " +  medCondition;
		}

	}

}
