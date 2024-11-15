package polymorphisam.Runtime.Amazon;

public class Main {
	public static void main(String[] args) {
		Movie M = new Movie();
		WebSeries W = new WebSeries();
		Cricket C = new Cricket();
		
		SPC.SinglePointOfContact(M);
		SPC.SinglePointOfContact(W);
		SPC.SinglePointOfContact(C);
	}

}
