package task2;

public class Employee {
     
	private int id;
	private String empName;
	private String salary;
	
	
	public Employee(int id, String empName, String salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
