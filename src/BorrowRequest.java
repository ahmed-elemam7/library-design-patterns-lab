public class BorrowRequest {
    private User user;
    private BookInterface book;
    private int days;

    public BorrowRequest(User user, BookInterface book, int days) {
        this.user = user;
        this.book = book;
        this.days = days;
    }

    public User getUser() {
        return user;
    }

    public BookInterface getBook() {
        return book;
    }

    public int getDays() {
        return days;
    }
}
