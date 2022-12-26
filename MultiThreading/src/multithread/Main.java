package multithread;

public class Main {

	
	public static void main(String[] args) {
		A myThread = new A();
		Thread th=new Thread(myThread);
		th.start();

		for (int i = 0; i <9; i++) {
			System.out.println("Main Thread");
		}
	}
	
}
