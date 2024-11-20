package logical.Loop.While.Count_Of_Given_Number;

public class Operation {
	public void CountDigit(int num) {
		int count = 0; // Initialize count to 0
		
		while(num!=0) {
            count++; // Increment count for each digit
            num = num / 10; // Remove the last digit from num
		}
		System.out.println("Total digit of given number is "+ count);
	}

}
