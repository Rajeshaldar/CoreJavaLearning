package userDefinedException.Shaadi_Com;

public class Shaadi_Com {
	public static void Submit(int age) throws ShaadiException{
        if (age >= 21) {
            System.out.println("You can do marriage");
        } 
        else {
        	throw new ShaadiException("First grow up");
        }
        
        // Some other logic                               
        System.out.println("Home logic");
        System.out.println("Chat logic");
        System.out.println("Video call logic");
    }

    public static void main(String[] args) {
        int age = 20; // Example age
        
        try {
            Submit(age); // Attempt to submit with the given age
        } catch (ShaadiException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        }
    }
     
}
