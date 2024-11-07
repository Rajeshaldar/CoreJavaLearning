package betweenClass.Type1.AreaOfCircle;

public class Operation {
	void Circle2() {
		float pi = 3.142f;
		float radius = 5.32f;
		float result = pi*radius*radius;
		System.out.println("The area of circle 1 is "+result);
	}
	void Circle1() {
		float pi = 3.142f;
		float radius = 12.32f;
		float result = pi*radius*radius;
		System.out.println("The area of circle 2 is "+result);
	}
	public static void Calculator(Operation O) {
		O.Circle2();
		O.Circle1();
	}

}
