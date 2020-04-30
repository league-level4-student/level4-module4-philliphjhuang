package _04_hospital;

public class Patient {
	public boolean feelsCaredFor() {
		if(checkPulse()) {
			return true;
		}
		return false;
	}
	public boolean checkPulse() {
		return true;
	}
	
}
