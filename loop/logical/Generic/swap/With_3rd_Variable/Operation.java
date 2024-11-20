package logical.Generic.swap.With_3rd_Variable;

public class Operation {
	public void Swap(int a, int b) {
		
        // Display the values of 'a' and 'b' before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Use a temporary variable 'temp' to hold the value of 'a'
        int temp = a;

        // Assign the value of 'b' to 'a'
        a = b;

        // Assign the value stored in 'temp' (original value of 'a') to 'b'
        b = temp;

        // Display the values of 'a' and 'b' after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}

}
