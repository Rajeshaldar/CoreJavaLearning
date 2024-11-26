package logical.sumOfNaturalNumber;

public class NaturalNumber {
	public void Calculator(int num) {
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of "+num+" is "+sum);
	}
}
