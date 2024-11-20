package logical.Loop.For.Factorial_Of_givenNumber;

public class Operation {
    public void FactorialOfGivenNumber(int num) {
        // Initialize product as 1 because the factorial of a number is the product of numbers starting from 1
        int fact = 1;

        // Loop to multiply numbers from 1 to the given number 'num'
        for (int i = num; i>=1; i--) {
            fact = fact * i; // Multiply the current product by 'i'
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }

}
