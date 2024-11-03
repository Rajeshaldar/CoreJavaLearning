package withInClass.Type1.Arithmetic;

public class Main {
	void Sum() {
		int a = 12;
		int res = a+a;
		System.out.println("Result of addition is "+res);
	}
	void Sub() {
		int a = 120;
		int res = a-a;
		System.out.println("Result of subtraction is "+res);
	}
	static void Calculator(Main M) {
		M.Sub();
		M.Sum();
	}
	public static void main(String[] args) {
		Main M = new Main();
		Calculator(M);
	}

}
