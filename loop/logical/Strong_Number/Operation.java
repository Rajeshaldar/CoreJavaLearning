package logical.Strong_Number;

public class Operation {
	public void StrongNummber(int num) {
		int copy = num;
		int sum=0;
		
		while(num!=0) {
			int rem = num%10;
			int fact=1;
			
			for(int i = rem; i>=1; i--) {
				fact = fact*i;
			}
			sum = sum+fact;
			num=num/10;
		}
		if(sum==copy) {
			System.out.println(copy + " is a Strong number");
		}
		else {
			System.out.println(copy + " is not a Strong number");
		}
	}
}
