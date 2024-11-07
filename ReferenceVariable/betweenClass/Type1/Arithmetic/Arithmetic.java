package betweenClass.Type1.Arithmetic;

public class Arithmetic {
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
	static void Calculator(Arithmetic O) {
		O.Sub();
		O.Sum();
	}

}
