package staff;

public class Admin extends ClinicStaff{

	public String task;
	
	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}


	public Admin(String firstName, String surname, int staffID, int salary, String title,String task) {
		super(firstName, surname, staffID, salary, title);
		this.task = task;
		// TODO Auto-generated constructor stub
	}


	public class Manager extends ClinicStaff{
		
		private String task;

		public Manager(String firstName, String surname, int staffID, int salary, String title, String task) {
			super(firstName, surname, staffID, salary,title);
			// TODO Auto-generated constructor stub
			this.task=task;
		}
		
		@Override
		public String toString() {
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}
		
	}
	
	
	public class Assistant extends ClinicStaff{
		
		
	private String task;

	public Assistant (String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
			this.task=task;
		}
	
	@Override
	public String toString() {
		return title + ": " + firstName + " " + surname + " " + staffID + " " + salary + " " + task;
	}

	}
	
	
	public class Receptionist extends ClinicStaff{

		private String task;

		public Receptionist(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
			this.task=task;
		}
		
		@Override
		public String toString() {
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}
		
	}
	
	
	public class CustomerService extends ClinicStaff{

		private String task;

		public CustomerService(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
			this.task=task;
		}
		
		@Override
		public String toString() {
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}
		
	}
	
	public class ITSupport extends ClinicStaff{

		private String task;

		public ITSupport(String firstName, String surname, int staffID, int salary, String title) {
			super(firstName, surname, staffID, salary, title);
			// TODO Auto-generated constructor stub
			this.task=task;
		}
		
		@Override
		public String toString() {
			return title + ": " + firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}
		
	}
	
	
////Method that generates the number ID
	public int generateStaffID (int i) {
		int staffID = 2000; //ID for medical staff starts in 2000
		staffID +=i;
		return staffID;
	}
	
}