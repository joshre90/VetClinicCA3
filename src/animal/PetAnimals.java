package animal;


public abstract class PetAnimals {

	protected String name;
	protected int age;
	protected String medCondition;
	private PetAnimals next;
	
	
	
	public PetAnimals getNext() {
		return next;
	}



	public void setNext(PetAnimals next) {
		this.next = next;
	}



	public PetAnimals(String name, int age, String medCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medCondition = medCondition;
	}
}