public class BookFactory {
    public static BookInterface createBook(String type, String title) {
        if (type.equalsIgnoreCase("book")) {
            return new Book(title);
        } else if (type.equalsIgnoreCase("ebook")) {
            return new EBook(title);
        } else if (type.equalsIgnoreCase("physical")) {
            return new PhysicalBook(title);
        } else if (type.equalsIgnoreCase("historical")) {
            return new HistoricalBook(title);
        } else {
            throw new IllegalArgumentException("Unknown type");
        }
    }
}
