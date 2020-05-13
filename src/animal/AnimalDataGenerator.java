package animal;

import java.util.Random;

public class AnimalDataGenerator {

	 	private String[] names = { "Chico", "Bambi", "Guido", "Mimi", "Black", "White", "Suzy", "Willy", "Suzy", "Hopper","Marble","Fluffy", "Rex", "Tido" }; //14
	    private String[] conditions = { "Arthritis", "Cancer", "Dental Disease", "Diabetes", "Distemper", "Ear Mites", "Epilepsy", "Bloat", "Worm", "Rabies","Parvovirus", "Acne" };//12
	    private int ages = 20;
	    
	    public AnimalDataGenerator() {
	    	
	    }
	    
	    public String getRandomData() {
			//return a random name
			
			Random r = new Random();
			
			//pick a name, condition and age based on length of arrays
			String name = names[r.nextInt(names.length)];
			String condition = conditions[r.nextInt(conditions.length)];
			int age = r.nextInt(ages);
			
			return ( name + " " + age + " " + condition);
			
		}

	
	
}
