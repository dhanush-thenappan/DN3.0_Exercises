public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        Book b1 = new Book("B001", "Java Programming", "Author A");
        Book b2 = new Book("B002", "Data Structures", "Author B");
        Book b3 = new Book("B003", "Algorithms", "Author C");

        lms.addBook(b1);
        lms.addBook(b2);
        lms.addBook(b3);

        System.out.println("Linear Search for 'Data Structures':");
        Book foundBook1 = lms.linearSearchByTitle("Data Structures");
        System.out.println(foundBook1 != null ? foundBook1 : "Book not found.");

        lms.sortBooksByTitle();

        System.out.println("\nBinary Search for 'Java Programming':");
        Book foundBook2 = lms.binarySearchByTitle("Java Programming");
        System.out.println(foundBook2 != null ? foundBook2 : "Book not found.");
    }
}
