package animal;


public abstract class PetAnimals {

	protected String name;
	protected int age;
	protected String medCondition;
	protected String type;
	private PetAnimals next;
	


	public PetAnimals(String name, int age, String medCondition, String type) {
		super();
		this.name = name;
		this.age = age;
		this.medCondition = medCondition;
		this.type=type;
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
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	public PetAnimals getNext() {
		return next;
	}



	public void setNext(PetAnimals next) {
		this.next = next;
	}
}