package synchonizatin;

public class MyThread extends Thread{

	Table n;
	MyThread(Table n){
		this.n=n;
	}
	
	public void run() {
		n.table(5);
	}
}
