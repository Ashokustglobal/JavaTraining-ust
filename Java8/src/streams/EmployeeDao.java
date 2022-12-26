package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDao {
	

	 public List<Employee> getModels() {
		List<Employee>emp=new ArrayList<>();
		emp.add(new Employee(1,"Ashok","Chennai","50000"));
		emp.add(new Employee(1,"Thiru","Chennai","50000"));
		emp.add(new Employee(1,"naveen","Chennai","50000"));
		emp.add(new Employee(1,"Krishna","Chennai","50000"));
		emp.add(new Employee(1,"Jeevan","Bengalur","50000"));
		emp.add(new Employee(1,"RaviTeja","Hyderabad","50000"));
		
//		emp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
//		emp.forEach(System.out::println);
		
		emp.stream().filter(e->e.getLocatin().equalsIgnoreCase("chennai")).map(Employee::getName).forEach(System.out::println);
		return emp;
		
	}
}
