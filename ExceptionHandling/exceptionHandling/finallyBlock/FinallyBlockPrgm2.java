package exceptionHandling.finallyBlock;

public class FinallyBlockPrgm2 {
    public static void main(String[] args) {
        try {
            // This will cause an ArithmeticException (division by zero)
            System.out.println(5 / 0);
        } catch (ArithmeticException AE) {
            // Handling the ArithmeticException
            System.out.println("Arithmetic Exception Handled");
        } finally {
            // This block always executes
            System.out.println("finally executed at last");
        }
    }
}


