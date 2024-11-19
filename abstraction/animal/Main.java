package animal;

public class Main {
	public static void main(String[] args) {
		Cat C = new Cat();
		Dog D = new Dog();
		Snake S = new Snake();
		
		SPC.SinglePointOfContact(D);
		SPC.SinglePointOfContact(C);
		SPC.SinglePointOfContact(S);
	}
}
