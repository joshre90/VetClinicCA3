package staff;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

//Sub class of ClinicStaff, it is composed of inner classes that are also subclasses of ClinicStaff
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

}