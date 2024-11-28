package exceptionHandling.stringIndexOutOfBoundException;

public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String S = "Qspiders";
        System.out.println("Main Starts");
        try {
            // This will cause a StringIndexOutOfBoundsException
            System.out.println(S.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("String Index Out Of Bounds Exception Handled");
        }
        System.out.println("Main Ends");
    }
}

