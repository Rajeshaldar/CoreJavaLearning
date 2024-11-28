package exceptionHandling.NestedTryCatchBlock.NullPointerException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String S = null;
        
        // S = "Rajesh";
        System.out.println("Main Starts");
        
        try {
            // Nested try block
            try {
                // This will cause a NullPointerException because S is null
                System.out.println(S.length());
            } catch (NullPointerException NP) {
                // Handling the NullPointerException in the nested try block
                System.out.println("Hi I'm NestedTryCatchBlock");
            }
        } catch (NullPointerException e) {
            // Handling the NullPointerException in the outer try block
            System.out.println("Null Pointer Exception is Handled");
        }
        
        System.out.println("Main Ends");
    }
}

