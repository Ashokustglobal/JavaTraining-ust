package Employee;

public class Employee1 {

	
	  String employeeId;
	  String empName;
	  String empSalary;
	  String empLocation;
	
public void display() {
		System.out.println("Ashok");
	}
	
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empLocation=" + empLocation + "]";
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	


	
	
	
}
