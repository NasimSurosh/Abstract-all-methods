package secondAssignment;

 class Doctor {
	private String doctorId;
	private String doctorName;
	private String specialization;

	public String getDoctorId() {
		return doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}



	
	public Doctor(String doctorId, String doctorName, String specialization ) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	public void displayDoctor() {
		System.out.println("Doctor id is: "+ doctorId);
		System.out.println("Doctor Name is: " + doctorName);
		System.out.println("Doctor date of birth is: " + specialization);
	}

}
