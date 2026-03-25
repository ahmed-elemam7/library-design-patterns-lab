public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();
        User user = new User("John", true);

        // 1 + 2
        BookInterface normalBook = BookFactory.createBook("book", "Harry Potter");
        BookInterface ebook = BookFactory.createBook("ebook", "Design Patterns");

        // 3 + 4
        BookInterface premiumEbook = new PremiumBook(ebook);

        library.addBook(normalBook);
        library.addBook(premiumEbook);

        System.out.println("---- Borrow Premium EBook ----");
        library.handleBorrowRequest(user, premiumEbook, 12);

        // 7
        System.out.println("\n---- Adapter Example ----");
        ExternalBookData jsonBook = new ExternalBookData(
                "Design Patterns",
                true,
                "Erich Gamma",
                1994
        );
        BookInterface adaptedBook = new BookAdapter(jsonBook);
        adaptedBook.borrowBook(user);

        // 8
        System.out.println("\n---- Observer Example ----");
        NotifiableBook notifyBook = new NotifiableBook("Clean Code");
        notifyBook.addObserver(user);
        notifyBook.borrowBook(user);
        notifyBook.returnBook();

        // 9
        System.out.println("\n---- Bonus Approval Example ----");
        BookInterface longBook = BookFactory.createBook("physical", "Lord of the Rings");
        library.handleBorrowRequest(user, longBook, 20);
    }
}
