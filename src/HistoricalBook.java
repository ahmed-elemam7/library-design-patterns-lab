public class HistoricalBook extends Book {
    public HistoricalBook(String title) {
        super(title);
    }

    @Override
    public int getBorrowDays() {
        return 5;
    }
}
