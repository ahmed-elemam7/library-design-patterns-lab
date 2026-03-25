public class BookAdapter implements BookInterface {
    private ExternalBookData externalBook;
    private boolean available;

    public BookAdapter(ExternalBookData externalBook) {
        this.externalBook = externalBook;
        this.available = externalBook.isBorrowable();
    }

    @Override
    public void borrowBook(User user) {
        if (available) {
            available = false;
            System.out.println(user.getName() + " borrowed external book: " + externalBook.getBookTitle());
        } else {
            System.out.println(externalBook.getBookTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println(externalBook.getBookTitle() + " has been returned.");
    }

    @Override
    public String getTitle() {
        return externalBook.getBookTitle();
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public int getBorrowDays() {
        return 7;
    }
}
