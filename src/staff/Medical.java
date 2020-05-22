package staff;

/**
 * @author Joshua Reyes - Student ID 2019364 - HDIP Sept 2019
 */

//Sub class of ClinicStaff, it is composed of inner classes that are also subclasses of ClinicStaff
public class Medical extends ClinicStaff {

	public Medical(String firstName, String surname, int staffID, int salary) {
		super(firstName, surname, staffID, salary);
		// TODO Auto-generated constructor stub
	}

	public class Veterinarian extends ClinicStaff {

		public Veterinarian(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return firstName + " " + surname + " " + staffID + " " + salary;
		}

	}

	public class TraineeVet extends ClinicStaff {

		public TraineeVet(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return firstName + " " + surname + " " + staffID + " " + salary;
		}

	}

	public class Nurse extends ClinicStaff {

		public Nurse(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return firstName + " " + surname + " " + staffID + " " + salary;
		}

	}

	public class VeterinarianAssistant extends ClinicStaff {

		public VeterinarianAssistant(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return firstName + " " + surname + " " + staffID + " " + salary;
		}

	}

	public class PetHairStylist extends ClinicStaff {

		public PetHairStylist(String firstName, String surname, int staffID, int salary) {
			super(firstName, surname, staffID, salary);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {

			return firstName + " " + surname + " " + staffID + " " + salary;
		}

	}

}