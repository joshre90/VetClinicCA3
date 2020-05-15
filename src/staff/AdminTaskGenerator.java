package staff;

import java.util.Random;

public class AdminTaskGenerator {


	String[] tasks = {"Making copies" , "Preparing coffee", "Taking Calls" , "Sending Fax", "Sending E-mail", "Attending a meeting", "Writting a report", "Coordinating activities", "Suplying inventory", "Setting up a computer", "Speaking to a customer" , "Booking an event", "Cleaning desk", "Having lunch", "On holidays", "Absent for today" , "Using toilet"};
	
	public AdminTaskGenerator(){
		
	}
	
    public String getRandomData() {
		//return a random task
		
		Random r = new Random();
		
		//pick a task
		String name = tasks[r.nextInt(tasks.length)];
		return name;
	
}
}
