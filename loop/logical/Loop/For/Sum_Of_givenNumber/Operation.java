package logical.Loop.For.Sum_Of_givenNumber;

public class Operation {
	public void SumOfGivenNumber(int num) {
		int sum = 0;
		
        // Loop from 1 to the given number
        for (int i = 1; i <= num; i++) {
            sum = sum + i; // Add the current number to sum
        }
        System.out.println(sum); // Print the final sum
	}

}
