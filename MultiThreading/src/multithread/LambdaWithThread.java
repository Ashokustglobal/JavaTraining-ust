package multithread;

public class LambdaWithThread extends Thread{

	 public static void main(String args[]) {
	      // Child thread
	      new Thread(() -> { // Lambda Expression
	         for(int i=1; i <= 5; i++) {
	            System.out.println(" Thread: "+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	      
	      // Main Thead
	      for(int j=1; j < 5; j++) {
	         System.out.println("Main Thread: "+ j);
	         try {
	            Thread.sleep(500);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	
}
}
