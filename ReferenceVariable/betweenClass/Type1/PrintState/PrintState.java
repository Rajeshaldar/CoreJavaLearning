package betweenClass.Type1.PrintState;

public class PrintState {
	void Print2() {
		System.out.print("Java");
	}
	void Print1() {
		System.out.print("I Love ");
	}
	static void Statement (PrintState O) {
		O.Print1();
		O.Print2();
	}
}
