package synchonizatin;

public class Table {

	public   void table (int t) {
		synchronized (this) {
		for(int i=0;i<=5;i++) {
			System.out.println(t*i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
}
