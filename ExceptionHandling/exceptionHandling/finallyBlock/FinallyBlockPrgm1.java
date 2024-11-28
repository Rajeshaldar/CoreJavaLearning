package exceptionHandling.finallyBlock;

public class FinallyBlockPrgm1 {
    public static void main(String[] args) {
        try {
            // This will cause an ArithmeticException (division by zero)
            System.out.println(5 / 0);
        } finally {
            // This block always executes, even if an exception is thrown
            System.out.println("I'm first executed");
        }
    }
}

