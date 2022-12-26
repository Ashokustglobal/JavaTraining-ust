package FunctionalInterface;

public class Airtel implements Sim{

	@Override
	public void data() {
		 
		System.out.println("i am using Airtel for calling");
	}

	@Override
	public void calling() {
		System.out.println("i am using Airtel for data");
		
	}

}
