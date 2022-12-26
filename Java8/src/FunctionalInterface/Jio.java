package FunctionalInterface;

public class Jio implements Sim{

	@Override
	public void data() {
		 
		System.out.println("i am using Jio for calling");
	}

	@Override
	public void calling() {
		 
		System.out.println("i am using Jio for data");
	}

}
