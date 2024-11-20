package logical.Generic.swap.WithOut_3rd_Variable;

public class Operation {
    public void Swap(int a, int b) {
        // Display the values of 'a' and 'b' before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values of 'a' and 'b' using arithmetic operations
        a = a + b; // Now 'a' holds the sum of both numbers
        b = a - b; // Subtracting 'b' from the sum gives the original value of 'a'
        a = a - b; // Subtracting the new 'b' from the sum gives the original value of 'b'

        // Display the values of 'a' and 'b' after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
