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
		
		System.out.println("--- Please Select the number for the task you would like to perform--- \n");
		System.out.println("1 - List All Staff\n2 - List All Staff By Selecting Category\n3 - Search for a staff member by name\n4 - List all animals\n5 - List all animals by type \n6 - Search for an animal by their name \n");
		

			
			do {
				System.out.print("*Please select an option from the list above: ");
				try {
					userInput=Integer.parseInt(myReader.readLine());
					if (0<= userInput && userInput <=6) {
						switch (userInput) {
						case 0:
							System.out.println("See you soon. Thank you!");
							valid= true;
							break;
						case 1:
							ls.listnames(medicalStaff);
							ls.listnames(adminStaff);
							System.out.println("one");
							valid = false;
							break;
						case 2:
							int choice;
							do {
								System.out.print("*Please select an option for the staff you want to list: ");
								System.out.print("\n+++ Medical Staff +++\n");
								System.out.print("1 - Veterinarian \n2 - Trainee Veterinarian \n3 - Nurse \n4 - Assistant Veterinarian \n5 - Pet Hair Stylist\n\n");
								System.out.print("+++ Administrative Staff +++\n");
								System.out.print("6 - Manager \n7 - Assistant \n8 - Receptionist \n9 - Customer Service Representative \n10 - IT Support Representative \n\n");
								try {
									choice = Integer.parseInt(myReader.readLine());
									if (0<choice && choice<=5) {
										ls.listStaffByTitle(medicalStaff,choice);
										valid=true;
									}else if(choice>5 && choice <13){
										ls.listStaffByTitle(adminStaff,choice);
									}
								}catch(Exception e){
									valid=false;
									System.out.println("ERROR! You did not enter a number between 1 and 6!");
								}
							}while (!valid);
							
							
							System.out.println("two");
							valid = false;
							break;
						case 3:
							System.out.println("three");
							valid = false;
							break;
						case 4:
							System.out.println("four");
							valid = false;
							break;
						case 5:
							System.out.println("five");
							valid = false;
							break;
						case 6:
							System.out.println("six");
							valid = false;
							break;
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
