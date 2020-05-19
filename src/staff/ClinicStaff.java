package staff;

public abstract class ClinicStaff {

	protected String firstName;
	protected String surname;
	protected final int staffID;
	protected int salary;
	protected String task;

	public ClinicStaff(String firstName, String surname, int staffID, int salary) {

		this.firstName = firstName;
		this.surname = surname;
		this.staffID = staffID;
		this.salary = salary;

	}

	public ClinicStaff(String firstName, String surname, int staffID, int salary, String task) {

		this.firstName = firstName;
		this.surname = surname;
		this.staffID = staffID;
		this.salary = salary;
		this.task = task;
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

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}