package staff;

import java.util.Random;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

public class AdminTaskGenerator {

	// Array with all the tasks stored (17)
	String[] tasks = { "Making copies", "Preparing coffee", "Taking Calls", "Sending Fax", "Sending E-mail",
			"Attending a meeting", "Writting a report", "Coordinating activities", "Supplying inventory",
			"Setting up a computer", "Speaking to a customer", "Booking an event", "Cleaning desk", "Having lunch",
			"On holidays", "Absent for today", "Using toilet", };

	public AdminTaskGenerator() {

	}

	/*
	 * Code taken from Ken Healy College Scenario code, Week 27 Apr - 3 May
	 */
	public String getRandomData() {

		// return a random task
		Random r = new Random();

		// pick a task
		String name = tasks[r.nextInt(tasks.length)];

		// Returns a task as a String
		return name;

	}
}
