package withInClass.Type1.PrintState;

public class Main {
	void Print2() {
		System.out.print("Java");
	}
	void Print1() {
		System.out.print("I Love ");
	}
	static void Statement (Main M) {
		M.Print1();
		M.Print2();
	}
	public static void main(String[] agrs) {
		Main M = new Main();
		Statement(M);
	}

}
