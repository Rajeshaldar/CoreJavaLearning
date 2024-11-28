package stackUnwinding.printStackTrace;

public class Main {
    public static void M4() {
        // This will cause an ArithmeticException (division by zero)
        System.out.println(5 / 0);
    }

    public static void M3() {
        M4(); // Calls M4 which throws ArithmeticException
    }

    public static void M2() {
        M3(); // Calls M3 which calls M4
        
    }

    public static void M1() {
        M2(); // Calls M2 which calls M3
    }

    public static void main(String[] args) {
        try {
            M1(); // Calls M1 which triggers the whole chain
        } catch (ArithmeticException AE) {
            // Handling the ArithmeticException
            System.out.println("Handled");
            // Printing the stack trace of the exception
            AE.printStackTrace();
        }
    }

}
