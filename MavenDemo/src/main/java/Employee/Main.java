package Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	 
	
	public static void main(String[] args) {
	
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		 Employee1 em=applicationContext.getBean("emp",Employee1.class);
		
		 em.display();
		 
	}
	
	
}
