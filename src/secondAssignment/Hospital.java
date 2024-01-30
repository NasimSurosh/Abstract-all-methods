package secondAssignment;

import java.util.ArrayList;

public class Hospital {

	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	private ArrayList<Appointment> appointment;

	public boolean addPatient(String patientId, String patientName, String dateOfBirth) {
		for (Patient patient : patients) {
			if (patient.getPatientId().equals(patientId)) {
				return false;
			}
		}
		patients.add(new Patient(patientId, patientName, dateOfBirth));
		return true;
	}

	public boolean addDoctor(String doctorId, String doctorName, String specialization) {
		for (Doctor doctor : doctors) {
			if (doctor.getDoctorId().equals(doctorId)) {
				return false;
			}
		}
		doctors.add(new Doctor(doctorId, doctorName, specialization));
		return true;

	}

	public boolean appointment(String patientId, String doctorId, String date, String time) {
		Patient patient = findPatient(patientId);
		Doctor doctor = findDoctor(doctorId);
		if (patient != null && doctor != null) {
			appointment.add(new Appointment(patient, doctor, date, time));
			return true;
		}
		return false;
	}

	public void displayPatient() {
		System.out.println("Patients");
		for (Patient patient : patients) {
			patient.displayPatient();
			System.out.println();
		}
	}

	public void displayDoctor() {
		System.out.println("Doctors:");
		for (Doctor doctor : doctors) {
			doctor.displayDoctor();
			System.out.println();
		}
	}

	public ArrayList<Appointment> getAppointments() {
		return appointment;
	}

	private Patient findPatient(String patientId) {
		for (Patient patient : patients) {
			if (patient.getPatientId().equals(patientId)) {
				return patient;
			}
		}
		return null; // Patient not found
	}

	private Doctor findDoctor(String doctorId) {
		for (Doctor doctor : doctors) {
			if (doctor.getDoctorId().equals(doctorId)) {
				return doctor;
			}
		}
		return null;
	}
}
