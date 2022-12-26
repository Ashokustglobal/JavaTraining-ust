package streams;

public class Employee {
     
	private int ustId;
	private String name;
	private String locatin;
	private String salary;
	
	
	
	public Employee(int ustId, String name, String locatin, String salary) {
	//	super();
		this.ustId = ustId;
		this.name = name;
		this.locatin = locatin;
		this.salary = salary;
	}
	public int getUstId() {
		return ustId;
	}
	public void setUstId(int ustId) {
		this.ustId = ustId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocatin() {
		return locatin;
	}
	public void setLocatin(String locatin) {
		this.locatin = locatin;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ustId=" + ustId + ", name=" + name + ", locatin=" + locatin + ", salary=" + salary + "]";
	}
	
	
	
}
