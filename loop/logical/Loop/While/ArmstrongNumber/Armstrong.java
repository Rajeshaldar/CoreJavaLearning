package logical.Loop.While.ArmstrongNumber;

public class Armstrong {
    public int CountDig(int n) {
        int count = 0; // Initialize the digit count to 0
        
        // Loop until the number becomes 0
        while (n != 0) {
            count++; // Increment the count for each digit
            n = n / 10; // Remove the last digit from the number
        }
        return count; // Return the total count of digits
    }

    // Method to check if a given number is an Armstrong number
    public void checkArmstrong(int n) {
        int temp = n; // Store the original number for comparison
        int count = CountDig(n); // Get the number of digits in the number
        int sum = 0; // Initialize the sum to 0
        
        // Loop until the number becomes 0
        while (n != 0) {
            int lastDig = n % 10; // Extract the last digit of the number
            sum = sum + (int)(Math.pow(lastDig, count)); // Add the power of the digit to the sum
            n = n / 10; // Remove the last digit from the number
        }
        
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number"); 
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}