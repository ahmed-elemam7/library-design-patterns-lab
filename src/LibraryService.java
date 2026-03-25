import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static LibraryService instance;
    private List<BookInterface> books = new ArrayList<>();

    private LibraryService() {
    }

    public static LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
        }
        return instance;
    }

    public void addBook(BookInterface book) {
        books.add(book);
    }

    public BookInterface findBook(String title) {
        for (BookInterface book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<BookInterface> getBooks() {
        return books;
    }
}
