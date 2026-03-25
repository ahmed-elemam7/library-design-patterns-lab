public abstract class BookDecorator implements BookInterface {
    protected BookInterface book;

    public BookDecorator(BookInterface book) {
        this.book = book;
    }

    @Override
    public void borrowBook(User user) {
        book.borrowBook(user);
    }

    @Override
    public void returnBook() {
        book.returnBook();
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public boolean isAvailable() {
        return book.isAvailable();
    }

    @Override
    public int getBorrowDays() {
        return book.getBorrowDays();
    }
}
