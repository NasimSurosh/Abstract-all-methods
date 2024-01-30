package secondAssignment;

 class Patient {
	private String patientId;
	private String patientName;
	private String dateOfBirth;
	
	
	public String getPatientId() {
		return patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public Patient(String patientId, String patientName, String dateOfBirth) {
		this.patientId=patientId;
		this.patientName = patientName;
		this.dateOfBirth = dateOfBirth;
}
	public void displayPatient() {
		System.out.println("Patient id is: "+ patientId);
		System.out.println("Patient Name is: " + patientName);
		System.out.println("Patient date of birth is: " + dateOfBirth);
	}


	
}