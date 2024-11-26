package logical.productOfNaturalNumber;

public class NaturalNumber {
	public void Calculator(int num) {
		int product=1;
		for(int i=1; i<=num; i++) {
			product = product*i;
		}
		System.out.println("Product of "+num+" is "+product);
	}

}
