package logical.Loop.While.Sum_of_Given_Number;

public class Operation {
    public void SumOfGivenNumber(int num) {
        int sum = 0; // Initialize sum to 0
        while (num != 0) { // Loop until num becomes 0
            int dig = num % 10; // Extract the last digit of num
            sum = sum + dig; // Add the digit to sum
            num = num / 10; // Remove the last digit from num
        }
        System.out.println(sum); // Print the sum of digits
    }
}
