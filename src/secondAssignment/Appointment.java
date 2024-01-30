package secondAssignment;

 class Appointment {
	private Patient patient;
	private Doctor doctor;
	private String date;
	private String time;

	public Appointment(Patient patient, Doctor doctor, String date, String time) {
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
		this.time = time;

	}

	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public void displayAppointment() {
		System.out.println("Patient is :" + patient.getPatientId());
		System.out.println("Doctor is :" + doctor.getDoctorId());
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);
	}

}
