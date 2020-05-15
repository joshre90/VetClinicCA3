import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import staff.AdminStaffList;
import staff.ClinicStaff;
import staff.MedicalStaffList;

public class Helper {

	//ArrayList of the Abstract (Parent) class used to store the medical and admin staff
	ArrayList<ClinicStaff> medicalStaff = new ArrayList<ClinicStaff>();
	ArrayList<ClinicStaff> adminStaff = new ArrayList<ClinicStaff>();
	
	//Instances
	MedicalStaffList msl = new MedicalStaffList();
	AdminStaffList asl = new AdminStaffList();
	ListStaff ls = new ListStaff();


	public void execute() {
		
		this.medicalStaff = msl.generateMedicalStaff();
		this.adminStaff = asl.generateAdminStaff();
		
		
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		boolean valid=false;//boolean flag
		int userInput=0;
		
		System.out.println("*******************************************************");
		System.out.println("**      WELCOME TO THE VETERINARY CLINIC SYSTEM      **");
		System.out.println("*******************************************************\n");
		
		
		

			//Validator
			do {
				System.out.println("--- Please Select the number for the task you would like to perform --- \n");
				System.out.println("1 - List All Staff\n2 - List All Staff By Selecting Category\n3 - Search for a staff member by name\n4 - List all animals\n5 - List all animals by type \n6 - Search for an animal by their name \n");
				System.out.print("*Please select an option from the list above: ");
				try {
					userInput=Integer.parseInt(myReader.readLine());
					if (0<= userInput && userInput <=6) {
						switch (userInput) {
						//Exit program
						case 0:
							System.out.println("See you soon. Thank you!");
							valid= true;
							break;
						//List all Staff
						case 1:
							ls.listnames(medicalStaff);
							ls.listnames(adminStaff);
							System.out.println("one");
							valid = false;
							break;
						//List All Staff By Selecting Category
						case 2:
							int choice;
							boolean flag=false;
							
							System.out.print("\nSelect a category which you want to list the staff from: ");
							System.out.print("\n+++ Medical Staff +++\n");
							System.out.print("1 - Veterinarian \n2 - Trainee Veterinarian \n3 - Nurse \n4 - Assistant Veterinarian \n5 - Pet Hair Stylist\n\n");
							System.out.print("+++ Administrative Staff +++\n");
							System.out.print("6 - Manager \n7 - Assistant \n8 - Receptionist \n9 - Customer Service Representative \n10 - IT Support Representative \n\n");
							
							//Validator for the sub-menu
							do {
								try {
									choice = Integer.parseInt(myReader.readLine());
									if (0<choice && choice<=5) {
										ls.listStaffByTitle(medicalStaff,choice);
										flag=true;
									}else if(choice>5 && choice <=10){
										ls.listStaffByTitle(adminStaff,choice);
										flag=true;
									}
									else{
										System.out.println("Invalid input. PLease select a number between 1 and 10");
										flag=false;
									}
								}catch(Exception e){
									flag=false;
									System.out.println("ERROR! You did not enter a number between 1 and 6!");
								}
							}while (!flag);
							
							valid = false;
							break;
						//Search for Staff By Name
						case 3:
							System.out.println("three");
							valid = false;
							break;
						//List All Animals
						case 4:
							System.out.println("four");
							valid = false;
							break;
						//List Animals By Type
						case 5:
							System.out.println("five");
							valid = false;
							break;
						//Search For Animals By Name
						case 6:
							System.out.println("six");
							valid = false;
							break;
						//(Redundant) In case there is an invalid input
						default :
							System.out.println("Invalid input");
							valid = false;
							break;
						}
					}
						else {
							System.out.println("Invalid input. PLease select a number between 0 and 6");
							valid = false;
						}
					
				} catch(Exception e){
					valid=false;
					System.out.println("ERROR! You did not enter a number between 1 and 6!");
				}
				
			} while (!valid);
		
		
		
		
		/// Loop that prints out each element of the medicalStaff ArrayList

		
		for (ClinicStaff as : adminStaff) {
			System.out.println(as);
		}
	}

}
