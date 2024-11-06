package library;

public class Teacher {
    // Static method for a teacher to read a book
    static void readBook(Book b) {
        System.out.println("Hey I'm Teacher");
        b.read(); // Call the read method of the Book instance passed as a parameter
    }
}
