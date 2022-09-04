package methodoverloading;

public class EmployeeDetails {
	private void empInfo() {
		System.out.println("Employee Details:");
	}
	private void empInfo(String S) {
		System.out.println("Employee Name is "+S);
	}
	private void empInfo(int id) {
		System.out.println("Employee ID is "+id);
	}
	private void empInfo(long mob) {
		System.out.println("Mobile number of the employee is "+mob);
	}
	private void empInfo(String pm, long pc) {
		System.out.println("Primary Email Id of the employee is "+pm);
		System.out.println("Primary contact number of the employee is "+pc);
	}
	private void empInfo(long ac, String am) {
		System.out.println("Alternate contact number of the employee is "+ac);
		System.out.println("Alternate Email Id of the employee is "+am);
	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empInfo();e.empInfo("ABCD");e.empInfo(12345);e.empInfo(9876543210l);
		e.empInfo("AB12@gmail.com", 9876543210l);e.empInfo(1234578901, "CD34@gmail.com");
	}
}
