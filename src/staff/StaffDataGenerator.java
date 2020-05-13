package staff;

import java.util.Random;

public class StaffDataGenerator {


	private String[] firstNames = { "Alan", "Richard", "Victoria", "Vivian", "Joe", "Diana", "Santiago", "John", "Ivan", "Robert","Lucy","Rebecca", "Maria", "Diana" }; //14
    private String[] surnames= { "Dillinger", "Smith", "Gonzalez", "O'Keefe", "Hernandez", "Lopez", "Byrne", "Ivern", "Scalci", "Scott","Halpert", "Beesly" };//12
    private int salary = 5;
    
    public StaffDataGenerator() {
    	
    }
    
    public String getRandomData() {
		//return a random name
		
		Random r = new Random();
		
		//pick a name, condition and age based on length of arrays
		String name = firstNames[r.nextInt(firstNames.length)];
		String surname = surnames[r.nextInt(surnames.length)];
		int salaryBand = r.nextInt(salary);
		
		return ( name + " " + surname + " " + salaryBand);
		
	}


	
}