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

			return name + " " + age + " " + medCondition;
		}

	}

	public class Cat extends Animal {

		public Cat(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}

	}

	public class Dog extends PetAnimals {

		public Dog(String name, int age, String medCondition) {
			super(name, age, medCondition);
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}

	}

	public class Mouse extends PetAnimals {

		public Mouse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}
	}

	public class Horse extends PetAnimals {

		public Horse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}

	}

	public class Lizard extends PetAnimals {

		public Lizard(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}
	}

	public class Sneak extends PetAnimals {

		public Sneak(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}

	}

	public class Parrot extends PetAnimals {

		public Parrot(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}

	}

	public class Fish extends PetAnimals {

		public Fish(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return name + " " + age + " " + medCondition;
		}

	}

}
