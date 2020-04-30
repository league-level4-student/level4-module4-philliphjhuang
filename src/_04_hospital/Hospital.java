package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> d = new ArrayList<Doctor>();
	ArrayList<Patient> p = new ArrayList<Patient>();
	
	public void addDoctor(Doctor d) {
		this.d.add(d);
	}
	public ArrayList<Doctor> getDoctors() {
		return d;
	}
	public void addPatient(Patient p) {
		this.p.add(p);
	}
	public ArrayList<Patient> getPatients(){
		return p;
	}
}
