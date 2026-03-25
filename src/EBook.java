public class EBook extends Book {
    public EBook(String title) {
        super(title);
    }

    @Override
    public void borrowBook(User user) {
        super.borrowBook(user);
        System.out.println("This is an e-book.");
    }
}
