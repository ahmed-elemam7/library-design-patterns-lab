public class Director extends Approver {
    @Override
    public boolean approve(BorrowRequest request) {
        if (request.getDays() > 14) {
            System.out.println("Director approved the request.");
            return true;
        }
        return false;
    }
}
