package logical.Loop.For.Product_Of_givenNumber;

public class Operation {
	    public void ProductOfGivenNumber(int num) {
	        // Initialize product as 1 because the factorial of a number is the product of numbers starting from 1
	        int product = 1;

	        // Loop to multiply numbers from 1 to the given number 'num'
	        for (int i = 1; i <= num; i++) {
	            product = product * i; // Multiply the current product by 'i'
	        }
	        System.out.println("The product of " + num + " is: " + product);
	    }
}
