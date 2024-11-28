package exceptionHandling.interruptedException;

public class InterruptedExceptionExample {
	 public static void main(String[] args) {
		 System.out.println("Main Starts");
		 
		 try {
			 Thread.sleep(3000);
		 }catch(InterruptedException I) {
			// System.out.println("3 sec waited");
		 }
		 
		 System.out.println("Main Ends");
		 
	 }

}
