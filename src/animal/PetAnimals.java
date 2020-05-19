package animal;

public abstract class PetAnimals {

	protected String name;
	protected int age;
	protected String medCondition;
	private PetAnimals next;

	public PetAnimals(String name, int age, String medCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medCondition = medCondition;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedCondition() {
		return medCondition;
	}

	public void setMedCondition(String medCondition) {
		this.medCondition = medCondition;
	}

	public PetAnimals getNext() {
		return next;
	}

	public void setNext(PetAnimals next) {
		this.next = next;
	}
}