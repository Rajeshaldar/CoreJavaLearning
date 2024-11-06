package library;

public class Main {
    public static void main(String[] args) {
    	// Create an instance of Book
        Book myBook = new Book();
        
        // Call the readBook method of Student, passing myBook as an argument
        Student.readBook(myBook);

        // Call the readBook method of Teacher, passing myBook as an argument
        Teacher.readBook(myBook);
    }
}
