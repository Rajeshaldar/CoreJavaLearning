package logical.Loop.For.PrimeNumber;

//Method to check if a number is prime
public class Operation {
	public void Prime(int num) {
		// Initialize a counter to count how many divisors the number has
		int count=0;
		
        // Loop through numbers from 1 to the given number 'num'
        for (int i = 1; i <= num; i++) {
        	
            // If 'num' is divisible by 'i', increment the count
            if (num % i == 0) {
                count++;
            }
        }
		
        // A prime number has exactly 2 divisors: 1 and itself
        if (count == 2) {
        	
            // Print that the number is prime
            System.out.println(num + " is a prime number");
        } else {
        	
            // If it has more than 2 divisors, print that the number is not prime
            System.out.println(num + " is not a prime number");
        }
	}

}
