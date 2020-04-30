package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Patient> getPatients(){
		return patients;
	}
}

class GeneralPractitioner extends Doctor {
	public boolean makesHouseCalls() {
		return true;
	}
	public boolean doMedicine() {
		return checkPulse();
	}
}

class Surgeon extends Doctor{
	public boolean performsSurgery() {
		return true;
	}
	public boolean makesHouseCalls() {
		return false;
	}
}
