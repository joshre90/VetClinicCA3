package staff;

public class Admin extends ClinicStaff {

	public Admin(String firstName, String surname, int staffID, int salary, String task) {
		super(firstName, surname, staffID, salary, task);
		// TODO Auto-generated constructor stub
	}

	public class Manager extends ClinicStaff {

		public Manager(String firstName, String surname, int staffID, int salary, String task) {
			super(firstName, surname, staffID, salary, task);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}

	}

	public class Assistant extends ClinicStaff {

		public Assistant(String firstName, String surname, int staffID, int salary, String task) {
			super(firstName, surname, staffID, salary, task);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}

	}

	public class Receptionist extends ClinicStaff {

		public Receptionist(String firstName, String surname, int staffID, int salary, String task) {
			super(firstName, surname, staffID, salary, task);
			// TODO Auto-generated constructor stub

		}

		@Override
		public String toString() {
			return firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}

	}

	public class CustomerServiceRep extends ClinicStaff {

		public CustomerServiceRep(String firstName, String surname, int staffID, int salary, String task) {
			super(firstName, surname, staffID, salary, task);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}

	}

	public class TechnicalSupport extends ClinicStaff {

		public TechnicalSupport(String firstName, String surname, int staffID, int salary, String task) {
			super(firstName, surname, staffID, salary, task);
			// TODO Auto-generated constructor stub

		}

		@Override
		public String toString() {
			return firstName + " " + surname + " " + staffID + " " + salary + " " + task;
		}

	}

	//// Method that generates the number ID
	public int generateStaffID(int i) {
		int staffID = 2000; // ID for medical staff starts in 2000
		staffID += i;
		return staffID;
	}

}