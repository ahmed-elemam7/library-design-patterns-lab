public class LibraryFacade {
    private LibraryService service;
    private Approver chain;

    public LibraryFacade() {
        service = LibraryService.getInstance();

        Approver librarian = new Librarian();
        Approver manager = new Manager();
        Approver director = new Director();

        librarian.setNext(manager);
        manager.setNext(director);

        chain = librarian;
    }

    public void addBook(BookInterface book) {
        service.addBook(book);
    }

    public void handleBorrowRequest(User user, BookInterface book, int days) {
        BorrowRequest request = new BorrowRequest(user, book, days);

        if (chain.approve(request)) {
            book.borrowBook(user);
            System.out.println("Borrow days = " + book.getBorrowDays());
        } else {
            System.out.println("Request rejected.");
        }
    }
}
