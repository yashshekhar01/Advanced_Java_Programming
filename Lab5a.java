import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("----------------------");
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> bookList = new ArrayList<>();

        // Add book objects to the ArrayList
        bookList.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(2, "1984", "George Orwell"));
        bookList.add(new Book(3, "Pride and Prejudice", "Jane Austen"));

        // Use advanced for loop to display all book details
        for (Book book : bookList) {
            book.displayBookDetails();
        }
    }
}
