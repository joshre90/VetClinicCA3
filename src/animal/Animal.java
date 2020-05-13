package animal;

public class Animal extends PetAnimals{
	


	//Constructor
	public Animal(String name, int age, String medCondition) {
		super(name, age, medCondition);
		// TODO Auto-generated constructor stub
	}



	public class rabbit extends PetAnimals{

		public rabbit(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			
			return "rabbit: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
	
	public class cat extends Animal{

		public cat(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Cat: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
	
	public class dog extends PetAnimals{

		public dog(String name, int age, String medCondition) {
			super(name, age, medCondition);
		}
		
		@Override
		public String toString() {
			
			return "Dog: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
	
	
	public class mouse extends PetAnimals{

		public mouse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "mouse: " + name + " " + age + " " + medCondition;
		}
	}
	
	
	
	
	
	public class horse extends PetAnimals{

		public horse(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "hamster: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
	
	public class lizzard extends PetAnimals{

		public lizzard(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "lizzard: " + name + " " + age + " " + medCondition;
		}
	}
	
	
	
	//Real class name is sneak, but memes had to made me change it
	public class snek extends PetAnimals{

		public snek(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Snek: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
	
	public class parrot extends PetAnimals{

		public parrot (String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Parrot: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
	
	public class fish extends PetAnimals{

		public fish(String name, int age, String medCondition) {
			super(name, age, medCondition);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			
			return "Fish: " + name + " " + age + " " + medCondition;
		}
		
	}
	
	
}
