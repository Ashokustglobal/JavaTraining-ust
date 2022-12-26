package ust.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ust.MavenDemo.Employee;
import ust.MavenDemo.Person;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 
		Employee factory=new Employee("r");  
		Employee em1= (Employee) applicationContext.getBean("person");
	      //  em1.experience();
	        em1.show();  
		
	}
}
