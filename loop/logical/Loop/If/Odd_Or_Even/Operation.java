package logical.Loop.If.Odd_Or_Even;

public class Operation {
    // Method to check if a given number is odd or even
    public void OddEven(int num) {
        // Check if the number is odd using the modulus operator
        
    	// A number is odd if the remainder when divided by 2 is 1
        if (num % 2 == 1) {
            // Print that the number is odd
            System.out.println(num + " is an odd number");
        } 
        else {
            // If the number is not odd
            System.out.println(num + " is an even number");
        }
			
		}
}
