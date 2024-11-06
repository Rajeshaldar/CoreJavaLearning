package library;

public class Student {
    // Static method for a student to read a book
    static void readBook(Book b) {
        System.out.println("Hey I'm Student");
        b.read(); // Call the read method of the Book instance passed as a parameter
    }
}
