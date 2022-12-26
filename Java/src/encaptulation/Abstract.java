package encaptulation;

public abstract class Abstract {

	private String name;
	private String gender;
	public Abstract(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	 public abstract void work() ;

	@Override
	public String toString() {
		return "Abstract [name=" + name + ", gender=" + gender + "]";
	}
	 
	 
}