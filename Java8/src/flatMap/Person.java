package flatMap;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private String emil;
	private List<String> phoneNumber;
	 
	public Person(){
		
	}

	
	
	public Person(int id, String name, String emil, List<String> phoneNumber) {
		//super();
		this.id = id;
		this.name = name;
		this.emil = emil;
		this.phoneNumber = phoneNumber;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emil=" + emil + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
