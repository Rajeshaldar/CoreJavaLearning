package exceptionHandling.NestedTryBlock;

public class E1 {
    public static void main(String[] args) {
        try {
            // First level try block
            try {
                // Second level try block (inner)
            } catch (Exception e) {
                // Handle exception for the inner try block
            } finally {
                // Finally block for the inner try block
            }
        } catch (Exception e) {
            // Handle exception for the first level try block
            try {
                // Third level try block (inside the first catch)
            } catch (Exception e1) {
                // Handle exception for the third level try block
            } finally {
                // Finally block for the third level try block
            }
        } finally {
            // Finally block for the first level try block
            try {
                // Fourth level try block (inside the first finally)
            } catch (Exception e) {
                // Handle exception for the fourth level try block
            } finally {
                // Finally block for the fourth level try block
            }
        }
    }
}

