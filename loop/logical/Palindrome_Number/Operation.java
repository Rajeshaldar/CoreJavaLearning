package logical.Palindrome_Number;

public class Operation {
	public void PalindromeNumber( int num) {
        int temp = num; // Store the original number for later comparison
        int rev = 0; // Initialize reverse number to 0
        
        // Loop until num becomes 0
        while (num != 0) {
            int lastDigit = num % 10; // Extract the last digit of num
            rev = (rev * 10) + lastDigit; // Append the last digit to rev
            num = num / 10; // Remove the last digit from num
        }
		if(rev==temp) {
			System.out.println(temp+" is a Palindrome Number");
		}
		else {
			System.out.println(temp+" is not a Palindrome Number");
		}
	}

}
