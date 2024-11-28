package exceptionHandling.arithmeticException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        try {
            // This will cause an ArithmeticException (division by zero)
            System.out.println(5 / 0);
        } catch (ArithmeticException A) {
            // Handling the exception
            System.out.println("Arithmetic Exception Handled");
        }
        System.out.println("Main Ends");
    }
}

