public class Librarian extends Approver {
    @Override
    public boolean approve(BorrowRequest request) {
        if (request.getDays() <= 7) {
            System.out.println("Librarian approved the request.");
            return true;
        } else if (next != null) {
            return next.approve(request);
        }
        return false;
    }
}
