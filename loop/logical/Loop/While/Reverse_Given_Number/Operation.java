package logical.Loop.While.Reverse_Given_Number;

public class Operation {
	public void LastDigit(int num) {
		
        // Loop until num becomes 0
        while (num != 0) {
            int dig = num % 10; // Extract the last digit of num

            System.out.print(dig); // Print the last digit
            num = num / 10; // Remove the last digit from num
        }
	}
}