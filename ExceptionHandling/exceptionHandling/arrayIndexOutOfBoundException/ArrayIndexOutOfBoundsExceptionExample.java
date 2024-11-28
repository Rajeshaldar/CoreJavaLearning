package exceptionHandling.arrayIndexOutOfBoundException;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {12, 30, 555, 10, 23};
        System.out.println("Main Starts");
        
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException AI) {
            // Handling the exception
            System.out.println("Array Index Out Of Bounds Exception is Handled");
        }
        
        System.out.println("Main Ends");
    }
}

