package staff;


public abstract class ClinicStaff {
	
	protected String firstName;
	protected String surname;
	protected final int staffID;
	protected int salary;
	protected String title;
	
	

	public ClinicStaff(String firstName, String surname, int staffID, int salary, String title) {

		this.firstName = firstName;
		this.surname = surname;
		this.staffID = staffID;
		this.salary = salary;
		this.title = title;
		
	}
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getStaffID() {
		return staffID;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}




	

}