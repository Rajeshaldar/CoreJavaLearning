package exceptionHandling.nullPointerException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String S = null;
        //S="Rajesh";
        System.out.println("Main Starts");
        try {
            // This will cause a NullPointerException
            System.out.println(S.length());
        } catch (NullPointerException NP) {
            // Handling the NullPointerException
            System.out.println("Null Pointer Exception is Handled");
        }
        System.out.println("Main Ends");
    }
}

