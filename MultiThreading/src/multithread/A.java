package multithread;

public class A extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <9; i++) {
			System.out.println("Child Thread");
		}

	}
	
}
