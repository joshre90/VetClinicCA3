package staff;

import java.util.Random;

public class StaffDataGenerator {


	private String[] firstNames = { "Bruce","Alan", "Richard", "Victoria", "Vivian", "Joe", "Diana", "Santiago", "John", "Ivan", "Robert","Lucy","Rebecca", "Maria", "Diana" }; //14
    private String[] surnames= { "Lee","Dillinger", "Smith", "Gonzalez", "O'Keefe", "Hernandez", "Lopez", "Byrne", "Ivern", "Scalci", "Scott","Halpert", "Beesly" };//12
    private int salary = 6;
    
    public StaffDataGenerator() {
    	
    }
    
    public String getRandomData() {
		//return a random name
		
		Random r = new Random();
		
		//pick a name, condition and age based on length of arrays
		String name = firstNames[r.nextInt(firstNames.length)];
		String surname = surnames[r.nextInt(surnames.length)];
		int salaryBand = generateSalary(r.nextInt(salary));
		
		return ( name + " " + surname + " " + salaryBand);
		
	}

    public int generateSalary(int salaryBand) {
    	if (salaryBand<=1) {
    		salaryBand=40000;
			}
		else if (salaryBand==2) {
			salaryBand=36000;
			}
		else if (salaryBand==3) {
			salaryBand=32000;
			}
		else if (salaryBand==4) {
			salaryBand=28000;
			}
		else {
			salaryBand=24000;
		}
    	
    	
    	return salaryBand;
    	
    }

	
}