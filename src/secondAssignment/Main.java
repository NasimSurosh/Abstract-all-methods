package secondAssignment;

public class Main {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		
		hospital.addDoctor("P123", "Nadim", "stomatolog");
		hospital.addPatient("2345L", "Kamil", "22.10.2010");
		hospital.appointment("2345L", "P123", "23.11.2024", "11:45 PM");
		
		hospital.displayPatient();
		hospital.displayDoctor();
		
		System.out.println("Appointment");
		for (Appointment appointment: hospital.getAppointments()) {
			appointment.displayAppointment();
			System.out.println();
		}
	}

}
