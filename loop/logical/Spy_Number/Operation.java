package logical.Spy_Number;

public class Operation {
	public void SpyNumber(int num) {
        int temp = num; // Store the original number for later comparison
        int sum = 0; 
        int product = 1;
        
        // Loop until num becomes 0
        while (num != 0) {
            int lastDigit = num % 10; // Extract the last digit of num
            sum = sum + lastDigit; // Add the last digit to sum
            product = product * lastDigit; // Multiply the last digit to product
            num = num / 10; // Remove the last digit from num
        }
        
        // Print the sum and product of the digits
        System.out.println("Sum of " + temp + " is " + sum);
        System.out.println("Product of " + temp + " is " + product);
        
        // Check if the sum and product of the digits are equal
        if (sum == product) {
			System.out.println("So "+temp + " is a Spy number");
		}
		else {
			System.out.println("So "+temp + " is not a Spy number");
		}
	}
}
