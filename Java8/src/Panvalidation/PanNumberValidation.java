package Panvalidation;

public class PanNumberValidation {
	
	private int personId;
	private String personName;
	private String  panNumber;
	
	public PanNumberValidation() {
		
	}
	
	public PanNumberValidation(int personId, String personName, String panNumber) {
//		super();
		this.personId = personId;
		this.personName = personName;
		this.panNumber = panNumber;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	
 
	
}
